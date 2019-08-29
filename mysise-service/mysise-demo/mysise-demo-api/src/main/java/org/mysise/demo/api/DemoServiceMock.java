package org.mysise.demo.api;

import org.mysise.common.base.FeedResult;

import java.util.List;
import java.util.Map;

public class DemoServiceMock implements DemoService {
    @Override
    public FeedResult<String> getName(String name) {
        return new FeedResult<>("demoService 调用失败");
    }

    @Override
    public FeedResult<List<Map<String, Object>>> listUsers() {
        return null;
    }
}
