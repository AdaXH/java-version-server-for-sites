package com.sites.controller;

import com.sites.common.BizException;
import com.sites.common.CommonResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionController {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionController.class);

    @ExceptionHandler(value = BizException.class)
    @ResponseBody
    public CommonResponse errorHandle(HttpServletRequest req, BizException e) {
        logger.info("error:"+e.getMessage());
        return CommonResponse.error(e.getErrorMessage(), e.getErrorCode());
    }

    @ExceptionHandler(value = NullPointerException.class)
    @ResponseBody
    public CommonResponse exceptionHandler(HttpServletRequest req, NullPointerException e){
        logger.error("npe:",e);
        return CommonResponse.error(e.getMessage(), "npe");
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public CommonResponse exceptionHandler(HttpServletRequest req, Exception e){
        logger.error("unknown exception:",e);
        return CommonResponse.error(e.getMessage(), "UNKNOWN_EXCEPTION");
    }
}
