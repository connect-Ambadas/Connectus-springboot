package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Worker;

@Repository
public interface ConnectUsWorkerRepository extends JpaRepository<Worker,Long> {
	
	@Query(value="SELECT * from worker p where p.worker_code=?1",nativeQuery=true)
	public Optional<Worker> findbyWorkerId(String workerCode);

}
