package org.mysise.demo1.api;

import com.baomidou.mybatisplus.extension.service.IService;
import org.mysise.demo1.entity.User;

import java.util.List;

public interface Demo1Service extends IService<User> {

    List<User> listUser();
}
