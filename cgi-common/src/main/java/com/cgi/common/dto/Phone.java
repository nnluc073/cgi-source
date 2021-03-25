package com.cgi.common.dto;

import lombok.Getter;

import java.io.Serializable;

/**
 * Created by Fundoo. User: nnluc073 Date: 10/12/2020 Time: 21:37
 */
@Getter
public class Phone implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long number;
	private Integer regionCode;
	private String phone;

	public Phone(Integer regionCode, Long number) {
		this.phone=regionCode.toString()+number.toString();
		this.number = number;
		this.regionCode = regionCode;
	}

	public String getInternationalPhone(){
		return "+"+phone;
	}
}
