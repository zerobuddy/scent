package com.scent.business;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {
    @POST("/test")
    Call<?> test();

    @GET("/test")
    Call<?> getTest();
}
