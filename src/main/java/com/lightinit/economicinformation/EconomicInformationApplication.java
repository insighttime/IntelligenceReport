package com.lightinit.economicinformation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//@EnableAutoConfiguration
//@MapperScan("com.lightinit.economicinformation.mapper")
public class EconomicInformationApplication {

    private static String[] args;
    private static ConfigurableApplicationContext context;

    public static void main(String[] args) {
        EconomicInformationApplication.args = args;
        EconomicInformationApplication.context = SpringApplication.run(EconomicInformationApplication.class, args);
    }

    public static void restart() {
        context.close();
        EconomicInformationApplication.context = SpringApplication.run(EconomicInformationApplication.class, args);

    }

}
