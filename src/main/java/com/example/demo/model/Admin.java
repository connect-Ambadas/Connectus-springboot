package com.example.demo.model;

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

	
}
