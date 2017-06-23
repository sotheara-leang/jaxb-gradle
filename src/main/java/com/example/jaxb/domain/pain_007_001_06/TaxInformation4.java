//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.23 at 09:33:09 AM ICT 
//


package com.example.jaxb.domain.pain_007_001_06;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.Digits;
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
 * <p>Java class for TaxInformation4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxInformation4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cdtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.06}TaxParty1" minOccurs="0"/&gt;
 *         &lt;element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.06}TaxParty2" minOccurs="0"/&gt;
 *         &lt;element name="UltmtDbtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.06}TaxParty2" minOccurs="0"/&gt;
 *         &lt;element name="AdmstnZone" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="RefNb" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.06}Max140Text" minOccurs="0"/&gt;
 *         &lt;element name="Mtd" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="TtlTaxblBaseAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.06}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="TtlTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.06}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.06}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="SeqNb" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.06}Number" minOccurs="0"/&gt;
 *         &lt;element name="Rcrd" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.06}TaxRecord1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxInformation4", propOrder = {
    "cdtr",
    "dbtr",
    "ultmtDbtr",
    "admstnZone",
    "refNb",
    "mtd",
    "ttlTaxblBaseAmt",
    "ttlTaxAmt",
    "dt",
    "seqNb",
    "rcrd"
})
public class TaxInformation4 implements ToString2
{

