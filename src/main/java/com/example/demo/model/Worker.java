package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="worker")
public class Worker {
	
	@Id
	@Column(name="workerId")
	public int workerId;
	
	@Column(name="workerName")
	public String workerName;
	
	@Column(name="adminCode")
	public String adminCode;
	
	@Column(name="workerLastName")
	public String workerLastName;
	
	@Column(name="workerEmailId")
	public String workerEmailId;
	
	@Column(name="workerPassword")
	public String workerPassword;
	
	@Column(name="workerPhoneNumber")
	public String workerPhoneNumber;
	
	@Column(name="workerShopName")
	public String workerShopName;
	
	@Column(name="workerShopAddress")
	public String workerShopAddress;
	
	@Column(name="role")
	public String role;
	
	@Column(name="recordCreated")
	public Date recordCreated;
	
	@Column(name="recordUpdated")
	public Date recordUpdated;
	
	@Column(name="workerCode")
	public String workerCode;

	public int getWorkerId() {
		return workerId;
	}

	public void setWorkerId(int workerId) {
		this.workerId = workerId;
	}

	public String getWorkerName() {
		return workerName;
	}

	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}

	public String getAdminCode() {
		return adminCode;
	}

	public void setAdminCode(String adminCode) {
		this.adminCode = adminCode;
	}

	public String getWorkerLastName() {
		return workerLastName;
	}

	public void setWorkerLastName(String workerLastName) {
		this.workerLastName = workerLastName;
	}

	public String getWorkerEmailId() {
		return workerEmailId;
	}

	public void setWorkerEmailId(String workerEmailId) {
		this.workerEmailId = workerEmailId;
	}

	public String getWorkerPassword() {
		return workerPassword;
	}

	public void setWorkerPassword(String workerPassword) {
		this.workerPassword = workerPassword;
	}

	public String getWorkerPhoneNumber() {
		return workerPhoneNumber;
	}

	public void setWorkerPhoneNumber(String workerPhoneNumber) {
		this.workerPhoneNumber = workerPhoneNumber;
	}

	public String getWorkerShopName() {
		return workerShopName;
	}

	public void setWorkerShopName(String workerShopName) {
		this.workerShopName = workerShopName;
	}

	public String getWorkerShopAddress() {
		return workerShopAddress;
	}

	public void setWorkerShopAddress(String workerShopAddress) {
		this.workerShopAddress = workerShopAddress;
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

	public String getWorkerCode() {
		return workerCode;
	}

	public void setWorkerCode(String workerCode) {
		this.workerCode = workerCode;
	}
	
	


}
