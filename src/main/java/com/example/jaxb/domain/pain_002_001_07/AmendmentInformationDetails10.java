//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.23 at 09:33:09 AM ICT 
//


package com.example.jaxb.domain.pain_002_001_07;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.example.jaxb.util.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for AmendmentInformationDetails10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmendmentInformationDetails10"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrgnlMndtId" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlCdtrSchmeId" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}PartyIdentification43" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlCdtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}BranchAndFinancialInstitutionIdentification5" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlCdtrAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}CashAccount24" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlDbtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}PartyIdentification43" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlDbtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}CashAccount24" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlDbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}BranchAndFinancialInstitutionIdentification5" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlDbtrAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}CashAccount24" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlFnlColltnDt" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}Frequency21Choice" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlRsn" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}MandateSetupReason1Choice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmendmentInformationDetails10", propOrder = {
    "orgnlMndtId",
    "orgnlCdtrSchmeId",
    "orgnlCdtrAgt",
    "orgnlCdtrAgtAcct",
    "orgnlDbtr",
    "orgnlDbtrAcct",
    "orgnlDbtrAgt",
    "orgnlDbtrAgtAcct",
    "orgnlFnlColltnDt",
    "orgnlFrqcy",
    "orgnlRsn"
})
public class AmendmentInformationDetails10 implements ToString2
{

