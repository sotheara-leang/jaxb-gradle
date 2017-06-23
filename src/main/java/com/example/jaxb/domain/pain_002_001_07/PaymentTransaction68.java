//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.23 at 02:22:44 PM ICT 
//


package com.example.jaxb.domain.pain_002_001_07;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.example.jaxb.util.JAXBDateTimeAdapter;
import com.example.jaxb.util.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for PaymentTransaction68 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTransaction68"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StsId" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlInstrId" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlEndToEndId" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="TxSts" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}TransactionIndividualStatus3Code" minOccurs="0"/&gt;
 *         &lt;element name="StsRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}StatusReasonInformation9" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ChrgsInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}Charges2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AccptncDtTm" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}ISODateTime" minOccurs="0"/&gt;
 *         &lt;element name="AcctSvcrRef" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="ClrSysRef" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlTxRef" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}OriginalTransactionReference22" minOccurs="0"/&gt;
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTransaction68", propOrder = {
    "stsId",
    "orgnlInstrId",
    "orgnlEndToEndId",
    "txSts",
    "stsRsnInf",
    "chrgsInf",
    "accptncDtTm",
    "acctSvcrRef",
    "clrSysRef",
    "orgnlTxRef",
    "splmtryData"
})
public class PaymentTransaction68 implements ToString2
{

