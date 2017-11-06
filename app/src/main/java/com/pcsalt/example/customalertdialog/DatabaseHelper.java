/*
package com.pcsalt.example.customalertdialog;

*/
/**
 * Created by sowmyaram on 8/2/2017.
 *//*

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

*/
/**
 * Created by Nihal on 1/24/2017.
 *//*


public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "MyPlate.db";
    public static final String CARS_TABLE_NAME = "CarNumber";
    public static final String CARS_COLUMN_ID = "id";
    public static final String CARS_COLUMN_NAME = "c_number";
    public static final String CARS_COLUMN_COLOR = "c_Color";
    public static final String CARS_COLUMN_PLACE = "c_Place";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table  " +           CARS_TABLE_NAME+
                "(_id integer primary key AUTOINCREMENT NOT NULL,"+  CARS_COLUMN_NAME+
                " Text,"+                    CARS_COLUMN_COLOR+
                " Text,"+                    CARS_COLUMN_PLACE+
                " Text)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+ DATABASE_NAME);
        onCreate(db);
    }


    public int numberOfRows(){
        SQLiteDatabase db = this.getReadableDatabase();
        int numRows = (int) DatabaseUtils.queryNumEntries(db,CARS_TABLE_NAME);
        return numRows;
    }




    public boolean insertPlate(int number, String color, String place) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put("c_number", number);
        contentValues.put("c_Color", color);
        contentValues.put("c_Place", place);

        db.insert(CARS_TABLE_NAME, null, contentValues);
        return true;
    }

    public ArrayList<Cars> getData() {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<Cars> car= new ArrayList<Cars>();
        Cursor result = db.rawQuery("select * from "+CARS_TABLE_NAME , null);
        while(result.moveToNext()){
            car.add( new Cars(result.getString(result.getColumnIndex(CARS_COLUMN_COLOR)),
                    result.getString(result.getColumnIndex(CARS_COLUMN_NAME)),
                    result.getString(result.getColumnIndex(CARS_COLUMN_PLACE))));

        }
        return car;
    }

    public boolean updatePlates(int id, int number, int color, int place) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put("c_number", number);
        contentValues.put("c_Color", color);
        contentValues.put("c_Place", place);

        db.update(CARS_TABLE_NAME, contentValues, "id = ? ", new String[]{Integer.toString(id)});
        return true;
    }

    public Integer deletePlates(Integer id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(CARS_TABLE_NAME,
                "id = ? ",
                new String[]{Integer.toString(id)});
    }

    public void insertSomeCars() {

        insertPlate(1,"Blue","Honda Civic");
        insertPlate(2,"Brown","Rolls Royce");
        insertPlate(3,"Blue","Honda Civic");
        insertPlate(4,"Black","Nissan Patrol <3");
        insertPlate(5,"Yellow","Tiida");
        insertPlate(6,"Grey","Rolls Royce");

    }

}*/
