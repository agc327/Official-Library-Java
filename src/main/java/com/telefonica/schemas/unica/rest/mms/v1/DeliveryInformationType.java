//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.13 at 12:42:16 PM CEST 
//


package com.telefonica.schemas.unica.rest.mms.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.telefonica.schemas.unica.rest.common.v1.UserIdType;


/**
 * <p>Java class for DeliveryInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.telefonica.com/schemas/UNICA/REST/common/v1}UserIdType"/>
 *         &lt;element name="deliveryStatus">
 *           &lt;simpleType>
 *             &lt;union memberTypes=" {http://www.telefonica.com/schemas/UNICA/REST/mms/v1/}DeliveryStatusType {http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryInformationType", propOrder = {
    "address",
    "deliveryStatus",
    "description"
})
public class DeliveryInformationType {

    @XmlElement(required = true)
    protected UserIdType address;
    @XmlElement(required = true)
    protected String deliveryStatus;
    protected String description;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link UserIdType }
     *     
     */
    public UserIdType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserIdType }
     *     
     */
    public void setAddress(UserIdType value) {
        this.address = value;
    }

    /**
     * Gets the value of the deliveryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    /**
     * Sets the value of the deliveryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryStatus(String value) {
        this.deliveryStatus = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
