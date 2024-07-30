package com.testingacademy.ex_RA01.CRUD.PATCH;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab274 {

    RequestSpecification r= RestAssured.given();
    Response response;
    ValidatableResponse validate;

    @Test
    public void putRequest()
    {   String booking_id="4365";
        String BASE_URL="https://restful-booker.herokuapp.com";
        String BASE_PATH="/booking";
       String Updated_BASE_PATH= BASE_PATH+"/"+booking_id;
        String token="a1ab8f43bb7bad5";


        String payload="{\n" +
                "    \"firstname\" : \"Jy\",\n" +

                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        r.baseUri(BASE_URL);
        r.basePath(BASE_PATH);
        r.contentType(ContentType.JSON);
        r.cookie(token);
        r.body(payload).log().all();

        response = r.when().log().all().patch();

       validate =response.then().log().all();
      validate.statusCode(200);
     // validate.body("firstname", Matchers.equalTo("Jam"));

    }
}