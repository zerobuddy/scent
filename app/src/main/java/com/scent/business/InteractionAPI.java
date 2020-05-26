package com.scent.business;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface InteractionAPI {

    @GET("interaction/{postId}")
    Call<?> fetchInteraction(@Path("postId") String postId);

    @POST("interaction/{postId}/like")
    Call<?> like(@Path("postId") String postId);

    @DELETE("interaction/{postId}/like")
    Call<?> cancelLike(@Path("postId") String postId);

    @POST("interaction/{postId}/unlike")
    Call<?> unlike(@Path("postId") String postId);

    @DELETE("interaction/{postId}/unlike")
    Call<?> cancelUnLike(@Path("postId") String postId);

    @POST("interaction/{postId}/comment")
    Call<?> comment(@Path("postId") String postId);

    @GET("interaction/comment/{commentId}")
    Call<?> getComment(@Path("commentId") String commentId);

    @DELETE("interaction/comment/{commentId}")
    Call<?> deleteComment(@Path("commentId") String commentId);

    @PUT("interaction/comment/{commentId}")
    Call<?> editComment(@Path("commentId") String commentId);

}
