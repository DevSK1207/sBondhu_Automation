package com.example.sbondhuautomation.Login;

import com.example.sbondhuautomation.BondhuPoint.Variable;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import static org.hamcrest.CoreMatchers.equalTo;

public class Login {


    @Before

    public void setup(){
        RestAssured.baseURI = "https://accounts.dev-sheba.xyz/api";
    }






    /**
     * LOGIN Point API
     * Response code - 200
     */



    @Test
    public void login_api_200(){
        RequestSpecification request = RestAssured.given();


        String body = Login_variable.loginValues();

        request.header("Content-Type", "application/json");
        request.body(body);

        request.post("/v3/profile/login").
                then().statusCode(200).log().all().assertThat()
                .body("code", equalTo(200))
                 .body("message", equalTo("Successful"));



    }

    /**
     * LOGIN Point API
     * Response code - 401
     */


    @Test
    public void login_api_401(){
        RequestSpecification request = RestAssured.given();


        String body = Login_variable.loginValues();

        request.header("Content-Type", "application/json");
        request.body(body);

        request.post("/v3/profile/login").
                then().statusCode(200).log().all().assertThat().assertThat()
                .body("code", equalTo(401))
                .body("message", equalTo("Multiple device logged in"));



    }




    /**
     * LOGIN Point API
     * Response code - 403
     */


    @Test
    public void login_api_403(){
        RequestSpecification request = RestAssured.given();


        String body = Login_variable.loginValues();

        request.header("Content-Type", "application/json");
        request.body(body);

        request.post("/v3/profile/login").
                then().statusCode(200).log().all().assertThat().assertThat()
                .body("code", equalTo(403))
                .body("message", equalTo("Multiple device logged in"));



    }

    /**
     * LOGIN Point API
     * Response code - 400
     */

    @Test
    public void login_api_400(){
        RequestSpecification request = RestAssured.given();


        String body = Login_variable.pinvalue();

        request.header("Content-Type", "application/json");
        request.body(body);

        request.post("/v3/profile/login").
                then().statusCode(200).log().all().assertThat()
                .body("code", equalTo(400))
                .body("message", equalTo("The password field is required."));


    }

    /**
     * Response code - 500
     */


    @Test
    public void login_api_500(){
        RequestSpecification request = RestAssured.given();


        String body = Login_variable.loginValues();

        request.header("Content-Type", "application/json");
        request.body(body);

        request.post("/v3/profile/login").
                then().statusCode(500).log().all().assertThat().assertThat();


    }



    /**
     * Response code - 403
     */


    @Test
    public void logint_api_403_hourlog(){
        RequestSpecification request = RestAssured.given();


        String body = Login_variable.loginValues();

        request.header("Content-Type", "application/json");
        request.body(body);

        request.post("/v3/profile/login").
                then().statusCode(200).log().all().assertThat()
                .body("code", equalTo(403))
                .body("login_wrong_pin_count", equalTo(0));


    }

    @Test
    public void logint_api_403_count1(){
        RequestSpecification request = RestAssured.given();


        String body = Login_variable.loginValues();

        request.header("Content-Type", "application/json");
        request.body(body);

        request.post("/v3/profile/login").
                then().statusCode(200).log().all().assertThat()
                .body("code", equalTo(403))
                .body("login_wrong_pin_count", equalTo(1));


    }

    @Test
    public void logint_api_403_count2(){
        RequestSpecification request = RestAssured.given();


        String body = Login_variable.loginValues();

        request.header("Content-Type", "application/json");
        request.body(body);

        request.post("/v3/profile/login").
                then().statusCode(200).log().all().assertThat()
                .body("code", equalTo(403))
                .body("login_wrong_pin_count", equalTo(2));


    }


    @Test
    public void login_api_405(){
        RequestSpecification request = RestAssured.given();

        String body = Login_variable.loginValues();

        request.header("Content-Type", "application/json");
        request.body(body);

        request.put("/v3/profile/login").
                then().statusCode(500).assertThat()
                .body("message", equalTo("Method is not allowed"));
        ;
    }



    /**
     * Check for null example
     */


    @Test
    public void checkForNullExample() {

        RequestSpecification request = RestAssured.given();

        String body = Login_variable.loginValues();

        request.header("Content-Type", "application/json");
        request.body(body);

        request.post("/v3/profile/login").
                then().statusCode(200).log().all().assertThat()
                .body("token", (equalTo(null)));


    }



}
