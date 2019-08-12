package com.example.aaron.androidrecipebookapp;

import android.app.Service;
import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Intent;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.IBinder;
import android.util.Log;

public class EzyabmProviderService extends ContentProvider {///////////////////////////////

    private Database database;

    private static final UriMatcher uri_matcher;

    static
    {
        uri_matcher = new UriMatcher(UriMatcher.NO_MATCH);
        uri_matcher.addURI(EzyabmContract.AUTHORITY, "recipes", 1);
        uri_matcher.addURI(EzyabmContract.AUTHORITY, "recipes/#", 2);
    }





    @Override
    public Uri insert(Uri u, ContentValues v)
    {

        return null;
    }
    @Override
    public boolean onCreate()
    {
        this.database = new Database(this.getContext(), null, 1);
        return true;
    }

    @Override
    public int update(Uri u, ContentValues v, String s, String[] str)
    {
        return  0;
    }


    @Override
    public Cursor query(Uri u, String[] project, String sel, String[] selArg, String sO)
    {
                return this.database.getWritableDatabase().query("recipeList", project, sel, selArg, null, null, sO);

    }
    @Override
    public int delete(Uri u, String s, String[] str)
    {

        return 0;
    }

    @Override
    public String getType(Uri u)
    {

        return null;
    }

}