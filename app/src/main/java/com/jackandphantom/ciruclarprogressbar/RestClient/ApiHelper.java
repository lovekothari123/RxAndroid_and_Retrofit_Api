package com.jackandphantom.ciruclarprogressbar.RestClient;


import com.jackandphantom.ciruclarprogressbar.Model.AllSongsModel;

import retrofit2.Call;
import retrofit2.http.GET;
import rx.Observable;

public interface ApiHelper {



    @GET("api/artist")
//    Call<AllSongsModel> getResponseArtist();
    Observable<AllSongsModel> getResponseArtist();


}
