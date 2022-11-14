package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.ConnectUsDao;
import com.example.demo.model.Admin;
import com.example.demo.model.ConstentMessage;
import com.example.demo.model.Response;
import com.example.demo.repository.ConnectUsAdminRepository;

@Service("ConnectUsServiceImpl")
public class ConnectUsServiceImpl implements ConnectUsService {
	
	@Autowired
	public ConnectUsDao connectUsDao;
	
	@Autowired
	public ConnectUsAdminRepository connectUsAdminRepository;
	
	@Autowired
	public ConstentMessage constentMessage;

	@Override
	public Response createAdminDetail(Admin admin) {
		Response response = new Response();
		int adminID = admin.getAdminId();
		Optional<Admin> adminDetails = connectUsAdminRepository.findbyAdminId(adminID);

		if (adminDetails.isPresent()) {
			response.setResponseMessage(constentMessage.getExistingAdminId());
			return response;
		}

		connectUsDao.saveAll(admin);

		response.setResponseMessage(constentMessage.getSuccessfulyCretaionNewAdmin());
		response.setResponseCode(constentMessage.getSuccessResponseCode());

		return response;
	}

}
