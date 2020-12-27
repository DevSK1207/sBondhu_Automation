package com.example.sbondhuautomation.Login;

public class Login_variable {
    private String mobile, password;

    public Login_variable(String bpassword, String bmobile) {

        mobile = bmobile;
        password = bpassword;

    }

    public static String loginValues() {

        return  "{ \"mobile\": \"01620011019\"," +
                "\"password\": \"33333\"}";
    }

    public static String pinvalue() {

        return  "{ \"mobile\": \"01620011019\"," ;
    }


}
