package org.mysise.demo.api;


import java.util.List;
import java.util.Map;

public interface DemoService {

    String getName(String name);

    List<Map<String,Object>> listUsers();
}
