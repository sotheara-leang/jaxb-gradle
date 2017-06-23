//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.23 at 09:33:09 AM ICT 
//


package com.example.jaxb.domain.pain_002_001_07;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.example.jaxb.util.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for CustomerPaymentStatusReportV07 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerPaymentStatusReportV07"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GrpHdr" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}GroupHeader52"/&gt;
 *         &lt;element name="OrgnlGrpInfAndSts" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}OriginalGroupHeader1"/&gt;
 *         &lt;element name="OrgnlPmtInfAndSts" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}OriginalPaymentInstruction18" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "CustomerPaymentStatusReportV07", propOrder = {
    "grpHdr",
    "orgnlGrpInfAndSts",
    "orgnlPmtInfAndSts",
    "splmtryData"
})
public class CustomerPaymentStatusReportV07 implements ToString2
{

    @XmlElement(name = "GrpHdr", required = true)
    @NotNull
    @Valid
    protected GroupHeader52 grpHdr;
    @XmlElement(name = "OrgnlGrpInfAndSts", required = true)
    @NotNull
    @Valid
    protected OriginalGroupHeader1 orgnlGrpInfAndSts;
    @XmlElement(name = "OrgnlPmtInfAndSts")
    @Valid
    protected List<OriginalPaymentInstruction18> orgnlPmtInfAndSts;
    @XmlElement(name = "SplmtryData")
    @Valid
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader52 }
     *     
     */
    public GroupHeader52 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader52 }
     *     
     */
    public void setGrpHdr(GroupHeader52 value) {
        this.grpHdr = value;
    }

    /**
     * Gets the value of the orgnlGrpInfAndSts property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupHeader1 }
     *     
     */
    public OriginalGroupHeader1 getOrgnlGrpInfAndSts() {
        return orgnlGrpInfAndSts;
    }

    /**
     * Sets the value of the orgnlGrpInfAndSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupHeader1 }
     *     
     */
    public void setOrgnlGrpInfAndSts(OriginalGroupHeader1 value) {
        this.orgnlGrpInfAndSts = value;
    }

    /**
     * Gets the value of the orgnlPmtInfAndSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orgnlPmtInfAndSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgnlPmtInfAndSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginalPaymentInstruction18 }
     * 
     * 
     */
    public List<OriginalPaymentInstruction18> getOrgnlPmtInfAndSts() {
        if (orgnlPmtInfAndSts == null) {
            orgnlPmtInfAndSts = new ArrayList<OriginalPaymentInstruction18>();
        }
        return this.orgnlPmtInfAndSts;
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

    public void setOrgnlPmtInfAndSts(List<OriginalPaymentInstruction18> value) {
        this.orgnlPmtInfAndSts = value;
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
            GroupHeader52 theGrpHdr;
            theGrpHdr = this.getGrpHdr();
            strategy.appendField(locator, this, "grpHdr", buffer, theGrpHdr, (this.grpHdr!= null));
        }
        {
            OriginalGroupHeader1 theOrgnlGrpInfAndSts;
            theOrgnlGrpInfAndSts = this.getOrgnlGrpInfAndSts();
            strategy.appendField(locator, this, "orgnlGrpInfAndSts", buffer, theOrgnlGrpInfAndSts, (this.orgnlGrpInfAndSts!= null));
        }
        {
            List<OriginalPaymentInstruction18> theOrgnlPmtInfAndSts;
            theOrgnlPmtInfAndSts = (((this.orgnlPmtInfAndSts!= null)&&(!this.orgnlPmtInfAndSts.isEmpty()))?this.getOrgnlPmtInfAndSts():null);
            strategy.appendField(locator, this, "orgnlPmtInfAndSts", buffer, theOrgnlPmtInfAndSts, ((this.orgnlPmtInfAndSts!= null)&&(!this.orgnlPmtInfAndSts.isEmpty())));
        }
        {
            List<SupplementaryData1> theSplmtryData;
            theSplmtryData = (((this.splmtryData!= null)&&(!this.splmtryData.isEmpty()))?this.getSplmtryData():null);
            strategy.appendField(locator, this, "splmtryData", buffer, theSplmtryData, ((this.splmtryData!= null)&&(!this.splmtryData.isEmpty())));
        }
        return buffer;
    }

}
