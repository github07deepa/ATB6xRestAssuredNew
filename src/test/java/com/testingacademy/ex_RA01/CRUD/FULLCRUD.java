package com.testingacademy.ex_RA01.CRUD;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FULLCRUD {

    String booking_id;
    String token;
    RequestSpecification rs= RestAssured.given();
 Response response;
 ValidatableResponse vr;

 //get token
 @Test
    @BeforeMethod
    public void getToken()
 {
//     String BASE_URL="https://restful-booker.herokuapp.com";
//     String BASE_PATH="/auth";
//     String UPDATED_BASE_URL=BASE_URL+
  String payload ="{\n" +
          "    \"username\" : \"admin\",\n" +
          "    \"password\" : \"password123\"\n" +
          "}";
     rs.baseUri("https://restful-booker.herokuapp.com");
     rs.basePath("auth");
     rs.contentType(ContentType.JSON);
     rs.body(payload);

     response =rs.post();
     vr=response.then();
     vr.statusCode(200);
     //extract token
     token =response.then().log().all().extract().path("token");
     Assert.assertNotNull(token);





}
