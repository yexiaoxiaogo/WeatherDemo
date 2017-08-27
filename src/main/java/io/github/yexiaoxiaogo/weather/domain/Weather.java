package io.github.yexiaoxiaogo.weather.domain;

import java.sql.Date;

public class Weather {
	
	private String id; //城市ID CN101010100
	private String city; //城市名称
	private String code_d;//白天天气状况代码  100
	private String code_n;//夜间天气状况代码  104
	private String txt_d;//白天天气状况描述  晴
	private String txt_n;//夜间天气状况描述  阴
	private String max;//最高气温
	private String min;//最低气温
	private Date date;//预报日期
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCode_d() {
		return code_d;
	}
	public void setCode_d(String code_d) {
		this.code_d = code_d;
	}
	public String getCode_n() {
		return code_n;
	}
	public void setCode_n(String code_n) {
		this.code_n = code_n;
	}
	public String getTxt_d() {
		return txt_d;
	}
	public void setTxt_d(String txt_d) {
		this.txt_d = txt_d;
	}
	public String getTxt_n() {
		return txt_n;
	}
	public void setTxt_n(String txt_n) {
		this.txt_n = txt_n;
	}
	public String getMax() {
		return max;
	}
	public void setMax(String max) {
		this.max = max;
	}
	public String getMin() {
		return min;
	}
	public void setMin(String min) {
		this.min = min;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}