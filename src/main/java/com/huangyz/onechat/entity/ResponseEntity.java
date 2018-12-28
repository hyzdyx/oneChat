package com.huangyz.onechat.entity;

import java.io.Serializable;

/**
 * @Author: huangyz
 * @Date: 2018-12-20 11:15
 * @Version 1.0
 */
public class ResponseEntity implements Serializable {

    private String code;

    private String message;

    private Object data;

    private String successCode = "200";

    private String errorCode = "-1";

    public static final ResponseEntity SUCCESS = new ResponseEntity("200", "success", null);

    public static final ResponseEntity ERROR = new ResponseEntity("-1", "error", null);

    public ResponseEntity() {
    }

    public ResponseEntity(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResponseEntity buildSuccess(String message, Object data) {
        this.code = successCode;
        this.message = message;
        this.data = data;
        return this;

    }

    public ResponseEntity buildError(String message, Object data) {
        this.code = errorCode;
        this.message = message;
        this.data = data;
        return this;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
