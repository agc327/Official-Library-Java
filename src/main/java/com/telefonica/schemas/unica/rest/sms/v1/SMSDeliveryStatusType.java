//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.13 at 12:42:16 PM CEST 
//


package com.telefonica.schemas.unica.rest.sms.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SMSDeliveryStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SMSDeliveryStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="smsDeliveryStatus" type="{http://www.telefonica.com/schemas/UNICA/REST/sms/v1/}DeliveryInformationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SMSDeliveryStatusType", propOrder = {
    "smsDeliveryStatus"
})
public class SMSDeliveryStatusType {

    protected List<DeliveryInformationType> smsDeliveryStatus;

    /**
     * Gets the value of the smsDeliveryStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smsDeliveryStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSmsDeliveryStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryInformationType }
     * 
     * 
     */
    public List<DeliveryInformationType> getSmsDeliveryStatus() {
        if (smsDeliveryStatus == null) {
            smsDeliveryStatus = new ArrayList<DeliveryInformationType>();
        }
        return this.smsDeliveryStatus;
    }

    /**
     * Sets the value of the smsDeliveryStatus property.
     * 
     * @param smsDeliveryStatus
     *     allowed object is
     *     {@link DeliveryInformationType }
     *     
     */
    public void setSmsDeliveryStatus(List<DeliveryInformationType> smsDeliveryStatus) {
        this.smsDeliveryStatus = smsDeliveryStatus;
    }

}
