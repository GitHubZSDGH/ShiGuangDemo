package test.jiyun.com.shiguangdemo.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

import com.androidkun.PullToRefreshRecyclerView;

/**
 * 项目名称:时光网
 * 类描述:
 * 创建人:LENOVO
 * 创建时间:2017-7-5 15:18
 * 修改人:
 * 修改内容:
 */

public class InnerPtrRecycleView extends PullToRefreshRecyclerView {

    public InnerPtrRecycleView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public InnerPtrRecycleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public InnerPtrRecycleView(Context context) {
        super(context);
    }

    private   float downX, downY, moveX, moveY;

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
                }else{

                    return super.onInterceptTouchEvent(e);
                }

        }
        return super.onInterceptTouchEvent(e);

    }
}
