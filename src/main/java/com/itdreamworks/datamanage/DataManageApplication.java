package com.itdreamworks.datamanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.itdreamworks.datamanage.mapper")
public class DataManageApplication {
    public static void main(String[] args) {
        SpringApplication.run(DataManageApplication.class, args);
    }
}
