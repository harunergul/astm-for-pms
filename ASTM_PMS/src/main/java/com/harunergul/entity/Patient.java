package com.harunergul.entity;

import com.harunergul.utils.Util;

import java.util.Date;

import com.harunergul.utils.ClassFieldOrder.FieldOrder;

/**
 * 	#: +-----+--------------+---------------------------------+-------------------+
	#: |  #  | ASTM Field # | ASTM Name                       | 	   Alias      |
	#: +=====+==============+=================================+===================+
	#: |   1 |        8.1.1 |                  Record Type ID |              type |
	#: +-----+--------------+---------------------------------+-------------------+
	#: |   2 |        8.1.2 |                 Sequence Number |               seq |
	#: +-----+--------------+---------------------------------+-------------------+
	#: |   3 |        8.1.3 |    Practice Assigned Patient ID |       practice_id |
	#: +-----+--------------+---------------------------------+-------------------+
	#: |   4 |        8.1.4 |  Laboratory Assigned Patient ID |     laboratory_id |
	#: +-----+--------------+---------------------------------+-------------------+
	#: |   5 |        8.1.5 |                      Patient ID |                id |
	#: +-----+--------------+---------------------------------+-------------------+
	#: |   6 |        8.1.6 |                    Patient Name |              name |
	#: +-----+--------------+---------------------------------+-------------------+
	#: |   7 |        8.1.7 |            Mother’s Maiden Name |       maiden_name |
	#: +-----+--------------+---------------------------------+-------------------+
	#: |   8 |        8.1.8 |                       Birthdate |         birthdate |
	#: +-----+--------------+---------------------------------+-------------------+
	#: |   9 |        8.1.9 |                     Patient Sex |               sex |
	#: +-----+--------------+---------------------------------+-------------------+
	#: |  10 |       8.1.10 |      Patient Race-Ethnic Origin |              race |
	#: +-----+--------------+---------------------------------+-------------------+
	#: |  11 |       8.1.11 |                 Patient Address |           address |
	#: +-----+--------------+---------------------------------+-------------------+
	#: |  12 |       8.1.12 |                  Reserved Field |          reserved |
	#: +-----+--------------+---------------------------------+-------------------+
	#: |  13 |       8.1.13 |        Patient Telephone Number |             phone |
	#: +-----+--------------+---------------------------------+-------------------+
	#: |  14 |       8.1.14 |          Attending Physician ID |      physician_id |
	#: +-----+--------------+---------------------------------+-------------------+
	#: |  15 |       8.1.15 |                Special Field #1 |         special_1 |
	#: +-----+--------------+---------------------------------+-------------------+
	#: |  16 |       8.1.16 |                Special Field #2 |         special_2 |
	#: +-----+--------------+---------------------------------+-------------------+
	#: |  17 |       8.1.17 |                  Patient Height |            height |
	#: +-----+--------------+---------------------------------+-------------------+
	#: |  18 |       8.1.18 |                  Patient Weight |            weight |
	#: +-----+--------------+---------------------------------+-------------------+
	#: |  19 |       8.1.19 |       Patient’s Known Diagnosis |         diagnosis |
	#: +-----+--------------+---------------------------------+-------------------+
	#: |  20 |       8.1.20 |     Patient’s Active Medication |        medication |
	#: +-----+--------------+---------------------------------+-------------------+
	#: |  21 |       8.1.21 |                  Patient’s Diet |              diet |
	#: +-----+--------------+---------------------------------+-------------------+
	#: |  22 |       8.1.22 |            Practice Field No. 1 |  practice_field_1 |
	#: +-----+--------------+---------------------------------+-------------------+
	#: |  23 |       8.1.23 |            Practice Field No. 2 |  practice_field_2 |
	#: +-----+--------------+---------------------------------+-------------------+
	#: |  24 |       8.1.24 |       Admission/Discharge Dates |    admission_date |
	#: +-----+--------------+---------------------------------+-------------------+
	#: |  25 |       8.1.25 |                Admission Status |  admission_status |
	#: +-----+--------------+---------------------------------+-------------------+
	#: |  26 |       8.1.26 |                        Location |          location |
	#: +-----+--------------+---------------------------------+-------------------+
	#:
 */

/**
 * 
 * @author Harun ERGUL
 * @date Jan 7, 2021
 */
public class Patient extends Record {

	@FieldOrder(value = 1)
	private final String type = "P";

	@FieldOrder(value = 2)
	private Integer seq = 1;

	@FieldOrder(value = 3)
	private String practice_id;

	@FieldOrder(value = 4)
	private String laboratory_id;

	@FieldOrder(value = 5)
	private String id;

	@FieldOrder(value = 6)
	private String name;

	@FieldOrder(value = 7)
	private String maiden_name;

	@FieldOrder(value = 8)
	private Date birthdate;

	@FieldOrder(value = 9)
	private String sex;

