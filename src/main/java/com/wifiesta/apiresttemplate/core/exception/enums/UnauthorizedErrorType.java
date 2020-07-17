package com.wifiesta.apiresttemplate.core.exception.enums;

/**
 * Unauthorized Error Type Enum (401 family)
 *
 * @author charz
 */
public enum UnauthorizedErrorType {
    UNAUTHORIZED(1, "Unauthorized application access."),
    INCORRECT_REQUEST_CREDENTIALS(2, "Unauthorized! Incorrect request credentials."),
    MISSING_AUTHORIZATION_PARAM(3, "Missing authorization param in the header.");

    private final int code;
    private final String message;

    private UnauthorizedErrorType(int code, String message) {
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
