
package proxy;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "ReleveWS", targetNamespace = "http://example.org/", wsdlLocation = "http://192.168.1.2:9191/?wsdl")
public class ReleveWS
    extends Service
{

    private final static URL RELEVEWS_WSDL_LOCATION;
    private final static WebServiceException RELEVEWS_EXCEPTION;
    private final static QName RELEVEWS_QNAME = new QName("http://example.org/", "ReleveWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.1.2:9191/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RELEVEWS_WSDL_LOCATION = url;
        RELEVEWS_EXCEPTION = e;
    }

    public ReleveWS() {
        super(__getWsdlLocation(), RELEVEWS_QNAME);
    }

    public ReleveWS(WebServiceFeature... features) {
        super(__getWsdlLocation(), RELEVEWS_QNAME, features);
    }

    public ReleveWS(URL wsdlLocation) {
        super(wsdlLocation, RELEVEWS_QNAME);
    }

    public ReleveWS(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RELEVEWS_QNAME, features);
    }

    public ReleveWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReleveWS(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ConsulteReleve
     */
    @WebEndpoint(name = "ConsulteRelevePort")
    public ConsulteReleve getConsulteRelevePort() {
        return super.getPort(new QName("http://example.org/", "ConsulteRelevePort"), ConsulteReleve.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsulteReleve
     */
    @WebEndpoint(name = "ConsulteRelevePort")
    public ConsulteReleve getConsulteRelevePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://example.org/", "ConsulteRelevePort"), ConsulteReleve.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RELEVEWS_EXCEPTION!= null) {
            throw RELEVEWS_EXCEPTION;
        }
        return RELEVEWS_WSDL_LOCATION;
    }

}
