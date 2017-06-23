//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.23 at 02:22:44 PM ICT 
//


package com.example.jaxb.domain.pain_002_001_07;

import java.math.BigDecimal;
import java.util.ArrayList;
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
import com.example.jaxb.util.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for OriginalPaymentInstruction18 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginalPaymentInstruction18"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrgnlPmtInfId" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}Max35Text"/&gt;
 *         &lt;element name="OrgnlNbOfTxs" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}Max15NumericText" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlCtrlSum" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}DecimalNumber" minOccurs="0"/&gt;
 *         &lt;element name="PmtInfSts" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}TransactionGroupStatus3Code" minOccurs="0"/&gt;
 *         &lt;element name="StsRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}StatusReasonInformation9" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NbOfTxsPerSts" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}NumberOfTransactionsPerStatus3" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TxInfAndSts" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}PaymentTransaction68" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalPaymentInstruction18", propOrder = {
    "orgnlPmtInfId",
    "orgnlNbOfTxs",
    "orgnlCtrlSum",
    "pmtInfSts",
    "stsRsnInf",
    "nbOfTxsPerSts",
    "txInfAndSts"
})
public class OriginalPaymentInstruction18 implements ToString2
{

    @XmlElement(name = "OrgnlPmtInfId", required = true)
    @NotNull
    @Size(min = 1, max = 35)
    protected String orgnlPmtInfId;
    @XmlElement(name = "OrgnlNbOfTxs")
    @Pattern(regexp = "[0-9]{1,15}")
    protected String orgnlNbOfTxs;
    @XmlElement(name = "OrgnlCtrlSum")
    @Digits(integer = 18, fraction = 17)
    protected BigDecimal orgnlCtrlSum;
    @XmlElement(name = "PmtInfSts")
    @XmlSchemaType(name = "string")
    protected TransactionGroupStatus3Code pmtInfSts;
    @XmlElement(name = "StsRsnInf")
    @Valid
    protected List<StatusReasonInformation9> stsRsnInf;
    @XmlElement(name = "NbOfTxsPerSts")
    @Valid
    protected List<NumberOfTransactionsPerStatus3> nbOfTxsPerSts;
    @XmlElement(name = "TxInfAndSts")
    @Valid
    protected List<PaymentTransaction68> txInfAndSts;

    /**
     * Gets the value of the orgnlPmtInfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlPmtInfId() {
        return orgnlPmtInfId;
    }

    /**
     * Sets the value of the orgnlPmtInfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlPmtInfId(String value) {
        this.orgnlPmtInfId = value;
    }

    /**
     * Gets the value of the orgnlNbOfTxs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlNbOfTxs() {
        return orgnlNbOfTxs;
    }

    /**
     * Sets the value of the orgnlNbOfTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlNbOfTxs(String value) {
        this.orgnlNbOfTxs = value;
    }

    /**
     * Gets the value of the orgnlCtrlSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrgnlCtrlSum() {
        return orgnlCtrlSum;
    }

    /**
     * Sets the value of the orgnlCtrlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrgnlCtrlSum(BigDecimal value) {
        this.orgnlCtrlSum = value;
    }

    /**
     * Gets the value of the pmtInfSts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionGroupStatus3Code }
     *     
     */
    public TransactionGroupStatus3Code getPmtInfSts() {
        return pmtInfSts;
    }

    /**
     * Sets the value of the pmtInfSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionGroupStatus3Code }
     *     
     */
    public void setPmtInfSts(TransactionGroupStatus3Code value) {
        this.pmtInfSts = value;
    }

    /**
     * Gets the value of the stsRsnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stsRsnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStsRsnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusReasonInformation9 }
     * 
     * 
     */
    public List<StatusReasonInformation9> getStsRsnInf() {
        if (stsRsnInf == null) {
            stsRsnInf = new ArrayList<StatusReasonInformation9>();
        }
        return this.stsRsnInf;
    }

    /**
     * Gets the value of the nbOfTxsPerSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nbOfTxsPerSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNbOfTxsPerSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfTransactionsPerStatus3 }
     * 
     * 
     */
    public List<NumberOfTransactionsPerStatus3> getNbOfTxsPerSts() {
        if (nbOfTxsPerSts == null) {
            nbOfTxsPerSts = new ArrayList<NumberOfTransactionsPerStatus3>();
        }
        return this.nbOfTxsPerSts;
    }

    /**
     * Gets the value of the txInfAndSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txInfAndSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxInfAndSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTransaction68 }
     * 
     * 
     */
    public List<PaymentTransaction68> getTxInfAndSts() {
        if (txInfAndSts == null) {
            txInfAndSts = new ArrayList<PaymentTransaction68>();
        }
        return this.txInfAndSts;
    }

    public void setStsRsnInf(List<StatusReasonInformation9> value) {
        this.stsRsnInf = value;
    }

    public void setNbOfTxsPerSts(List<NumberOfTransactionsPerStatus3> value) {
        this.nbOfTxsPerSts = value;
    }

    public void setTxInfAndSts(List<PaymentTransaction68> value) {
        this.txInfAndSts = value;
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
            String theOrgnlPmtInfId;
            theOrgnlPmtInfId = this.getOrgnlPmtInfId();
            strategy.appendField(locator, this, "orgnlPmtInfId", buffer, theOrgnlPmtInfId, (this.orgnlPmtInfId!= null));
        }
        {
            String theOrgnlNbOfTxs;
            theOrgnlNbOfTxs = this.getOrgnlNbOfTxs();
            strategy.appendField(locator, this, "orgnlNbOfTxs", buffer, theOrgnlNbOfTxs, (this.orgnlNbOfTxs!= null));
        }
        {
            BigDecimal theOrgnlCtrlSum;
            theOrgnlCtrlSum = this.getOrgnlCtrlSum();
            strategy.appendField(locator, this, "orgnlCtrlSum", buffer, theOrgnlCtrlSum, (this.orgnlCtrlSum!= null));
        }
        {
            TransactionGroupStatus3Code thePmtInfSts;
            thePmtInfSts = this.getPmtInfSts();
            strategy.appendField(locator, this, "pmtInfSts", buffer, thePmtInfSts, (this.pmtInfSts!= null));
        }
        {
            List<StatusReasonInformation9> theStsRsnInf;
            theStsRsnInf = (((this.stsRsnInf!= null)&&(!this.stsRsnInf.isEmpty()))?this.getStsRsnInf():null);
            strategy.appendField(locator, this, "stsRsnInf", buffer, theStsRsnInf, ((this.stsRsnInf!= null)&&(!this.stsRsnInf.isEmpty())));
        }
        {
            List<NumberOfTransactionsPerStatus3> theNbOfTxsPerSts;
            theNbOfTxsPerSts = (((this.nbOfTxsPerSts!= null)&&(!this.nbOfTxsPerSts.isEmpty()))?this.getNbOfTxsPerSts():null);
            strategy.appendField(locator, this, "nbOfTxsPerSts", buffer, theNbOfTxsPerSts, ((this.nbOfTxsPerSts!= null)&&(!this.nbOfTxsPerSts.isEmpty())));
        }
        {
            List<PaymentTransaction68> theTxInfAndSts;
            theTxInfAndSts = (((this.txInfAndSts!= null)&&(!this.txInfAndSts.isEmpty()))?this.getTxInfAndSts():null);
            strategy.appendField(locator, this, "txInfAndSts", buffer, theTxInfAndSts, ((this.txInfAndSts!= null)&&(!this.txInfAndSts.isEmpty())));
        }
        return buffer;
    }

}
