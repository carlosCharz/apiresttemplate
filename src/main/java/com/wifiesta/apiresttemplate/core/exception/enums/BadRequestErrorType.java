package com.wifiesta.apiresttemplate.core.exception.enums;

/**
 * Bad Request Error Type Enum (400 family)
 *
 * @author charz
 */
public enum BadRequestErrorType {
    BAD_REQUEST_EXCEPTION(1, "Bad request exception"),
    ARGUMENT_NOT_VALID(2, "Argument not valid"),
    WRONG_DESERIALIZATION(3, "Wrong deserialization to build the bean"),
    METHOD_NOT_ALLOWED(4, "Method not allowed"),
    ARGUMENT_TYPE_MISMATCH(5, "Argument type mismatch"),
    MISSING_PARAMETER(6, "Missing parameter"),
    EXCEEDED_MULTIPART_MAX_FILE_SIZE(7, "The file exceeds the maximum size permitted"),
    EMPTY_MULTIPART_FILE_SIZE(8, "The file is empty");

    private final int code;
    private final String message;

    private BadRequestErrorType(int code, String message) {
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
