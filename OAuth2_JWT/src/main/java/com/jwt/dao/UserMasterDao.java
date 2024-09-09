package com.jwt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.model.UserMaster;

public interface UserMasterDao extends JpaRepository<UserMaster, Long> {

	UserMaster findFirstByUserName(String username);

	UserMaster findFirstByIsDeletedAndContactNo(int isDeleted, String contactNo);
	UserMaster findFirstByIsDeletedAndCountryCodeAndContactNo(int isDeleted, String countryCode, String contactNo);
	UserMaster findByIsDeletedAndUserId(int isDeleted, int userId);
	boolean existsByIsDeletedAndUserId(int isDeleted, int userId);

}
