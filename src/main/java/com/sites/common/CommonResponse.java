package com.sites.common;

public class CommonResponse<T> {
    private boolean success;
    private String errorCode;
    private String errorMessage;
    private T data;
    private Object errorStack;

    public Object getErrorStack() {
        return errorStack;
    }

    public void setErrorStack(Object errorStack) {
        this.errorStack = errorStack;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
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

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static CommonResponse error(String errorMessage, String errorCode) {
        CommonResponse<Object> objectCommonResponse = new CommonResponse<>();
        objectCommonResponse.setSuccess(false);
        objectCommonResponse.setErrorMessage(errorMessage);
        objectCommonResponse.setErrorCode(errorCode);
        objectCommonResponse.setData(null);
        return objectCommonResponse;
    }


    public static CommonResponse success(Object data) {
        CommonResponse<Object> objectCommonResponse = new CommonResponse<>();
        objectCommonResponse.setSuccess(true);
        objectCommonResponse.setData(data);
        return objectCommonResponse;
    }

}
