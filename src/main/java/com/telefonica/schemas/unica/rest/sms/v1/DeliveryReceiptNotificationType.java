//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.08 at 02:31:37 PM CEST 
//


package com.telefonica.schemas.unica.rest.sms.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.telefonica.schemas.unica.rest.common.v1.SimpleReferenceType;
import com.telefonica.schemas.unica.rest.common.v1.UserIdType;


/**
 * <p>Java class for DeliveryReceiptNotificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryReceiptNotificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reference" type="{http://www.telefonica.com/schemas/UNICA/REST/common/v1}SimpleReferenceType"/>
 *         &lt;element name="originAddress" type="{http://www.telefonica.com/schemas/UNICA/REST/common/v1}UserIdType" maxOccurs="unbounded"/>
 *         &lt;element name="filterCriteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryReceiptNotificationType", propOrder = {
    "reference",
    "originAddress",
    "filterCriteria"
})
public class DeliveryReceiptNotificationType {

    @XmlElement(required = true)
    protected SimpleReferenceType reference;
    @XmlElement(required = true)
    protected List<UserIdType> originAddress;
    protected String filterCriteria;

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleReferenceType }
     *     
     */
    public SimpleReferenceType getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleReferenceType }
     *     
     */
    public void setReference(SimpleReferenceType value) {
        this.reference = value;
    }

    /**
     * Gets the value of the originAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserIdType }
     * 
     * 
     */
    public List<UserIdType> getOriginAddress() {
        if (originAddress == null) {
            originAddress = new ArrayList<UserIdType>();
        }
        return this.originAddress;
    }

    /**
     * Gets the value of the filterCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterCriteria() {
        return filterCriteria;
    }

    /**
     * Sets the value of the filterCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterCriteria(String value) {
        this.filterCriteria = value;
    }

    /**
     * Sets the value of the originAddress property.
     * 
     * @param originAddress
     *     allowed object is
     *     {@link UserIdType }
     *     
     */
    public void setOriginAddress(List<UserIdType> originAddress) {
        this.originAddress = originAddress;
    }

}
