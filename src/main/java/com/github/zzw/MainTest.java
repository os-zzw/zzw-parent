package com.github.zzw;

import java.util.ArrayList;

import com.google.common.collect.Lists;

/**
 * @author zhangzhewei
 * Created on 2020-03-10
 */
public class MainTest {

    private static final int YI = 100000000;

    public static void main(String[] args) {
        ArrayList<Object> list = Lists.newArrayList();
        list.add("11");
        list.add(0, "22");
        System.out.println(list);
    }

}
