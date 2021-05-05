package com.sites.common;

public enum ErrorEnum {
    NOT_FOUND("404", "资源未找到"),
    ARGUMENTS_NOT_MATCH("argument not match", "入参不匹配"),
    UNKNOWN_ERROR("unknown error", "未知错误");

    private String errorCode;
    private String errorMessage;

    ErrorEnum(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
