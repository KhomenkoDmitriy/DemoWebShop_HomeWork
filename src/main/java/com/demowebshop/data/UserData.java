package com.demowebshop.data;

public class UserData {
    public static final String FirstName = "Dmitriy";
    public static final String LastName = "Medvedev";
    public static final String email = "mitycan38@gmail.com";
    public static final String password = "Pp1234567!";
    public static final String ConfirmPassword = "Pp1234567!";

    public static String generateEmail(){
        int i = (int) ((System.currentTimeMillis() / 1000 % 3600));
        return "mitycan38" + i + "@gmail.com";
    }
}
