package com.ahmed.supermarket.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ahmed.supermarket.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long>{
    Login findByUsernameAndPassword(String username, String password);

}
