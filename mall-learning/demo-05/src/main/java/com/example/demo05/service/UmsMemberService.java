package com.example.demo05.service;


import com.example.demo05.common.api.CommonResult;

/**
 * 会员管理Service
 * Created on 2021/5.
 */
public interface UmsMemberService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);

}