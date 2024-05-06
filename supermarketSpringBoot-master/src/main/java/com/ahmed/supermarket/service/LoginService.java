package com.ahmed.supermarket.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahmed.supermarket.model.Login;
import com.ahmed.supermarket.repository.LoginRepository;



@Service
public class LoginService {
    
    @Autowired
    private LoginRepository repo;
  
  public Login login(String username, String password) {
      Login user = repo.findByUsernameAndPassword(username, password);
      return user;
  }
    

}
