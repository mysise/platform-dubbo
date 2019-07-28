package org.mysise.demo.api;

import com.baomidou.mybatisplus.extension.service.IService;
import org.mysise.demo.entity.DemoEntity;
import org.mysise.demo1.entity.User;

import java.util.List;

public interface DemoService extends IService<DemoEntity> {



    List<User> getName();
}
