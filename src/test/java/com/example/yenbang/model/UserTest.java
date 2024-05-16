package com.example.yenbang.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONString;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void UserTest() {
        // try
        User TestData  = new User("test", "1234", 01077777777, 1, 1, new Date());
        // when
        String printData = "";
        // then
        System.out.println(TestData.toString());
    }

}