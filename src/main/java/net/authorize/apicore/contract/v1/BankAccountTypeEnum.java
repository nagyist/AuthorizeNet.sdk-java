//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.06 at 01:39:26 PM PDT 
//


package net.authorize.apicore.contract.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bankAccountTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="bankAccountTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="checking"/>
 *     &lt;enumeration value="savings"/>
 *     &lt;enumeration value="businessChecking"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "bankAccountTypeEnum")
@XmlEnum
public enum BankAccountTypeEnum {

    @XmlEnumValue("checking")
    CHECKING("checking"),
    @XmlEnumValue("savings")
    SAVINGS("savings"),
    @XmlEnumValue("businessChecking")
    BUSINESS_CHECKING("businessChecking");
    private final String value;

    BankAccountTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BankAccountTypeEnum fromValue(String v) {
        for (BankAccountTypeEnum c: BankAccountTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
