package org.mysise.demo.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import org.mysise.demo.api.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {


    @Reference(interfaceClass = DemoService.class, check = false,version = "1.0.0")
    private DemoService demoService;


    @RequestMapping("/")
    public String index(){
        return demoService.getName();
    }
}
