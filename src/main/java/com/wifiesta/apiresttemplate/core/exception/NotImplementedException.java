package com.wifiesta.apiresttemplate.core.exception;

import com.wifiesta.apiresttemplate.core.exception.enums.ServerErrorType;

/**
 * Not implemented exception
 *
 * @author charz
 *
 */
public class NotImplementedException extends BaseRuntimeException {

    private static final long serialVersionUID = 1L;

    private ServerErrorType errorType;

    public NotImplementedException(ServerErrorType errorType) {
        super(errorType.getMessage());
        this.errorType = errorType;
    }

    @Override
    public Integer getCode() {
        return this.errorType.getCode();
    }

}
