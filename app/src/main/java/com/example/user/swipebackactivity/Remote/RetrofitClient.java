package com.example.user.swipebackactivity.Remote;

import java.lang.reflect.GenericArrayType;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit=null;

    public  static Retrofit getClient(String beseUrl){
        if (retrofit == null)
        {
            retrofit=new Retrofit.Builder()
                    .baseUrl(beseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
