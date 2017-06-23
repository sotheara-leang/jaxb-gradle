//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.23 at 02:22:44 PM ICT 
//


package com.example.jaxb.domain.pain_007_001_06;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.example.jaxb.util.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for TaxRecord1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxRecord1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Ctgy" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="CtgyDtls" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="DbtrSts" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="CertId" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="FrmsCd" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Prd" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.06}TaxPeriod1" minOccurs="0"/&gt;
 *         &lt;element name="TaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.06}TaxAmount1" minOccurs="0"/&gt;
 *         &lt;element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.06}Max140Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxRecord1", propOrder = {
    "tp",
    "ctgy",
    "ctgyDtls",
    "dbtrSts",
    "certId",
    "frmsCd",
    "prd",
    "taxAmt",
    "addtlInf"
})
public class TaxRecord1 implements ToString2
{

    @XmlElement(name = "Tp")
    @Size(min = 1, max = 35)
    protected String tp;
    @XmlElement(name = "Ctgy")
    @Size(min = 1, max = 35)
    protected String ctgy;
    @XmlElement(name = "CtgyDtls")
    @Size(min = 1, max = 35)
    protected String ctgyDtls;
    @XmlElement(name = "DbtrSts")
    @Size(min = 1, max = 35)
    protected String dbtrSts;
    @XmlElement(name = "CertId")
    @Size(min = 1, max = 35)
    protected String certId;
    @XmlElement(name = "FrmsCd")
    @Size(min = 1, max = 35)
    protected String frmsCd;
    @XmlElement(name = "Prd")
    @Valid
    protected TaxPeriod1 prd;
    @XmlElement(name = "TaxAmt")
    @Valid
    protected TaxAmount1 taxAmt;
    @XmlElement(name = "AddtlInf")
    @Size(min = 1, max = 140)
    protected String addtlInf;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTp(String value) {
        this.tp = value;
    }

    /**
     * Gets the value of the ctgy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtgy() {
        return ctgy;
    }

    /**
     * Sets the value of the ctgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtgy(String value) {
        this.ctgy = value;
    }

    /**
     * Gets the value of the ctgyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtgyDtls() {
        return ctgyDtls;
    }

    /**
     * Sets the value of the ctgyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtgyDtls(String value) {
        this.ctgyDtls = value;
    }

    /**
     * Gets the value of the dbtrSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbtrSts() {
        return dbtrSts;
    }

    /**
     * Sets the value of the dbtrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbtrSts(String value) {
        this.dbtrSts = value;
    }

    /**
     * Gets the value of the certId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertId() {
        return certId;
    }

    /**
     * Sets the value of the certId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertId(String value) {
        this.certId = value;
    }

    /**
     * Gets the value of the frmsCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrmsCd() {
        return frmsCd;
    }

    /**
     * Sets the value of the frmsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrmsCd(String value) {
        this.frmsCd = value;
    }

    /**
     * Gets the value of the prd property.
     * 
     * @return
     *     possible object is
     *     {@link TaxPeriod1 }
     *     
     */
    public TaxPeriod1 getPrd() {
        return prd;
    }

    /**
     * Sets the value of the prd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxPeriod1 }
     *     
     */
    public void setPrd(TaxPeriod1 value) {
        this.prd = value;
    }

    /**
     * Gets the value of the taxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link TaxAmount1 }
     *     
     */
    public TaxAmount1 getTaxAmt() {
        return taxAmt;
    }

    /**
     * Sets the value of the taxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAmount1 }
     *     
     */
    public void setTaxAmt(TaxAmount1 value) {
        this.taxAmt = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
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
            String theTp;
            theTp = this.getTp();
            strategy.appendField(locator, this, "tp", buffer, theTp, (this.tp!= null));
        }
        {
            String theCtgy;
            theCtgy = this.getCtgy();
            strategy.appendField(locator, this, "ctgy", buffer, theCtgy, (this.ctgy!= null));
        }
        {
            String theCtgyDtls;
            theCtgyDtls = this.getCtgyDtls();
            strategy.appendField(locator, this, "ctgyDtls", buffer, theCtgyDtls, (this.ctgyDtls!= null));
        }
        {
            String theDbtrSts;
            theDbtrSts = this.getDbtrSts();
            strategy.appendField(locator, this, "dbtrSts", buffer, theDbtrSts, (this.dbtrSts!= null));
        }
        {
            String theCertId;
            theCertId = this.getCertId();
            strategy.appendField(locator, this, "certId", buffer, theCertId, (this.certId!= null));
        }
        {
            String theFrmsCd;
            theFrmsCd = this.getFrmsCd();
            strategy.appendField(locator, this, "frmsCd", buffer, theFrmsCd, (this.frmsCd!= null));
        }
        {
            TaxPeriod1 thePrd;
            thePrd = this.getPrd();
            strategy.appendField(locator, this, "prd", buffer, thePrd, (this.prd!= null));
        }
        {
            TaxAmount1 theTaxAmt;
            theTaxAmt = this.getTaxAmt();
            strategy.appendField(locator, this, "taxAmt", buffer, theTaxAmt, (this.taxAmt!= null));
        }
        {
            String theAddtlInf;
            theAddtlInf = this.getAddtlInf();
            strategy.appendField(locator, this, "addtlInf", buffer, theAddtlInf, (this.addtlInf!= null));
        }
        return buffer;
    }

}
