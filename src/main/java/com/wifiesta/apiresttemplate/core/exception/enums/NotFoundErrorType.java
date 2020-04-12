package com.wifiesta.apiresttemplate.core.exception.enums;

/**
 * Resource Not Found Error Type Enum (404 family)
 *
 * @author charz
 */
public enum NotFoundErrorType {
  ACCESS_TOKEN_NOT_FOUND(1, "Access token not found");

  private final int code;
  private final String message;

  private NotFoundErrorType(int code, String message) {
    this.code = code;
    this.message = message;
  }

  public int getCode() {
    return this.code;
  }

  public String getMessage() {
    return this.message;
  }

}
