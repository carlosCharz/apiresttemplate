package com.wifiesta.apiresttemplate.core.service;

/**
 * Interface for User Service Implementation
 *
 * @author charz
 */

public interface UserService {

  String getByKey(String id);
  
  String testException();

}
