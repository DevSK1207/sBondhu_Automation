package com.example.sbondhuautomation.Topup;

public class Topup_variable {

    private String topup_mobile, vendor_id, connection_type, topup_amount,Topup_password ;

    public Topup_variable(String btopup_mobile, String bvendor_id, String bconnection_type, String bTopup_amount, String bTopup_password) {

        topup_mobile = btopup_mobile;
        vendor_id = bvendor_id;
        connection_type = bconnection_type;
        topup_amount = bTopup_amount;
        Topup_password = bTopup_password;
        vendor_id = bvendor_id;

    }

    public static String printValues() {

        return  "{ \"mobile\": \"01620011019\"," +
                "{ \"vendor_id\": \"1\"," +
                "{ \"connection_type\": \"prepaid\"," +
                "{ \"amount\": \"10\"," +
                "\"password\": \"22222\"}";
    }


    public static String printValues2() {

        return  "{ \"mobile\": \"01620011019\"," +
                "{ \"vendor_id\": \"1\"," +
                "{ \"connection_type\": \"prepaid\"," +
                "{ \"amount\": \"10\"," +
                "\"password\": \"12345\"}";
    }
}
