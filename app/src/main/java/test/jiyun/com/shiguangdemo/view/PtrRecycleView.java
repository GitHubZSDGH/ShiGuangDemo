package test.jiyun.com.shiguangdemo.view;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.AbsListView;
import android.widget.ScrollView;

import com.androidkun.PullToRefreshRecyclerView;

import test.jiyun.com.shiguangdemo.App;

import static android.R.attr.scrollX;
import static android.R.attr.y;
import static android.R.transition.move;
import static test.jiyun.com.shiguangdemo.R.drawable.m;
import static test.jiyun.com.shiguangdemo.R.drawable.switch_off;

/**
 * 项目名称:时光网
 * 类描述:
 * 创建人:LENOVO
 * 创建时间:2017-6-29 14:39
 * 修改人:
 * 修改内容:
 */

public class PtrRecycleView extends PullToRefreshRecyclerView {

    private GestureDetector mDetctor;
    private int firstVisibleItem = 0;

    public PtrRecycleView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
       // init(context);
    }

    public PtrRecycleView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PtrRecycleView(Context context) {
        this(context, null);
    }


    float downX, downY, moveX, moveY;

    private void init(Context context){
        mDetctor=new GestureDetector(context, new GestureDetector.OnGestureListener() {
            @Override
            public boolean onDown(MotionEvent e) {
                return false;
            }

            @Override
            public void onShowPress(MotionEvent e) {

            }

            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                return false;
            }

            @Override
            public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
                if(Math.abs(e1.getX()-e2.getX())<Math.abs(e1.getY()-e2.getY())){
                    Log.d("PtrRecycleView", "上下滑");

                }else{
                    Log.d("PtrRecycleView", "左右滑");
                }

                return false;
            }

            @Override
            public void onLongPress(MotionEvent e) {

            }

            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                return false;
            }
        });

    }

//
//    @Override
//    public boolean onTouchEvent(MotionEvent e) {
//        mDetctor.onTouchEvent(e);
//        return true;
//    }



    @Override
    public boolean onInterceptTouchEvent(MotionEvent e) {
        switch (e.getAction()) {
            case MotionEvent.ACTION_DOWN:
                downX = e.getRawX();
                downY = e.getRawY();
                Log.d("PtrRecycleView", "按下");
                return super.onInterceptTouchEvent(e);


            case MotionEvent.ACTION_MOVE:
                moveX = e.getRawX();
                moveY = e.getRawY();


                if (Math.abs(moveX - downX) < Math.abs(moveY - downY)) {
                    Log.d("PtrRecycleView", "上下滑");
                    //requestDisallowInterceptTouchEvent(true);
                    return false;
                }

        }
        return super.onInterceptTouchEvent(e);

    }

}
