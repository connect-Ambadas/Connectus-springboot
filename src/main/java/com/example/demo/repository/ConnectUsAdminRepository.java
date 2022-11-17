package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Admin;

@Repository
public interface ConnectUsAdminRepository extends JpaRepository<Admin,Long>{

	@Query(value="SELECT * from admin p where p.admin_id=?1",nativeQuery=true)
	public Optional<Admin> findbyAdminId(int adminID);
    
	
	@Query(value="SELECT admin_email_id, admin_password from admin p where p.admin_email_id=?1 and p.admin_password=?2",nativeQuery=true)
	public Admin findbyAdminDetail(String adminEmailID , String adminPassword);
	

}
