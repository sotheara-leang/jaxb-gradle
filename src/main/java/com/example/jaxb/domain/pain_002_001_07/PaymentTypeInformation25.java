//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.23 at 02:22:44 PM ICT 
//


package com.example.jaxb.domain.pain_002_001_07;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.example.jaxb.util.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for PaymentTypeInformation25 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTypeInformation25"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InstrPrty" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}Priority2Code" minOccurs="0"/&gt;
 *         &lt;element name="ClrChanl" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}ClearingChannel2Code" minOccurs="0"/&gt;
 *         &lt;element name="SvcLvl" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}ServiceLevel8Choice" minOccurs="0"/&gt;
 *         &lt;element name="LclInstrm" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}LocalInstrument2Choice" minOccurs="0"/&gt;
 *         &lt;element name="SeqTp" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}SequenceType3Code" minOccurs="0"/&gt;
 *         &lt;element name="CtgyPurp" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}CategoryPurpose1Choice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTypeInformation25", propOrder = {
    "instrPrty",
    "clrChanl",
    "svcLvl",
    "lclInstrm",
    "seqTp",
    "ctgyPurp"
})
public class PaymentTypeInformation25 implements ToString2
{

    @XmlElement(name = "InstrPrty")
    @XmlSchemaType(name = "string")
    protected Priority2Code instrPrty;
    @XmlElement(name = "ClrChanl")
    @XmlSchemaType(name = "string")
    protected ClearingChannel2Code clrChanl;
    @XmlElement(name = "SvcLvl")
    @Valid
    protected ServiceLevel8Choice svcLvl;
    @XmlElement(name = "LclInstrm")
    @Valid
    protected LocalInstrument2Choice lclInstrm;
    @XmlElement(name = "SeqTp")
    @XmlSchemaType(name = "string")
    protected SequenceType3Code seqTp;
    @XmlElement(name = "CtgyPurp")
    @Valid
    protected CategoryPurpose1Choice ctgyPurp;

    /**
     * Gets the value of the instrPrty property.
     * 
     * @return
     *     possible object is
     *     {@link Priority2Code }
     *     
     */
    public Priority2Code getInstrPrty() {
        return instrPrty;
    }

    /**
     * Sets the value of the instrPrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority2Code }
     *     
     */
    public void setInstrPrty(Priority2Code value) {
        this.instrPrty = value;
    }

    /**
     * Gets the value of the clrChanl property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingChannel2Code }
     *     
     */
    public ClearingChannel2Code getClrChanl() {
        return clrChanl;
    }

    /**
     * Sets the value of the clrChanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingChannel2Code }
     *     
     */
    public void setClrChanl(ClearingChannel2Code value) {
        this.clrChanl = value;
    }

    /**
     * Gets the value of the svcLvl property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLevel8Choice }
     *     
     */
    public ServiceLevel8Choice getSvcLvl() {
        return svcLvl;
    }

    /**
     * Sets the value of the svcLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLevel8Choice }
     *     
     */
    public void setSvcLvl(ServiceLevel8Choice value) {
        this.svcLvl = value;
    }

    /**
     * Gets the value of the lclInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link LocalInstrument2Choice }
     *     
     */
    public LocalInstrument2Choice getLclInstrm() {
        return lclInstrm;
    }

    /**
     * Sets the value of the lclInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalInstrument2Choice }
     *     
     */
    public void setLclInstrm(LocalInstrument2Choice value) {
        this.lclInstrm = value;
    }

    /**
     * Gets the value of the seqTp property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceType3Code }
     *     
     */
    public SequenceType3Code getSeqTp() {
        return seqTp;
    }

    /**
     * Sets the value of the seqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceType3Code }
     *     
     */
    public void setSeqTp(SequenceType3Code value) {
        this.seqTp = value;
    }

    /**
     * Gets the value of the ctgyPurp property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryPurpose1Choice }
     *     
     */
    public CategoryPurpose1Choice getCtgyPurp() {
        return ctgyPurp;
    }

    /**
     * Sets the value of the ctgyPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryPurpose1Choice }
     *     
     */
    public void setCtgyPurp(CategoryPurpose1Choice value) {
        this.ctgyPurp = value;
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
            Priority2Code theInstrPrty;
            theInstrPrty = this.getInstrPrty();
            strategy.appendField(locator, this, "instrPrty", buffer, theInstrPrty, (this.instrPrty!= null));
        }
        {
            ClearingChannel2Code theClrChanl;
            theClrChanl = this.getClrChanl();
            strategy.appendField(locator, this, "clrChanl", buffer, theClrChanl, (this.clrChanl!= null));
        }
        {
            ServiceLevel8Choice theSvcLvl;
            theSvcLvl = this.getSvcLvl();
            strategy.appendField(locator, this, "svcLvl", buffer, theSvcLvl, (this.svcLvl!= null));
        }
        {
            LocalInstrument2Choice theLclInstrm;
            theLclInstrm = this.getLclInstrm();
            strategy.appendField(locator, this, "lclInstrm", buffer, theLclInstrm, (this.lclInstrm!= null));
        }
        {
            SequenceType3Code theSeqTp;
            theSeqTp = this.getSeqTp();
            strategy.appendField(locator, this, "seqTp", buffer, theSeqTp, (this.seqTp!= null));
        }
        {
            CategoryPurpose1Choice theCtgyPurp;
            theCtgyPurp = this.getCtgyPurp();
            strategy.appendField(locator, this, "ctgyPurp", buffer, theCtgyPurp, (this.ctgyPurp!= null));
        }
        return buffer;
    }

}
