package com.harunergul.utils;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Comparator;

import org.apache.commons.lang3.StringUtils;

import com.harunergul.entity.ClassFieldOrder.FieldOrder;
import com.harunergul.entity.Order;

public class Util<T> {

	public static String[] getFieldsInOrder(Class<?> clazz) {
		Field[] fields = clazz.getDeclaredFields();

		Arrays.sort(fields, new Comparator<Field>() {
			public int compare(Field o1, Field o2) {
				FieldOrder or1 = o1.getAnnotation(FieldOrder.class);
				FieldOrder or2 = o2.getAnnotation(FieldOrder.class);

				if (or1 != null && or2 != null) {
					return or1.value() - or2.value();
				} else if (or1 != null && or2 == null) {
					return -1;
				} else if (or1 == null && or2 != null) {
					return 1;
				}
				return o1.getName().compareTo(o2.getName());
			}
		});

		String orderedFields[] = new String[fields.length];
		int i = 0;
		for (Field field : fields) {
			orderedFields[i] = field.getName();
			i++;
		}
		return orderedFields;
	}

	public static void main(String... args) {
		Order order = new Order();
		order.setAction_code("abc");
		order.setBiomaterial("ABCDEF");
		String[] fieldsss = Util.getFieldsInOrder(Order.class);
		System.out.println(StringUtils.join(fieldsss, "|"));
	}

}
