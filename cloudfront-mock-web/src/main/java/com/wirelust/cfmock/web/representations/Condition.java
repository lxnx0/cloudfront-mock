package com.wirelust.cfmock.web.representations;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.wirelust.cfmock.web.json.UnixTimestampDeserializer;

/**
 * Date: 26-Jun-2016
 *
 * @author T. Curran
 */
public class Condition {

	@JsonProperty("DateLessThan")
	DateLessThan dateLessThan;

	@JsonProperty("DateGreaterThan")
	DateGreaterThan dateGreaterThan;

	@JsonProperty("IpAddress")
	IPAddress ipAddress;

	public DateLessThan getDateLessThan() {
		return dateLessThan;
	}

	public void setDateLessThan(DateLessThan dateLessThan) {
		this.dateLessThan = dateLessThan;
	}

	public DateGreaterThan getDateGreaterThan() {
		return dateGreaterThan;
	}

	public void setDateGreaterThan(DateGreaterThan dateGreaterThan) {
		this.dateGreaterThan = dateGreaterThan;
	}

	public IPAddress getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(IPAddress ipAddress) {
		this.ipAddress = ipAddress;
	}

	public class DateLessThan {
		@JsonProperty("AWS:EpochTime")
		@JsonDeserialize(using = UnixTimestampDeserializer.class)
		Date value;

		public Date getValue() {
			return value;
		}

		public void setValue(Date value) {
			this.value = value;
		}
	}

	public class DateGreaterThan {
		@JsonProperty("AWS:EpochTime")
		@JsonDeserialize(using = UnixTimestampDeserializer.class)
		Date value;

		public Date getValue() {
			return value;
		}

		public void setValue(Date value) {
			this.value = value;
		}
	}

	public class IPAddress {
		@JsonProperty("AWS:SourceIp")
		String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

}
