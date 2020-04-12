package com.wifiesta.apiresttemplate.core.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.wifiesta.apiresttemplate.core.configuration.CustomSetting;
import com.wifiesta.apiresttemplate.core.service.UserService;

/**
 * REST Param Controller
 *
 * @author charz
 *
 */
@RestController
@RequestMapping("/params")
public class ParamController {

  protected static final Logger logger = LoggerFactory.getLogger(ParamController.class);

  @Autowired
  private CustomSetting customSetting;

  @Autowired
  private UserService userService;

  @RequestMapping(value = "/all", method = RequestMethod.GET)
  @ResponseStatus(HttpStatus.OK)
  public void printAllEnvironmentParameters() {
    logger.info(customSetting.toString());
  }

  @RequestMapping(value = "/test", method = RequestMethod.GET)
  @ResponseStatus(HttpStatus.OK)
  public String test() {
    return userService.getByKey("1");
  }

  @RequestMapping(value = "/exception", method = RequestMethod.GET)
  @ResponseStatus(HttpStatus.OK)
  public String exception() {
    return userService.testException();
  }

}
