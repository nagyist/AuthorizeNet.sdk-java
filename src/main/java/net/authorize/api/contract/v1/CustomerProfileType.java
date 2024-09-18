//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.08.29 at 03:44:59 AM IST 
//


package net.authorize.api.contract.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customerProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerProfileType">
 *   &lt;complexContent>
 *     &lt;extension base="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}customerProfileBaseType">
 *       &lt;sequence>
 *         &lt;element name="paymentProfiles" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}customerPaymentProfileType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shipToList" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}customerAddressType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="profileType" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}customerProfileTypeEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerProfileType", propOrder = {
    "paymentProfiles",
    "shipToList",
    "profileType"
})
public class CustomerProfileType
    extends CustomerProfileBaseType
{

    protected List<CustomerPaymentProfileType> paymentProfiles;
    protected List<CustomerAddressType> shipToList;
    @XmlSchemaType(name = "string")
    protected CustomerProfileTypeEnum profileType;

    /**
     * Gets the value of the paymentProfiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentProfiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentProfiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerPaymentProfileType }
     * 
     * 
     */
    public List<CustomerPaymentProfileType> getPaymentProfiles() {
        if (paymentProfiles == null) {
            paymentProfiles = new ArrayList<CustomerPaymentProfileType>();
        }
        return this.paymentProfiles;
    }

    /**
     * Gets the value of the shipToList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipToList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipToList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerAddressType }
     * 
     * 
     */
    public List<CustomerAddressType> getShipToList() {
        if (shipToList == null) {
            shipToList = new ArrayList<CustomerAddressType>();
        }
        return this.shipToList;
    }

    /**
     * Gets the value of the profileType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileTypeEnum }
     *     
     */
    public CustomerProfileTypeEnum getProfileType() {
        return profileType;
    }

    /**
     * Sets the value of the profileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileTypeEnum }
     *     
     */
    public void setProfileType(CustomerProfileTypeEnum value) {
        this.profileType = value;
    }

}
