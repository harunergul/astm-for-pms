package com.harunergul.utils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.harunergul.entity.Order;
import com.harunergul.entity.types.OrderActionCode;
import com.harunergul.utils.ClassFieldOrder.FieldOrder;

/**
 * 
 * @author Harun ERGUL
 * @date Jan 6, 2021
 * @param <T>
 */
public class Util<T> {

	public static Field[] getFieldsFromObject(Object record) {
		return getFieldsInOrder(record.getClass());
	}

	public static Field[] getFieldsInOrder(Class<?> clazz) {
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

		return fields;
	}

	public static Boolean isInstance(Field field, Class<?> class1) {
//		System.out.println(class1.getTypeName());
//		System.out.println(class1.getTypeName());
//		System.out.println(field.getType().getCanonicalName());
//		System.out.println("-------");
		if (field.getType().getCanonicalName().equals(class1.getTypeName())) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}

	}

	private static boolean isIterableClass(Class<?> clazz) {
		List<Class<?>> classes = new ArrayList<Class<?>>();
		computeClassHierarchy(clazz, classes);
		return classes.contains(Iterable.class);
	}

	/**
	 * Get all superclasses and interfaces recursively.
	 *
	 * @param clazz   The class to start the search with.
	 * @param classes List of classes to which to add all found super classes and
	 *                interfaces.
	 */
	private static void computeClassHierarchy(Class<?> clazz, List<Class<?>> classes) {
		for (Class current = clazz; current != null; current = current.getSuperclass()) {
			if (classes.contains(current)) {
				return;
			}
			classes.add(current);
			for (Class currentInterface : current.getInterfaces()) {
				computeClassHierarchy(currentInterface, classes);
			}
		}
	}

	public static void main(String... args) {
		Order order = new Order();
		order.setAction_code(OrderActionCode.CANCEL_TEST);
		order.setBiomaterial("ABCDEF"); //$NON-NLS-1$
		Field[] fieldsss = Util.getFieldsInOrder(Order.class);

		// System.out.println(StringUtils.join(fieldsss, "|"));
		// System.out.println(Util.isIterableClass(ArrayList.class));
	}

	public static String formatTests(ArrayList<?> tests) {

		ArrayList<String> testList = new ArrayList<String>();
		if (tests != null && tests.size() > 0) {
			if (tests.get(0) instanceof String) {
				for (Object object : tests) {
					String test = (String) object;
					testList.add(test);
				}
			} else if (tests.get(0) instanceof Integer) {
				for (Object object : tests) {
					Integer test = (Integer) object;
					testList.add(String.valueOf(test));
				}
			}

		}

		String appendedTest = StringUtils.join(testList, "\\^^^"); 
		return StringUtils.prependIfMissing(appendedTest, "^^^"); 

	}

	public static String replaceTurkishChars(String variable) {

		if (variable == null) {
			return ""; //$NON-NLS-1$
		} else {
			variable = variable.replace(Messages.getString("Util.4"), "C"); //$NON-NLS-1$ //$NON-NLS-2$
			variable = variable.replace(Messages.getString("Util.6"), "G"); //$NON-NLS-1$ //$NON-NLS-2$
			variable = variable.replace(Messages.getString("Util.8"), "I"); //$NON-NLS-1$ //$NON-NLS-2$
			variable = variable.replace(Messages.getString("Util.10"), "O"); //$NON-NLS-1$ //$NON-NLS-2$
			variable = variable.replace(Messages.getString("Util.12"), "S"); //$NON-NLS-1$ //$NON-NLS-2$
			variable = variable.replace(Messages.getString("Util.14"), "U"); //$NON-NLS-1$ //$NON-NLS-2$
			variable = variable.replace(Messages.getString("Util.16"), "g"); //$NON-NLS-1$ //$NON-NLS-2$
			variable = variable.replace(Messages.getString("Util.18"), "o"); //$NON-NLS-1$ //$NON-NLS-2$
			variable = variable.replace(Messages.getString("Util.20"), "s"); //$NON-NLS-1$ //$NON-NLS-2$
			variable = variable.replace(Messages.getString("Util.22"), "ü"); //$NON-NLS-1$ //$NON-NLS-2$
			return variable;
		}

	}

 
}
