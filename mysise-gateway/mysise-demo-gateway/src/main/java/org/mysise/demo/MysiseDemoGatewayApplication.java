package org.mysise.demo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableDubboConfiguration
@ImportResource(locations = {"classpath:spring/zipkin.xml"})
@ComponentScan(basePackages = {"org.mysise"})
public class MysiseDemoGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysiseDemoGatewayApplication.class, args);
    }

}
