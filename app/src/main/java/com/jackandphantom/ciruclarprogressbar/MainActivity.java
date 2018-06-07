package com.jackandphantom.ciruclarprogressbar;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.jackandphantom.ciruclarprogressbar.Adapter.AtristAdapter;
import com.jackandphantom.ciruclarprogressbar.Model.AllSongsDatum;
import com.jackandphantom.ciruclarprogressbar.Model.AllSongsModel;
import com.jackandphantom.ciruclarprogressbar.RestClient.ApiHelper;
import com.jackandphantom.ciruclarprogressbar.RestClient.RestClient;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rx.Observer;
import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


public class MainActivity extends AppCompatActivity {

  static Context context;

   static List<AllSongsDatum> allsongsdatum= new ArrayList<>();
   static List<AllSongsModel> allSongsModels= new ArrayList<>();
    ProgressDialog progressDialog;
   static    AtristAdapter listadapter;
   static RecyclerView artist_recycle_view;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();




         init();

         CallApiUsingRx();





    }

    private void CallApiUsingRx() {



        rx.Observable<AllSongsModel> call = RestClient.getinstance(context).getResponseArtist();


//        call.subscribeOn(Schedulers.newThread())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(allSongsModel -> {
//
//
//                });


        call.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(allSongsModel -> {


                    int size =     allSongsModel.getData().size();

                    Log.d("mytag","count=<"+size);


                    allsongsdatum = allSongsModel.getData();

                    for (int i = 0; i <allsongsdatum.size() ; i++) {

                        Log.d("Artist_fragment","All Artist Delatils===>"+allsongsdatum.get(i).getArtistName());
                        Log.d("Artist_fragment","All Artist Delatils===>"+allsongsdatum.get(i).getArtistId());
                    }


                    listadapter = new AtristAdapter(context,allsongsdatum,artist_recycle_view);
                    artist_recycle_view.setAdapter(listadapter);


                });

    }


    private void init() {
        artist_recycle_view = (RecyclerView)findViewById(R.id.artist_recycle_view);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context,3, LinearLayoutManager.VERTICAL,false);
        artist_recycle_view.setLayoutManager(gridLayoutManager);
        artist_recycle_view.setHasFixedSize(true);
    }


}
