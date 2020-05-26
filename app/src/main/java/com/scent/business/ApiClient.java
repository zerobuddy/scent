package com.scent.business;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static String BASE_URL = "";
    public static Retrofit retrofit;

    public static Retrofit getApiClient(){
      if(retrofit != null){
          retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
      }
      return retrofit;
    }
}
