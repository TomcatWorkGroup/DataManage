package com.itdreamworks.datamanage;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableSwagger2Doc
@SpringBootApplication
//@EnableTransactionManagement
@MapperScan("com.itdreamworks.datamanage.mapper")
public class DataManageApplication {
    public static void main(String[] args) {
        SpringApplication.run(DataManageApplication.class, args);
    }
}
