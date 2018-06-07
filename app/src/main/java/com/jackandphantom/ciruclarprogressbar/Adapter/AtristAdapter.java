package com.jackandphantom.ciruclarprogressbar.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.jackandphantom.ciruclarprogressbar.Model.AllSongsDatum;
import com.jackandphantom.ciruclarprogressbar.R;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by love on 3/24/2018.
 */

public class AtristAdapter extends RecyclerView.Adapter<AtristAdapter.ViewHolder> {

  Context context;
  List<AllSongsDatum> list=new ArrayList<>();
  RelativeLayout rl_header;
  FragmentManager fm;
  RecyclerView  artist_recycle_view;






    public AtristAdapter(Context context, List<AllSongsDatum> allsongsdatum, RecyclerView artist_recycle_view) {
        this.context=context;
        this.list=allsongsdatum;
        this.artist_recycle_view=artist_recycle_view;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.artist_view_one, parent, false);
        ViewHolder vh = new ViewHolder(v); // pass the view to View Holder
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {


        final AllSongsDatum item = list.get(position);

        holder.Heading_one.setText(list.get(position).getArtistName());
        holder.Heading_one.setSelected(true);
        String a_id = String.valueOf(list.get(position).getArtistId());
        holder.heading_two.setText(a_id);
        holder.heading_two.setSelected(true);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent  intent = new Intent(context, Main2Activity.class);

                context.startActivity(intent);
                Log.d("mytag","Clicked hua");
            }
        });

        Log.d("AtristAdapter","Artist_images===>"+list.get(position).getImage());

//        Glide.with(context).load(list.get(position).getImage()).placeholder(R.drawable.jay_z).into(holder.cirulerImage);
//        ImageLoader.getInstance().displayImage(item.getImage(),holder.cirulerImage,options);



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView Heading_one,heading_two;

        public ViewHolder(View itemView) {
            super(itemView);
            Heading_one =(TextView)itemView.findViewById(R.id.artist_view_one_heading_one);
            heading_two =(TextView)itemView.findViewById(R.id.artist_view_one_heading_two);

        }
    }

}
