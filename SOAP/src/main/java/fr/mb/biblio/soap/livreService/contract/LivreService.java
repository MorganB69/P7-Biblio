package fr.mb.biblio.soap.livreService.contract;

import java.time.LocalDate;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import fr.mb.biblio.models.LocalDateXmlAdapter;
import fr.mb.biblio.models.beans.Livre;
import fr.mb.biblio.models.exception.FunctionalException;
import fr.mb.biblio.models.exception.NotFoundException;
import fr.mb.biblio.models.recherche.RechercheLivre;
import fr.mb.biblio.soap.test.ListeLivre;

/**
 * Service permettant la gestion d'un livre
 * @author Morgan
 *
 */
@WebService(name="livreService")
public interface LivreService {
	
	/**
	 * Rajout d'un livre
	 * @param livre
	 * @throws FunctionalException
	 */
	@WebMethod
	public void insert(@WebParam(name="livre")Livre livre) throws FunctionalException;
	
	/**
	 * Obtention d'un livre via son id
	 * @param id
	 * @return
	 * @throws NotFoundException
	 */
	@WebMethod
	public Livre getLivreById(@WebParam(name="id")Integer id) throws NotFoundException;
	
	/**
	 * Obtention de tous les livres selon un offset et un nb de pages
	 * @param offset
	 * @param nb
	 * @return
	 * @throws FunctionalException 
	 */
	@WebMethod
	public List<Livre> getAllLivres(@WebParam(name="offset")Integer offset, 
									@WebParam(name="nb")Integer nb) throws FunctionalException;
	
	/**
	 * Obtention du nombre de résultat de la recherche
	 * @param recherche
	 * @return
	 * @throws FunctionalException 
	 */
	@WebMethod
	public Long countLivres(@WebParam(name="recherche")RechercheLivre recherche);
	
	/**
	 * Obtention des livres selon des critères de recherche, un offset et un nb de pages
	 * @param recherche
	 * @param offset
	 * @param nb
	 * @return
	 * @throws FunctionalException 
	 */
	@WebMethod
	public List<Livre> rechercheLivres(@WebParam(name="recherche")RechercheLivre recherche,
									   @WebParam(name="offset")Integer offset,@WebParam(name="nb") Integer nb) throws FunctionalException;

	
	/**
	 * Insertion de livres rentrés manuellement
	 * @throws FunctionalException
	 */
	@WebMethod
	public void insertionExemple() throws FunctionalException;
	
	/**
	 * Insertion de livres aléatoires
	 * @param nb
	 * @throws FunctionalException
	 */
	@WebMethod
	public void creationAleatoireLivre(@WebParam(name="nb")Integer nb) throws FunctionalException;
	
	/**
	 * Trouver la date de retour d'un livre via son id
	 * @param nb
	 * @throws FunctionalException
	 */
	@WebMethod
	public String dateRetourLivre(@WebParam(name="idLivre")Integer idLivre) throws FunctionalException, NotFoundException;

	
	}

