package com.ccl.common.exception;

import com.ccl.common.vo.CommonResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 *  全局异常处理
 *  @author: ccl
 *  @Date: 2025/3/16 13:50
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    // 处理参数校验异常
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public CommonResult<String> handleValidationException(MethodArgumentNotValidException e) {
        return CommonResult.failed(e.getBindingResult().getFieldError().getDefaultMessage(), null);
    }

    // 处理未知异常
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public CommonResult<String> handleException(Exception e) {
        return CommonResult.failed(e.getMessage(), null);
    }
}
