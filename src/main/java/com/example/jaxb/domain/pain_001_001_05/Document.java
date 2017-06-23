//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.23 at 09:23:48 AM ICT 
//


package com.example.jaxb.domain.pain_001_001_05;

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
 * &lt;complexType name="Document"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CstmrCdtTrfInitn" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.05}CustomerCreditTransferInitiationV05"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "customerCreditTransferInitiation"
})
@XmlRootElement(name = "Document")
public class Document {

    @XmlElement(name = "CstmrCdtTrfInitn", required = true)
    @NotNull
    @Valid
    protected CustomerCreditTransferInitiationV05 customerCreditTransferInitiation;

    /**
     * Gets the value of the customerCreditTransferInitiation property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerCreditTransferInitiationV05 }
     *     
     */
    public CustomerCreditTransferInitiationV05 getCustomerCreditTransferInitiation() {
        return customerCreditTransferInitiation;
    }

    /**
     * Sets the value of the customerCreditTransferInitiation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCreditTransferInitiationV05 }
     *     
     */
    public void setCustomerCreditTransferInitiation(CustomerCreditTransferInitiationV05 value) {
        this.customerCreditTransferInitiation = value;
    }

}
