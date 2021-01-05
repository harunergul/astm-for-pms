package com.harunergul.entity;

import com.harunergul.entity.ClassFieldOrder.FieldOrder;
 
/*
 * 
 #: +-----+--------------+--------------------------------+--------------------+
#: |  #  | ASTM Field # | ASTM Name                      | Python alias       |
#: +=====+==============+================================+====================+
#: |   1 |        9.4.1 |                 Record Type ID |               type |
#: +-----+--------------+--------------------------------+--------------------+
#: |   2 |        9.4.2 |                Sequence Number |                seq |
#: +-----+--------------+--------------------------------+--------------------+
#: |   3 |        9.4.3 |                    Specimen ID |          sample_id |
#: +-----+--------------+--------------------------------+--------------------+
#: |   4 |        9.4.4 |         Instrument Specimen ID |         instrument |
#: +-----+--------------+--------------------------------+--------------------+
#: |   5 |        9.4.5 |              Universal Test ID |               test |
#: +-----+--------------+--------------------------------+--------------------+
#: |   6 |        9.4.6 |                       Priority |           priority |
#: +-----+--------------+--------------------------------+--------------------+
#: |   7 |        9.4.7 |    Requested/Ordered Date/Time |         created_at |
#: +-----+--------------+--------------------------------+--------------------+
#: |   8 |        9.4.8 |  Specimen Collection Date/Time |         sampled_at |
#: +-----+--------------+--------------------------------+--------------------+
#: |   9 |        9.4.9 |            Collection End Time |       collected_at |
#: +-----+--------------+--------------------------------+--------------------+
#: |  10 |       9.4.10 |              Collection Volume |             volume |
#: +-----+--------------+--------------------------------+--------------------+
#: |  11 |       9.4.11 |                   Collector ID |          collector |
#: +-----+--------------+--------------------------------+--------------------+
#: |  12 |       9.4.12 |                    Action Code |        action_code |
#: +-----+--------------+--------------------------------+--------------------+
#: |  13 |       9.4.13 |                    Danger Code |        danger_code |
#: +-----+--------------+--------------------------------+--------------------+
#: |  14 |       9.4.14 |           Relevant Information |      clinical_info |
#: +-----+--------------+--------------------------------+--------------------+
#: |  15 |       9.4.15 |    Date/Time Specimen Received |       delivered_at |
#: +-----+--------------+--------------------------------+--------------------+
#: |  16 |       9.4.16 |            Specimen Descriptor |        biomaterial |
#: +-----+--------------+--------------------------------+--------------------+
#: |  17 |       9.4.17 |             Ordering Physician |          physician |
#: +-----+--------------+--------------------------------+--------------------+
#: |  18 |       9.4.18 |        Physician’s Telephone # |    physician_phone |
#: +-----+--------------+--------------------------------+--------------------+
#: |  19 |       9.4.19 |               User Field No. 1 |       user_field_1 |
#: +-----+--------------+--------------------------------+--------------------+
#: |  20 |       9.4.20 |               User Field No. 2 |       user_field_2 |
#: +-----+--------------+--------------------------------+--------------------+
#: |  21 |       9.4.21 |         Laboratory Field No. 1 | laboratory_field_1 |
#: +-----+--------------+--------------------------------+--------------------+
#: |  22 |       9.4.22 |         Laboratory Field No. 2 | laboratory_field_2 |
#: +-----+--------------+--------------------------------+--------------------+
#: |  23 |       9.4.23 |             Date/Time Reported |        modified_at |
#: +-----+--------------+--------------------------------+--------------------+
#: |  24 |       9.4.24 |              Instrument Charge |  instrument_charge |
#: +-----+--------------+--------------------------------+--------------------+
#: |  25 |       9.4.25 |          Instrument Section ID | instrument_section |
#: +-----+--------------+--------------------------------+--------------------+
#: |  26 |       9.4.26 |                    Report Type |        report_type |
#: +-----+--------------+--------------------------------+--------------------+
#:
*/

/**
 * 
 * @author Harun ERGUL
 * @date Jan 5, 2021
 */
public class Order extends Record{
	
	
	@FieldOrder(value=0)
	private String type = "O";
	
	@FieldOrder(value=1)
	private Integer seq = 1;
	
	@FieldOrder(value=2)
	private String sample_id;
	
	@FieldOrder(value=3)
	private String instrument;
	
	@FieldOrder(value=4)
	private String test;
	
	@FieldOrder(value=5)
	private String priority;
	
	@FieldOrder(value=6)
	private String created_at;

	@FieldOrder(value=7)
	private String sampled_at;
	
	@FieldOrder(value=8)
	private String collected_at;
	
	@FieldOrder(value=9)
	private String volume;
	
	@FieldOrder(value=10)
	private String collector;
	
	@FieldOrder(value=11)
	private String action_code;
	
	@FieldOrder(value=12)
	private String danger_code;
	
