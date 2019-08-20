package org.mysise.demo1.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.mysise.common.base.FeedResult;
import org.mysise.demo1.api.Demo1Service;
import org.mysise.demo1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Service(version = "${service.version}",interfaceClass = Demo1Service.class)
@Component
public class Demo1ServiceImpl implements Demo1Service {

    @Autowired
    private UserMapper userMapper;

    @Override
    public FeedResult<List<Map<String,Object>>> listUser() {
        return new FeedResult<>(userMapper.selectMaps(null)) ;
    }
}
