//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.13 at 12:42:16 PM CEST 
//


package com.telefonica.schemas.unica.rest.sms.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.telefonica.schemas.unica.rest.sms.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SmsDeliveryStatusUpdate_QNAME = new QName("http://www.telefonica.com/schemas/UNICA/REST/sms/v1/", "smsDeliveryStatusUpdate");
    private final static QName _ReceivedSMSAsync_QNAME = new QName("http://www.telefonica.com/schemas/UNICA/REST/sms/v1/", "receivedSMSAsync");
    private final static QName _SmsRingTone_QNAME = new QName("http://www.telefonica.com/schemas/UNICA/REST/sms/v1/", "smsRingTone");
    private final static QName _ReceivedSMS_QNAME = new QName("http://www.telefonica.com/schemas/UNICA/REST/sms/v1/", "receivedSMS");
    private final static QName _SmsLogo_QNAME = new QName("http://www.telefonica.com/schemas/UNICA/REST/sms/v1/", "smsLogo");
    private final static QName _SmsDeliveryStatus_QNAME = new QName("http://www.telefonica.com/schemas/UNICA/REST/sms/v1/", "smsDeliveryStatus");
    private final static QName _SmsText_QNAME = new QName("http://www.telefonica.com/schemas/UNICA/REST/sms/v1/", "smsText");
    private final static QName _SmsNotification_QNAME = new QName("http://www.telefonica.com/schemas/UNICA/REST/sms/v1/", "smsNotification");
    private final static QName _DeliveryReceiptNotification_QNAME = new QName("http://www.telefonica.com/schemas/UNICA/REST/sms/v1/", "deliveryReceiptNotification");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.telefonica.schemas.unica.rest.sms.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SMSNotificationType }
     * 
     */
    public SMSNotificationType createSMSNotificationType() {
        return new SMSNotificationType();
    }

    /**
     * Create an instance of {@link DeliveryReceiptNotificationType }
     * 
     */
    public DeliveryReceiptNotificationType createDeliveryReceiptNotificationType() {
        return new DeliveryReceiptNotificationType();
    }

    /**
     * Create an instance of {@link SMSRingToneType }
     * 
     */
    public SMSRingToneType createSMSRingToneType() {
        return new SMSRingToneType();
    }

    /**
     * Create an instance of {@link SMSLogoType }
     * 
     */
    public SMSLogoType createSMSLogoType() {
        return new SMSLogoType();
    }

    /**
     * Create an instance of {@link ReceivedSMSType }
     * 
     */
    public ReceivedSMSType createReceivedSMSType() {
        return new ReceivedSMSType();
    }

    /**
     * Create an instance of {@link SMSDeliveryStatusUpdateType }
     * 
     */
    public SMSDeliveryStatusUpdateType createSMSDeliveryStatusUpdateType() {
        return new SMSDeliveryStatusUpdateType();
    }

    /**
     * Create an instance of {@link ReceivedSMSAsyncType }
     * 
     */
    public ReceivedSMSAsyncType createReceivedSMSAsyncType() {
        return new ReceivedSMSAsyncType();
    }

    /**
     * Create an instance of {@link SMSTextType }
     * 
     */
    public SMSTextType createSMSTextType() {
        return new SMSTextType();
    }

    /**
     * Create an instance of {@link SMSDeliveryStatusType }
     * 
     */
    public SMSDeliveryStatusType createSMSDeliveryStatusType() {
        return new SMSDeliveryStatusType();
    }

    /**
     * Create an instance of {@link CoordinatesType }
     * 
     */
    public CoordinatesType createCoordinatesType() {
        return new CoordinatesType();
    }

    /**
     * Create an instance of {@link SMSMessageType }
     * 
     */
    public SMSMessageType createSMSMessageType() {
        return new SMSMessageType();
    }

    /**
     * Create an instance of {@link DeliveryInformationType }
     * 
     */
    public DeliveryInformationType createDeliveryInformationType() {
        return new DeliveryInformationType();
    }

    /**
     * Create an instance of {@link LocationInfoType }
     * 
     */
    public LocationInfoType createLocationInfoType() {
        return new LocationInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SMSDeliveryStatusUpdateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.telefonica.com/schemas/UNICA/REST/sms/v1/", name = "smsDeliveryStatusUpdate")
    public JAXBElement<SMSDeliveryStatusUpdateType> createSmsDeliveryStatusUpdate(SMSDeliveryStatusUpdateType value) {
        return new JAXBElement<SMSDeliveryStatusUpdateType>(_SmsDeliveryStatusUpdate_QNAME, SMSDeliveryStatusUpdateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceivedSMSAsyncType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.telefonica.com/schemas/UNICA/REST/sms/v1/", name = "receivedSMSAsync")
    public JAXBElement<ReceivedSMSAsyncType> createReceivedSMSAsync(ReceivedSMSAsyncType value) {
        return new JAXBElement<ReceivedSMSAsyncType>(_ReceivedSMSAsync_QNAME, ReceivedSMSAsyncType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SMSRingToneType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.telefonica.com/schemas/UNICA/REST/sms/v1/", name = "smsRingTone")
    public JAXBElement<SMSRingToneType> createSmsRingTone(SMSRingToneType value) {
        return new JAXBElement<SMSRingToneType>(_SmsRingTone_QNAME, SMSRingToneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceivedSMSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.telefonica.com/schemas/UNICA/REST/sms/v1/", name = "receivedSMS")
    public JAXBElement<ReceivedSMSType> createReceivedSMS(ReceivedSMSType value) {
        return new JAXBElement<ReceivedSMSType>(_ReceivedSMS_QNAME, ReceivedSMSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SMSLogoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.telefonica.com/schemas/UNICA/REST/sms/v1/", name = "smsLogo")
    public JAXBElement<SMSLogoType> createSmsLogo(SMSLogoType value) {
        return new JAXBElement<SMSLogoType>(_SmsLogo_QNAME, SMSLogoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SMSDeliveryStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.telefonica.com/schemas/UNICA/REST/sms/v1/", name = "smsDeliveryStatus")
    public JAXBElement<SMSDeliveryStatusType> createSmsDeliveryStatus(SMSDeliveryStatusType value) {
        return new JAXBElement<SMSDeliveryStatusType>(_SmsDeliveryStatus_QNAME, SMSDeliveryStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SMSTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.telefonica.com/schemas/UNICA/REST/sms/v1/", name = "smsText")
    public JAXBElement<SMSTextType> createSmsText(SMSTextType value) {
        return new JAXBElement<SMSTextType>(_SmsText_QNAME, SMSTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SMSNotificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.telefonica.com/schemas/UNICA/REST/sms/v1/", name = "smsNotification")
    public JAXBElement<SMSNotificationType> createSmsNotification(SMSNotificationType value) {
        return new JAXBElement<SMSNotificationType>(_SmsNotification_QNAME, SMSNotificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryReceiptNotificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.telefonica.com/schemas/UNICA/REST/sms/v1/", name = "deliveryReceiptNotification")
    public JAXBElement<DeliveryReceiptNotificationType> createDeliveryReceiptNotification(DeliveryReceiptNotificationType value) {
        return new JAXBElement<DeliveryReceiptNotificationType>(_DeliveryReceiptNotification_QNAME, DeliveryReceiptNotificationType.class, null, value);
    }

}
