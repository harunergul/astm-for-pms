package com.harunergul;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import com.harunergul.entity.Header;
import com.harunergul.entity.Order;
import com.harunergul.entity.Patient;
import com.harunergul.entity.Record;
import com.harunergul.entity.types.OrderActionCode;
import com.harunergul.entity.types.OrderPriorityAction;
import com.harunergul.entity.types.OrderReportType;
import com.harunergul.utils.Codec;

public class Helper {

	public ArrayList<String> createOrderWithEmergency() {

		Header header = new Header();
		header.setTimestamp(new Date());
		header.setSender("ASTM-Host");

		Order order = new Order();
		order.setAction_code(OrderActionCode.ADD_ORDER);
		order.setReport_type(OrderReportType.ORDER_RECORD);
		order.setSample_id("165666");
		order.setPriority(OrderPriorityAction.ACIL_ISTEM_STAT);

		Patient patient = new Patient();
		patient.setSeq(1);
		patient.setLaboratory_id("204092702");
		patient.setName("ÖZGE", "ŞEVVAL");
		patient.setSex("F");
		patient.setAdmission_date(new Date());

		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.set(Calendar.YEAR, 1980);
		patient.setBirthdate(cal.getTime());

		ArrayList<String> tests = new ArrayList<String>();
		tests.add("10182");

		order.setTest(tests);

		ArrayList<Record> records = new ArrayList<Record>();
		records.add(header);
		records.add(patient);
		records.add(order);

		Codec codec = new Codec();
		return codec.encode(records, null, null, 1);
	}

	public ArrayList<String> createOrder() {
		Header header = new Header();
		header.setTimestamp(new Date());
		header.setSender("ASTM-Host");

		Order order = new Order();
		order.setAction_code(OrderActionCode.ADD_ORDER);
		order.setReport_type(OrderReportType.ORDER_RECORD);
		order.setSample_id("11703100");

		Patient patient = new Patient();
		patient.setSeq(1);
		patient.setLaboratory_id("204092702");
		patient.setName("ÖZGE", "ŞEVVAL");
		patient.setSex("F");
		patient.setAdmission_date(new Date());

		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.set(Calendar.YEAR, 1980);
		patient.setBirthdate(cal.getTime());

		ArrayList<String> tests = new ArrayList<String>();
		tests.add("717");
		tests.add("20600");
		tests.add("29070");
		order.setTest(tests);

		ArrayList<Record> records = new ArrayList<Record>();
		records.add(header);
		records.add(patient);
		records.add(order);

		Codec codec = new Codec();
		return codec.encode(records, null, null, 1);

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

	public ArrayList<String> deleteOrder() {
		Header header = new Header();
		header.setTimestamp(new Date());
		header.setSender("ASTM-Host");

		Order order = new Order();
		order.setAction_code(OrderActionCode.CANCEL_TEST);
		order.setReport_type(OrderReportType.ORDER_RECORD);
		order.setSample_id("11703100");

		Patient patient = new Patient();
		patient.setSeq(1);
		patient.setLaboratory_id("204092702");
		patient.setName("ÖZGE", "ŞEVVAL");
		patient.setSex("F");
		patient.setAdmission_date(new Date());

		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.set(Calendar.YEAR, 1980);
		patient.setBirthdate(cal.getTime());

		ArrayList<String> tests = new ArrayList<String>();
		tests.add("10182");

		order.setTest(tests);

		ArrayList<Record> records = new ArrayList<Record>();
		records.add(header);
		records.add(patient);
		records.add(order);

		Codec codec = new Codec();
		return codec.encode(records, null, null, 1);
	}

	public ArrayList<String> rerunOrder() {
		Header header = new Header();
		header.setTimestamp(new Date());
		header.setSender("ASTM-Host");

		Order order = new Order();
		order.setAction_code(OrderActionCode.ADD_ORDER);
		order.setReport_type(OrderReportType.CORRECTION);
		order.setLaboratory_field_2("R");
		order.setSample_id("11703100");

		Patient patient = new Patient();
		patient.setSeq(1);
		patient.setLaboratory_id("204092702");
		patient.setName("ÖZGE", "ŞEVVAL");
		patient.setSex("F");
		patient.setAdmission_date(new Date());

		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.set(Calendar.YEAR, 1980);
		patient.setBirthdate(cal.getTime());

		ArrayList<String> tests = new ArrayList<String>();
		tests.add("717");

		order.setTest(tests);

		ArrayList<Record> records = new ArrayList<Record>();
		records.add(header);
		records.add(patient);
		records.add(order);

		Codec codec = new Codec();
		return codec.encode(records, null, null, 1);
	}

	public ArrayList<String> rerunDilutionOrder() {
		Header header = new Header();
		header.setTimestamp(new Date());
		header.setSender("ASTM-Host");

		Order order = new Order();
		order.setPriority(OrderPriorityAction.ACIL_ISTEM_STAT);
		order.setAction_code(OrderActionCode.ADD_ORDER);
		order.setReport_type(OrderReportType.CORRECTION);
		order.setLaboratory_field_2("R");
		order.setSample_id("11703100");

		Patient patient = new Patient();
		patient.setSeq(1);
		patient.setLaboratory_id("204092702");
		patient.setName("ÖZGE", "ŞEVVAL");
		patient.setSex("F");
		patient.setAdmission_date(new Date());

		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.set(Calendar.YEAR, 1980);
		patient.setBirthdate(cal.getTime());

		ArrayList<String> tests = new ArrayList<String>();
		tests.add("717^..100");

		order.setTest(tests);

		ArrayList<Record> records = new ArrayList<Record>();
		records.add(header);
		records.add(patient);
		records.add(order);

		Codec codec = new Codec();
		return codec.encode(records, null, null, 1);
	}
}
