package com.scent.business;

import com.scent.data.RequestData;
import com.scent.data.ResponseData;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface FeedAPI {

    @GET("feed/{postId}")
    Call<ResponseData> fetchFeed(@Path("postId") String postId, @Body RequestData requestData);

    @DELETE("feed/{postId}")
    Call<ResponseData> deleteFeed(@Path("postId") String postId, @Body RequestData requestData);

    @PUT("feed/{postId}")
    Call<ResponseData> editFeed(@Path("postId") String postId, @Body RequestData requestData);

    @POST("feed/all/{userId}")
    Call<ResponseData> fetchFeeds(@Path("userId") String userId, @Body RequestData requestData);

    @POST("feed/all/{latitude}/{longitude}")
    Call<ResponseData> fetchFeed(@Path("latitude") String latitude, @Path("longitude") String longitude);
}
