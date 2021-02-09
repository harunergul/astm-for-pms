package com.harunergul.entity;

/**
 * 
 * @author Harun ERGUL
 * @date Jan 13, 2021
 */
public abstract class Record {
	/**
	 * ASTM specification base encoding.
	 */
	public final static String ENCODING = "latin-1";

	/**
	 * Message start token.
	 */
	public final static byte STX = 0x02;

	/**
	 * Message end token.
	 */
	public final static byte ETX = 0x03;

	/**
	 * ASTM session termination token.
	 */
	public final static byte EOT = 0x04;

	/**
	 * ASTM session initialization token.
	 */
	public final static byte ENQ = 0x05;

	/**
	 * Command accepted token.
	 */
	public final static byte ACK = 0x06;

	/**
	 * Command rejected token.
	 */
	public final static byte NAK = 0x15;
	/**
	 * Message chunk end token.
	 */
	public final static byte ETB = 0x17;
	public final static byte LF = 0x0A;
	public final static byte CR = 0x0D;

	/**
	 * CR + LF shortcut.
	 */
	public final static byte CRLF = CR + LF;

	/**
	 * 
	 * Message records delimiter.
	 */
	public final static byte RECORD_SEP = 0x0D;

	public final static byte FIELD_SEP = 0x7C;

	/**
	 * Delimiter for repeated fields.
	 */
	public final static byte REPEAT_SEP = 0x5C;
	/**
	 * Field components delimiter.
	 */
	public final static byte COMPONENT_SEP = 0x5E;

	/**
	 * Date escape token.
	 */
	public final static byte ESCAPE_SEP = 0x26;

}
