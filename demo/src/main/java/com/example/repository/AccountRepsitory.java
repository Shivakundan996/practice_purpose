package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Account;

public interface AccountRepsitory extends JpaRepository<Account, Long>{
	
	

}
