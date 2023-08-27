package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transactionByWorker")
public class TransactionByWorker {
	
	@Id
	@Column(name="id")
	public int id;
	
	@Column(name="transWorkerName")
	public String transWorkerName;
	
	@Column(name="adminCode")
	public String adminCode;
	
	@Column(name="customerName")
	public String customerName;
	
	@Column(name="customerPhoneNumber")
	public String customerPhoneNumber;
	
	@Column(name="shopName")
	public String shopName;
	
	@Column(name="shopAddress")
	public String shopAddress;
	
	@Column(name="role")
	public String role;
	
	@Column(name="recordCreated")
	public Date recordCreated;
	
	@Column(name="recordUpdated")
	public Date recordUpdated;
	
	@Column(name="merchantCode")
	public String merchantCode;
	
	@Column(name="batchNumber")
	public int batchNumber;
	
	@Column(name="transactionAmount")
	public String transactionAmount;
	
	@Column(name="transactionAdditionalAmount")
	public String transactionAdditionalAmount;
	
	@Column(name="currencyType")
	public String currencyType;
	
	@Column(name="stanNumber")
	public int stanNumber;
	
	@Column(name="latitude")
	public String latitude;
	
	@Column(name="logitude")
	public String logitude;
	
	@Column(name="status")
	public String status;
	
	@Column(name="transactionStartTime")
	public Date transactionStartTime;
	
	@Column(name="tranactionEndTime")
	public Date tranactionEndTime;
	
	@Column(name="billNumber")
	public String billNumber;
	
	@Column(name="appVersion")
	public String appVersion;
	
	@Column(name="responseCode")
	public int responseCode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTransWorkerName() {
		return transWorkerName;
	}

	public void setTransWorkerName(String transWorkerName) {
		this.transWorkerName = transWorkerName;
	}

	public String getAdminCode() {
		return adminCode;
	}

	public void setAdminCode(String adminCode) {
		this.adminCode = adminCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopAddress() {
		return shopAddress;
	}

	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
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

	public int getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(int batchNumber) {
		this.batchNumber = batchNumber;
	}

	public String getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getTransactionAdditionalAmount() {
		return transactionAdditionalAmount;
	}

	public void setTransactionAdditionalAmount(String transactionAdditionalAmount) {
		this.transactionAdditionalAmount = transactionAdditionalAmount;
	}

	public String getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	public int getStanNumber() {
		return stanNumber;
	}

	public void setStanNumber(int stanNumber) {
		this.stanNumber = stanNumber;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLogitude() {
		return logitude;
	}

	public void setLogitude(String logitude) {
		this.logitude = logitude;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getTransactionStartTime() {
		return transactionStartTime;
	}

	public void setTransactionStartTime(Date transactionStartTime) {
		this.transactionStartTime = transactionStartTime;
	}

	public Date getTranactionEndTime() {
		return tranactionEndTime;
	}

	public void setTranactionEndTime(Date tranactionEndTime) {
		this.tranactionEndTime = tranactionEndTime;
	}

	public String getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	
	
	

}
