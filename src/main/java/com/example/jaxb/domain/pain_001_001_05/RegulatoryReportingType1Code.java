//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.23 at 09:33:09 AM ICT 
//


package com.example.jaxb.domain.pain_001_001_05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegulatoryReportingType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RegulatoryReportingType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CRED"/&gt;
 *     &lt;enumeration value="DEBT"/&gt;
 *     &lt;enumeration value="BOTH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RegulatoryReportingType1Code")
@XmlEnum
public enum RegulatoryReportingType1Code {

    CRED,
    DEBT,
    BOTH;

    public String value() {
        return name();
    }

    public static RegulatoryReportingType1Code fromValue(String v) {
        return valueOf(v);
    }

}
