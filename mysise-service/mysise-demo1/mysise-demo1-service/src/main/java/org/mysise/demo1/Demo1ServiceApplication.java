package org.mysise.demo1;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
@MapperScan("org.mysise.demo1.mapper")
public class Demo1ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo1ServiceApplication.class, args);
    }

}
