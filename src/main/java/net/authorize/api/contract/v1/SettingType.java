//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.07.05 at 11:12:58 AM IST 
//


package net.authorize.api.contract.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for settingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="settingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="settingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="settingValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "settingType", propOrder = {
    "settingName",
    "settingValue"
})
public class SettingType {

    protected String settingName;
    protected String settingValue;

    /**
     * Gets the value of the settingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettingName() {
        return settingName;
    }

    /**
     * Sets the value of the settingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettingName(String value) {
        this.settingName = value;
    }

    /**
     * Gets the value of the settingValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettingValue() {
        return settingValue;
    }

    /**
     * Sets the value of the settingValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettingValue(String value) {
        this.settingValue = value;
    }

}
