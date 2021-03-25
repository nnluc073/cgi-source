package com.cgi.common.constants.enums;

public enum ERole {
	ADMIN("ADMIN"),
	LEADERSHIP("LEADERSHIP"),
	CRM_ADMIN("CRM_ADMIN"),
	SALES_MANAGER("SALES_MANAGER"),
	SALES_LEADER("SALES_LEADER"),
	SALES_PERSON("SALES_PERSON"),
	CONTACT_SALES("CONTACT_SALES"),
	CONTACT_LEADER("CONTACT_LEADER"),
	CREATIVE("CREATIVE"),
	USER("USER"),
	CLIENT_USER("CLIENT_USER");

	private String roleCode;

	public String getRoleCode() {
		return roleCode;
	}

	ERole(String roleCode) {
		this.roleCode = roleCode;
	}

	public static ERole valueOfString(String roleCode) {
		ERole[] values = values();
		for (ERole s : values) {
			if (s.getRoleCode().equals(roleCode)) {
				return s;
			}
		}

		return null;
	}
}
