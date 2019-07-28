package org.mysise.demo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.mysise.demo.api.DemoService;
import org.mysise.demo.entity.DemoEntity;
import org.mysise.demo.mapper.DemoMapper;
import org.mysise.user.api.UserService;
import org.mysise.user.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;


@Service(version = "1.0.0",interfaceClass = DemoService.class)
@Component
public class DemoServiceImpl extends ServiceImpl<DemoMapper, DemoEntity> implements DemoService {

    @Reference(interfaceClass = UserService.class, check = false)
    private UserService userService;

    @Override
    public List<User> getName() {

        return userService.listUser();
    }
}
