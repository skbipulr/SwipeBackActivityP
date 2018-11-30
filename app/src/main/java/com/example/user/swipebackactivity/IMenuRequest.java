package com.example.user.swipebackactivity;

import com.example.user.swipebackactivity.Model.Item;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface IMenuRequest {
    @GET
   Call<List<Item>> getMenuList(@Url  String url);

}
