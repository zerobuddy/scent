package com.scent.business;

import retrofit2.Call;
import retrofit2.http.POST;

public interface LoginAPI {

    @POST("login")
    Call<?> login();

    @POST("logout")
    Call<?> logout();

    @POST("forgotPassword")
    Call<?> forgotPassword();

    @POST("refresh")
    Call<?> refresh();
}