	@FieldOrder(value = 10)
	private String race;

	@FieldOrder(value = 11)
	private String address;

	@FieldOrder(value = 12)
	private String reserved;

	@FieldOrder(value = 13)
	private String phone;

	@FieldOrder(value = 14)
	private String physician_id;

	@FieldOrder(value = 15)
	private String special_1;

	@FieldOrder(value = 16)
	private String special_2;

	@FieldOrder(value = 17)
	private String height;

	@FieldOrder(value = 18)
	private String weight;

	@FieldOrder(value = 19)
	private String diagnosis;

	@FieldOrder(value = 20)
	private String medication;

	@FieldOrder(value = 21)
	private String diet;

	@FieldOrder(value = 22)
	private String practice_field_1;

	@FieldOrder(value = 23)
	private String practice_field_2;

	@FieldOrder(value = 24)
	private Date admission_date;

	@FieldOrder(value = 25)
	private String admission_status;

	@FieldOrder(value = 26)
	private String location;

	@FieldOrder(value = 27)
	private String diagnostic_code_nature;

	@FieldOrder(value = 28)
	private String diagnostic_code;

	@FieldOrder(value = 29)
	private String religion;

	@FieldOrder(value = 30)
	private String martial_status;

	@FieldOrder(value = 31)
	private String isolation_status;

	@FieldOrder(value = 32)
	private String language;

	@FieldOrder(value = 33)
	private String hospital_service;

	@FieldOrder(value = 34)
	private String hospital_institution;

	@FieldOrder(value = 35)
	private String dosage_category;

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public String getPractice_id() {
		return practice_id;
	}

	public void setPractice_id(String practice_id) {
		this.practice_id = practice_id;
	}

	public String getLaboratory_id() {
		return laboratory_id;
	}

	public void setLaboratory_id(String laboratory_id) {
		this.laboratory_id = laboratory_id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String patientName, String patientSurname) {
		String name = "";
		if (patientSurname != null) {
			name = patientSurname.trim();
		}

		if (patientName != null) {
			name = name + "^" + patientName.trim();
		}
		name = Util.replaceTurkishChars(name);

		this.name = name.toUpperCase();
	}

	public String getMaiden_name() {
		return maiden_name;
	}

	public void setMaiden_name(String maiden_name) {
		this.maiden_name = maiden_name;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getReserved() {
		return reserved;
	}

	public void setReserved(String reserved) {
		this.reserved = reserved;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhysician_id() {
		return physician_id;
	}

	public void setPhysician_id(String physician_id) {
		this.physician_id = physician_id;
	}

	public String getSpecial_1() {
		return special_1;
	}

	public void setSpecial_1(String special_1) {
		this.special_1 = special_1;
	}

	public String getSpecial_2() {
		return special_2;
	}

	public void setSpecial_2(String special_2) {
		this.special_2 = special_2;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getMedication() {
		return medication;
	}

	public void setMedication(String medication) {
		this.medication = medication;
	}

	public String getDiet() {
		return diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	public String getPractice_field_1() {
		return practice_field_1;
	}

	public void setPractice_field_1(String practice_field_1) {
		this.practice_field_1 = practice_field_1;
	}

	public String getPractice_field_2() {
		return practice_field_2;
	}

	public void setPractice_field_2(String practice_field_2) {
		this.practice_field_2 = practice_field_2;
	}

	public Date getAdmission_date() {
		return admission_date;
	}

	public void setAdmission_date(Date admission_date) {
		this.admission_date = admission_date;
	}

	public String getAdmission_status() {
		return admission_status;
	}

	public void setAdmission_status(String admission_status) {
		this.admission_status = admission_status;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDiagnostic_code_nature() {
		return diagnostic_code_nature;
	}

	public void setDiagnostic_code_nature(String diagnostic_code_nature) {
		this.diagnostic_code_nature = diagnostic_code_nature;
	}

	public String getDiagnostic_code() {
		return diagnostic_code;
	}

	public void setDiagnostic_code(String diagnostic_code) {
		this.diagnostic_code = diagnostic_code;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getMartial_status() {
		return martial_status;
	}

	public void setMartial_status(String martial_status) {
		this.martial_status = martial_status;
	}

	public String getIsolation_status() {
		return isolation_status;
	}

	public void setIsolation_status(String isolation_status) {
		this.isolation_status = isolation_status;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getHospital_service() {
		return hospital_service;
	}

	public void setHospital_service(String hospital_service) {
		this.hospital_service = hospital_service;
	}

	public String getHospital_institution() {
		return hospital_institution;
	}

	public void setHospital_institution(String hospital_institution) {
		this.hospital_institution = hospital_institution;
	}

	public String getDosage_category() {
		return dosage_category;
	}

	public void setDosage_category(String dosage_category) {
		this.dosage_category = dosage_category;
	}

	public String getType() {
		return type;
	}

}
