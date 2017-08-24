package com.hgz.test.tuipiantuozhuaiandsuofang.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.hgz.test.tuipiantuozhuaiandsuofang.fragment.MyFragment;

/**
 * Created by Administrator on 2017/8/23.
 */

public class MyViewpagerAdapter extends FragmentPagerAdapter {
    private FragmentManager fm;
    private String[] titles;
    public MyViewpagerAdapter(FragmentManager fm, String[] titles) {
        super(fm);
        this.titles=titles;
    }

    @Override
    public Fragment getItem(int position) {
        MyFragment myFragment = new MyFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title",titles[position]);
        myFragment.setArguments(bundle);
        return myFragment;
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
