package com.example.demo.ifaces;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Donar;

public interface DonarRepository extends JpaRepository<Donar, String> {
	Donar[] findByBloodGroup(String name);
	Donar[] findByLocation(String name);
	
	
	@Query(value = "update Donar set location=:updateLocation where mobileNumber=:srch")
	@Modifying
	@Transactional
	int modifyLocation(@Param("srch")long mobileNo,@Param("updateLocation")String updateLocation);

}
