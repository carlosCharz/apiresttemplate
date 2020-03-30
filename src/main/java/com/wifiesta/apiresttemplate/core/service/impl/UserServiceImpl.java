package com.wifiesta.apiresttemplate.core.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wifiesta.apiresttemplate.core.dao.UserRepository;
import com.wifiesta.apiresttemplate.core.exception.ResourceNotFoundException;
import com.wifiesta.apiresttemplate.core.exception.enums.NotFoundErrorType;
import com.wifiesta.apiresttemplate.core.service.UserService;

/**
 * Service that manages the logic for Users
 *
 * @author charz
 */

@Service
public class UserServiceImpl implements UserService {

  protected static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

  @Autowired
  private UserRepository userRepository;

  @Override
  public String getByKey(String id) {
    logger.info("User Service Implementation called");
    return userRepository.getByKey(id);
  }
  
  @Override
  public String testException() {
    throw new ResourceNotFoundException(NotFoundErrorType.ACCESS_TOKEN_NOT_FOUND);
  }

}
