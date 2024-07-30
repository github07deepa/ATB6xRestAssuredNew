package com.testingacademy.ex_RA01.CRUD.Get.BDDStyle;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Lab269 {
    @Test
    public void getRequestBDDStyle() {

                RestAssured
                .given()
                .baseUri("https://zippopotam.us")
                        .basePath("/IN/560048")
                        .when().log().all().get()
                        .then()
                        .log().all().statusCode(200);

    }
}