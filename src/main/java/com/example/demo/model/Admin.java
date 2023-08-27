package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="admin")
public class Admin {
	@Id
	@Column(name="adminId")
	public int adminId;
	
	@Column(name="adminName")
	public String adminName;
	
	@Column(name="adminCode")
	public String adminCode;
	
	@Column(name="adminLastName")
	public String adminLastName;
	
	@Column(name="adminEmailId")
	public String adminEmailId;
	
	@Column(name="adminPassword")
	public String adminPassword;
	
	@Column(name="adminPhoneNumber")
	public String adminPhoneNumber;
	
	@Column(name="adminShopName")
	public String adminShopName;
	
	@Column(name="adminShopAddress")
	public String adminShopAddress;
	
	@Column(name="role")
	public String role;
	
	@Column(name="recordCreated")
	public Date recordCreated;
	
	@Column(name="recordUpdated")
	public Date recordUpdated;
	
	@Column(name="merchantCode")
	public String merchantCode;

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	

	public String getAdminCode() {
		return adminCode;
	}

	public void setAdminCode(String adminCode) {
		this.adminCode = adminCode;
	}

	public String getAdminLastName() {
		return adminLastName;
	}

	public void setAdminLastName(String adminLastName) {
		this.adminLastName = adminLastName;
	}

	public String getAdminEmailId() {
		return adminEmailId;
	}

	public void setAdminEmailId(String adminEmailId) {
		this.adminEmailId = adminEmailId;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getAdminPhoneNumber() {
		return adminPhoneNumber;
	}

	public void setAdminPhoneNumber(String adminPhoneNumber) {
		this.adminPhoneNumber = adminPhoneNumber;
	}

	public String getAdminShopName() {
		return adminShopName;
	}

	public void setAdminShopName(String adminShopName) {
		this.adminShopName = adminShopName;
	}

	public String getAdminShopAddress() {
		return adminShopAddress;
	}

	public void setAdminShopAddress(String adminShopAddress) {
		this.adminShopAddress = adminShopAddress;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getRecordCreated() {
		return recordCreated;
	}

	public void setRecordCreated(Date recordCreated) {
		this.recordCreated = recordCreated;
	}

	public Date getRecordUpdated() {
		return recordUpdated;
	}

	public void setRecordUpdated(Date recordUpdated) {
		this.recordUpdated = recordUpdated;
	}

	public String getMerchantCode() {
		return merchantCode;
	}

	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}
	

	
}
