//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.07.05 at 11:12:58 AM IST 
//


package net.authorize.api.contract.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="status" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}TransactionGroupStatusEnum" minOccurs="0"/>
 *         &lt;element name="sorting" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}TransactionListSorting" minOccurs="0"/>
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
    "status",
    "sorting",
    "paging"
})
@XmlRootElement(name = "getUnsettledTransactionListRequest")
public class GetUnsettledTransactionListRequest
    extends ANetApiRequest
{

    @XmlSchemaType(name = "string")
    protected TransactionGroupStatusEnum status;
    protected TransactionListSorting sorting;
    protected Paging paging;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionGroupStatusEnum }
     *     
     */
    public TransactionGroupStatusEnum getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionGroupStatusEnum }
     *     
     */
    public void setStatus(TransactionGroupStatusEnum value) {
        this.status = value;
    }

    /**
     * Gets the value of the sorting property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionListSorting }
     *     
     */
    public TransactionListSorting getSorting() {
        return sorting;
    }

    /**
     * Sets the value of the sorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionListSorting }
     *     
     */
    public void setSorting(TransactionListSorting value) {
        this.sorting = value;
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
