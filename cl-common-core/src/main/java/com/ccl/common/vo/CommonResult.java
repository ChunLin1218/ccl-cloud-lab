package com.ccl.common.vo;

import com.ccl.common.enums.ResultCode;
import lombok.Data;

import java.io.Serializable;

@Data
public class CommonResult<T> implements Serializable {
    private static final long serialVersionUID = -4012170306337511959L;

    private int code;

    private String msg;

    private T data;

    public CommonResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public CommonResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> CommonResult<T> success() {
        return new CommonResult(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), null);
    }

    public static <T> CommonResult<T> success(T data) {
        return new CommonResult(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), data);
    }

    public static <T> CommonResult<T> success(String msg, T data) {
        return new CommonResult(ResultCode.SUCCESS.getCode(), msg, data);
    }

    public static <T> CommonResult<T> failed() {
        return new CommonResult(ResultCode.SUCCESS.getCode(), ResultCode.FAILED.getMsg(), null);
    }

    public static <T> CommonResult<T> failed(T data) {
        return new CommonResult(ResultCode.FAILED.getCode(), ResultCode.FAILED.getMsg(), data);
    }

    public static <T> CommonResult<T> failed(String msg, T data) {
        return new CommonResult(ResultCode.FAILED.getCode(), msg, data);
    }
}
