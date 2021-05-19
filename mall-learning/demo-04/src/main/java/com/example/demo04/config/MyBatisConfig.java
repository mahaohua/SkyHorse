package com.example.demo04.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * 用于配置需要动态生成mapper接口的路径
 */
@Configuration
@MapperScan({"com.example.demo04.mbg.mapper","com.example.demo04.dao"})
public class MyBatisConfig {
}