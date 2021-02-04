package com.dev.rlogin;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class database extends SQLiteOpenHelper {
     public static final String Database_name = "student.db";
     public static final String Table_name = "student_table";
     public static final String Col_1 = "Id";
     public static final String Col_2 = "NAME";
     public static final String Col_3 = "SURNAME";
     public static final String Col_4 = "MARKS";

    public database(Context context) {
        super(context, Database_name, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + Table_name+ " (ID INTEGER PRIMARY KEY AUTOINCREMENT ,NAME TEXT ,SURNAME TEXT,MARKS, INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
          db.execSQL("DROP TABLE IF EXISTS "+ Table_name);
    }
}










