package com.scent.business;

import com.scent.data.RequestData;
import com.scent.data.ResponseData;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ProfileAPI {

    @POST("profile/{userId}")
    Call<ResponseData> fetchProfile(@Path("userId") String userId, @Body RequestData requestData);

    @PUT("profile/{userId}")
    Call<ResponseData> updateProfile(@Path("userId") String userId, @Body RequestData requestData);

    @DELETE("profile/{userId}")
    Call<ResponseData> deleteProfile(@Path("userId") String userId, @Body RequestData requestData);
}
