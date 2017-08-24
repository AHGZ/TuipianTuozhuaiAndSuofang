package com.hgz.test.tuipiantuozhuaiandsuofang;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2017/8/23.
 */

public class SQLite extends SQLiteOpenHelper {
    public SQLite(Context context) {
        super(context,"manhua.db",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table manhua(_id Integer primary key autoincrement,description varchar(20),image varchar(20))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
