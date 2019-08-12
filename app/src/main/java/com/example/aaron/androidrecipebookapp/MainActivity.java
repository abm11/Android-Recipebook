package com.example.aaron.androidrecipebookapp;

import android.content.ContentResolver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.listGen();
    }

//    public void onInsertClick(View v){
//        Intent intent = new Intent(this, AddRecipe.class);
//        startActivity(intent);
//    }

    public void listGen()
    {
        final String categories[] = new String[]
                {
                        EzyabmContract.RID,
                        EzyabmContract.LABEL,
                        EzyabmContract.INSTR,
                        EzyabmContract.RATE
                };

        String catDisp[] = new String[]
                {
                        EzyabmContract.LABEL,
                        EzyabmContract.RATE
                };

        int[] catIDs = new int[]
                {
                        R.id.label,
                        R.id.rating
                };


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        final ContentResolver content_resolver = getContentResolver();
        Cursor cursor = content_resolver.query(EzyabmContract.URI, categories,null,null,null);
        ListView list_view = findViewById(R.id.main_list);
        list_view.setAdapter(new SimpleCursorAdapter(this, R.layout.list_layout, cursor, catDisp, catIDs, 0));
    }
}