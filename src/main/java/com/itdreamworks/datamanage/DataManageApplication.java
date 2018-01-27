package com.itdreamworks.datamanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.itdreamworks.datamanage.mapper")
public class DataManageApplication {
    public static void main(String[] args) {
        SpringApplication.run(DataManageApplication.class, args);
//        SpringApplication application = new SpringApplication(SpringApplicationBuilder.class);
//        application.run(args);
    }
}
