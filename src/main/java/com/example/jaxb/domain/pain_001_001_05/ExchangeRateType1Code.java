//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.23 at 09:23:48 AM ICT 
//


package com.example.jaxb.domain.pain_001_001_05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeRateType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExchangeRateType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SPOT"/&gt;
 *     &lt;enumeration value="SALE"/&gt;
 *     &lt;enumeration value="AGRD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExchangeRateType1Code")
@XmlEnum
public enum ExchangeRateType1Code {

    SPOT,
    SALE,
    AGRD;

    public String value() {
        return name();
    }

    public static ExchangeRateType1Code fromValue(String v) {
        return valueOf(v);
    }

}
