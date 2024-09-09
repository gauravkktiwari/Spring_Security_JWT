package com.jwt.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_master")
public class UserMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;

	@Column(name = "contact_no", length = 20)
	private String contactNo;
	
	@Column(name = "country_code", columnDefinition="VARCHAR(20) default '+91'")
	private String countryCode="+91";
	
	@Column(name = "user_name", length = 100)
	private String userName;
	
	@Column(name = "password", length = 100)
	private String password;
	
	@Column(name = "is_active", columnDefinition = "int(1) default 1")
    private int isActive;
	
	@Column(name = "is_deleted", columnDefinition = "int(1) default 0")
    private int isDeleted;
	
	@Column(name = "is_otp_verified", columnDefinition = "int(1) default 0")
    private int isOTPVerified;
	
	@Column(name = "otp", length = 10)
	private String otp;
	
	@Column(name = "created_date")
    private Date createdDate;

    @Column(name = "updated_date")
    private Date updatedDate;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

	public int getIsOTPVerified() {
		return isOTPVerified;
	}

	public void setIsOTPVerified(int isOTPVerified) {
		this.isOTPVerified = isOTPVerified;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	@Column(name = "default_company_id", columnDefinition = "int(11) default 0")
	private int defaultCompanyId;

	public int getDefaultCompanyId() {
		return defaultCompanyId;
	}

	public void setDefaultCompanyId(int defaultCompanyId) {
		this.defaultCompanyId = defaultCompanyId;
	}
}
