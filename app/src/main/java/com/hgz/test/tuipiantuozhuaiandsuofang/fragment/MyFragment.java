package com.hgz.test.tuipiantuozhuaiandsuofang.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.hgz.test.tuipiantuozhuaiandsuofang.R;
import com.hgz.test.tuipiantuozhuaiandsuofang.adapter.MyListviewAdapter;
import com.hgz.test.tuipiantuozhuaiandsuofang.bean.Info;
import com.hgz.test.tuipiantuozhuaiandsuofang.dao.SQLiteDao;
import com.limxing.xlistview.view.XListView;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/23.
 */

public class MyFragment extends Fragment implements XListView.IXListViewListener {

    private View view;
    private XListView xlv;
    private MyListviewAdapter myListviewAdapter;
    private boolean flag;
    private int limit = 3;
    private SQLiteDao dao;
    private ArrayList<Info.DataBean.TopicsBean> data;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.myfragment, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        dao = new SQLiteDao(getActivity());
        xlv = (XListView) view.findViewById(R.id.xlv);
        getData();
        xlv.setPullLoadEnable(true);
        xlv.setXListViewListener(this);
        data = dao.findData();
        myListviewAdapter = new MyListviewAdapter(getActivity(), data,xlv);
        xlv.setAdapter(myListviewAdapter);

    }

    private void getData() {
        String url = "http://api.kkmh.com/v1/topic_new/discovery_module_list/210";
        RequestParams requestParams = new RequestParams(url);
        requestParams.addQueryStringParameter("offset", "0");
        requestParams.addQueryStringParameter("limit", limit + "");
        x.http().get(requestParams, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                Info info = gson.fromJson(result, Info.class);
                final List<Info.DataBean.TopicsBean> topics = info.getData().getTopics();
                if (myListviewAdapter == null) {
                    myListviewAdapter = new MyListviewAdapter(getActivity(), topics,xlv);
                    xlv.setAdapter(myListviewAdapter);
                } else {
                    myListviewAdapter.loadMore(topics, flag);
                    myListviewAdapter.notifyDataSetChanged();
                }
                if (data==null&&data.size()<1){
                    for (Info.DataBean.TopicsBean dataes : topics) {
                        dao.addData(dataes.getDescription(),dataes.getVertical_image_url());
                    }
                }else{
                    dao.delete();
                    for (Info.DataBean.TopicsBean dataes : topics) {
                        dao.addData(dataes.getDescription(),dataes.getVertical_image_url());
                    }
                }

            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }

    @Override
    public void onRefresh() {
        limit = limit + 7;
        getData();
        flag = true;
        xlv.stopRefresh(true);
    }

    @Override
    public void onLoadMore() {
        limit = limit + 7;
        getData();
        flag = false;
        xlv.stopLoadMore();
    }
}
