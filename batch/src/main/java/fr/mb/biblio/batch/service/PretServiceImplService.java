
package fr.mb.biblio.batch.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PretServiceImplService", targetNamespace = "http://impl.pretService.soap.biblio.mb.fr/", wsdlLocation = "http://localhost:8080/SOAP/pretService?wsdl")
public class PretServiceImplService
    extends Service
{

    private final static URL PRETSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException PRETSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName PRETSERVICEIMPLSERVICE_QNAME = new QName("http://impl.pretService.soap.biblio.mb.fr/", "PretServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/SOAP/pretService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRETSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        PRETSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public PretServiceImplService() {
        super(__getWsdlLocation(), PRETSERVICEIMPLSERVICE_QNAME);
    }

    public PretServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRETSERVICEIMPLSERVICE_QNAME, features);
    }

    public PretServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, PRETSERVICEIMPLSERVICE_QNAME);
    }

    public PretServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRETSERVICEIMPLSERVICE_QNAME, features);
    }

    public PretServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PretServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PretService
     */
    @WebEndpoint(name = "PretServiceImplPort")
    public PretService getPretServiceImplPort() {
        return super.getPort(new QName("http://impl.pretService.soap.biblio.mb.fr/", "PretServiceImplPort"), PretService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PretService
     */
    @WebEndpoint(name = "PretServiceImplPort")
    public PretService getPretServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.pretService.soap.biblio.mb.fr/", "PretServiceImplPort"), PretService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRETSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw PRETSERVICEIMPLSERVICE_EXCEPTION;
        }
        return PRETSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
