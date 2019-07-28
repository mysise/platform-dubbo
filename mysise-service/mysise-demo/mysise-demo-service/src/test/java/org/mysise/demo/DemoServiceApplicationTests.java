package org.mysise.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mysise.demo.api.DemoService;
import org.mysise.demo1.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoServiceApplicationTests {

    @Autowired
    private DemoService demoService;

    @Test
    public void test() {

        List<User> result = demoService.getName();
        Assert.notNull(result);
    }

}
