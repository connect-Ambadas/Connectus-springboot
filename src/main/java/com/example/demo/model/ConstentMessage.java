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
	
	@Value("${SUCCESSFUL_CREATION_NEW_WORKER}")
	public String successfulyCreationNewWorker;
	
	
	@Value("${UNSUCCESSFUL_CREATION_NEW_ADMIN}")
	public String adminNotCretaed;
	
	@Value("${UNSUCCESSFUL_CREATION_NEW_Worker}")
	public String workerNotCretaed;
	
	@Value("${SUCCESSFUL_UPDATION_EXISTING_ADMIN}")
	public String successfulyUpdatedAdmin;
	
	@Value("${SUCCESSFUL_UPDATION_EXISTING_WORKER}")
	public String successfulyUpdatedWorker;
	
	@Value("${INVALID_ADMIN_ID}")
	public String invalidAdminId;
	
	
	@Value("${SUCCESSFUL_RESPONSECODE}")
	public String successResponseCode;
	
	@Value("${UNSUCCESSFUL_RESPONSECODE}")
	public String unsuccessResponseCode;
	
	@Value("${LOGIN_SUCCESSFUL}")
	public String loginSuccesful;
	
	@Value("${LOGIN_FAILED}")
	public String loginFailed;
	
	@Value("${EXISTING_WORKER_NUMBER}")
	public String existingWorkerId;
	
	@Value("${SUCCESSFUL_ADMIN_RESPONSECODE}")
	public String successAdminResponseCode;
	
	@Value("${UNSUCCESSFUL_ADMIN_RESPONSECODE}")
	public String unsuccessAdminResponseCode;
	
	@Value("${SUCCESSFUL_WORKER_RESPONSECODE}")
	public String successWorkerResponseCode;
	
	@Value("${UNSUCCESSFUL_WORKER_RESPONSECODE}")
	public String unsuccessWorkerResponseCode;
	
	@Value("${SUCCESSFUL_TRANSACTIONBYWORKER_RESPONSECODE}")
	public String successTransactionByWorkerResponseCode;
	
	@Value("${UNSUCCESSFUL_TRANSACTIONBYWORKER_RESPONSECODE}")
	public String unsuccessTransactionByWorkerResponseCode;
	
	@Value("${SUCCESSFUL_LOGIN_RESPONSECODE}")
	public String successLoginResponseCode;
	
	@Value("${UNSUCCESSFUL_LOGIN_RESPONSECODE}")
	public String unsuccessLoginResponseCode;
	
	@Value("${SUCCESSFUL_CREATION_NEW_TRANSACTIONBYWORKER}")
	public String successfulyCreationNewTransactionByWorker;
	
	@Value("${UNSUCCESSFUL_CREATION_NEW_TRANSACTIONBYWORKER}")
	public String transactionByWorkerNotCretaed;

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

	public String getLoginSuccesful() {
		return loginSuccesful;
	}

	public void setLoginSuccesful(String loginSuccesful) {
		this.loginSuccesful = loginSuccesful;
	}

	public String getLoginFailed() {
		return loginFailed;
	}

	public void setLoginFailed(String loginFailed) {
		this.loginFailed = loginFailed;
	}

	public String getSuccessfulyCreationNewWorker() {
		return successfulyCreationNewWorker;
	}

	public void setSuccessfulyCreationNewWorker(String successfulyCreationNewWorker) {
		this.successfulyCreationNewWorker = successfulyCreationNewWorker;
	}

	public String getWorkerNotCretaed() {
		return workerNotCretaed;
	}

	public void setWorkerNotCretaed(String workerNotCretaed) {
		this.workerNotCretaed = workerNotCretaed;
	}

	public String getSuccessfulyUpdatedWorker() {
		return successfulyUpdatedWorker;
	}

	public void setSuccessfulyUpdatedWorker(String successfulyUpdatedWorker) {
		this.successfulyUpdatedWorker = successfulyUpdatedWorker;
	}

	public String getExistingWorkerId() {
		return existingWorkerId;
	}

	public void setExistingWorkerId(String existingWorkerId) {
		this.existingWorkerId = existingWorkerId;
	}

	public String getSuccessAdminResponseCode() {
		return successAdminResponseCode;
	}

	public void setSuccessAdminResponseCode(String successAdminResponseCode) {
		this.successAdminResponseCode = successAdminResponseCode;
	}

	public String getUnsuccessAdminResponseCode() {
		return unsuccessAdminResponseCode;
	}

	public void setUnsuccessAdminResponseCode(String unsuccessAdminResponseCode) {
		this.unsuccessAdminResponseCode = unsuccessAdminResponseCode;
	}

	public String getSuccessWorkerResponseCode() {
		return successWorkerResponseCode;
	}

	public void setSuccessWorkerResponseCode(String successWorkerResponseCode) {
		this.successWorkerResponseCode = successWorkerResponseCode;
	}

	public String getUnsuccessWorkerResponseCode() {
		return unsuccessWorkerResponseCode;
	}

	public void setUnsuccessWorkerResponseCode(String unsuccessWorkerResponseCode) {
		this.unsuccessWorkerResponseCode = unsuccessWorkerResponseCode;
	}

	public String getSuccessTransactionByWorkerResponseCode() {
		return successTransactionByWorkerResponseCode;
	}

	public void setSuccessTransactionByWorkerResponseCode(String successTransactionByWorkerResponseCode) {
		this.successTransactionByWorkerResponseCode = successTransactionByWorkerResponseCode;
	}

	public String getUnsuccessTransactionByWorkerResponseCode() {
		return unsuccessTransactionByWorkerResponseCode;
	}

	public void setUnsuccessTransactionByWorkerResponseCode(String unsuccessTransactionByWorkerResponseCode) {
		this.unsuccessTransactionByWorkerResponseCode = unsuccessTransactionByWorkerResponseCode;
	}

	public String getSuccessLoginResponseCode() {
		return successLoginResponseCode;
	}

	public void setSuccessLoginResponseCode(String successLoginResponseCode) {
		this.successLoginResponseCode = successLoginResponseCode;
	}

	public String getUnsuccessLoginResponseCode() {
		return unsuccessLoginResponseCode;
	}

	public void setUnsuccessLoginResponseCode(String unsuccessLoginResponseCode) {
		this.unsuccessLoginResponseCode = unsuccessLoginResponseCode;
	}

	public String getSuccessfulyCreationNewTransactionByWorker() {
		return successfulyCreationNewTransactionByWorker;
	}

	public void setSuccessfulyCreationNewTransactionByWorker(String successfulyCreationNewTransactionByWorker) {
		this.successfulyCreationNewTransactionByWorker = successfulyCreationNewTransactionByWorker;
	}

	public String getTransactionByWorkerNotCretaed() {
		return transactionByWorkerNotCretaed;
	}

	public void setTransactionByWorkerNotCretaed(String transactionByWorkerNotCretaed) {
		this.transactionByWorkerNotCretaed = transactionByWorkerNotCretaed;
	}
	
	
	

}
