//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.13 at 12:42:16 PM CEST 
//


package com.telefonica.schemas.unica.rpc.payment.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * input parameters for NotifyPaymentFinalStatus operation
 * 
 * <p>Java class for NotifyPaymentFinalStatusParamsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotifyPaymentFinalStatusParamsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transactionStatus">
 *           &lt;simpleType>
 *             &lt;union memberTypes=" {http://www.telefonica.com/schemas/UNICA/RPC/payment/v1}TransactionEnumerationType {http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="transactionStatusDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyPaymentFinalStatusParamsType", propOrder = {
    "transactionId",
    "transactionStatus",
    "transactionStatusDescription",
    "any"
})
public class NotifyPaymentFinalStatusParamsType {

    @XmlElement(required = true)
    protected String transactionId;
    @XmlElement(required = true)
    protected String transactionStatus;
    @XmlElement(required = true)
    protected String transactionStatusDescription;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the transactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * Sets the value of the transactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionStatus(String value) {
        this.transactionStatus = value;
    }

    /**
     * Gets the value of the transactionStatusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionStatusDescription() {
        return transactionStatusDescription;
    }

    /**
     * Sets the value of the transactionStatusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionStatusDescription(String value) {
        this.transactionStatusDescription = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param any
     *     allowed object is
     *     {@link Object }
     *     {@link Element }
     *     
     */
    public void setAny(List<Object> any) {
        this.any = any;
    }

}
