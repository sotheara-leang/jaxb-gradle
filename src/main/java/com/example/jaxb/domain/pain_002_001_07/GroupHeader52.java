//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.23 at 02:22:44 PM ICT 
//


package com.example.jaxb.domain.pain_002_001_07;

import java.util.Date;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
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
 * <p>Java class for GroupHeader52 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupHeader52"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}Max35Text"/&gt;
 *         &lt;element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}ISODateTime"/&gt;
 *         &lt;element name="InitgPty" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}PartyIdentification43" minOccurs="0"/&gt;
 *         &lt;element name="FwdgAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}BranchAndFinancialInstitutionIdentification5" minOccurs="0"/&gt;
 *         &lt;element name="DbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}BranchAndFinancialInstitutionIdentification5" minOccurs="0"/&gt;
 *         &lt;element name="CdtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}BranchAndFinancialInstitutionIdentification5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupHeader52", propOrder = {
    "msgId",
    "creDtTm",
    "initgPty",
    "fwdgAgt",
    "dbtrAgt",
    "cdtrAgt"
})
public class GroupHeader52 implements ToString2
{

    @XmlElement(name = "MsgId", required = true)
    @NotNull
    @Size(min = 1, max = 35)
    protected String msgId;
    @XmlElement(name = "CreDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(JAXBDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    @NotNull
    protected Date creDtTm;
    @XmlElement(name = "InitgPty")
    @Valid
    protected PartyIdentification43 initgPty;
    @XmlElement(name = "FwdgAgt")
    @Valid
    protected BranchAndFinancialInstitutionIdentification5 fwdgAgt;
    @XmlElement(name = "DbtrAgt")
    @Valid
    protected BranchAndFinancialInstitutionIdentification5 dbtrAgt;
    @XmlElement(name = "CdtrAgt")
    @Valid
    protected BranchAndFinancialInstitutionIdentification5 cdtrAgt;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgId(String value) {
        this.msgId = value;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreDtTm(Date value) {
        this.creDtTm = value;
    }

    /**
     * Gets the value of the initgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getInitgPty() {
        return initgPty;
    }

    /**
     * Sets the value of the initgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public void setInitgPty(PartyIdentification43 value) {
        this.initgPty = value;
    }

    /**
     * Gets the value of the fwdgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getFwdgAgt() {
        return fwdgAgt;
    }

    /**
     * Sets the value of the fwdgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public void setFwdgAgt(BranchAndFinancialInstitutionIdentification5 value) {
        this.fwdgAgt = value;
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
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public void setCdtrAgt(BranchAndFinancialInstitutionIdentification5 value) {
        this.cdtrAgt = value;
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
            String theMsgId;
            theMsgId = this.getMsgId();
            strategy.appendField(locator, this, "msgId", buffer, theMsgId, (this.msgId!= null));
        }
        {
            Date theCreDtTm;
            theCreDtTm = this.getCreDtTm();
            strategy.appendField(locator, this, "creDtTm", buffer, theCreDtTm, (this.creDtTm!= null));
        }
        {
            PartyIdentification43 theInitgPty;
            theInitgPty = this.getInitgPty();
            strategy.appendField(locator, this, "initgPty", buffer, theInitgPty, (this.initgPty!= null));
        }
        {
            BranchAndFinancialInstitutionIdentification5 theFwdgAgt;
            theFwdgAgt = this.getFwdgAgt();
            strategy.appendField(locator, this, "fwdgAgt", buffer, theFwdgAgt, (this.fwdgAgt!= null));
        }
        {
            BranchAndFinancialInstitutionIdentification5 theDbtrAgt;
            theDbtrAgt = this.getDbtrAgt();
            strategy.appendField(locator, this, "dbtrAgt", buffer, theDbtrAgt, (this.dbtrAgt!= null));
        }
        {
            BranchAndFinancialInstitutionIdentification5 theCdtrAgt;
            theCdtrAgt = this.getCdtrAgt();
            strategy.appendField(locator, this, "cdtrAgt", buffer, theCdtrAgt, (this.cdtrAgt!= null));
        }
        return buffer;
    }

}
