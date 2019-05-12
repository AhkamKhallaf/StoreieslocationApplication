package com.example.storeieslocationapplication.vIewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.util.Log;

import com.example.storeieslocationapplication.apIservice.ApiInerface;
import com.example.storeieslocationapplication.apIservice.Apiclient;
import com.example.storeieslocationapplication.mOdel.Onestoredata;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Dataviewmodel extends ViewModel {
    ApiInerface apiInerface;
    Onestoredata onestoredata;
    MutableLiveData<Onestoredata>mutableLiveData;

    public Dataviewmodel() {
        apiInerface = Apiclient.getInstance();
    }

    public LiveData<Onestoredata>getData(String location,int raduis,String sensor,String key ,String type)
    {
        mutableLiveData = new MutableLiveData<>();
        onestoredata = new Onestoredata();
        apiInerface.getData(location,raduis,sensor,key,type)
                .enqueue(new Callback<Onestoredata>() {
                    @Override
                    public void onResponse(Call<Onestoredata> call, Response<Onestoredata> response) {
                        if (response.isSuccessful()&& response.body()!=null)
                        {
                            Log.d("SASASAS",response.body().getArrayList().size()+"");
                            mutableLiveData.setValue(response.body());
                        }

                    }

                    @Override
                    public void onFailure(Call<Onestoredata> call, Throwable t) {
                        Log.d("SASASAS",t.getMessage()+"errrrrrrrrrrr");
                    }
                });
        return mutableLiveData;
    }
}
