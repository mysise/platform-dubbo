package org.mysise.demo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class MysiseDemoGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysiseDemoGatewayApplication.class, args);
    }

}
