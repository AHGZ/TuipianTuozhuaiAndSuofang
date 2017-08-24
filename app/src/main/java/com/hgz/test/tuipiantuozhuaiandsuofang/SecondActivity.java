package com.hgz.test.tuipiantuozhuaiandsuofang;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import uk.co.senab.photoview.PhotoView;

/**
 * Created by Administrator on 2017/8/23.
 */

public class SecondActivity extends Activity {

    private PhotoView photoView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        photoView = (PhotoView) findViewById(R.id.intentImage);
        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        getImage(url, photoView);
    }
    private void getImage(String path,ImageView imageView){
        DisplayImageOptions options=new DisplayImageOptions.Builder()
                .cacheOnDisk(true)
                .cacheOnDisk(true)
                .showImageOnFail(R.drawable.loading)
                .build();

        ImageLoader.getInstance().displayImage(path,imageView,options);
    }
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        //activity接受到事件分发之后,我们手动处理触摸事件,只给传给我们自己的onTouchEvent方法;
        onTouchEvent(ev);
        return true;
    }

    //手指按下的坐标
    float downX;
    float downY;

    //手指移动前的坐标
    float lastX;
    float lastY;
    boolean moveble = false;
    boolean isMorePoint = false;

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        super.onTouchEvent(event);

        //接受多指触控需要用 event.getAction() & MotionEvent.ACTION_MASK 来获得当前的触摸事件
        switch (event.getAction() & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_DOWN:
                downX = event.getX();
                downY = event.getY();
                lastX = downX;
                lastY = downY;

                if (downX > photoView.getX()
                        && downX < photoView.getX() + photoView.getWidth()
                        && downY > photoView.getY()
                        && downY < photoView.getY() + photoView.getHeight()
                        ) {
                    moveble = true;
                } else {
                    moveble = false;
                }
                break;
            case MotionEvent.ACTION_MOVE:

                //当前手指摸出的坐标
                float currentX = event.getX();
                float currentY = event.getY();

                //我手指移动的距离
                float gapX = currentX - lastX;
                float gapY = currentY - lastY;

                //  如果点击位置不在图片上的话不做任何逻辑处理  moveble ==true 的时候做处理
                if (moveble) {
                    if (isMorePoint) {
                        //多指的时候 把事件交给photoview去处理 ,它自己会根据事件去做放大缩小的逻辑 ,
                        photoView.dispatchTouchEvent(event);
                    } else {
                        //单指的时候  拖拽的逻辑  设置图片新的位置    ==    原来的位置 + 手指移动的距离
                        photoView.setX(photoView.getX() + gapX);
                        photoView.setY(photoView.getY() + gapY);
                    }
                }
                lastX = event.getX();
                lastY = event.getY();
                break;
            case MotionEvent.ACTION_UP:

                break;

            //除了第一个手指之外别的手指按下时触发
            case MotionEvent.ACTION_POINTER_DOWN:
                isMorePoint = true;
                break;
            //除了第一个手指之外别的手指抬起时触发
            case MotionEvent.ACTION_POINTER_UP:
                isMorePoint = false;
                break;
        }

        return true;
    }
}
