package com.jwt.dto;

import javax.validation.constraints.NotBlank;

import com.jwt.util.RestMessages;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AccessTokenRequestDto {

	@NotBlank(message = RestMessages.VALID_CLIENT_ID)
	private String clientId;
	
	@NotBlank(message = RestMessages.VALID_CLIENT_SECRET)
	private String clientSecret;
	
	@NotBlank(message = RestMessages.VALID_CONTACT_NO)
	private String contactNo;

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId.trim();
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret.trim();
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo.trim();
	}

	@Override
	public String toString() {
		return "{clientId=" + clientId + ", clientSecret=" + clientSecret + ", contactNo="
				+ contactNo + "}";
	}
	
}
