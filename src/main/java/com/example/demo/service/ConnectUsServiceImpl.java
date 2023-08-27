package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.ConnectUsDao;
import com.example.demo.model.Admin;
import com.example.demo.model.ConstentMessage;
import com.example.demo.model.Response;
import com.example.demo.model.Worker;
import com.example.demo.repository.ConnectUsAdminRepository;
import com.example.demo.repository.ConnectUsWorkerRepository;

@Service("ConnectUsServiceImpl")
public class ConnectUsServiceImpl implements ConnectUsService {
	
	@Autowired
	public ConnectUsDao connectUsDao;
	
	@Autowired
	public ConnectUsAdminRepository connectUsAdminRepository;
	
	@Autowired
	public ConnectUsWorkerRepository connectUsWorkerRepository;
	
	@Autowired
	public ConstentMessage constentMessage;

	@Override
	public Response createAdminDetail(Admin admin) {
		Response response = new Response();
		String adminCode = admin.getAdminCode();
		Optional<Admin> adminDetails = connectUsAdminRepository.findbyAdminId(adminCode);

		if (adminDetails.isPresent()) {
			response.setResponseMessage(constentMessage.getExistingAdminId());
			response.setResponseCode(constentMessage.getUnsuccessResponseCode()); // updated build
			return response;
		}

		connectUsDao.saveAdminAll(admin);

		response.setResponseMessage(constentMessage.getSuccessfulyCretaionNewAdmin());
		response.setResponseCode(constentMessage.getSuccessResponseCode());

		return response;
	}

	@Override
	public Response createWorkerDetail(Worker worker) {
		Response response = new Response();
		String workerCode = worker.getWorkerCode();
		Optional<Worker> workerDetails = connectUsWorkerRepository.findbyWorkerId(workerCode);

		if (workerDetails.isPresent()) {
			response.setResponseMessage(constentMessage.getExistingWorkerId());
			response.setResponseCode(constentMessage.getUnsuccessResponseCode()); // updated build
			return response;
		}

		connectUsDao.saveWorkerAll(worker);

		response.setResponseMessage(constentMessage.getSuccessfulyCreationNewWorker());
		response.setResponseCode(constentMessage.getSuccessResponseCode());

		return response;
	}
	
	@Override
	public Response loginCheckService(Admin admin) {
		Response response = new Response();
		
		String adminEmailID = admin.getAdminEmailId();
		String adminPassword = admin.getAdminPassword();
		
		Admin adminLoginDetails = connectUsAdminRepository.findbyAdminDetail(adminEmailID,adminPassword);
		
		
		if (adminLoginDetails != null && adminLoginDetails.getAdminEmailId().equals(adminEmailID) && adminLoginDetails.getAdminPassword().equals(adminPassword)) {
			response.setResponseMessage(constentMessage.getLoginSuccesful());
			response.setResponseCode(constentMessage.getSuccessResponseCode()); // updated build
			return response;
		} else {
			response.setResponseMessage(constentMessage.getLoginFailed());
			response.setResponseCode(constentMessage.getUnsuccessResponseCode());
			return response;
		}
	}

	

}
