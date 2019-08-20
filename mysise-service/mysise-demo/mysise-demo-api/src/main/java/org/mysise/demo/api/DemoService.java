package org.mysise.demo.api;


import org.mysise.common.base.FeedResult;

import java.util.List;
import java.util.Map;

public interface DemoService {

    FeedResult<String> getName(String name);

    FeedResult<List<Map<String,Object>>> listUsers();
}
