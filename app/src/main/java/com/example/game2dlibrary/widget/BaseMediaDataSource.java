package com.example.game2dlibrary.widget;

import android.media.MediaDataSource;

import java.io.IOException;

public abstract class BaseMediaDataSource extends MediaDataSource {

    public BaseMediaDataSource() {
    }



    @Override
    public int readAt(long l, byte[] bytes, int i, int i1) throws IOException {
        return 0;
    }

    @Override
    public long getSize() throws IOException {
        return 0;
    }

    @Override
    public void close() throws IOException {

    }
}
