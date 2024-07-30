package com.testingacademy.ex_RA01.CRUD.Get.NonBDDStyle;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab270a {

    @Test
    public void getRequest()
    {
        RequestSpecification rs = RestAssured.given();
        rs.baseUri("https://restful-booker.herokuapp.com");
        rs.basePath("/apidoc/index.html").log().all();
        rs.when().get();
        rs.then().log().all().statusCode(200);
    }

    @Test
    public void getRequestNegative()
    {
        RequestSpecification rs = RestAssured.given();
        rs.baseUri("https://restful-booker.herokuapp.com");
        rs.basePath("/apidoc/index.html").log().all();
        rs.when().get();
        rs.then().log().all().statusCode(404);
    }
}
