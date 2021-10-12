package com.example.ilism;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SongInfoAdapter extends RecyclerView.Adapter<SongInfoAdapter.SongInfoViewHolder> {

    ArrayList<SongInfo> arrayList;

    public SongInfoAdapter(ArrayList<SongInfo> arrayList) {
        this.arrayList = arrayList;
    }


    @NonNull
    @Override
    public SongInfoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_items,parent,false);
        SongInfoViewHolder songInfoViewHolder = new SongInfoViewHolder(view);
        return songInfoViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SongInfoViewHolder holder, int position) {
        SongInfo songInfo = arrayList.get(position);

        holder.txtSongName.setText(songInfo.songName);
        holder.txtSinger.setText(songInfo.singer);

//        if(songInfo == null){return;}
//        holder.txtSongName.setText(songInfo.getSongName());
//        holder.txtSinger.setText(songInfo.getSinger());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class SongInfoViewHolder extends RecyclerView.ViewHolder{

        TextView txtSongName, txtSinger;

        public SongInfoViewHolder(@NonNull View itemView) {
            super(itemView);
            txtSongName = itemView.findViewById(R.id.txtSongName);
            txtSinger = itemView.findViewById(R.id.txtSinger);
        }
    }

}
