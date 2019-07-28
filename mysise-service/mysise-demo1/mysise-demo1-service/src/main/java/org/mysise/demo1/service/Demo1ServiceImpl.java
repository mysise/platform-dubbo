package org.mysise.demo1.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.mysise.demo1.api.Demo1Service;
import org.mysise.demo1.entity.User;
import org.mysise.demo1.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.List;


@Service(version = "${service.version}",interfaceClass = Demo1Service.class)
@Component
public class Demo1ServiceImpl extends ServiceImpl<UserMapper, User> implements Demo1Service {

    @Override
    public List<User> listUser() {
        return list();
    }
}
