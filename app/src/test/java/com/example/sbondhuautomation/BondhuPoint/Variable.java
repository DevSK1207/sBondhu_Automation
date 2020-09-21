package com.example.sbondhuautomation.BondhuPoint;

public class Variable {
    private String amount, payment_method, remember_token, user_id, user_type;

    public Variable(String bamount, String bpayment_method, String bremember_token, String buser_id, String buser_type) {

        amount = bamount;
        payment_method = bpayment_method;
        remember_token = bremember_token;
        user_id = buser_id;
        user_type = buser_type;
    }

    public static String printValues() {

      return  "{ \"amount\": \"10\"," +
                "\"payment_method\": \"bkash\"," +
                "\"remember_token\": \"ZcCDKeqixfbzaWecPZXjCpamlVmwhnBwaqpOAKlBypnrYFCCoRziXwvwchxEGHStrqkNxPkjVrNUVOgGkqPIMWBqMceaaQfYRxcgHIxrdcYJKibjvmWYReGoluYbaFvkbvchPofjxjLNNRcwwbYLNfXTFsuFsVqzoGZeEcSycpCvdUWotecYPPrnHLVDnRHiYRxHfIbpwphXXMixMfFSCeQbXlOOmmdLmmXinEWogSeILGMZVrJKZCDzHoOrGTZ\"," +
                "\"user_id\": \"39169\"," +
                "\"user_type\": \"affiliate\"}";
    }


    public static String printValues2() {

        return  "{ \"amount\": \"10\"," +
                "\"payment_method\": \"bkash\"," +
                "\"remember_token\": \"cCDKeqixfbzaWecPZXjCpamlVmwhnBwaqpOAKlBypnrYFCCoRziXwvwchxEGHStrqkNxPkjVrNUVOgGkqPIMWBqMceaaQfYRxcgHIxrdcYJKibjvmWYReGoluYbaFvkbvchPofjxjLNNRcwwbYLNfXTFsuFsVqzoGZeEcSycpCvdUWotecYPPrnHLVDnRHiYRxHfIbpwphXXMixMfFSCeQbXlOOmmdLmmXinEWogSeILGMZVrJKZCDzHoOrGTZ\"," +
                "\"user_id\": \"39169\"," +
                "\"user_type\": \"affiliate\"}";
    }
}
