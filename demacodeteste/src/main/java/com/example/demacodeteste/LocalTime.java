package com.example.springboot;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.xml.bind.annotation.XmlRootElement;

public class LocalTime{
   
@JsonIgnoreProperties(ignoreUnknown = true)
public Integer hour;
public Integer minute;
public Integer nano;
public Integer second;

	public Integer getHour() {
		return this.hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}

	public Integer getMinute() {
		return this.minute;
	}

	public void setMinute(Integer minute) {
		this.minute = minute;
	}

	public Integer getNano() {
		return this.nano;
	}

	public void setNano(Integer nano) {
		this.nano = nano;
	}

	public Integer getSecond() {
		return this.second;
	}

	public void setSecond(Integer second) {
		this.second = second;
	}
}

