package com.huikedu.com;

import com.alibaba.fastjson.JSON;

import static org.junit.Assert.*;

public class UserDemoTest {

    public static void main(String[] args) {
        UserDemo ud = new UserDemo();
        ud.setId(001);
        ud.setAge("18");
        ud.setName("hello world");
        System.out.println(JSON.toJSONString(ud));
    }
}