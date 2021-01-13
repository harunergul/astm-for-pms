package com.harunergul.utils;

public class Constants {

	/**
	 * ASTM specification base encoding.
	 */
	public final static String ENCODING = "latin-1";

	/**
	 * Message start token.
	 */
	public final static char STX = 2;

	/**
	 * Message end token.
	 */
	public final static char ETX = 3;

	/**
	 * ASTM session termination token.
	 */
	public final static char EOT = 4;

	/**
	 * ASTM session initialization token.
	 */
	public final static char ENQ = 5;

	/**
	 * Command accepted token.
	 */
	public final static char ACK = 6;

	/**
	 * Command rejected token.
	 */
	public final static byte NAK = 0x15;
	/**
	 * Message chunk end token.
	 */
	public final static char ETB =17;
//	public final static byte LF = 0x0A;
//	public final static byte CR = 0x0D;
	public final static char CR = 13;
	public final static char LF= 10;

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