	@FieldOrder(value=13)
	private String clinical_info;
	
	@FieldOrder(value=14)
	private String delivered_at;
	
	@FieldOrder(value=15)
	private String biomaterial;
	
	@FieldOrder(value=16)
	private String physician;
	
	@FieldOrder(value=17)
	private String physician_phone;
	
	@FieldOrder(value=18)
	private String user_field_1;
	
	@FieldOrder(value=19)
	private String user_field_2;
	
	@FieldOrder(value=20)
	private String laboratory_field_1;
	
	@FieldOrder(value=21)
	private String laboratory_field_2;
	
	@FieldOrder(value=22)
	private String modified_at;
	
	@FieldOrder(value=23)
	private String instrument_charge;
	
	@FieldOrder(value=24)
	private String instrument_section;
	
	@FieldOrder(value=25)
	private String report_type;
	
	@FieldOrder(value=26)
	private String reserved;
	
	@FieldOrder(value=27)
	private String location_ward;
	
	@FieldOrder(value=28)
	private String infection_flag;
	
	@FieldOrder(value=29)
	private String specimen_service;
	
	@FieldOrder(value=30)
	private String laboratory;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public String getSample_id() {
		return sample_id;
	}

	public void setSample_id(String sample_id) {
		this.sample_id = sample_id;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getSampled_at() {
		return sampled_at;
	}

	public void setSampled_at(String sampled_at) {
		this.sampled_at = sampled_at;
	}

	public String getCollected_at() {
		return collected_at;
	}

	public void setCollected_at(String collected_at) {
		this.collected_at = collected_at;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getCollector() {
		return collector;
	}

	public void setCollector(String collector) {
		this.collector = collector;
	}

	public String getAction_code() {
		return action_code;
	}

	public void setAction_code(String action_code) {
		this.action_code = action_code;
	}

	public String getDanger_code() {
		return danger_code;
	}

	public void setDanger_code(String danger_code) {
		this.danger_code = danger_code;
	}

	public String getClinical_info() {
		return clinical_info;
	}

	public void setClinical_info(String clinical_info) {
		this.clinical_info = clinical_info;
	}

	public String getDelivered_at() {
		return delivered_at;
	}

	public void setDelivered_at(String delivered_at) {
		this.delivered_at = delivered_at;
	}

	public String getBiomaterial() {
		return biomaterial;
	}

	public void setBiomaterial(String biomaterial) {
		this.biomaterial = biomaterial;
	}

	public String getPhysician() {
		return physician;
	}

	public void setPhysician(String physician) {
		this.physician = physician;
	}

	public String getPhysician_phone() {
		return physician_phone;
	}

	public void setPhysician_phone(String physician_phone) {
		this.physician_phone = physician_phone;
	}

	public String getUser_field_1() {
		return user_field_1;
	}

	public void setUser_field_1(String user_field_1) {
		this.user_field_1 = user_field_1;
	}

	public String getUser_field_2() {
		return user_field_2;
	}

	public void setUser_field_2(String user_field_2) {
		this.user_field_2 = user_field_2;
	}

	public String getLaboratory_field_1() {
		return laboratory_field_1;
	}

	public void setLaboratory_field_1(String laboratory_field_1) {
		this.laboratory_field_1 = laboratory_field_1;
	}

	public String getLaboratory_field_2() {
		return laboratory_field_2;
	}

	public void setLaboratory_field_2(String laboratory_field_2) {
		this.laboratory_field_2 = laboratory_field_2;
	}

	public String getModified_at() {
		return modified_at;
	}

	public void setModified_at(String modified_at) {
		this.modified_at = modified_at;
	}

	public String getInstrument_charge() {
		return instrument_charge;
	}

	public void setInstrument_charge(String instrument_charge) {
		this.instrument_charge = instrument_charge;
	}

	public String getInstrument_section() {
		return instrument_section;
	}

	public void setInstrument_section(String instrument_section) {
		this.instrument_section = instrument_section;
	}

	public String getReport_type() {
		return report_type;
	}

	public void setReport_type(String report_type) {
		this.report_type = report_type;
	}

	public String getReserved() {
		return reserved;
	}

	public void setReserved(String reserved) {
		this.reserved = reserved;
	}

	public String getLocation_ward() {
		return location_ward;
	}

	public void setLocation_ward(String location_ward) {
		this.location_ward = location_ward;
	}

	public String getInfection_flag() {
		return infection_flag;
	}

	public void setInfection_flag(String infection_flag) {
		this.infection_flag = infection_flag;
	}

	public String getSpecimen_service() {
		return specimen_service;
	}

	public void setSpecimen_service(String specimen_service) {
		this.specimen_service = specimen_service;
	}

	public String getLaboratory() {
		return laboratory;
	}

	public void setLaboratory(String laboratory) {
		this.laboratory = laboratory;
	}

	public static void main(String... args) {
		Order order = new Order();
		
//		order.to
	}
}
