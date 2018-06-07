
package fr.mb.biblio.batch.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "pretService", targetNamespace = "http://contract.pretService.soap.biblio.mb.fr/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PretService {


    /**
     * 
     * @return
     *     returns java.util.List<fr.mb.biblio.batch.service.Pret>
     * @throws FunctionalException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPretsProlonges", targetNamespace = "http://contract.pretService.soap.biblio.mb.fr/", className = "fr.mb.biblio.batch.service.GetPretsProlonges")
    @ResponseWrapper(localName = "getPretsProlongesResponse", targetNamespace = "http://contract.pretService.soap.biblio.mb.fr/", className = "fr.mb.biblio.batch.service.GetPretsProlongesResponse")
    public List<Pret> getPretsProlonges()
        throws FunctionalException_Exception
    ;

    /**
     * 
     * @param livreId
     * @param dateDebut
     * @param emprunteurId
     * @return
     *     returns fr.mb.biblio.batch.service.Pret
     * @throws NotFoundException_Exception
     * @throws FunctionalException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "creationPretDate", targetNamespace = "http://contract.pretService.soap.biblio.mb.fr/", className = "fr.mb.biblio.batch.service.CreationPretDate")
    @ResponseWrapper(localName = "creationPretDateResponse", targetNamespace = "http://contract.pretService.soap.biblio.mb.fr/", className = "fr.mb.biblio.batch.service.CreationPretDateResponse")
    public Pret creationPretDate(
        @WebParam(name = "livreId", targetNamespace = "")
        Integer livreId,
        @WebParam(name = "emprunteurId", targetNamespace = "")
        Integer emprunteurId,
        @WebParam(name = "dateDebut", targetNamespace = "")
        Object dateDebut)
        throws FunctionalException_Exception, NotFoundException_Exception
    ;

    /**
     * 
     * @param pretId
     * @param emprunteurId
     * @return
     *     returns fr.mb.biblio.batch.service.Pret
     * @throws NotFoundException_Exception
     * @throws FunctionalException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "prolongerPret", targetNamespace = "http://contract.pretService.soap.biblio.mb.fr/", className = "fr.mb.biblio.batch.service.ProlongerPret")
    @ResponseWrapper(localName = "prolongerPretResponse", targetNamespace = "http://contract.pretService.soap.biblio.mb.fr/", className = "fr.mb.biblio.batch.service.ProlongerPretResponse")
    public Pret prolongerPret(
        @WebParam(name = "pretId", targetNamespace = "")
        Integer pretId,
        @WebParam(name = "emprunteurId", targetNamespace = "")
        Integer emprunteurId)
        throws FunctionalException_Exception, NotFoundException_Exception
    ;

    /**
     * 
     * @throws Exception_Exception
     * @throws FunctionalException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "relanceMailRetards", targetNamespace = "http://contract.pretService.soap.biblio.mb.fr/", className = "fr.mb.biblio.batch.service.RelanceMailRetards")
    @ResponseWrapper(localName = "relanceMailRetardsResponse", targetNamespace = "http://contract.pretService.soap.biblio.mb.fr/", className = "fr.mb.biblio.batch.service.RelanceMailRetardsResponse")
    public void relanceMailRetards()
        throws Exception_Exception, FunctionalException_Exception
    ;

    /**
     * 
     * @param pretId
     * @return
     *     returns java.lang.String
     * @throws NotFoundException_Exception
     * @throws FunctionalException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "retourPret", targetNamespace = "http://contract.pretService.soap.biblio.mb.fr/", className = "fr.mb.biblio.batch.service.RetourPret")
    @ResponseWrapper(localName = "retourPretResponse", targetNamespace = "http://contract.pretService.soap.biblio.mb.fr/", className = "fr.mb.biblio.batch.service.RetourPretResponse")
    public String retourPret(
        @WebParam(name = "pretId", targetNamespace = "")
        Integer pretId)
        throws FunctionalException_Exception, NotFoundException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<fr.mb.biblio.batch.service.Pret>
     * @throws FunctionalException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPretsEnCours", targetNamespace = "http://contract.pretService.soap.biblio.mb.fr/", className = "fr.mb.biblio.batch.service.GetPretsEnCours")
    @ResponseWrapper(localName = "getPretsEnCoursResponse", targetNamespace = "http://contract.pretService.soap.biblio.mb.fr/", className = "fr.mb.biblio.batch.service.GetPretsEnCoursResponse")
    public List<Pret> getPretsEnCours()
        throws FunctionalException_Exception
    ;

    /**
     * 
     * @param livreId
     * @param emprunteurId
     * @return
     *     returns fr.mb.biblio.batch.service.Pret
     * @throws NotFoundException_Exception
     * @throws FunctionalException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "nouveauPret", targetNamespace = "http://contract.pretService.soap.biblio.mb.fr/", className = "fr.mb.biblio.batch.service.NouveauPret")
    @ResponseWrapper(localName = "nouveauPretResponse", targetNamespace = "http://contract.pretService.soap.biblio.mb.fr/", className = "fr.mb.biblio.batch.service.NouveauPretResponse")
    public Pret nouveauPret(
        @WebParam(name = "livreId", targetNamespace = "")
        Integer livreId,
        @WebParam(name = "emprunteurId", targetNamespace = "")
        Integer emprunteurId)
        throws FunctionalException_Exception, NotFoundException_Exception
    ;

    /**
     * 
     * @param id
     * @return
     *     returns fr.mb.biblio.batch.service.Pret
     * @throws NotFoundException_Exception
     * @throws FunctionalException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPretById", targetNamespace = "http://contract.pretService.soap.biblio.mb.fr/", className = "fr.mb.biblio.batch.service.GetPretById")
    @ResponseWrapper(localName = "getPretByIdResponse", targetNamespace = "http://contract.pretService.soap.biblio.mb.fr/", className = "fr.mb.biblio.batch.service.GetPretByIdResponse")
    public Pret getPretById(
        @WebParam(name = "id", targetNamespace = "")
        Integer id)
        throws FunctionalException_Exception, NotFoundException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<fr.mb.biblio.batch.service.Pret>
     * @throws FunctionalException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPretsRetards", targetNamespace = "http://contract.pretService.soap.biblio.mb.fr/", className = "fr.mb.biblio.batch.service.GetPretsRetards")
    @ResponseWrapper(localName = "getPretsRetardsResponse", targetNamespace = "http://contract.pretService.soap.biblio.mb.fr/", className = "fr.mb.biblio.batch.service.GetPretsRetardsResponse")
    public List<Pret> getPretsRetards()
        throws FunctionalException_Exception
    ;

}