package com.example.demo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:constentMessage.properties")
public class ConstentMessage {
	
	@Value("${ADMIN_NUMBER}")
	public String adminId;
	
	
	@Value("${INVALID_DETAILS}")
	public String invalidDetails;
	
	
	@Value("${EXISTING_ADMIN_NUMBER}")
	public String existingAdminId;
	
	
	@Value("${SUCCESSFUL_CREATION_NEW_ADMIN}")
	public String successfulyCretaionNewAdmin;
	
	
	@Value("${UNSUCCESSFUL_CREATION_NEW_ADMIN}")
	public String adminNotCretaed;
	
	@Value("${SUCCESSFUL_UPDATION_EXISTING_ADMIN}")
	public String successfulyUpdatedAdmin;
	
	@Value("${INVALID_ADMIN_ID}")
	public String invalidAdminId;
	
	
	@Value("${SUCCESSFUL_RESPONSECODE}")
	public String successResponseCode;
	
	@Value("${UNSUCCESSFUL_RESPONSECODE}")
	public String unsuccessResponseCode;

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getInvalidDetails() {
		return invalidDetails;
	}

	public void setInvalidDetails(String invalidDetails) {
		this.invalidDetails = invalidDetails;
	}

	public String getExistingAdminId() {
		return existingAdminId;
	}

	public void setExistingAdminId(String existingAdminId) {
		this.existingAdminId = existingAdminId;
	}

	public String getSuccessfulyCretaionNewAdmin() {
		return successfulyCretaionNewAdmin;
	}

	public void setSuccessfulyCretaionNewAdmin(String successfulyCretaionNewAdmin) {
		this.successfulyCretaionNewAdmin = successfulyCretaionNewAdmin;
	}

	public String getSuccessfulyUpdatedAdmin() {
		return successfulyUpdatedAdmin;
	}

	public void setSuccessfulyUpdatedAdmin(String successfulyUpdatedAdmin) {
		this.successfulyUpdatedAdmin = successfulyUpdatedAdmin;
	}

	public String getInvalidAdminId() {
		return invalidAdminId;
	}

	public void setInvalidAdminId(String invalidAdminId) {
		this.invalidAdminId = invalidAdminId;
	}

	public String getSuccessResponseCode() {
		return successResponseCode;
	}

	public void setSuccessResponseCode(String successResponseCode) {
		this.successResponseCode = successResponseCode;
	}

	public String getUnsuccessResponseCode() {
		return unsuccessResponseCode;
	}

	public void setUnsuccessResponseCode(String unsuccessResponseCode) {
		this.unsuccessResponseCode = unsuccessResponseCode;
	}

	public String getAdminNotCretaed() {
		return adminNotCretaed;
	}

	public void setAdminNotCretaed(String adminNotCretaed) {
		this.adminNotCretaed = adminNotCretaed;
	}

}
