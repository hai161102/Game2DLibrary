package com.example.game2dlibrary.models;

import android.media.MediaActionSound;
import android.media.MediaDataSource;
import android.media.MediaPlayer;

import com.example.game2dlibrary.enums.MediaEnum;

import java.io.IOException;

public abstract class MediaObject {
    public MediaEnum mediaEnum;
    public int rawId;

    public MediaObject(MediaEnum mediaEnum,  int rawId) {
        this.mediaEnum = mediaEnum;
        this.rawId = rawId;
    }

    public MediaObject() {
    }

    protected void setData(){

    }
}