    @XmlElement(name = "Cdtr")
    @Valid
    protected TaxParty1 cdtr;
    @XmlElement(name = "Dbtr")
    @Valid
    protected TaxParty2 dbtr;
    @XmlElement(name = "UltmtDbtr")
    @Valid
    protected TaxParty2 ultmtDbtr;
    @XmlElement(name = "AdmstnZone")
    @Size(min = 1, max = 35)
    protected String admstnZone;
    @XmlElement(name = "RefNb")
    @Size(min = 1, max = 140)
    protected String refNb;
    @XmlElement(name = "Mtd")
    @Size(min = 1, max = 35)
    protected String mtd;
    @XmlElement(name = "TtlTaxblBaseAmt")
    @Valid
    protected ActiveOrHistoricCurrencyAndAmount ttlTaxblBaseAmt;
    @XmlElement(name = "TtlTaxAmt")
    @Valid
    protected ActiveOrHistoricCurrencyAndAmount ttlTaxAmt;
    @XmlElement(name = "Dt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "SeqNb")
    @Digits(integer = 18, fraction = 0)
    protected BigDecimal seqNb;
    @XmlElement(name = "Rcrd")
    @Valid
    protected List<TaxRecord1> rcrd;

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link TaxParty1 }
     *     
     */
    public TaxParty1 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxParty1 }
     *     
     */
    public void setCdtr(TaxParty1 value) {
        this.cdtr = value;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link TaxParty2 }
     *     
     */
    public TaxParty2 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxParty2 }
     *     
     */
    public void setDbtr(TaxParty2 value) {
        this.dbtr = value;
    }

    /**
     * Gets the value of the ultmtDbtr property.
     * 
     * @return
     *     possible object is
     *     {@link TaxParty2 }
     *     
     */
    public TaxParty2 getUltmtDbtr() {
        return ultmtDbtr;
    }

    /**
     * Sets the value of the ultmtDbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxParty2 }
     *     
     */
    public void setUltmtDbtr(TaxParty2 value) {
        this.ultmtDbtr = value;
    }

    /**
     * Gets the value of the admstnZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdmstnZone() {
        return admstnZone;
    }

    /**
     * Sets the value of the admstnZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdmstnZone(String value) {
        this.admstnZone = value;
    }

    /**
     * Gets the value of the refNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNb() {
        return refNb;
    }

    /**
     * Sets the value of the refNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNb(String value) {
        this.refNb = value;
    }

    /**
     * Gets the value of the mtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtd() {
        return mtd;
    }

    /**
     * Sets the value of the mtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtd(String value) {
        this.mtd = value;
    }

    /**
     * Gets the value of the ttlTaxblBaseAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlTaxblBaseAmt() {
        return ttlTaxblBaseAmt;
    }

    /**
     * Sets the value of the ttlTaxblBaseAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setTtlTaxblBaseAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlTaxblBaseAmt = value;
    }

    /**
     * Gets the value of the ttlTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlTaxAmt() {
        return ttlTaxAmt;
    }

    /**
     * Sets the value of the ttlTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setTtlTaxAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlTaxAmt = value;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDt(XMLGregorianCalendar value) {
        this.dt = value;
    }

    /**
     * Gets the value of the seqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeqNb() {
        return seqNb;
    }

    /**
     * Sets the value of the seqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeqNb(BigDecimal value) {
        this.seqNb = value;
    }

    /**
     * Gets the value of the rcrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rcrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxRecord1 }
     * 
     * 
     */
    public List<TaxRecord1> getRcrd() {
        if (rcrd == null) {
            rcrd = new ArrayList<TaxRecord1>();
        }
        return this.rcrd;
    }

    public void setRcrd(List<TaxRecord1> value) {
        this.rcrd = value;
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
            TaxParty1 theCdtr;
            theCdtr = this.getCdtr();
            strategy.appendField(locator, this, "cdtr", buffer, theCdtr, (this.cdtr!= null));
        }
        {
            TaxParty2 theDbtr;
            theDbtr = this.getDbtr();
            strategy.appendField(locator, this, "dbtr", buffer, theDbtr, (this.dbtr!= null));
        }
        {
            TaxParty2 theUltmtDbtr;
            theUltmtDbtr = this.getUltmtDbtr();
            strategy.appendField(locator, this, "ultmtDbtr", buffer, theUltmtDbtr, (this.ultmtDbtr!= null));
        }
        {
            String theAdmstnZone;
            theAdmstnZone = this.getAdmstnZone();
            strategy.appendField(locator, this, "admstnZone", buffer, theAdmstnZone, (this.admstnZone!= null));
        }
        {
            String theRefNb;
            theRefNb = this.getRefNb();
            strategy.appendField(locator, this, "refNb", buffer, theRefNb, (this.refNb!= null));
        }
        {
            String theMtd;
            theMtd = this.getMtd();
            strategy.appendField(locator, this, "mtd", buffer, theMtd, (this.mtd!= null));
        }
        {
            ActiveOrHistoricCurrencyAndAmount theTtlTaxblBaseAmt;
            theTtlTaxblBaseAmt = this.getTtlTaxblBaseAmt();
            strategy.appendField(locator, this, "ttlTaxblBaseAmt", buffer, theTtlTaxblBaseAmt, (this.ttlTaxblBaseAmt!= null));
        }
        {
            ActiveOrHistoricCurrencyAndAmount theTtlTaxAmt;
            theTtlTaxAmt = this.getTtlTaxAmt();
            strategy.appendField(locator, this, "ttlTaxAmt", buffer, theTtlTaxAmt, (this.ttlTaxAmt!= null));
        }
        {
            XMLGregorianCalendar theDt;
            theDt = this.getDt();
            strategy.appendField(locator, this, "dt", buffer, theDt, (this.dt!= null));
        }
        {
            BigDecimal theSeqNb;
            theSeqNb = this.getSeqNb();
            strategy.appendField(locator, this, "seqNb", buffer, theSeqNb, (this.seqNb!= null));
        }
        {
            List<TaxRecord1> theRcrd;
            theRcrd = (((this.rcrd!= null)&&(!this.rcrd.isEmpty()))?this.getRcrd():null);
            strategy.appendField(locator, this, "rcrd", buffer, theRcrd, ((this.rcrd!= null)&&(!this.rcrd.isEmpty())));
        }
        return buffer;
    }

}
