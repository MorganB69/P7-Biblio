package fr.mb.biblio.soap.pretService.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;


import fr.mb.biblio.dao.contract.LivreDao;
import fr.mb.biblio.dao.contract.PretDao;
import fr.mb.biblio.dao.contract.UtilisateurDao;
import fr.mb.biblio.models.beans.Livre;
import fr.mb.biblio.models.beans.Pret;
import fr.mb.biblio.models.beans.Utilisateur;
import fr.mb.biblio.models.exception.FunctionalException;
import fr.mb.biblio.models.exception.NotFoundException;
import fr.mb.biblio.soap.pretService.contract.PretService;

/**
 * Implemetation du service de gestion des prets
 * @author Morgan
 *
 */
public class PretServiceImpl implements PretService {
	
	
	private static final Logger logger = LogManager.getLogger(PretServiceImpl.class);
	
	/**
	 * Dao pour les prets
	 */
	@Inject
	PretDao pretDao;
	@Inject
	UtilisateurDao utilisateurDao;
	@Inject
	LivreDao livreDao;
	
	/**
	 * Pret à retourner
	 */
	Pret pretReturn;
	
	/**
	 * Liste de pret a retourner
	 */
	List <Pret>listeReturn;
	
	/**
	 * Durée de pret definit dans un fichier properties car configurable
	 */
	@Value( "${dureePret}" )
	Integer DUREEPRET;
	
	@Resource
	WebServiceContext ctx;
	
	
	public Boolean isAdmin() {
		
		
		//get detail from request headers
		String usernameFromHeader = (String) ctx.getMessageContext().get("USERNAME");
	    logger.info(usernameFromHeader);
		Utilisateur user=utilisateurDao.getUser(usernameFromHeader);
		
		return user.getAdmin();
	}
	
	/* (non-Javadoc)
	 * @see fr.mb.biblio.soap.pretService.contract.PretService#nouveauPret(java.lang.Integer, java.lang.Integer)
	 */
	@Override
	@Transactional
	public Pret nouveauPret(Integer livreId, Integer emprunteurId) throws FunctionalException {
		
			
		Pret pret=new Pret();
		
		if (isAdmin()==true) {
			//Récupération de l'utilisateur
			Utilisateur emprunteur=utilisateurDao.findById(emprunteurId);
			//Récupération du livre à emprunter
			Livre livre=livreDao.findById(livreId);
			//Date de début du pret
			LocalDate dateDebut=LocalDate.now();
			//Date de fin théorique
			LocalDate dateFin=dateDebut.plusDays(DUREEPRET);
			
			//Enregistrement des parametres
			pret.setDateDebut(dateDebut);
			pret.setDateFin(dateFin);
			pret.setUtilisateur(emprunteur);
			pret.setLivre(livre);
			pret.getLivre().setDisponible(false);
			pret.setProlonge(false);
			
			pretDao.persist(pret);}
		else throw new FunctionalException("Seul un administrateur peut enregistrer un nouveau prêt");
			
			return pret;
		}
		

	@Override
	@Transactional
	public Pret prolongerPret(Integer pretId, Integer emprunteurId) throws FunctionalException {
		//Récupération du prêt
		Pret pret=pretDao.findById(pretId);
		//Vérification que le l'utilisateur correspond à celui du prêt et vérification que le prêt n'est pas prolongé
		if(emprunteurId==pret.getUtilisateur().getIdUtilisateur()&&pret.isProlonge()==false) {
			
			
			//Récupération de la date de fin
			LocalDate dateFin=pret.getDateFin();
			
			//Vérification que le prêt est en retard
			if (LocalDate.now().isAfter(dateFin)) {
				//Prolongation de la date de fin
				dateFin.plusDays(DUREEPRET);
				//Modification des paramètres
				pret.setDateFin(dateFin);
				pret.setProlonge(true);
				
				pretDao.update(pret);}
			
			else throw new FunctionalException ("Le prêt n'est pas encore en retard");
			
		}
		else throw new FunctionalException("Le prêt a déjà été prolongé ou l'utilisateur n'est pas bon");
		
		return pret;
	}



	@Override
	public String retourPret(Integer pretId) throws FunctionalException {
		//Récupération du prêt
				Pret pret=pretDao.findById(pretId);
				LocalDate dateEffective=LocalDate.now();
				pret.setDateEffective(dateEffective);
				pret.getLivre().setDisponible(true);
		return null;
	}

	@Override
	@Transactional
	public Pret getPretById(Integer id) throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<Pret> getPretsEnCours() throws FunctionalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<Pret> getPretsProlonges() throws FunctionalException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<Pret> getPretsRetards() throws FunctionalException {
		// TODO Auto-generated method stub
		return null;
	}




}