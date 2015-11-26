package com.example.suhaas.traveltracker;

import android.content.Context;
import android.database.Cursor;

public class MemoriesLoader extends DbCursorLoader {

    private MemoriesDataSource mDataSource;

    public MemoriesLoader(Context context, MemoriesDataSource memoriesDataSource){
        super(context);
        mDataSource = memoriesDataSource;
    }
    @Override
    protected Cursor loadCursor() {
        return mDataSource.allMemoriesCursor();
    }
}
