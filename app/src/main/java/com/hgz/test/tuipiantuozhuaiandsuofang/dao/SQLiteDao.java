package com.hgz.test.tuipiantuozhuaiandsuofang.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.hgz.test.tuipiantuozhuaiandsuofang.SQLite;
import com.hgz.test.tuipiantuozhuaiandsuofang.bean.Info;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/8/23.
 */

public class SQLiteDao {

    private final SQLiteDatabase db;

    public SQLiteDao(Context context){
        SQLite sqLite = new SQLite(context);
        db = sqLite.getWritableDatabase();
    }
    public void addData(String description,String image){
        ContentValues values = new ContentValues();
        values.put("description",description);
        values.put("image",image);
        db.insert("manhua",null,values);
    }
    public void delete(){
        db.delete("manhua",null,null);
    }
    public ArrayList<Info.DataBean.TopicsBean> findData(){
        Cursor cursor = db.query(false, "manhua", null, null, null, null, null, null, null);
        ArrayList<Info.DataBean.TopicsBean> topics = new ArrayList<>();
        while (cursor.moveToNext()){
            String description = cursor.getString(cursor.getColumnIndex("description"));
            String image = cursor.getString(cursor.getColumnIndex("image"));
            Info.DataBean.TopicsBean topicsBean = new Info.DataBean.TopicsBean();
            topicsBean.setDescription(description);
            topicsBean.setVertical_image_url(image);
            topics.add(topicsBean);
        }
        return topics;
    }
}
