package com.harunergul;

import java.util.ArrayList;
import java.util.Date;

import com.harunergul.entity.Header;
import com.harunergul.entity.Order;
import com.harunergul.entity.Record;
import com.harunergul.entity.types.OrderActionCode;
import com.harunergul.entity.types.OrderReportType;
import com.harunergul.utils.Codec;

public class Helper {

	public String createOrder() {

		Header header = new Header();
		header.setTimestamp(new Date());
		header.setSender("ASTM-Host");

		Order order = new Order();
		order.setAction_code(OrderActionCode.ADD_ORDER);
		order.setReport_type(OrderReportType.ORDER_RECORD);
		order.setSample_id("11703100");

		ArrayList<String> tests = new ArrayList<String>();
		tests.add("14755");
		tests.add("3754");
		tests.add("375441");
		order.setTest(tests);

		ArrayList<Record> records = new ArrayList<Record>();
		records.add(header);
		records.add(order);

		Codec codec = new Codec();
		System.out.println(codec.encode(records, null, null, 1));

		return null;
	}

	public String repeatOrder() {

		Header header = new Header();
		header.setTimestamp(new Date());
		header.setSender("ASTM-Host");

		Order order = new Order();
		order.setAction_code(OrderActionCode.RERUN_TEST);
		order.setReport_type(OrderReportType.CORRECTION);
		order.setSample_id("11703100");

		ArrayList<String> tests = new ArrayList<String>();
		tests.add("14755");
		tests.add("3754");
		tests.add("375441");
		order.setTest(tests);

		ArrayList<Record> records = new ArrayList<Record>();
		records.add(header);
		records.add(order);

		Codec codec = new Codec();
		System.out.println(codec.encode(records, null, null, 1));

		return null;
	}

	public String cancelOrder() {

		Header header = new Header();
		header.setTimestamp(new Date());
		header.setSender("ASTM-Host");

		Order order = new Order();
		order.setAction_code(OrderActionCode.CANCEL_TEST);
		order.setReport_type(OrderReportType.CORRECTION);
		order.setSample_id("11703100");

		ArrayList<String> tests = new ArrayList<String>();
		tests.add("14755");
		tests.add("3754");
		tests.add("375441");
		order.setTest(tests);

		ArrayList<Record> records = new ArrayList<Record>();
		records.add(header);
		records.add(order);

		Codec codec = new Codec();
		System.out.println(codec.encode(records, null, null, 1));

		return null;
	}
}
