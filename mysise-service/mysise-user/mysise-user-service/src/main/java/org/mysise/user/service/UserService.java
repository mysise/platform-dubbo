package org.mysise.user.service;


import com.baomidou.mybatisplus.extension.service.IService;
import org.mysise.user.entity.User;

import java.util.List;

public interface UserService extends IService<User> {

    List<User> listUser();

}
