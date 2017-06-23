//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.23 at 02:22:44 PM ICT 
//


package com.example.jaxb.domain.pain_001_001_05;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.example.jaxb.util.JAXBDateAdapter;
import com.example.jaxb.util.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for PaymentInstruction9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentInstruction9"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmtInfId" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.05}Max35Text"/&gt;
 *         &lt;element name="PmtMtd" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.05}PaymentMethod3Code"/&gt;
 *         &lt;element name="BtchBookg" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.05}BatchBookingIndicator" minOccurs="0"/&gt;
 *         &lt;element name="NbOfTxs" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.05}Max15NumericText" minOccurs="0"/&gt;
 *         &lt;element name="CtrlSum" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.05}DecimalNumber" minOccurs="0"/&gt;
 *         &lt;element name="PmtTpInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.05}PaymentTypeInformation19" minOccurs="0"/&gt;
 *         &lt;element name="ReqdExctnDt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.05}ISODate"/&gt;
 *         &lt;element name="PoolgAdjstmntDt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.05}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.05}PartyIdentification43"/&gt;
 *         &lt;element name="DbtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.05}CashAccount24"/&gt;
 *         &lt;element name="DbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.05}BranchAndFinancialInstitutionIdentification5"/&gt;
 *         &lt;element name="DbtrAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.05}CashAccount24" minOccurs="0"/&gt;
 *         &lt;element name="InstrForDbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.05}Max140Text" minOccurs="0"/&gt;
 *         &lt;element name="UltmtDbtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.05}PartyIdentification43" minOccurs="0"/&gt;
 *         &lt;element name="ChrgBr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.05}ChargeBearerType1Code" minOccurs="0"/&gt;
 *         &lt;element name="ChrgsAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.05}CashAccount24" minOccurs="0"/&gt;
 *         &lt;element name="ChrgsAcctAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.05}BranchAndFinancialInstitutionIdentification5" minOccurs="0"/&gt;
 *         &lt;element name="CdtTrfTxInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.05}CreditTransferTransaction6" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstruction9", propOrder = {
    "pmtInfId",
    "pmtMtd",
    "btchBookg",
    "nbOfTxs",
    "ctrlSum",
    "pmtTpInf",
    "reqdExctnDt",
    "poolgAdjstmntDt",
    "dbtr",
    "dbtrAcct",
    "dbtrAgt",
    "dbtrAgtAcct",
    "instrForDbtrAgt",
    "ultmtDbtr",
    "chrgBr",
    "chrgsAcct",
    "chrgsAcctAgt",
    "cdtTrfTxInf"
})
public class PaymentInstruction9 implements ToString2
{

