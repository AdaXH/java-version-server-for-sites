package com.sites.common;

public class BizException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    protected String errorCode;
    protected String errorMessage;

    public BizException() {
        super();
    }

    public BizException(BaseErrorImpl errorInfoInterface) {
        super(errorInfoInterface.getErrorCode());
        this.errorCode = errorInfoInterface.getErrorCode();
        this.errorMessage = errorInfoInterface.getErrorMessage();
    }

    public BizException(BaseErrorImpl errorInfoInterface, Throwable cause) {
        super(errorInfoInterface.getErrorCode(), cause);
        this.errorCode = errorInfoInterface.getErrorCode();
        this.errorMessage = errorInfoInterface.getErrorMessage();
    }

    public BizException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }

    public BizException(String errorMessage, String errorCode) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public BizException(String errorMessage, String errorCode, Throwable cause) {
        super(errorCode, cause);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }


    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMessage = errorMsg;
    }

    public String getMessage() {
        return errorMessage;
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }

}
