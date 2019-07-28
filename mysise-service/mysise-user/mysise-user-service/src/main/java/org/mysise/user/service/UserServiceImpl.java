package org.mysise.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.mysise.user.api.UserService;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Override
    public String getUserName() {
        return "name";
    }
}
