package com.cgi.common.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

/**
 * Created by Fundoo. User: nnluc073 Date: 10/12/2020 Time: 21:37
 */
@Getter
public class Email implements Serializable {
	private static final long serialVersionUID = 1L;
	private String user;
	private String domain;
	private String mail;

	public Email(String mail) {
		String[] param = mail.split("@");
		this.user=param[0];
		this.domain=param[1];
		this.mail = mail;
	}
}
