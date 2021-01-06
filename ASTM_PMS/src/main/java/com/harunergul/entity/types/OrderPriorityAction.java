package com.harunergul.entity.types;

/**
 * 
 * @author Harun ERGUL
 * @date Jan 6, 2021
 */
public enum OrderPriorityAction {
	ROUTINE("R"), ACIL_ISTEM_STAT("S"), MICROBIOLOGY("M");

	String value;

	OrderPriorityAction(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
