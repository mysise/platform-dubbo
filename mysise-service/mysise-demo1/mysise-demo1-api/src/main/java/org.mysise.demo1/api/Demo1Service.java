package org.mysise.demo1.api;


import org.mysise.common.base.FeedResult;

import java.util.List;
import java.util.Map;

public interface Demo1Service {

    FeedResult<List<Map<String,Object>>> listUser();
}
