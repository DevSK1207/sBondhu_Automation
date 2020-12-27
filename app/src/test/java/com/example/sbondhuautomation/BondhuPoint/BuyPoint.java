package com.example.sbondhuautomation.BondhuPoint;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import static com.example.sbondhuautomation.BondhuPoint.Variable.printValues;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.not;

/**
 * Buy point Rest Assure Code
 * Nowrin
 * 21/9/2020
 */

public class BuyPoint {

    @Before

    public void setup(){
        RestAssured.baseURI = "https://api.dev-sheba.xyz";
    }
    /*  public void setup(){ RestAssured.baseURI = "https://api.sheba.xyz";}*/






/**
 * Validation Buy Point API
 * Response code - 200
 */



    @Test
    public void buypoint_api_200(){
        RequestSpecification request = RestAssured.given();


        String body = Variable.printValues();

        request.header("Content-Type", "application/json");
        request.body(body);

        request.post("/v2/wallet/recharge").
                then().statusCode(200).assertThat()
                .body("code", equalTo(200));


    }

    /**
     * if previous initiation of online payment expires within 3 minutes.
     * Response code - 400
     */

    @Test
    public void buypoint_api_400(){
        RequestSpecification request = RestAssured.given();


        String body = Variable.printValues();

        request.header("Content-Type", "application/json");
        request.body(body);

        request.post("/v2/wallet/recharge").
                then().statusCode(200).assertThat()
                .body("code", equalTo(400))
                .body("message", equalTo("Please wait until your previous initiation of online payment expires within 3 minutes."));


    }

    /**
     * Response code - 500
     */


    @Test
    public void buypoint_api_500(){
        RequestSpecification request = RestAssured.given();


        String body = Variable.printValues();

        request.header("Content-Type", "application/json");
        request.body(body);

        request.post("/v2/wallet/recharge").
                then().statusCode(200).assertThat()
                .body("code", equalTo(500));


    }



    /**
     * Response code - 404
     */


    @Test
    public void buypoint_api_404(){
        RequestSpecification request = RestAssured.given();


        String body = Variable.printValues2();

        request.header("Content-Type", "application/json");
        request.body(body);

        request.post("/v2/wallet/recharge").
                then().statusCode(200).assertThat()
                .body("code", equalTo(404))
                .body("message", equalTo("User Not found."));


    }


    @Test
    public void buypoint_api_405(){
        RequestSpecification request = RestAssured.given();

        String body = Variable.printValues();

        request.header("Content-Type", "application/json");
        request.body(body);

        request.put("/v2/wallet/recharge").
                then().statusCode(405);
    }



    /**
     * Check for null example
     */


    @Test
    public void checkForNullExample() {

        RequestSpecification request = RestAssured.given();

        String body = Variable.printValues();

        request.header("Content-Type", "application/json");
        request.body(body);

        request.post("/v2/wallet/recharge").
                then().statusCode(200).assertThat()
                .body("link", (equalTo(null)))
             //   .body("transaction_id", not(equalTo(null)))
                .body("id", (equalTo("0")))
                .body("type", (equalTo("recharge")))
                .body("link", (equalTo("https://www.dev-sheba.xyz/bkash?paymentID=YF9ZNUB1600691471972")))
                .body("success_url", (equalTo("https://www.dev-sheba.xyz/profile/credit")))
                .body("fail_url", (equalTo("https://api.dev-sheba.xyz")));

    }

}
