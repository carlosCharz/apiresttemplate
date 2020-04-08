package com.wifiesta.apiresttemplate.core.exception;

import com.wifiesta.apiresttemplate.core.exception.enums.UnauthorizedErrorType;

/**
 * Unauthorized exception
 * 
 * @author charz
 *
 */
public class UnauthorizedException extends BaseRuntimeException {

    private static final long serialVersionUID = 1L;

    private UnauthorizedErrorType errorType;

    public UnauthorizedException(UnauthorizedErrorType errorType) {
        super(errorType.getMessage());
        this.errorType = errorType;
    }

    @Override
    public Integer getCode() {
        return this.errorType.getCode();
    }

}