    @XmlElement(name = "StsId")
    @Size(min = 1, max = 35)
    protected String stsId;
    @XmlElement(name = "OrgnlInstrId")
    @Size(min = 1, max = 35)
    protected String orgnlInstrId;
    @XmlElement(name = "OrgnlEndToEndId")
    @Size(min = 1, max = 35)
    protected String orgnlEndToEndId;
    @XmlElement(name = "TxSts")
    @XmlSchemaType(name = "string")
    protected TransactionIndividualStatus3Code txSts;
    @XmlElement(name = "StsRsnInf")
    @Valid
    protected List<StatusReasonInformation9> stsRsnInf;
    @XmlElement(name = "ChrgsInf")
    @Valid
    protected List<Charges2> chrgsInf;
    @XmlElement(name = "AccptncDtTm", type = String.class)
    @XmlJavaTypeAdapter(JAXBDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date accptncDtTm;
    @XmlElement(name = "AcctSvcrRef")
    @Size(min = 1, max = 35)
    protected String acctSvcrRef;
    @XmlElement(name = "ClrSysRef")
    @Size(min = 1, max = 35)
    protected String clrSysRef;
    @XmlElement(name = "OrgnlTxRef")
    @Valid
    protected OriginalTransactionReference22 orgnlTxRef;
    @XmlElement(name = "SplmtryData")
    @Valid
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the stsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStsId() {
        return stsId;
    }

    /**
     * Sets the value of the stsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStsId(String value) {
        this.stsId = value;
    }

    /**
     * Gets the value of the orgnlInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlInstrId() {
        return orgnlInstrId;
    }

    /**
     * Sets the value of the orgnlInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlInstrId(String value) {
        this.orgnlInstrId = value;
    }

    /**
     * Gets the value of the orgnlEndToEndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlEndToEndId() {
        return orgnlEndToEndId;
    }

    /**
     * Sets the value of the orgnlEndToEndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlEndToEndId(String value) {
        this.orgnlEndToEndId = value;
    }

    /**
     * Gets the value of the txSts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIndividualStatus3Code }
     *     
     */
    public TransactionIndividualStatus3Code getTxSts() {
        return txSts;
    }

    /**
     * Sets the value of the txSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIndividualStatus3Code }
     *     
     */
    public void setTxSts(TransactionIndividualStatus3Code value) {
        this.txSts = value;
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
     * Gets the value of the chrgsInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chrgsInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrgsInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Charges2 }
     * 
     * 
     */
    public List<Charges2> getChrgsInf() {
        if (chrgsInf == null) {
            chrgsInf = new ArrayList<Charges2>();
        }
        return this.chrgsInf;
    }

    /**
     * Gets the value of the accptncDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getAccptncDtTm() {
        return accptncDtTm;
    }

    /**
     * Sets the value of the accptncDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccptncDtTm(Date value) {
        this.accptncDtTm = value;
    }

    /**
     * Gets the value of the acctSvcrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSvcrRef() {
        return acctSvcrRef;
    }

    /**
     * Sets the value of the acctSvcrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctSvcrRef(String value) {
        this.acctSvcrRef = value;
    }

    /**
     * Gets the value of the clrSysRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrSysRef() {
        return clrSysRef;
    }

    /**
     * Sets the value of the clrSysRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClrSysRef(String value) {
        this.clrSysRef = value;
    }

    /**
     * Gets the value of the orgnlTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalTransactionReference22 }
     *     
     */
    public OriginalTransactionReference22 getOrgnlTxRef() {
        return orgnlTxRef;
    }

    /**
     * Sets the value of the orgnlTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalTransactionReference22 }
     *     
     */
    public void setOrgnlTxRef(OriginalTransactionReference22 value) {
        this.orgnlTxRef = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
    }

    public void setStsRsnInf(List<StatusReasonInformation9> value) {
        this.stsRsnInf = value;
    }

    public void setChrgsInf(List<Charges2> value) {
        this.chrgsInf = value;
    }

    public void setSplmtryData(List<SupplementaryData1> value) {
        this.splmtryData = value;
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
            String theStsId;
            theStsId = this.getStsId();
            strategy.appendField(locator, this, "stsId", buffer, theStsId, (this.stsId!= null));
        }
        {
            String theOrgnlInstrId;
            theOrgnlInstrId = this.getOrgnlInstrId();
            strategy.appendField(locator, this, "orgnlInstrId", buffer, theOrgnlInstrId, (this.orgnlInstrId!= null));
        }
        {
            String theOrgnlEndToEndId;
            theOrgnlEndToEndId = this.getOrgnlEndToEndId();
            strategy.appendField(locator, this, "orgnlEndToEndId", buffer, theOrgnlEndToEndId, (this.orgnlEndToEndId!= null));
        }
        {
            TransactionIndividualStatus3Code theTxSts;
            theTxSts = this.getTxSts();
            strategy.appendField(locator, this, "txSts", buffer, theTxSts, (this.txSts!= null));
        }
        {
            List<StatusReasonInformation9> theStsRsnInf;
            theStsRsnInf = (((this.stsRsnInf!= null)&&(!this.stsRsnInf.isEmpty()))?this.getStsRsnInf():null);
            strategy.appendField(locator, this, "stsRsnInf", buffer, theStsRsnInf, ((this.stsRsnInf!= null)&&(!this.stsRsnInf.isEmpty())));
        }
        {
            List<Charges2> theChrgsInf;
            theChrgsInf = (((this.chrgsInf!= null)&&(!this.chrgsInf.isEmpty()))?this.getChrgsInf():null);
            strategy.appendField(locator, this, "chrgsInf", buffer, theChrgsInf, ((this.chrgsInf!= null)&&(!this.chrgsInf.isEmpty())));
        }
        {
            Date theAccptncDtTm;
            theAccptncDtTm = this.getAccptncDtTm();
            strategy.appendField(locator, this, "accptncDtTm", buffer, theAccptncDtTm, (this.accptncDtTm!= null));
        }
        {
            String theAcctSvcrRef;
            theAcctSvcrRef = this.getAcctSvcrRef();
            strategy.appendField(locator, this, "acctSvcrRef", buffer, theAcctSvcrRef, (this.acctSvcrRef!= null));
        }
        {
            String theClrSysRef;
            theClrSysRef = this.getClrSysRef();
            strategy.appendField(locator, this, "clrSysRef", buffer, theClrSysRef, (this.clrSysRef!= null));
        }
        {
            OriginalTransactionReference22 theOrgnlTxRef;
            theOrgnlTxRef = this.getOrgnlTxRef();
            strategy.appendField(locator, this, "orgnlTxRef", buffer, theOrgnlTxRef, (this.orgnlTxRef!= null));
        }
        {
            List<SupplementaryData1> theSplmtryData;
            theSplmtryData = (((this.splmtryData!= null)&&(!this.splmtryData.isEmpty()))?this.getSplmtryData():null);
            strategy.appendField(locator, this, "splmtryData", buffer, theSplmtryData, ((this.splmtryData!= null)&&(!this.splmtryData.isEmpty())));
        }
        return buffer;
    }

}
