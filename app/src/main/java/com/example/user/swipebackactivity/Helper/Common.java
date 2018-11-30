package com.example.user.swipebackactivity.Helper;

import com.example.user.swipebackactivity.IMenuRequest;
import com.example.user.swipebackactivity.Remote.RetrofitClient;

public class Common {

    public static IMenuRequest  getMenuRequest()
    {
        return RetrofitClient.getClient("https://api.androidhive.info/").create(IMenuRequest.class);
    }
}
