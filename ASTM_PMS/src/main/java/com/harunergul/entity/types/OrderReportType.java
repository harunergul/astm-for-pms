package com.harunergul.entity.types;

/**
 * 
 * @author Harun ERGUL
 * @date Jan 6, 2021
 */
public enum OrderReportType {

	/**
	 * use
	 */
	ORDER_RECORD("O")// use when create order and cancel order
	, CORRECTION("C"); // use when you need to rerun test

	private String value;

	OrderReportType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
