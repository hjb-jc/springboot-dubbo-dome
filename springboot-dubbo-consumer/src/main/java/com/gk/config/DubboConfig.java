package com.gk.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DubboConfig {

    //创建ApplicationConfig对象
    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig config = new ApplicationConfig();
        config.setName("springboot-dubbo-consumer");
        return config;
    }
    //构建注册配置，注册服务
    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig config = new RegistryConfig();
        config.setAddress("zookeeper://127.0.0.1:2181");
        return config;
    }

    //指定服务发布的协议和端口
    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig config = new ProtocolConfig();
        config.setName("dubbo");
        config.setPort(20880);
        return config;
    }

















}
