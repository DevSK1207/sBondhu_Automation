package com.example.sbondhuautomation.Topup;

import com.example.sbondhuautomation.BondhuPoint.Variable;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.Matchers.not;

public class OTFList {

    private static final String remembertoken = OTF_variable.remembertoken;
    private static final String vendorid = OTF_variable.vendorid;
    private static final String simtype = OTF_variable.simtype;
    private static final String affiliate_for = OTF_variable.affiliate_for;



    @Before

    public void setup() {
        RestAssured.baseURI = "https://api.dev-sheba.xyz";
    }
    /*  public void setup(){ RestAssured.baseURI = "https://api.sheba.xyz";}*/


    /**
     * Response code - 200
     */


    @Test
    public void OTFList_api_200() {



            RequestSpecification request = given();
            request.post("/v3/affiliates/39169/top-up-otf","remember_token="+remembertoken+"&vendor_id="+vendorid+"&sim_type="+simtype+"&for="+affiliate_for+"").
                    then().statusCode(200).assertThat()
                   .body("message", equalTo("successful"));






    }


    /**
     * Response code - 500
     */


    @Test
    public void OTFList_api_500() {

        RequestSpecification request = given();
        request.post("/v3/affiliates/39169/top-up-otf?remember_token=DE7J6GymmFbFPNjfqYHphqV8uBPmRLQo6wBEe484H7V0LqSqAuXufPrubyHtdOyNdxu3dOLVhpDfHPHUex5ONakAC9RiXg05R3pP3uh0SSOXBMrPpFpmsfAgMZ7ObKsAFpGO3CGN5nBjNNkphPYKCXC21tqTJdagQgbuuXyuYDda8w87Mh9Wcqdbu1z6JPhQgKBO9fgO7n73BneeGOyEzzdXC0HtLkU14GWcIbWUfhukj6b0rPi4raCaQenxFIn&vendor_id=1&sim_type=prepaid&for=affiliate").
                then().statusCode(500).assertThat();


    }


    /**
     * Response code - 400
     */


    @Test
    public void OTFList_api_400() {

        RequestSpecification request = given();
        request.post("/v3/affiliates/39169/top-up-otf?vendor_id=1&sim_type=prepaid&for=affiliate").
                then().statusCode(200).assertThat()
                .body("code", equalTo(400))
                .body("message", equalTo("Authentication token is missing from the request."));


    }


    /**
     * Response code - 405
     */


    @Test
    public void OTFList_api_405() {
        RequestSpecification request = given();
        request.put("/v3/affiliates/39169/top-up-otf?remember_token=DE7J6GymmFbFPNjfqYHphqV8uBPmRLQo6wBEe484H7V0LqSqAuXufPrubyHtdOyNdxu3dOLVhpDfHPHUex5ONakAC9RiXg05R3pP3uh0SSOXBMrPpFpmsfAgMZ7ObKsAFpGO3CGN5nBjNNkphPYKCXC21tqTJdagQgbuuXyuYDda8w87Mh9Wcqdbu1z6JPhQgKBO9fgO7n73BneeGOyEzzdXC0HtLkU14GWcIbWUfhukj6b0rPi4raCaQenxFIn&vendor_id=1&sim_type=prepaid&for=affiliate").
                then().statusCode(405).assertThat()
                .body("message", equalTo("405 Method Not Allowed"));


    }


    /**
     * Check for null example
     */


    @Test
    public void checkForNullExample() {

        RequestSpecification request = given();
        request.post("/v3/affiliates/39169/top-up-otf?remember_token=DE7J6GymmFbFPNjfqYHphqV8uBPmRLQo6wBEe484H7V0LqSqAuXufPrubyHtdOyNdxu3dOLVhpDfHPHUex5ONakAC9RiXg05R3pP3uh0SSOXBMrPpFpmsfAgMZ7ObKsAFpGO3CGN5nBjNNkphPYKCXC21tqTJdagQgbuuXyuYDda8w87Mh9Wcqdbu1z6JPhQgKBO9fgO7n73BneeGOyEzzdXC0HtLkU14GWcIbWUfhukj6b0rPi4raCaQenxFIn&vendor_id=1&sim_type=prepaid&for=affiliate").
                then().statusCode(200).assertThat()
                .body("message", (equalTo("Successful")))
                .body("data", not(equalTo(null)))
                .body("data.id", not(equalTo(null)))
                .body("data.topup_vendor_id", not(equalTo(null)))
                .body("data.amount", not(equalTo(null)))
                .body("data.name_en", not(equalTo(null)))
                .body("data.name_bn", not(equalTo(null)))
                .body("data.description", not(equalTo(null)))
                .body("data.type", not(equalTo(null)))
                .body("data.sim_type", not(equalTo(null)))
                .body("data.cashback_amount", not(equalTo(null)))
                .body("data.status", not(equalTo(null)))
                .body("data.created_by", not(equalTo(null)))
                .body("data.created_by_name", not(equalTo(null)))
                .body("data.updated_by", not(equalTo(null)))
                .body("data.updated_by_name", not(equalTo(null)))
                .body("data.created_at", not(equalTo(null)))
                .body("data.updated_at", not(equalTo(null)))
                .body("data.regular_commission", not(equalTo(null)))
                .body("data.otf_commission", not(equalTo(null)));







    }
}
