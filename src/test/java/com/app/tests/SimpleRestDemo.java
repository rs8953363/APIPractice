package com.app.tests;

import io.restassured.*;
import org.junit.Test;

public class SimpleRestDemo {
    @Test
    public void test1(){
        RestAssured.get("https://uinames.api/");
    }
}
