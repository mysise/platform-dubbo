package org.mysise.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mysise.common.base.FeedResult;
import org.mysise.demo.api.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DemoServiceApplicationTests {

    @Autowired
    private DemoService demoService;


    @Resource
    private RedisTemplate<String, Object> redisTemplate;


    @Test
    public void test() {

        FeedResult<List<Map<String,Object>> >result = demoService.listUsers();
        Assert.notNull(result);
    }


    @Test
    public void testHyperLogLog(){
        String uv1 = "uv1";
        for(int j=0;j<1000;j++){
            int num =(int)(Math.random() * 1000);
            log.info(String.valueOf(num));
            Long hll =  redisTemplate.opsForHyperLogLog().add(uv1,String.valueOf(num));
        }
        System.out.println(redisTemplate.opsForHyperLogLog().size(uv1));
    }
}
