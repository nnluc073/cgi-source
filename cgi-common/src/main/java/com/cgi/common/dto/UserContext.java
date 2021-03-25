package com.cgi.common.dto;

import java.io.Serializable;
import java.util.List;

import com.cgi.common.constants.enums.ERole;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class UserContext implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String kcUserId;
	
    private String userName;
    
    private String phoneNumber;
    
    private String email;
    
    private Long profileId;

	private List<String> authorities;
	
	private String expiresIn;

	private String refreshToken;

	private String accessToken;
	
	private List<ERole> roles;
	
	private Object userData;
	
	private boolean hasPasswordReset;
	
	private int registrationType;
	
	private String salesPerson;
	
}
