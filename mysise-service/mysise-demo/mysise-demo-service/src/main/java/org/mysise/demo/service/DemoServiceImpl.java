package org.mysise.demo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import org.mysise.common.base.FeedResult;
import org.mysise.common.utils.RedisUtils;
import org.mysise.demo.api.DemoService;
import org.mysise.demo1.api.Demo1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


@Service(version = "${demo.service.version}",interfaceClass = DemoService.class,filter = "tracing",timeout = 10000)
@Component
public class DemoServiceImpl implements DemoService {

    @Reference(interfaceClass = Demo1Service.class,version = "${demo1.service.version}",check = false,timeout = 10000)
    private Demo1Service demo1Service;

    @Autowired
    private RedisUtils redisUtils;
    @Override
    public FeedResult<String> getName(String name) {
        redisUtils.set("hi",name);
        return new FeedResult<>(redisUtils.get("hi").toString());
    }

    @Override
    public FeedResult<List<Map<String,Object>>> listUsers() {

        return demo1Service.listUser();
    }
}
