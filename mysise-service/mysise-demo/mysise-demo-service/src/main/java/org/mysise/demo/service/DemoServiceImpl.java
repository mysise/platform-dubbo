package org.mysise.demo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.mysise.demo.api.DemoService;
import org.mysise.demo.entity.DemoEntity;
import org.mysise.demo.mapper.DemoMapper;
import org.mysise.demo1.api.Demo1Service;
import org.mysise.demo1.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;


@Service(version = "1.0.0",interfaceClass = DemoService.class)
@Component
public class DemoServiceImpl extends ServiceImpl<DemoMapper, DemoEntity> implements DemoService {

    @Reference(interfaceClass = Demo1Service.class, check = false)
    private Demo1Service demo1Service;

    @Override
    public List<User> getName() {

        return demo1Service.listUser();
    }
}
