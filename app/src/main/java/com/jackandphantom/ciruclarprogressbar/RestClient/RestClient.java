package com.jackandphantom.ciruclarprogressbar.RestClient;

import android.content.Context;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public  class RestClient {


    public static  ApiHelper apiHelper;


       public static ApiHelper getinstance(Context context){

            if(apiHelper == null){

                getapiHelper();
              return apiHelper;
            }

           return apiHelper;
       }

    private static ApiHelper getapiHelper() {


        HttpLoggingInterceptor  httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);


        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(httpLoggingInterceptor);

        Retrofit retrofit = new Retrofit.Builder()
                .client(builder.build())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                         .addConverterFactory(GsonConverterFactory.create())
                         .baseUrl("http://34.236.75.251/")
                          .build();

         apiHelper = retrofit.create(ApiHelper.class);

         return apiHelper;

    }


}
