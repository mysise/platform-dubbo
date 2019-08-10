package org.mysise.demo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import org.mysise.demo.api.DemoService;
import org.mysise.demo1.api.Demo1Service;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


@Service(version = "1.0.0",interfaceClass = DemoService.class)
@Component
public class DemoServiceImpl implements DemoService {

    @Reference(interfaceClass = Demo1Service.class, check = false)
    private Demo1Service demo1Service;

    @Override
    public String getName() {
        return "Hello World";
    }

    @Override
    public List<Map<String,Object>> listUsers() {

        return demo1Service.listUser();
    }
}
