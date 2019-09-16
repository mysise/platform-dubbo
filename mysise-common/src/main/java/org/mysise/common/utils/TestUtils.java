package org.mysise.common.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestUtils {

    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        List<String> list1 = new CopyOnWriteArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add(0,"3");
        list1.forEach(a->{
            System.out.println(a);
        });
    }
}
