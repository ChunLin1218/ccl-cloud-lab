package com.ccl.common.enums;

import lombok.Data;
import lombok.Getter;

@Getter
public enum ResultCode {

    SUCCESS(1, "Success"),
    FAILED(-1, "Internal Server Error"),

    // 业务相关状态码（可自定义）
    USER_NOT_EXIST(1001, "User does not exist"),
    ORDER_NOT_FOUND(2001, "Order not found"),
    PRODUCT_OUT_OF_STOCK(3001, "Product out of stock");

    private int code;

    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
