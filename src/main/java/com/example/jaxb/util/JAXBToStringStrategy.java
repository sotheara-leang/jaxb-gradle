package com.example.jaxb.util;

import org.jvnet.jaxb2_commons.lang.DefaultToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;

/**
 * Strategy applied to {@link ToString2}.
 * @author sotheara.leang
 *
 */
public class JAXBToStringStrategy extends DefaultToStringStrategy {

	@Override
	protected void appendClassName(StringBuilder buffer, Object object) {
		buffer.append(getShortClassName(object.getClass()));
		buffer.append(" ");
	}
	
	@Override
	public boolean isUseIdentityHashCode() {
		return false;
	}
	
	@Override
	protected void appendArrayStart(StringBuilder buffer) {
		buffer.append("[");
	}
	
	@Override
	protected void appendArrayEnd(StringBuilder buffer) {
		buffer.append("]");
	}
}
