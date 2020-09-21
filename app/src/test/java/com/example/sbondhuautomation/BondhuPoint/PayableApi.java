package com.example.sbondhuautomation.BondhuPoint;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.get;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.not;

public class PayableApi {


    @Before

    public void setup() {
        RestAssured.baseURI = "https://api.dev-sheba.xyz";
    }


    /**
     * Response code - 200
     */


    @Test
    public void payable_api_200() {
        get("/v2/payments?payable_type=bondhu_point").
                then().statusCode(200).assertThat()
                .body("code", equalTo(200))
                .body("message", equalTo("Successful"));


    }


    /**
     * Response code - 500
     */


    @Test
    public void payable_api_500() {
        get("/v2/payments?payable_type=bondhu_point").
                then().statusCode(200).assertThat()
                .body("code", equalTo(200))
                .body("message", equalTo("Successful"));


    }


    /**
     * Response code - 405
     */


    @Test
    public void payable_api_405() {
        RequestSpecification request = RestAssured.given();
        request.post("/v2/payments?payable_type=bondhu_point").
         then().statusCode(405);


    }


    /**
     * Check for null example
     */


    @Test
    public void checkForNullExample() {
        get("/v2/payments?payable_type=bondhu_point").
                then().statusCode(200).assertThat()
                .body("message", (equalTo("Successful")))
                .body("payments", not(equalTo(null)))
               /* //.body("payments.name", (equalTo("bKash")))
                .body("payments.name_bn", (equalTo("বিকাশ")))
                .body("payments.is_published", (equalTo("1")))
                .body("payments.description", (equalTo("")))
                .body("payments.asset", (equalTo("bkash")))
                .body("payments.method_name", (equalTo("bkash")))
               // .body("payments.name", (equalTo("Nagad")))
                .body("payments.name_bn", (equalTo("নগদ")))
                .body("payments.is_published", (equalTo("1")))
                .body("payments.description", (equalTo("")))
                .body("payments.asset", (equalTo("nagad")))
                .body("payments.method_name", (equalTo("nagad")))*/

                .body("discount_message", (equalTo("Pay online and stay relaxed!!!")));





    }

}