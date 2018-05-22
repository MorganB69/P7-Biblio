package fr.mb.biblio.soap.livreService.contract;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import fr.mb.biblio.models.beans.Livre;
import fr.mb.biblio.models.exception.FunctionalException;
import fr.mb.biblio.models.exception.NotFoundException;
import fr.mb.biblio.models.recherche.RechercheLivre;

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
	public Livre getLivreById(@WebParam(name="id")Integer id) throws NotFoundException;
	
	/**
	 * Obtention de tous les livres selon un offset et un nb de pages
	 * @param offset
	 * @param nb
	 * @return
	 */
	public List<Livre> getAllLivres(@WebParam(name="offset")Integer offset, 
									@WebParam(name="nb")Integer nb);
	
	/**
	 * Obtention des livres selon des critères de recherche, un offset et un nb de pages
	 * @param recherche
	 * @param offset
	 * @param nb
	 * @return
	 */
	public List<Livre> rechercheLivres(@WebParam(name="recherche")RechercheLivre recherche,
									   @WebParam(name="offset")Integer offset, Integer nb);
	
}
