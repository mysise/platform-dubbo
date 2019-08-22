package org.mysise.demo1.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.mysise.common.base.FeedResult;
import org.mysise.demo1.api.Demo1Service;
import org.mysise.demo1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

@Service(version = "1.0.0",interfaceClass = Demo1Service.class,filter = "tracing")
public class Demo1ServiceImpl implements Demo1Service {

    @Autowired
    private UserMapper userMapper;

    @Override
    public FeedResult<List<Map<String,Object>>> listUser() {
        return new FeedResult<>(userMapper.selectMaps(null)) ;
    }
}
