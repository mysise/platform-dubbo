package org.mysise.demo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import lombok.extern.slf4j.Slf4j;
import org.mysise.common.base.FeedResult;
import org.mysise.demo.api.DemoService;
import org.mysise.demo1.api.Demo1Service;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


@Service(version = "${demo.service.version}",interfaceClass = DemoService.class,filter = {"tracing","ipFilter"})
@Component
@Slf4j
public class DemoServiceImpl implements DemoService {

    @NacosValue(value = "${aaa:222}", autoRefreshed = true)
    private String aaa;

    @Reference(interfaceClass = Demo1Service.class,version = "${demo1.service.version}",check = false,timeout = 10000)
    private Demo1Service demo1Service;

//    @Autowired
//    private RedisUtils redisUtils;
    @Override
    public FeedResult<String> getName(String name) {
        //redisUtils.set("hi",name);
        log.info("nacos aaa : {} ",aaa);
        return new FeedResult<>(aaa);
    }

    @Override
    public FeedResult<List<Map<String,Object>>> listUsers() {

        return demo1Service.listUser();
    }
}
