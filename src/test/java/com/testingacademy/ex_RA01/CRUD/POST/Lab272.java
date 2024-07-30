package com.testingacademy.ex_RA01.CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab272 {
    RequestSpecification r= RestAssured.given();
    Response response;
    ValidatableResponse validate;
    @Test
    public void postRequestNonBDDStylePositive(){

        String BASE_URL="https://restful-booker.herokuapp.com";
        String BASE_PATH="/booking";
        String payload="{\n" +
                "    \"firstname\" : \"Sam\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

                r.baseUri(BASE_URL).basePath(BASE_PATH).contentType(ContentType.JSON).log().all();
               r.body(payload);

        response= r.when().post();
        String responseString= response.asString();
        System.out.println("responseString = " + responseString);

        validate= response.then();
        validate.statusCode(200);
    }

    @Test
    public void postRequestNonBDDStyleNegative(){

        String BASE_URL="https://restful-booker.herokuapp.com";
        String BASE_PATH="/booking";
        String payload="";

        r.baseUri(BASE_URL).basePath(BASE_PATH).contentType(ContentType.JSON).log().all();
        r.body(payload);

        response= r.when().post();
        String responseString= response.asString();
        System.out.println("responseString = " + responseString);

        validate= response.then();
        validate.statusCode(500);
    }
}
