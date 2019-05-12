package com.example.storeieslocationapplication.apIservice;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Apiclient {
    private static ApiInerface apiinterface;

    public  static ApiInerface getInstance()
    {
        if (apiinterface==null)
        {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(" https://maps.googleapis.com")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            return retrofit.create(ApiInerface.class);
        }

        return apiinterface;

    }
}
