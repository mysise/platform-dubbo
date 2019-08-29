package org.mysise.common.utils;

import java.util.ArrayList;
import java.util.List;

public class TestUtils {

    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add(0,"3");
        list.forEach(a->{
            System.out.println(a);
        });
    }
}
