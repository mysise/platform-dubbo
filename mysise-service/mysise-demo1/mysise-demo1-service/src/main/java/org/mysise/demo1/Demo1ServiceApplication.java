package org.mysise.demo1;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDubboConfiguration
@MapperScan("org.mysise.demo1.mapper")
@ComponentScan(basePackages = {"org.mysise"})
//@ImportResource(locations = {"classpath:spring/zipkin.xml"})
public class Demo1ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo1ServiceApplication.class, args);
    }

}
