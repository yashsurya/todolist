package com.bignerdranch.android.todolistapp.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.bignerdranch.android.todolistapp.database.TaskDbSchema.TaskTable;

public class TaskBaseHelper extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "taskBase.db";

    public TaskBaseHelper(Context context){
        super(context, DATABASE_NAME, null, VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TaskTable.NAME + "(" +
                " _id integer primary key autoincrement, " +
                TaskTable.Cols.UUID + ", " +
                TaskTable.Cols.DESCRIPTION + ", " +
                TaskTable.Cols.DATE + ", " +
                TaskTable.Cols.COMPLETED +
                ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
