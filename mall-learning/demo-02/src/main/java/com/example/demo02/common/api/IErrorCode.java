package com.example.demo02.common.api;

/**
 * 封装API的错误码
 * Created on 2021/5
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}