    @XmlElement(name = "OrgnlMndtId")
    @Size(min = 1, max = 35)
    protected String orgnlMndtId;
    @XmlElement(name = "OrgnlCdtrSchmeId")
    @Valid
    protected PartyIdentification43 orgnlCdtrSchmeId;
    @XmlElement(name = "OrgnlCdtrAgt")
    @Valid
    protected BranchAndFinancialInstitutionIdentification5 orgnlCdtrAgt;
    @XmlElement(name = "OrgnlCdtrAgtAcct")
    @Valid
    protected CashAccount24 orgnlCdtrAgtAcct;
    @XmlElement(name = "OrgnlDbtr")
    @Valid
    protected PartyIdentification43 orgnlDbtr;
    @XmlElement(name = "OrgnlDbtrAcct")
    @Valid
    protected CashAccount24 orgnlDbtrAcct;
    @XmlElement(name = "OrgnlDbtrAgt")
    @Valid
    protected BranchAndFinancialInstitutionIdentification5 orgnlDbtrAgt;
    @XmlElement(name = "OrgnlDbtrAgtAcct")
    @Valid
    protected CashAccount24 orgnlDbtrAgtAcct;
    @XmlElement(name = "OrgnlFnlColltnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orgnlFnlColltnDt;
    @XmlElement(name = "OrgnlFrqcy")
    @Valid
    protected Frequency21Choice orgnlFrqcy;
    @XmlElement(name = "OrgnlRsn")
    @Valid
    protected MandateSetupReason1Choice orgnlRsn;

    /**
     * Gets the value of the orgnlMndtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlMndtId() {
        return orgnlMndtId;
    }

    /**
     * Sets the value of the orgnlMndtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlMndtId(String value) {
        this.orgnlMndtId = value;
    }

    /**
     * Gets the value of the orgnlCdtrSchmeId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getOrgnlCdtrSchmeId() {
        return orgnlCdtrSchmeId;
    }

    /**
     * Sets the value of the orgnlCdtrSchmeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public void setOrgnlCdtrSchmeId(PartyIdentification43 value) {
        this.orgnlCdtrSchmeId = value;
    }

    /**
     * Gets the value of the orgnlCdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getOrgnlCdtrAgt() {
        return orgnlCdtrAgt;
    }

    /**
     * Sets the value of the orgnlCdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public void setOrgnlCdtrAgt(BranchAndFinancialInstitutionIdentification5 value) {
        this.orgnlCdtrAgt = value;
    }

    /**
     * Gets the value of the orgnlCdtrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount24 }
     *     
     */
    public CashAccount24 getOrgnlCdtrAgtAcct() {
        return orgnlCdtrAgtAcct;
    }

    /**
     * Sets the value of the orgnlCdtrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount24 }
     *     
     */
    public void setOrgnlCdtrAgtAcct(CashAccount24 value) {
        this.orgnlCdtrAgtAcct = value;
    }

    /**
     * Gets the value of the orgnlDbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getOrgnlDbtr() {
        return orgnlDbtr;
    }

    /**
     * Sets the value of the orgnlDbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public void setOrgnlDbtr(PartyIdentification43 value) {
        this.orgnlDbtr = value;
    }

    /**
     * Gets the value of the orgnlDbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount24 }
     *     
     */
    public CashAccount24 getOrgnlDbtrAcct() {
        return orgnlDbtrAcct;
    }

    /**
     * Sets the value of the orgnlDbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount24 }
     *     
     */
    public void setOrgnlDbtrAcct(CashAccount24 value) {
        this.orgnlDbtrAcct = value;
    }

    /**
     * Gets the value of the orgnlDbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getOrgnlDbtrAgt() {
        return orgnlDbtrAgt;
    }

    /**
     * Sets the value of the orgnlDbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public void setOrgnlDbtrAgt(BranchAndFinancialInstitutionIdentification5 value) {
        this.orgnlDbtrAgt = value;
    }

    /**
     * Gets the value of the orgnlDbtrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount24 }
     *     
     */
    public CashAccount24 getOrgnlDbtrAgtAcct() {
        return orgnlDbtrAgtAcct;
    }

    /**
     * Sets the value of the orgnlDbtrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount24 }
     *     
     */
    public void setOrgnlDbtrAgtAcct(CashAccount24 value) {
        this.orgnlDbtrAgtAcct = value;
    }

    /**
     * Gets the value of the orgnlFnlColltnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrgnlFnlColltnDt() {
        return orgnlFnlColltnDt;
    }

    /**
     * Sets the value of the orgnlFnlColltnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrgnlFnlColltnDt(XMLGregorianCalendar value) {
        this.orgnlFnlColltnDt = value;
    }

    /**
     * Gets the value of the orgnlFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency21Choice }
     *     
     */
    public Frequency21Choice getOrgnlFrqcy() {
        return orgnlFrqcy;
    }

    /**
     * Sets the value of the orgnlFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency21Choice }
     *     
     */
    public void setOrgnlFrqcy(Frequency21Choice value) {
        this.orgnlFrqcy = value;
    }

    /**
     * Gets the value of the orgnlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link MandateSetupReason1Choice }
     *     
     */
    public MandateSetupReason1Choice getOrgnlRsn() {
        return orgnlRsn;
    }

    /**
     * Sets the value of the orgnlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateSetupReason1Choice }
     *     
     */
    public void setOrgnlRsn(MandateSetupReason1Choice value) {
        this.orgnlRsn = value;
    }

    public String toString() {
        final ToStringStrategy2 strategy = new JAXBToStringStrategy();
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            String theOrgnlMndtId;
            theOrgnlMndtId = this.getOrgnlMndtId();
            strategy.appendField(locator, this, "orgnlMndtId", buffer, theOrgnlMndtId, (this.orgnlMndtId!= null));
        }
        {
            PartyIdentification43 theOrgnlCdtrSchmeId;
            theOrgnlCdtrSchmeId = this.getOrgnlCdtrSchmeId();
            strategy.appendField(locator, this, "orgnlCdtrSchmeId", buffer, theOrgnlCdtrSchmeId, (this.orgnlCdtrSchmeId!= null));
        }
        {
            BranchAndFinancialInstitutionIdentification5 theOrgnlCdtrAgt;
            theOrgnlCdtrAgt = this.getOrgnlCdtrAgt();
            strategy.appendField(locator, this, "orgnlCdtrAgt", buffer, theOrgnlCdtrAgt, (this.orgnlCdtrAgt!= null));
        }
        {
            CashAccount24 theOrgnlCdtrAgtAcct;
            theOrgnlCdtrAgtAcct = this.getOrgnlCdtrAgtAcct();
            strategy.appendField(locator, this, "orgnlCdtrAgtAcct", buffer, theOrgnlCdtrAgtAcct, (this.orgnlCdtrAgtAcct!= null));
        }
        {
            PartyIdentification43 theOrgnlDbtr;
            theOrgnlDbtr = this.getOrgnlDbtr();
            strategy.appendField(locator, this, "orgnlDbtr", buffer, theOrgnlDbtr, (this.orgnlDbtr!= null));
        }
        {
            CashAccount24 theOrgnlDbtrAcct;
            theOrgnlDbtrAcct = this.getOrgnlDbtrAcct();
            strategy.appendField(locator, this, "orgnlDbtrAcct", buffer, theOrgnlDbtrAcct, (this.orgnlDbtrAcct!= null));
        }
        {
            BranchAndFinancialInstitutionIdentification5 theOrgnlDbtrAgt;
            theOrgnlDbtrAgt = this.getOrgnlDbtrAgt();
            strategy.appendField(locator, this, "orgnlDbtrAgt", buffer, theOrgnlDbtrAgt, (this.orgnlDbtrAgt!= null));
        }
        {
            CashAccount24 theOrgnlDbtrAgtAcct;
            theOrgnlDbtrAgtAcct = this.getOrgnlDbtrAgtAcct();
            strategy.appendField(locator, this, "orgnlDbtrAgtAcct", buffer, theOrgnlDbtrAgtAcct, (this.orgnlDbtrAgtAcct!= null));
        }
        {
            XMLGregorianCalendar theOrgnlFnlColltnDt;
            theOrgnlFnlColltnDt = this.getOrgnlFnlColltnDt();
            strategy.appendField(locator, this, "orgnlFnlColltnDt", buffer, theOrgnlFnlColltnDt, (this.orgnlFnlColltnDt!= null));
        }
        {
            Frequency21Choice theOrgnlFrqcy;
            theOrgnlFrqcy = this.getOrgnlFrqcy();
            strategy.appendField(locator, this, "orgnlFrqcy", buffer, theOrgnlFrqcy, (this.orgnlFrqcy!= null));
        }
        {
            MandateSetupReason1Choice theOrgnlRsn;
            theOrgnlRsn = this.getOrgnlRsn();
            strategy.appendField(locator, this, "orgnlRsn", buffer, theOrgnlRsn, (this.orgnlRsn!= null));
        }
        return buffer;
    }

}
