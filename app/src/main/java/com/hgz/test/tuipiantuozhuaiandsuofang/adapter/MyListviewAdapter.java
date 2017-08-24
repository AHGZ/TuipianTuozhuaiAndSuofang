package com.hgz.test.tuipiantuozhuaiandsuofang.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hgz.test.tuipiantuozhuaiandsuofang.R;
import com.hgz.test.tuipiantuozhuaiandsuofang.SecondActivity;
import com.hgz.test.tuipiantuozhuaiandsuofang.bean.Info;
import com.limxing.xlistview.view.XListView;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

/**
 * Created by Administrator on 2017/8/23.
 */

public class MyListviewAdapter extends BaseAdapter {
    private Context context;
    private List<Info.DataBean.TopicsBean> topics;
    private XListView xlv;
    public MyListviewAdapter(final Context context, final List<Info.DataBean.TopicsBean> topics, XListView xlv) {
        this.context=context;
        this.topics=topics;
        this.xlv=xlv;
        xlv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(context, SecondActivity.class);
                intent.putExtra("url",topics.get(position-1).getVertical_image_url());
                context.startActivity(intent);
            }
        });
    }

    public void loadMore(List<Info.DataBean.TopicsBean> data,boolean flag){
        for (Info.DataBean.TopicsBean dataes:data) {
            if (flag){
                topics.add(0,dataes);
            }else{
                topics.add(dataes);
            }
        }
    }
    @Override
    public int getCount() {
        return topics==null?0:topics.size();
    }

    @Override
    public Object getItem(int position) {
        return topics.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
            convertView=convertView.inflate(context, R.layout.listview_item,null);
        }
        ImageView showImage = (ImageView) convertView.findViewById(R.id.showImage);
        TextView showText = (TextView) convertView.findViewById(R.id.showText);
        getImage(topics.get(position).getVertical_image_url(),showImage);
        showText.setText(topics.get(position).getDescription());
        return convertView;
    }
    private void getImage(String path,ImageView imageView){
        DisplayImageOptions options=new DisplayImageOptions.Builder()
                .cacheOnDisk(true)
                .cacheOnDisk(true)
                .showImageOnFail(R.drawable.loading)
                .build();

        ImageLoader.getInstance().displayImage(path,imageView,options);
    }
}
