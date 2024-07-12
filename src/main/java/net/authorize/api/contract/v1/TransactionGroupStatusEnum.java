//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.07.05 at 11:12:58 AM IST 
//


package net.authorize.api.contract.v1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionGroupStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionGroupStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="any"/>
 *     &lt;enumeration value="pendingApproval"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionGroupStatusEnum")
@XmlEnum
public enum TransactionGroupStatusEnum {

    @XmlEnumValue("any")
    ANY("any"),
    @XmlEnumValue("pendingApproval")
    PENDING_APPROVAL("pendingApproval");
    private final String value;

    TransactionGroupStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionGroupStatusEnum fromValue(String v) {
        for (TransactionGroupStatusEnum c: TransactionGroupStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
