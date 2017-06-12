
package org.sudharsan.simpleservice.getdepartment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for empDepartmentRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="empDepartmentRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="empId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="empName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="empProj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "empDepartmentRequestType", propOrder = {
    "empId",
    "empName",
    "empProj"
})
public class EmpDepartmentRequestType {

    @XmlElement(required = true)
    protected String empId;
    @XmlElement(required = true)
    protected String empName;
    @XmlElement(required = true)
    protected String empProj;

    /**
     * Gets the value of the empId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpId() {
        return empId;
    }

    /**
     * Sets the value of the empId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpId(String value) {
        this.empId = value;
    }

    /**
     * Gets the value of the empName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * Sets the value of the empName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpName(String value) {
        this.empName = value;
    }

    /**
     * Gets the value of the empProj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpProj() {
        return empProj;
    }

    /**
     * Sets the value of the empProj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpProj(String value) {
        this.empProj = value;
    }

}
