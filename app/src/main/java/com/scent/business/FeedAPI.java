package com.scent.business;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface FeedAPI {

    @GET("feed/{postId}")
    Call<?> fetchFeed(@Path("postId") String postId);

    @DELETE("feed/{postId}")
    Call<?> deleteFeed(@Path("postId") String postId);

    @PUT("feed/{postId}")
    Call<?> editFeed(@Path("postId") String postId);

    @POST("feed/all/{userId}")
    Call<?> fetchFeeds(@Path("postId") String userId);

}
