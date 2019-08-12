package com.example.aaron.androidrecipebookapp;


import android.content.ContentProvider;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class Database extends SQLiteOpenHelper {
//Class for database generation and management
public Database(Context context, SQLiteDatabase.CursorFactory factory, int version)
{
    super(context, "DataBaseBook", factory, version);
}

        @Override
        public void onCreate(SQLiteDatabase db){


            db.execSQL("CREATE TABLE recipeList (" +"_id INTEGER PRIMARY KEY AUTOINCREMENT, "+"Instructions VARCHAR(128) NOT NULL,"
                    +"name VARCHAR(32) NOT NULL, "+"Rating INTEGER"+");");
            Log.d("g53mdp", "Table Generated");
            db.execSQL("INSERT INTO recipeList (name, Instructions, Rating) VALUES ('Mulled Wine', 'Remove the zest from the lemon and one of the oranges with a potato peeler in thin strips then juice the zested orange. Push the cloves into the remaining orange.', 3);");
            db.execSQL("INSERT INTO recipeList (name, Instructions, Rating) VALUES ('Christmas Pudding', 'ix the almonds, apples, candied peel, nutmeg, raisins, flour, breadcrumbs, light muscovado sugar, eggs and 2 tbsp brandy or cognac in a large bowl.', 5);");
            db.execSQL("INSERT INTO recipeList (name, Instructions, Rating) VALUES ('Ice Cream', 'asdf', 1);");
            Log.d("g53mdp", "Recipe Added.");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldV, int newV)
        {
            db.execSQL("DROP TABLE IF EXISTS recipeList");
            onCreate(db);
        }
}

