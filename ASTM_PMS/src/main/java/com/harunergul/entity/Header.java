package com.harunergul.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.harunergul.utils.ClassFieldOrder.FieldOrder;

/*
 
#: +-----+--------------+---------------------------------+-------------------+
#: |  #  | ASTM Field # | ASTM Name                       |        Alias      |
#: +=====+==============+=================================+===================+
#: |   1 |        7.1.1 |             ASTM Record Type ID |              type |
#: +-----+--------------+---------------------------------+-------------------+
#: |   2 |        7.1.2 |            Delimiter Definition |         delimeter |
#: +-----+--------------+---------------------------------+-------------------+
#: |   3 |        7.1.3 |              Message Control ID |        message_id |
#: +-----+--------------+---------------------------------+-------------------+
#: |   4 |        7.1.4 |                 Access Password |          password |
#: +-----+--------------+---------------------------------+-------------------+
#: |   5 |        7.1.5 |               Sender Name or ID |            sender |
#: +-----+--------------+---------------------------------+-------------------+
#: |   6 |        7.1.6 |           Sender Street Address |           address |
#: +-----+--------------+---------------------------------+-------------------+
#: |   7 |        7.1.7 |                  Reserved Field |          reserved |
#: +-----+--------------+---------------------------------+-------------------+
#: |   8 |        7.1.8 |         Sender Telephone Number |             phone |
#: +-----+--------------+---------------------------------+-------------------+
#: |   9 |        7.1.9 |       Characteristics of Sender |              caps |
#: +-----+--------------+---------------------------------+-------------------+
#: |  10 |       7.1.10 |                     Receiver ID |          receiver |
#: +-----+--------------+---------------------------------+-------------------+
#: |  11 |       7.1.11 |                        Comments |          comments |
#: +-----+--------------+---------------------------------+-------------------+
#: |  12 |       7.1.12 |                   Processing ID |     processing_id |
#: +-----+--------------+---------------------------------+-------------------+
#: |  13 |       7.1.13 |                  Version Number |           version |
#: +-----+--------------+---------------------------------+-------------------+
#: |  14 |       7.1.14 |            Date/Time of Message |         timestamp |
#: +-----+--------------+---------------------------------+-------------------+
#:
 
 
 */
/**
 * 
 * @author Harun ERGUL
 * @date Jan 13, 2021
 */
public class Header extends Record {
	@FieldOrder(value = 0)
	private String type = "H";

	@FieldOrder(value = 1)
	private String delimeter = "\\^&";

	@FieldOrder(value = 2)
	private String message_id;

	@FieldOrder(value = 3)
	private String password;

	@FieldOrder(value = 4)
	private String sender;

	@FieldOrder(value = 5)
	private String address;

	@FieldOrder(value = 6)
	private String reserved;

	@FieldOrder(value = 7)
	private String phone;

	@FieldOrder(value = 8)
	private String caps;

	@FieldOrder(value = 9)
	private String receiver;

	@FieldOrder(value = 10)
	private String comments;

	@FieldOrder(value = 11)
	private String processing_id = "P";

	@FieldOrder(value = 12)
	private String version;

	@FieldOrder(value = 13)
	private Date timestamp;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDelimeter() {
		return delimeter;
	}

	public void setDelimeter(String delimeter) {
		this.delimeter = delimeter;
	}

	public String getMessage_id() {
		return message_id;
	}

	public void setMessage_id(String message_id) {
		this.message_id = message_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
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

	public String getCaps() {
		return caps;
	}

	public void setCaps(String caps) {
		this.caps = caps;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getProcessing_id() {
		return processing_id;
	}

	public void setProcessing_id(String processing_id) {
		this.processing_id = processing_id;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public static void main(String... args) {
		Header h = new Header();
		Date date = new Date();

		SimpleDateFormat format = new SimpleDateFormat("YYYYMMDDHHmm00");

		System.out.println(format.format(date.getTime()));
		System.out.println("20160405081500");
	}
}
