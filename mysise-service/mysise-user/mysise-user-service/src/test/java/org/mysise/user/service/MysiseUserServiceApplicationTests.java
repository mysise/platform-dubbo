package org.mysise.user.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mysise.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MysiseUserServiceApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void test() {

        List<User> list =  userService.listUser();
        Assert.assertNotNull(list);
    }

}
