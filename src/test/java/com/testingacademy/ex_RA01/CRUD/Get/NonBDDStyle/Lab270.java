package com.testingacademy.ex_RA01.CRUD.Get.NonBDDStyle;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab270 {

    RequestSpecification rs= RestAssured.given();
    @Test
    public void getRequestNonBDDStyle()
    {

        rs.baseUri("https://zippopotam.us");
        rs.basePath("/IN/560048");
        rs.when().log().all().get();
        rs.then().log().all().statusCode(200);

    }
    @Test
    public void getRequestNonBDDStyle2()
    {

        rs.baseUri("https://zippopotam.us");
        rs.basePath("/IN/560048");
        rs.when().log().all().get();
        rs.then().log().all().statusCode(200);

    }


}
