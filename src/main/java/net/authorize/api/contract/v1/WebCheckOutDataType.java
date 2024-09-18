//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.08.29 at 03:44:59 AM IST 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for webCheckOutDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="webCheckOutDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}webCheckOutTypeEnum"/>
 *         &lt;element name="id">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="token" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}webCheckOutDataTypeToken" minOccurs="0"/>
 *         &lt;element name="bankToken" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}bankAccountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "webCheckOutDataType", propOrder = {
    "type",
    "id",
    "token",
    "bankToken"
})
public class WebCheckOutDataType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected WebCheckOutTypeEnum type;
    @XmlElement(required = true)
    protected String id;
    protected WebCheckOutDataTypeToken token;
    protected BankAccountType bankToken;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link WebCheckOutTypeEnum }
     *     
     */
    public WebCheckOutTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebCheckOutTypeEnum }
     *     
     */
    public void setType(WebCheckOutTypeEnum value) {
        this.type = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link WebCheckOutDataTypeToken }
     *     
     */
    public WebCheckOutDataTypeToken getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebCheckOutDataTypeToken }
     *     
     */
    public void setToken(WebCheckOutDataTypeToken value) {
        this.token = value;
    }

    /**
     * Gets the value of the bankToken property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccountType }
     *     
     */
    public BankAccountType getBankToken() {
        return bankToken;
    }

    /**
     * Sets the value of the bankToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccountType }
     *     
     */
    public void setBankToken(BankAccountType value) {
        this.bankToken = value;
    }

}
