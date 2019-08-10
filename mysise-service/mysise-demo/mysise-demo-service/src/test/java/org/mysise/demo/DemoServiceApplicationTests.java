package org.mysise.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mysise.demo.api.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Map;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoServiceApplicationTests {

    @Autowired
    private DemoService demoService;

    @Test
    public void test() {

        List<Map<String,Object>> result = demoService.listUsers();
        Assert.notNull(result);
    }

}
