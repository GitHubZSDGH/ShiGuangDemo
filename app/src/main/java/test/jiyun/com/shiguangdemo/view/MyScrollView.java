package test.jiyun.com.shiguangdemo.view;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.ScrollView;

/**
 * 项目名称:时光网
 * 类描述: 自定义scrollview 实现悬停效果
 * 创建人:LENOVO
 * 创建时间:2017-6-21 11:45
 * 修改人:
 * 修改内容:
 */
public class MyScrollView extends ScrollView {

    private OnScrollListener onScrollListener;

    public interface OnScrollListener{
        void onScroll(int scrollY);
    }


    public MyScrollView(Context context) {
        super(context, null, 0);
    }


    public MyScrollView(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
    }


    public MyScrollView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setOnScrollListener(OnScrollListener onScrollListener){
        this.onScrollListener = onScrollListener;
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        if(onScrollListener!=null){
            onScrollListener.onScroll(t);
        }
    }


    private float downX,downY,moveX,moveY;

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

                      return true;

                }

        }
        return super.onInterceptTouchEvent(e);

    }


}

