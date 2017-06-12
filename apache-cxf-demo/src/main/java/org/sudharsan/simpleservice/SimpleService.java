package org.sudharsan.simpleservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.8
 * 2017-06-12T00:52:47.438+05:30
 * Generated source version: 2.7.8
 * 
 */
@WebServiceClient(name = "SimpleService", 
                  wsdlLocation = "file:/D:/sts_Ws/apache-cxf-demo/src/main/resources/wsdl/SimpleService.wsdl",
                  targetNamespace = "http://sudharsan.org/SimpleService/") 
public class SimpleService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://sudharsan.org/SimpleService/", "SimpleService");
    public final static QName SimpleServiceSOAP = new QName("http://sudharsan.org/SimpleService/", "SimpleServiceSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/sts_Ws/apache-cxf-demo/src/main/resources/wsdl/SimpleService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SimpleService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/sts_Ws/apache-cxf-demo/src/main/resources/wsdl/SimpleService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SimpleService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SimpleService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SimpleService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SimpleService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SimpleService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SimpleService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns GetDepartmentsService
     */
    @WebEndpoint(name = "SimpleServiceSOAP")
    public GetDepartmentsService getSimpleServiceSOAP() {
        return super.getPort(SimpleServiceSOAP, GetDepartmentsService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetDepartmentsService
     */
    @WebEndpoint(name = "SimpleServiceSOAP")
    public GetDepartmentsService getSimpleServiceSOAP(WebServiceFeature... features) {
        return super.getPort(SimpleServiceSOAP, GetDepartmentsService.class, features);
    }

}