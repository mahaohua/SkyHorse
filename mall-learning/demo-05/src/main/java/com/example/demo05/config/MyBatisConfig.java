package com.example.demo05.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * 用于配置需要动态生成mapper接口的路径
 */
@Configuration
@MapperScan({"com.example.demo05.mbg.mapper","com.example.demo05.dao"})
public class MyBatisConfig {
}