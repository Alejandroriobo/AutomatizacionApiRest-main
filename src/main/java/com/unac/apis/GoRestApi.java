package com.unac.apis;

import com.unac.restinteractions.RestInteractions;

public class GoRestApi {

    private static final String TOKEN = "fb31be4e3b6d69b33c59f9950850a8c8c37c13f7703bfdbe4175453f7b00bdd2";
    private static final String PATH_NAME = "name";
    private static final String PATH_EMAIL = "email";

    public static void setBaseUrl(String baseUrl) {
        RestInteractions.setBaseUrl(baseUrl);
    }

    public static void executionGetToken(String endPoint, String idUser){
        RestInteractions.executionGetToken(endPoint, idUser, TOKEN);
    }

    public static void executionPut(String endPoint, String idUser, String name, String email){
        RestInteractions.executionPut(endPoint, idUser, TOKEN, name, email);
    }

    public static void validateResponse(Integer statusCode, String name, String email) {
        RestInteractions.validateCode(statusCode);
        RestInteractions.validateDataResponse(name, PATH_NAME);
        RestInteractions.validateDataResponse(email, PATH_EMAIL);
    }

    public static void validateResponse(Integer statusCode, String name) {
        RestInteractions.validateCode(statusCode);
        RestInteractions.validateDataResponse(name, PATH_NAME);
    }
}

