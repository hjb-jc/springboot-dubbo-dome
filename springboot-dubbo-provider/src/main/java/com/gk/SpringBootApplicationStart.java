package com.gk;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;


@SpringBootApplication
@EnableDubbo
public class SpringBootApplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationStart.class, args);
    }
}
