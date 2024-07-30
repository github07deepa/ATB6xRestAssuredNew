package com.testingacademy.ex_RA01;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Lab261 {
    @Description("Testcase1-RA1")
    @Test
    public void getRequest()
    {
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                .when()
                .get()
                .then().statusCode(201);
    } @Test
    public void getRequest2()
    {
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                .when()
                .get()
                .then().statusCode(201);
    }
}
