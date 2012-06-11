//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.08 at 02:31:37 PM CEST 
//


package com.telefonica.schemas.unica.rest.sms.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DeliveredToNetwork"/>
 *     &lt;enumeration value="DeliveryUncertain"/>
 *     &lt;enumeration value="DeliveryImpossible"/>
 *     &lt;enumeration value="MessageWaiting"/>
 *     &lt;enumeration value="DeliveredToTerminal"/>
 *     &lt;enumeration value="DeliveryNotificationNotSupported"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeliveryStatusType")
@XmlEnum
public enum DeliveryStatusType {


    /**
     * 
     *     					Successful delivery to network
     *     				
     * 
     */
    @XmlEnumValue("DeliveredToNetwork")
    DELIVERED_TO_NETWORK("DeliveredToNetwork"),

    /**
     * 
     *     					Delivery Status unknown: e.g. because it was handed off to another network.
     *     				
     * 
     */
    @XmlEnumValue("DeliveryUncertain")
    DELIVERY_UNCERTAIN("DeliveryUncertain"),

    /**
     * 
     *     					Unsuccessful delivery; the message could not be delivered before it expired.
     *     				
     * 
     */
    @XmlEnumValue("DeliveryImpossible")
    DELIVERY_IMPOSSIBLE("DeliveryImpossible"),

    /**
     * 
     *     					The message is still queued for delivery. This is a temporary state, pending transition to one of the preceding states.
     *     				
     * 
     */
    @XmlEnumValue("MessageWaiting")
    MESSAGE_WAITING("MessageWaiting"),

    /**
     * 
     *     					Successful delivered to Terminal
     *     				
     * 
     */
    @XmlEnumValue("DeliveredToTerminal")
    DELIVERED_TO_TERMINAL("DeliveredToTerminal"),

    /**
     * 
     *     					Unable to provide delivery receipt notification. NotifySMSDeliveryReceipt function will provide “DeliveryNotificationNotSupported” to indicate that delivery receipt for the specified address in a SendSMSRequest is not supported. 
     *     				
     * 
     */
    @XmlEnumValue("DeliveryNotificationNotSupported")
    DELIVERY_NOTIFICATION_NOT_SUPPORTED("DeliveryNotificationNotSupported");
    private final String value;

    DeliveryStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeliveryStatusType fromValue(String v) {
        for (DeliveryStatusType c: DeliveryStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
