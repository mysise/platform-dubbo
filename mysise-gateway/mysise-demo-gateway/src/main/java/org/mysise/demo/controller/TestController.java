package org.mysise.demo.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import org.mysise.common.base.FeedResult;
import org.mysise.demo.api.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
public class TestController {


    @Reference(interfaceClass = DemoService.class,timeout = 10000,check = false,version = "${demo.service.version}",mock = "true")
    private DemoService demoService;


    @GetMapping("/")
    public FeedResult<String> index(String name){
        return demoService.getName(name);
    }

    @GetMapping("/list")
    public FeedResult<List<Map<String,Object>>> list(){
        return demoService.listUsers();
    }
}
