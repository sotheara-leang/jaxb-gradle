//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.22 at 09:05:05 PM ICT 
//


package com.example.jaxb.domain.pain_002_001_07;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CstmrPmtStsRpt" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}CustomerPaymentStatusReportV07"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "customerPaymentStatusReport"
})
@XmlRootElement(name = "Document")
public class Document {

    @XmlElement(name = "CstmrPmtStsRpt", required = true)
    @NotNull
    @Valid
    protected CustomerPaymentStatusReportV07 customerPaymentStatusReport;

    /**
     * Gets the value of the customerPaymentStatusReport property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPaymentStatusReportV07 }
     *     
     */
    public CustomerPaymentStatusReportV07 getCustomerPaymentStatusReport() {
        return customerPaymentStatusReport;
    }

    /**
     * Sets the value of the customerPaymentStatusReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPaymentStatusReportV07 }
     *     
     */
    public void setCustomerPaymentStatusReport(CustomerPaymentStatusReportV07 value) {
        this.customerPaymentStatusReport = value;
    }

}
