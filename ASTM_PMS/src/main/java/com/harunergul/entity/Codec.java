package com.harunergul.entity;

public class Codec {

	public void encode(Record[] records, String encoding, Integer size, int seq) {
		if (encoding == null) {
			encoding = Record.ENCODING;
		}
		if (seq == 0) {
			seq = 1;
		}

		encode_message(seq, records, encoding);

	}

	public void encode_message(int seq, Record[] records, String encoding) {
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

		for (Record record : records) {
			encode_record(record, encoding);
		}
//		 data = RECORD_SEP.join(encode_record(record, encoding)
//                 for record in records)
//data = b''.join((str(seq % 8).encode(), data, CR, ETX))
//return b''.join([STX, data, make_checksum(data), CR, LF])
	}

	private void encode_record(Record record, String encoding) {
		// TODO Auto-generated method stub

	}

}
