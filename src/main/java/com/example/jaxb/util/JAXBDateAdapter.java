package com.example.jaxb.util;

import java.util.Calendar;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Adapter to convert date between xml and java date.
 * @author sotheara.leang
 *
 */
public class JAXBDateAdapter extends XmlAdapter<String, Date> {

	@Override
	public Date unmarshal(String xmlDate) throws Exception {
		return javax.xml.bind.DatatypeConverter.parseDate(xmlDate).getTime();
	}

	@Override
	public String marshal(Date javaDate) throws Exception {
		Calendar javaDateCalender = Calendar.getInstance();
		javaDateCalender.setTime(javaDate);
		
		return javax.xml.bind.DatatypeConverter.printDate(javaDateCalender);
	}
}
