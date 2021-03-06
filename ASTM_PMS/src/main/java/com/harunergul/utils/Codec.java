package com.harunergul.utils;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.harunergul.entity.Header;
import com.harunergul.entity.Order;
import com.harunergul.entity.Patient;
import com.harunergul.entity.Record;
import com.harunergul.entity.types.OrderActionCode;

/**
 * 
 * @author Harun ERGUL
 * @date Jan 6, 2021
 */
public class Codec {

	public ArrayList<String> encode(ArrayList<Record> records, String encoding, Integer size, int seq) {
		if (encoding == null) {
			encoding = Record.ENCODING;
		}
		if (seq == 0) {
			seq = 1;
		}

		return encode_message(seq, records, encoding);

	}

	public ArrayList<String> encode_message(int seq, ArrayList<Record> records, String encoding) {
		/***
		 * Encodes ASTM message.
		 * 
		 * 
		 * :param seq: Frame sequence number. :type seq: int
		 * 
		 * :param records: List of ASTM records. :type records: list
		 * 
		 * :param encoding: Data encoding. :type encoding: str
		 * 
		 * :return: ASTM complete message with checksum and other control characters.
		 * :rtype: str
		 */
		ArrayList<String> recordStrings = new ArrayList<String>();
		for (Record record : records) {
			try {
				recordStrings.add(encode_record(record, encoding));
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		recordStrings.add("L|1|N");
		return recordStrings;

	}

	private String encode_record(Record record, String encoding)
			throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub

		Field[] fields = Util.getFieldsFromObject(record);
		ArrayList<String> appender = new ArrayList<String>();
		for (Field field : fields) {
			field.setAccessible(true);
			if (Util.isInstance(field, String.class)) {
				String result = (String) field.get(record);
				if (result == null) {
					result = "";
				}
				appender.add(result);
			} else if (Util.isInstance(field, Integer.class)) {
				String result = "";
				Integer fieldValue = (Integer) field.get(record);
				if (fieldValue != null) {
					result = String.valueOf(fieldValue);
				}
				appender.add(result);

			} else if (Util.isInstance(field, Date.class)) {
				String result = "";
				if (record instanceof Header) {
					Date resultDate = (Date) field.get(record);
					if (resultDate != null) {
						SimpleDateFormat format = new SimpleDateFormat("YYYYMMDDHHmm00");
						result = format.format(resultDate.getTime());
					}
				} else if (record instanceof Order) {
					Date resultDate = (Date) field.get(record);
					if (resultDate != null) {
						SimpleDateFormat format = new SimpleDateFormat("YYYYMMDDHHmm00");
						result = format.format(resultDate.getTime());
					}
				} else if (record instanceof Patient) {
					Date resultDate = (Date) field.get(record);
					if (resultDate != null) {
						SimpleDateFormat format = new SimpleDateFormat("YYYYMMDDHHmm00");
						if (field.getName().equals("birthdate")) {
							format = new SimpleDateFormat("YYYYMMDD");
						}
						result = format.format(resultDate.getTime());
					}
				}
				appender.add(result);
			}

		}

		return StringUtils.join(appender.toArray(), "|");

	}

	public static void main(String... args) {
		Order order = new Order();
		order.setAction_code(OrderActionCode.RERUN_TEST);
		order.setBiomaterial("DEF");
		Codec codec = new Codec();

		ArrayList<Record> records = new ArrayList<Record>();
		records.add(order);
		order.getTestHolder().add("516");
		order.getTestHolder().add("279");
		order.getTestHolder().add("386");
		order.getTestHolder().add("715");
		
		order.setTest(order.getTestHolder());

		System.out.println(codec.encode(records, null, 5, 1));
	}

}
