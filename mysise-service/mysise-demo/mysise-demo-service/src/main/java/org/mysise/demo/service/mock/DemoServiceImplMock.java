package org.mysise.demo.service.mock;

import org.mysise.common.base.FeedResult;
import org.mysise.demo.api.DemoService;

import java.util.List;
import java.util.Map;

public class DemoServiceImplMock implements DemoService {
    @Override
    public FeedResult<String> getName(String name) {
        return new FeedResult<>("服务繁忙");
    }

    @Override
    public FeedResult<List<Map<String, Object>>> listUsers() {
        return null;
    }
}
