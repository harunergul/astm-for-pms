package com.harunergul.utils;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 
 * @author Harun ERGUL
 * @date Jan 5, 2021
 */
public class ClassFieldOrder {

	@Retention(RetentionPolicy.RUNTIME)
	public @interface FieldOrder {
		int value();
	}
}
