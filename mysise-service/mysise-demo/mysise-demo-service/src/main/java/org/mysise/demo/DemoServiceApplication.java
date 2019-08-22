package org.mysise.demo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableDubboConfiguration
@MapperScan("org.mysise.demo.mapper")
//主要是为了扫描到common的配置
@ComponentScan(basePackages = {"org.mysise"})
@ImportResource(locations = {"classpath:spring/zipkin.xml"})
public class DemoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoServiceApplication.class, args);
    }

}
