package com.example.ilism;

import android.widget.TextView;

import java.util.ArrayList;

public class SongInfo {
    String songName, singer;

    public SongInfo(String songName, String singer) {
        this.songName = songName;
        this.singer = singer;
    }

    public static ArrayList<SongInfo> init(){
        ArrayList<SongInfo> tmp = new ArrayList<>();
        tmp.add(new SongInfo("abc", "456"));
        tmp.add(new SongInfo("123", "cde"));
        tmp.add(new SongInfo("abc", "456"));
        tmp.add(new SongInfo("abc", "456"));
        tmp.add(new SongInfo("abc", "456"));
        tmp.add(new SongInfo("abc", "456"));
        tmp.add(new SongInfo("abc", "456"));
        tmp.add(new SongInfo("abc", "456"));
        tmp.add(new SongInfo("abc", "456"));
        tmp.add(new SongInfo("abc", "456"));
        return tmp;
    }

//    TextView songName, singer;
//
//    public SongInfo(TextView songName, TextView singer) {
//        this.songName = songName;
//        this.singer = singer;
//    }
//    public TextView getSongName() {
//        return songName;
//    }
//    public void setSongName(TextView songName) {
//        this.songName = songName;
//    }
//    public TextView getSinger() {
//        return singer;
//    }
//    public void setSinger(TextView singer) {
//        this.singer = singer;
//    }
}
