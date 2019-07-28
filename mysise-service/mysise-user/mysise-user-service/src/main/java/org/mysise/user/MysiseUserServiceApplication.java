package org.mysise.user;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
@MapperScan("org.mysise.user.mapper")
public class MysiseUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysiseUserServiceApplication.class, args);
    }

}
