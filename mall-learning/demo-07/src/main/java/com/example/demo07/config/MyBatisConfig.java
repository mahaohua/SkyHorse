package com.example.demo07.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * 用于配置需要动态生成mapper接口的路径
 */
@Configuration
@MapperScan({"com.example.demo07.mbg.mapper","com.example.demo07.dao"})
public class MyBatisConfig {
}