//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.07.05 at 11:12:58 AM IST 
//


package net.authorize.api.contract.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fraudInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fraudInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fraudFilterList" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ArrayOfFraudFilterType"/>
 *         &lt;element name="fraudAction">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fraudInformationType", propOrder = {
    "fraudFilterList",
    "fraudAction"
})
public class FraudInformationType {

    @XmlElement(required = true)
    protected ArrayOfFraudFilterType fraudFilterList;
    @XmlElement(required = true)
    protected String fraudAction;

    /**
     * Gets the value of the fraudFilterList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFraudFilterType }
     *     
     */
    public ArrayOfFraudFilterType getFraudFilterList() {
        return fraudFilterList;
    }

    /**
     * Sets the value of the fraudFilterList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFraudFilterType }
     *     
     */
    public void setFraudFilterList(ArrayOfFraudFilterType value) {
        this.fraudFilterList = value;
    }

    /**
     * Gets the value of the fraudAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraudAction() {
        return fraudAction;
    }

    /**
     * Sets the value of the fraudAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraudAction(String value) {
        this.fraudAction = value;
    }

}
