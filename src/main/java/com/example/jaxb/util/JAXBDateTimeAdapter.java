package com.example.jaxb.util;

import java.util.Calendar;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Adapter to convert datetime between xml and java date.
 * @author sotheara.leang
 *
 */
public class JAXBDateTimeAdapter extends XmlAdapter<String, Date> {

	@Override
	public Date unmarshal(String xmlDateTime) throws Exception {
		return javax.xml.bind.DatatypeConverter.parseDateTime(xmlDateTime).getTime();
	}

	@Override
	public String marshal(Date javaDate) throws Exception {
		Calendar javaDateCalender = Calendar.getInstance();
		javaDateCalender.setTime(javaDate);
		
		return javax.xml.bind.DatatypeConverter.printDateTime(javaDateCalender);
	}
}
