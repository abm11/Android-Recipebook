package com.example.aaron.androidrecipebookapp;

import android.net.Uri;

public class EzyabmContract {

    public static final String AUTHORITY = "com.example.aaron.androidrecipebookapp.EzyabmProviderService";
    public static final Uri URI = Uri.parse("content://"+AUTHORITY+"/recipeList");
    public static final String RID = "_id";
    public static final String LABEL = "name";
    public static final String INSTR = "Instructions";
    public static final String RATE = "Rating";
}