    @XmlElement(name = "PmtInfId", required = true)
    @NotNull
    @Size(min = 1, max = 35)
    protected String pmtInfId;
    @XmlElement(name = "PmtMtd", required = true)
    @XmlSchemaType(name = "string")
    @NotNull
    protected PaymentMethod3Code pmtMtd;
    @XmlElement(name = "BtchBookg")
    protected Boolean btchBookg;
    @XmlElement(name = "NbOfTxs")
    @Pattern(regexp = "[0-9]{1,15}")
    protected String nbOfTxs;
    @XmlElement(name = "CtrlSum")
    @Digits(integer = 18, fraction = 17)
    protected BigDecimal ctrlSum;
    @XmlElement(name = "PmtTpInf")
    @Valid
    protected PaymentTypeInformation19 pmtTpInf;
    @XmlElement(name = "ReqdExctnDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(JAXBDateAdapter.class)
    @XmlSchemaType(name = "date")
    @NotNull
    protected Date reqdExctnDt;
    @XmlElement(name = "PoolgAdjstmntDt", type = String.class)
    @XmlJavaTypeAdapter(JAXBDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date poolgAdjstmntDt;
    @XmlElement(name = "Dbtr", required = true)
    @NotNull
    @Valid
    protected PartyIdentification43 dbtr;
    @XmlElement(name = "DbtrAcct", required = true)
    @NotNull
    @Valid
    protected CashAccount24 dbtrAcct;
    @XmlElement(name = "DbtrAgt", required = true)
    @NotNull
    @Valid
    protected BranchAndFinancialInstitutionIdentification5 dbtrAgt;
    @XmlElement(name = "DbtrAgtAcct")
    @Valid
    protected CashAccount24 dbtrAgtAcct;
    @XmlElement(name = "InstrForDbtrAgt")
    @Size(min = 1, max = 140)
    protected String instrForDbtrAgt;
    @XmlElement(name = "UltmtDbtr")
    @Valid
    protected PartyIdentification43 ultmtDbtr;
    @XmlElement(name = "ChrgBr")
    @XmlSchemaType(name = "string")
    protected ChargeBearerType1Code chrgBr;
    @XmlElement(name = "ChrgsAcct")
    @Valid
    protected CashAccount24 chrgsAcct;
    @XmlElement(name = "ChrgsAcctAgt")
    @Valid
    protected BranchAndFinancialInstitutionIdentification5 chrgsAcctAgt;
    @XmlElement(name = "CdtTrfTxInf", required = true)
    @NotNull
    @Size(min = 1)
    @Valid
    protected List<CreditTransferTransaction6> cdtTrfTxInf;

    /**
     * Gets the value of the pmtInfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtInfId() {
        return pmtInfId;
    }

    /**
     * Sets the value of the pmtInfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtInfId(String value) {
        this.pmtInfId = value;
    }

    /**
     * Gets the value of the pmtMtd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethod3Code }
     *     
     */
    public PaymentMethod3Code getPmtMtd() {
        return pmtMtd;
    }

    /**
     * Sets the value of the pmtMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethod3Code }
     *     
     */
    public void setPmtMtd(PaymentMethod3Code value) {
        this.pmtMtd = value;
    }

    /**
     * Gets the value of the btchBookg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBtchBookg() {
        return btchBookg;
    }

    /**
     * Sets the value of the btchBookg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBtchBookg(Boolean value) {
        this.btchBookg = value;
    }

    /**
     * Gets the value of the nbOfTxs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfTxs() {
        return nbOfTxs;
    }

    /**
     * Sets the value of the nbOfTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbOfTxs(String value) {
        this.nbOfTxs = value;
    }

    /**
     * Gets the value of the ctrlSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCtrlSum() {
        return ctrlSum;
    }

    /**
     * Sets the value of the ctrlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCtrlSum(BigDecimal value) {
        this.ctrlSum = value;
    }

    /**
     * Gets the value of the pmtTpInf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypeInformation19 }
     *     
     */
    public PaymentTypeInformation19 getPmtTpInf() {
        return pmtTpInf;
    }

    /**
     * Sets the value of the pmtTpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypeInformation19 }
     *     
     */
    public void setPmtTpInf(PaymentTypeInformation19 value) {
        this.pmtTpInf = value;
    }

    /**
     * Gets the value of the reqdExctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getReqdExctnDt() {
        return reqdExctnDt;
    }

    /**
     * Sets the value of the reqdExctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqdExctnDt(Date value) {
        this.reqdExctnDt = value;
    }

    /**
     * Gets the value of the poolgAdjstmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getPoolgAdjstmntDt() {
        return poolgAdjstmntDt;
    }

    /**
     * Sets the value of the poolgAdjstmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoolgAdjstmntDt(Date value) {
        this.poolgAdjstmntDt = value;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public void setDbtr(PartyIdentification43 value) {
        this.dbtr = value;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount24 }
     *     
     */
    public CashAccount24 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount24 }
     *     
     */
    public void setDbtrAcct(CashAccount24 value) {
        this.dbtrAcct = value;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public void setDbtrAgt(BranchAndFinancialInstitutionIdentification5 value) {
        this.dbtrAgt = value;
    }

    /**
     * Gets the value of the dbtrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount24 }
     *     
     */
    public CashAccount24 getDbtrAgtAcct() {
        return dbtrAgtAcct;
    }

    /**
     * Sets the value of the dbtrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount24 }
     *     
     */
    public void setDbtrAgtAcct(CashAccount24 value) {
        this.dbtrAgtAcct = value;
    }

    /**
     * Gets the value of the instrForDbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrForDbtrAgt() {
        return instrForDbtrAgt;
    }

    /**
     * Sets the value of the instrForDbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrForDbtrAgt(String value) {
        this.instrForDbtrAgt = value;
    }

    /**
     * Gets the value of the ultmtDbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getUltmtDbtr() {
        return ultmtDbtr;
    }

    /**
     * Sets the value of the ultmtDbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public void setUltmtDbtr(PartyIdentification43 value) {
        this.ultmtDbtr = value;
    }

    /**
     * Gets the value of the chrgBr property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBearerType1Code }
     *     
     */
    public ChargeBearerType1Code getChrgBr() {
        return chrgBr;
    }

    /**
     * Sets the value of the chrgBr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBearerType1Code }
     *     
     */
    public void setChrgBr(ChargeBearerType1Code value) {
        this.chrgBr = value;
    }

    /**
     * Gets the value of the chrgsAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount24 }
     *     
     */
    public CashAccount24 getChrgsAcct() {
        return chrgsAcct;
    }

    /**
     * Sets the value of the chrgsAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount24 }
     *     
     */
    public void setChrgsAcct(CashAccount24 value) {
        this.chrgsAcct = value;
    }

    /**
     * Gets the value of the chrgsAcctAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getChrgsAcctAgt() {
        return chrgsAcctAgt;
    }

    /**
     * Sets the value of the chrgsAcctAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public void setChrgsAcctAgt(BranchAndFinancialInstitutionIdentification5 value) {
        this.chrgsAcctAgt = value;
    }

    /**
     * Gets the value of the cdtTrfTxInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cdtTrfTxInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCdtTrfTxInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditTransferTransaction6 }
     * 
     * 
     */
    public List<CreditTransferTransaction6> getCdtTrfTxInf() {
        if (cdtTrfTxInf == null) {
            cdtTrfTxInf = new ArrayList<CreditTransferTransaction6>();
        }
        return this.cdtTrfTxInf;
    }

    public void setCdtTrfTxInf(List<CreditTransferTransaction6> value) {
        this.cdtTrfTxInf = value;
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
            String thePmtInfId;
            thePmtInfId = this.getPmtInfId();
            strategy.appendField(locator, this, "pmtInfId", buffer, thePmtInfId, (this.pmtInfId!= null));
        }
        {
            PaymentMethod3Code thePmtMtd;
            thePmtMtd = this.getPmtMtd();
            strategy.appendField(locator, this, "pmtMtd", buffer, thePmtMtd, (this.pmtMtd!= null));
        }
        {
            Boolean theBtchBookg;
            theBtchBookg = this.isBtchBookg();
            strategy.appendField(locator, this, "btchBookg", buffer, theBtchBookg, (this.btchBookg!= null));
        }
        {
            String theNbOfTxs;
            theNbOfTxs = this.getNbOfTxs();
            strategy.appendField(locator, this, "nbOfTxs", buffer, theNbOfTxs, (this.nbOfTxs!= null));
        }
        {
            BigDecimal theCtrlSum;
            theCtrlSum = this.getCtrlSum();
            strategy.appendField(locator, this, "ctrlSum", buffer, theCtrlSum, (this.ctrlSum!= null));
        }
        {
            PaymentTypeInformation19 thePmtTpInf;
            thePmtTpInf = this.getPmtTpInf();
            strategy.appendField(locator, this, "pmtTpInf", buffer, thePmtTpInf, (this.pmtTpInf!= null));
        }
        {
            Date theReqdExctnDt;
            theReqdExctnDt = this.getReqdExctnDt();
            strategy.appendField(locator, this, "reqdExctnDt", buffer, theReqdExctnDt, (this.reqdExctnDt!= null));
        }
        {
            Date thePoolgAdjstmntDt;
            thePoolgAdjstmntDt = this.getPoolgAdjstmntDt();
            strategy.appendField(locator, this, "poolgAdjstmntDt", buffer, thePoolgAdjstmntDt, (this.poolgAdjstmntDt!= null));
        }
        {
            PartyIdentification43 theDbtr;
            theDbtr = this.getDbtr();
            strategy.appendField(locator, this, "dbtr", buffer, theDbtr, (this.dbtr!= null));
        }
        {
            CashAccount24 theDbtrAcct;
            theDbtrAcct = this.getDbtrAcct();
            strategy.appendField(locator, this, "dbtrAcct", buffer, theDbtrAcct, (this.dbtrAcct!= null));
        }
        {
            BranchAndFinancialInstitutionIdentification5 theDbtrAgt;
            theDbtrAgt = this.getDbtrAgt();
            strategy.appendField(locator, this, "dbtrAgt", buffer, theDbtrAgt, (this.dbtrAgt!= null));
        }
        {
            CashAccount24 theDbtrAgtAcct;
            theDbtrAgtAcct = this.getDbtrAgtAcct();
            strategy.appendField(locator, this, "dbtrAgtAcct", buffer, theDbtrAgtAcct, (this.dbtrAgtAcct!= null));
        }
        {
            String theInstrForDbtrAgt;
            theInstrForDbtrAgt = this.getInstrForDbtrAgt();
            strategy.appendField(locator, this, "instrForDbtrAgt", buffer, theInstrForDbtrAgt, (this.instrForDbtrAgt!= null));
        }
        {
            PartyIdentification43 theUltmtDbtr;
            theUltmtDbtr = this.getUltmtDbtr();
            strategy.appendField(locator, this, "ultmtDbtr", buffer, theUltmtDbtr, (this.ultmtDbtr!= null));
        }
        {
            ChargeBearerType1Code theChrgBr;
            theChrgBr = this.getChrgBr();
            strategy.appendField(locator, this, "chrgBr", buffer, theChrgBr, (this.chrgBr!= null));
        }
        {
            CashAccount24 theChrgsAcct;
            theChrgsAcct = this.getChrgsAcct();
            strategy.appendField(locator, this, "chrgsAcct", buffer, theChrgsAcct, (this.chrgsAcct!= null));
        }
        {
            BranchAndFinancialInstitutionIdentification5 theChrgsAcctAgt;
            theChrgsAcctAgt = this.getChrgsAcctAgt();
            strategy.appendField(locator, this, "chrgsAcctAgt", buffer, theChrgsAcctAgt, (this.chrgsAcctAgt!= null));
        }
        {
            List<CreditTransferTransaction6> theCdtTrfTxInf;
            theCdtTrfTxInf = (((this.cdtTrfTxInf!= null)&&(!this.cdtTrfTxInf.isEmpty()))?this.getCdtTrfTxInf():null);
            strategy.appendField(locator, this, "cdtTrfTxInf", buffer, theCdtTrfTxInf, ((this.cdtTrfTxInf!= null)&&(!this.cdtTrfTxInf.isEmpty())));
        }
        return buffer;
    }

}
