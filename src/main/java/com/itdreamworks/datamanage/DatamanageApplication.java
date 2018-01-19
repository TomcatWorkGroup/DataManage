package com.itdreamworks.datamanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.itdreamworks.datamanage.mapper")
@SpringBootApplication
public class DatamanageApplication {
    public static void main(String[] args) {
        SpringApplication.run(DatamanageApplication.class, args);
    }
}
