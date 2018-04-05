package com.example.rgathergood.sqlite2;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by rgathergood on 22/03/2018.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "sqlitedatabaseexample";
    public static final int DB_VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sqlArtists = "CREATE TABLE artists(id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR);";
        String sqlTracks = "CREATE TABLE tracks(id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR, artist_id INTEGER, FOREIGN KEY(artist_id) REFERENCES artists(id));";

        sqLiteDatabase.execSQL(sqlArtists);
        sqLiteDatabase.execSQL(sqlTracks);

    }

    public boolean addArtist(String name) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        db.insert("artists", null, contentValues);
        db.close();
        return true;
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String sqlArtists = "DROP TABLE IF EXISTS artists";
        String sqlTracks = "DROP TABLE IF EXISTS tracks";

        sqLiteDatabase.execSQL(sqlTracks);
        sqLiteDatabase.execSQL(sqlArtists);

        onCreate(sqLiteDatabase);

    }
}
