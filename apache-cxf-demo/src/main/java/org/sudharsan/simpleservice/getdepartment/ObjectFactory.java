
package org.sudharsan.simpleservice.getdepartment;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sudharsan.simpleservice.getdepartment package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EmpDepartmentResponse_QNAME = new QName("http://sudharsan.org/SimpleService/getdepartment", "empDepartmentResponse");
    private final static QName _EmpDepartmentRequest_QNAME = new QName("http://sudharsan.org/SimpleService/getdepartment", "empDepartmentRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.sudharsan.simpleservice.getdepartment
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmpDepartmentResponseType }
     * 
     */
    public EmpDepartmentResponseType createEmpDepartmentResponseType() {
        return new EmpDepartmentResponseType();
    }

    /**
     * Create an instance of {@link EmpDepartmentRequestType }
     * 
     */
    public EmpDepartmentRequestType createEmpDepartmentRequestType() {
        return new EmpDepartmentRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmpDepartmentResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sudharsan.org/SimpleService/getdepartment", name = "empDepartmentResponse")
    public JAXBElement<EmpDepartmentResponseType> createEmpDepartmentResponse(EmpDepartmentResponseType value) {
        return new JAXBElement<EmpDepartmentResponseType>(_EmpDepartmentResponse_QNAME, EmpDepartmentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmpDepartmentRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sudharsan.org/SimpleService/getdepartment", name = "empDepartmentRequest")
    public JAXBElement<EmpDepartmentRequestType> createEmpDepartmentRequest(EmpDepartmentRequestType value) {
        return new JAXBElement<EmpDepartmentRequestType>(_EmpDepartmentRequest_QNAME, EmpDepartmentRequestType.class, null, value);
    }

}
