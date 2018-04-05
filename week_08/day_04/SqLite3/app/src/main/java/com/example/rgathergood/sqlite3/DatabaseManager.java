package com.example.rgathergood.sqlite3;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by rgathergood on 23/03/2018.
 */

public class DatabaseManager extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "EmployeeDatabase";
    public static final int DATABASE_VERSION = 1;
    public static final String TABLE_NAME = "employees";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_DEPT = "department";
    public static final String COLUMN_JOIN_DATE = "joiningdate";
    public static final String COLUMN_SALARY = "salary";


    public DatabaseManager(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = ("CREATE TABLE " + TABLE_NAME + " (\n" +
                "    " + COLUMN_ID + " INTEGER NOT NULL CONSTRAINT employees_pk PRIMARY KEY AUTOINCREMENT,\n" +
                "    " + COLUMN_NAME + " varchar(200) NOT NULL,\n" +
                "    " + COLUMN_DEPT + " varchar(200) NOT NULL,\n" +
                "    " + COLUMN_JOIN_DATE + " datetime NOT NULL,\n" +
                "    " + COLUMN_SALARY + " double NOT NULL\n" +
                ");");

        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    boolean addEmployee(String name, String dept, String joiningDate, double salary) {
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put(COLUMN_NAME, name);
        cv.put(COLUMN_DEPT, dept);
        cv.put(COLUMN_JOIN_DATE, joiningDate);
        cv.put(COLUMN_SALARY, String.valueOf(salary));

        return sqLiteDatabase.insert(TABLE_NAME, null, cv) != -1;

    }

    Cursor getAllEmployees() {
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        return sqLiteDatabase.rawQuery("SELECT * FROM " + TABLE_NAME, null);
        //selectionArgs could be used for boolean
    }

    boolean updateEmployee(int id, String name, String dept, double salary) {
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_NAME, name);
        cv.put(COLUMN_DEPT, dept);
        cv.put(COLUMN_SALARY, String.valueOf(salary));
        return sqLiteDatabase.update(TABLE_NAME, cv, COLUMN_ID + "=?", new String[]{String.valueOf(id)}) > 0;
    }

    boolean deleteEmployee(int id) {
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        return sqLiteDatabase.delete(TABLE_NAME, COLUMN_ID + "=?", new String[]{String.valueOf(id)}) > 0;
    }
}
