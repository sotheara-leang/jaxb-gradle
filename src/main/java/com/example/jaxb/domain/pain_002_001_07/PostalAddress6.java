//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.23 at 09:33:09 AM ICT 
//


package com.example.jaxb.domain.pain_002_001_07;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for PostalAddress6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostalAddress6"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdrTp" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}AddressType2Code" minOccurs="0"/&gt;
 *         &lt;element name="Dept" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="SubDept" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="StrtNm" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="BldgNb" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}Max16Text" minOccurs="0"/&gt;
 *         &lt;element name="PstCd" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}Max16Text" minOccurs="0"/&gt;
 *         &lt;element name="TwnNm" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="CtrySubDvsn" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="AdrLine" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.07}Max70Text" maxOccurs="7" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddress6", propOrder = {
    "adrTp",
    "dept",
    "subDept",
    "strtNm",
    "bldgNb",
    "pstCd",
    "twnNm",
    "ctrySubDvsn",
    "ctry",
    "adrLine"
})
public class PostalAddress6 implements ToString2
{

    @XmlElement(name = "AdrTp")
    @XmlSchemaType(name = "string")
    protected AddressType2Code adrTp;
    @XmlElement(name = "Dept")
    @Size(min = 1, max = 70)
    protected String dept;
    @XmlElement(name = "SubDept")
    @Size(min = 1, max = 70)
    protected String subDept;
    @XmlElement(name = "StrtNm")
    @Size(min = 1, max = 70)
    protected String strtNm;
    @XmlElement(name = "BldgNb")
    @Size(min = 1, max = 16)
    protected String bldgNb;
    @XmlElement(name = "PstCd")
    @Size(min = 1, max = 16)
    protected String pstCd;
    @XmlElement(name = "TwnNm")
    @Size(min = 1, max = 35)
    protected String twnNm;
    @XmlElement(name = "CtrySubDvsn")
    @Size(min = 1, max = 35)
    protected String ctrySubDvsn;
    @XmlElement(name = "Ctry")
    @Pattern(regexp = "[A-Z]{2,2}")
    protected String ctry;
    @XmlElement(name = "AdrLine")
    @Size(min = 0, max = 7)
    protected List<String> adrLine;

    /**
     * Gets the value of the adrTp property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType2Code }
     *     
     */
    public AddressType2Code getAdrTp() {
        return adrTp;
    }

    /**
     * Sets the value of the adrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType2Code }
     *     
     */
    public void setAdrTp(AddressType2Code value) {
        this.adrTp = value;
    }

    /**
     * Gets the value of the dept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDept() {
        return dept;
    }

    /**
     * Sets the value of the dept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDept(String value) {
        this.dept = value;
    }

    /**
     * Gets the value of the subDept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubDept() {
        return subDept;
    }

    /**
     * Sets the value of the subDept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDept(String value) {
        this.subDept = value;
    }

    /**
     * Gets the value of the strtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrtNm() {
        return strtNm;
    }

    /**
     * Sets the value of the strtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrtNm(String value) {
        this.strtNm = value;
    }

    /**
     * Gets the value of the bldgNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBldgNb() {
        return bldgNb;
    }

    /**
     * Sets the value of the bldgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBldgNb(String value) {
        this.bldgNb = value;
    }

    /**
     * Gets the value of the pstCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstCd() {
        return pstCd;
    }

    /**
     * Sets the value of the pstCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstCd(String value) {
        this.pstCd = value;
    }

    /**
     * Gets the value of the twnNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwnNm() {
        return twnNm;
    }

    /**
     * Sets the value of the twnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwnNm(String value) {
        this.twnNm = value;
    }

    /**
     * Gets the value of the ctrySubDvsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrySubDvsn() {
        return ctrySubDvsn;
    }

    /**
     * Sets the value of the ctrySubDvsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrySubDvsn(String value) {
        this.ctrySubDvsn = value;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

    /**
     * Gets the value of the adrLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adrLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdrLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdrLine() {
        if (adrLine == null) {
            adrLine = new ArrayList<String>();
        }
        return this.adrLine;
    }

    public void setAdrLine(List<String> value) {
        this.adrLine = value;
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
            AddressType2Code theAdrTp;
            theAdrTp = this.getAdrTp();
            strategy.appendField(locator, this, "adrTp", buffer, theAdrTp, (this.adrTp!= null));
        }
        {
            String theDept;
            theDept = this.getDept();
            strategy.appendField(locator, this, "dept", buffer, theDept, (this.dept!= null));
        }
        {
            String theSubDept;
            theSubDept = this.getSubDept();
            strategy.appendField(locator, this, "subDept", buffer, theSubDept, (this.subDept!= null));
        }
        {
            String theStrtNm;
            theStrtNm = this.getStrtNm();
            strategy.appendField(locator, this, "strtNm", buffer, theStrtNm, (this.strtNm!= null));
        }
        {
            String theBldgNb;
            theBldgNb = this.getBldgNb();
            strategy.appendField(locator, this, "bldgNb", buffer, theBldgNb, (this.bldgNb!= null));
        }
        {
            String thePstCd;
            thePstCd = this.getPstCd();
            strategy.appendField(locator, this, "pstCd", buffer, thePstCd, (this.pstCd!= null));
        }
        {
            String theTwnNm;
            theTwnNm = this.getTwnNm();
            strategy.appendField(locator, this, "twnNm", buffer, theTwnNm, (this.twnNm!= null));
        }
        {
            String theCtrySubDvsn;
            theCtrySubDvsn = this.getCtrySubDvsn();
            strategy.appendField(locator, this, "ctrySubDvsn", buffer, theCtrySubDvsn, (this.ctrySubDvsn!= null));
        }
        {
            String theCtry;
            theCtry = this.getCtry();
            strategy.appendField(locator, this, "ctry", buffer, theCtry, (this.ctry!= null));
        }
        {
            List<String> theAdrLine;
            theAdrLine = (((this.adrLine!= null)&&(!this.adrLine.isEmpty()))?this.getAdrLine():null);
            strategy.appendField(locator, this, "adrLine", buffer, theAdrLine, ((this.adrLine!= null)&&(!this.adrLine.isEmpty())));
        }
        return buffer;
    }

}
