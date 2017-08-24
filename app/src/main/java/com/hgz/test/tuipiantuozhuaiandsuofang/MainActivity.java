package com.hgz.test.tuipiantuozhuaiandsuofang;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.provider.Settings;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import com.hgz.test.tuipiantuozhuaiandsuofang.adapter.MyViewpagerAdapter;
import com.hgz.test.tuipiantuozhuaiandsuofang.receiver.MyListenerNetWorkReceiver;

public class MainActivity extends AppCompatActivity {

    private String[] titles={"周一","周二","周三","周四","周五","周六","周日"};
    private MyListenerNetWorkReceiver myListenerNetWorkReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        //给viewpager设置适配器
        MyViewpagerAdapter myViewpagerAdapter = new MyViewpagerAdapter(getSupportFragmentManager(), titles);
        viewPager.setAdapter(myViewpagerAdapter);
        //将tablayout与viewpager关联起来
        tabLayout.setupWithViewPager(viewPager);

        myListenerNetWorkReceiver = new MyListenerNetWorkReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(myListenerNetWorkReceiver,intentFilter);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(myListenerNetWorkReceiver);
    }
}
