package com.example.storeieslocationapplication.apIservice;

import com.example.storeieslocationapplication.mOdel.Onestoredata;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInerface {
    @GET("/maps/api/place/nearbysearch/json")
    Call<Onestoredata>getData(@Query("location") String location
            ,@Query("radius") int raduis,@Query("sensor")String sensor,@Query("key") String key,
                              @Query("types") String type);

}
