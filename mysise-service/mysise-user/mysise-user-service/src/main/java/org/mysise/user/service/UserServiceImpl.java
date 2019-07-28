package org.mysise.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.mysise.user.api.UserService;
import org.mysise.user.entity.User;
import org.mysise.user.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Service(version = "${service.version}",interfaceClass = UserService.class)
@Component
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

    @Override
    public List<User> listUser() {
        return list();
    }
}
