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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ANetApiRequest">
 *       &lt;sequence>
 *         &lt;element name="month">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="4"/>
 *               &lt;maxLength value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="modifiedTypeFilter" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}AUJobTypeEnum" minOccurs="0"/>
 *         &lt;element name="paging" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}Paging" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "month",
    "modifiedTypeFilter",
    "paging"
})
@XmlRootElement(name = "getAUJobDetailsRequest")
public class GetAUJobDetailsRequest
    extends ANetApiRequest
{

    @XmlElement(required = true)
    protected String month;
    @XmlSchemaType(name = "string")
    protected AUJobTypeEnum modifiedTypeFilter;
    protected Paging paging;

    /**
     * Gets the value of the month property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonth(String value) {
        this.month = value;
    }

    /**
     * Gets the value of the modifiedTypeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link AUJobTypeEnum }
     *     
     */
    public AUJobTypeEnum getModifiedTypeFilter() {
        return modifiedTypeFilter;
    }

    /**
     * Sets the value of the modifiedTypeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUJobTypeEnum }
     *     
     */
    public void setModifiedTypeFilter(AUJobTypeEnum value) {
        this.modifiedTypeFilter = value;
    }

    /**
     * Gets the value of the paging property.
     * 
     * @return
     *     possible object is
     *     {@link Paging }
     *     
     */
    public Paging getPaging() {
        return paging;
    }

    /**
     * Sets the value of the paging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paging }
     *     
     */
    public void setPaging(Paging value) {
        this.paging = value;
    }

}
