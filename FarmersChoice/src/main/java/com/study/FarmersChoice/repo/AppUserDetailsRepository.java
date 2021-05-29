package com.study.FarmersChoice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.FarmersChoice.entity.AppUserDetails;

@Repository
public interface AppUserDetailsRepository extends JpaRepository<AppUserDetails, Long> {
	
	AppUserDetails findByUsername(String username);

}
