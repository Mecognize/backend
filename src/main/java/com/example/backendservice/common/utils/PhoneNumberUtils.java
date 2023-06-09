package com.example.backendservice.common.utils;

public class PhoneNumberUtils {
    public static boolean isValid(String phoneNumber) {
        String reg = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";
        return phoneNumber.matches(reg);
    }
}
