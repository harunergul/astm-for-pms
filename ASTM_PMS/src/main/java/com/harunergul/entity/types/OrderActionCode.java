package com.harunergul.entity.types;

/**
 * 
 * @author Harun ERGUL
 * @date Jan 6, 2021
 */
public enum OrderActionCode {
	/**
	 * C --> Cancel the named tests. A --> Add the tests to the existing sample with
	 * the patient and other demographic data X --> Sample or tests are in
	 * processing.
	 */

	ADD_ORDER("A"), RERUN_TEST("R"), CANCEL_TEST("C");

	private String value;

	OrderActionCode(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
