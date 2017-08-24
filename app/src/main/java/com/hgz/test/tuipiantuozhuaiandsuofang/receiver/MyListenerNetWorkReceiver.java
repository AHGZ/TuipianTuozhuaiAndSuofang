package com.hgz.test.tuipiantuozhuaiandsuofang.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/8/23.
 */

public class MyListenerNetWorkReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())){
            ConnectivityManager manager= (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo activeNetworkInfo = manager.getActiveNetworkInfo();
            if (activeNetworkInfo!=null&&activeNetworkInfo.isConnected()) {
                if (activeNetworkInfo.getType() == ConnectivityManager.TYPE_WIFI) {
                    Toast.makeText(context, "现在存于Wifi状态下", Toast.LENGTH_SHORT).show();
                } else if (activeNetworkInfo.getType() == ConnectivityManager.TYPE_MOBILE) {
                    Toast.makeText(context, "现在存于移动网络状态下", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(context, "现在没网", Toast.LENGTH_SHORT).show();
                }
            }else{
                Toast.makeText(context, "现在没网", Toast.LENGTH_SHORT).show();
                showSettingsNetWorkDialog(context);
            }
        }
    }
    //设置网络的对话框
    public void showSettingsNetWorkDialog(final Context context){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("设置网络");
        builder.setTitle("当前无网络，是否前往设置网络");
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent();
                intent.setAction(Settings.ACTION_WIRELESS_SETTINGS);
                context.startActivity(intent);
            }
        });
        builder.setNegativeButton("取消",null);
        builder.create().show();
    }
}
