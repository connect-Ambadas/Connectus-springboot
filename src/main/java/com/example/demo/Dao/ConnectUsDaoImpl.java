package com.example.demo.Dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Admin;
import com.example.demo.model.ConstentMessage;
import com.example.demo.model.Response;
import com.example.demo.model.TransactionByWorker;
import com.example.demo.model.Worker;
import com.example.demo.repository.ConnectUsAdminRepository;
import com.example.demo.repository.ConnectUsTransactionByWorkerRepository;
import com.example.demo.repository.ConnectUsWorkerRepository;

@Repository("ConnectUsDaoImpl")
@Transactional
public class ConnectUsDaoImpl implements ConnectUsDao{
	
	@Autowired
	public ConnectUsAdminRepository connectUsAdminRepository;
	
	@Autowired
	public ConnectUsWorkerRepository connectUsWorkerRepository;
	
	@Autowired
	public ConnectUsTransactionByWorkerRepository connectUsTransactionByWorkerRepository;
	
	@Autowired
	public ConstentMessage constentMessage;

	@Override
	public Response saveAdminAll(Admin admin) {
		Admin responseAdminData;
		Response response = new Response();
		
		responseAdminData=connectUsAdminRepository.save(admin);
		
		if(responseAdminData == null) {
			
			response.setResponseMessage(constentMessage.getAdminNotCretaed());
			response.setResponseCode(constentMessage.getUnsuccessAdminResponseCode());
			
			return response;
		} else {
			response.setResponseMessage(constentMessage.getSuccessfulyCretaionNewAdmin());
			response.setResponseCode(constentMessage.getSuccessAdminResponseCode());
			
			return response;
		}
		
	}

	@Override
	public Response saveWorkerAll(Worker worker) {
		Worker responseWorkerData;
		Response response = new Response();
		
		responseWorkerData=connectUsWorkerRepository.save(worker);
		
		if(responseWorkerData == null) {
			
			response.setResponseMessage(constentMessage.getWorkerNotCretaed());
			response.setResponseCode(constentMessage.getUnsuccessWorkerResponseCode());
			
			return response;
		} else {
			response.setResponseMessage(constentMessage.getSuccessfulyCreationNewWorker());
			response.setResponseCode(constentMessage.getSuccessWorkerResponseCode());
			
			return response;
		}
	}

	@Override
	public Response savetransactionByWorker(TransactionByWorker transactionByWorker) {
		TransactionByWorker responseTransactionByWorker;
		Response response = new Response();
		
		responseTransactionByWorker = connectUsTransactionByWorkerRepository.save(transactionByWorker);
		

		if(responseTransactionByWorker == null) {
			
			response.setResponseMessage(constentMessage.getTransactionByWorkerNotCretaed());
			response.setResponseCode(constentMessage.getUnsuccessTransactionByWorkerResponseCode());
			
			return response;
		} else {
			response.setResponseMessage(constentMessage.getSuccessfulyCreationNewTransactionByWorker());
			response.setResponseCode(constentMessage.getSuccessTransactionByWorkerResponseCode());
			
			return response;
		}
	}

}
