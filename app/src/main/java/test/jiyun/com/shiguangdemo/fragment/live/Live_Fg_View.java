package test.jiyun.com.shiguangdemo.fragment.live;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.base.BaseFragment;

/**
 * 项目名称:时光网
 * 类描述: 直播模块 二层布局
 * 创建人:LENOVO
 * 创建时间:2017-6-21 9:39
 * 修改人:
 * 修改内容:
 */

public class Live_Fg_View extends BaseFragment {
    @Bind(R.id.Live_frameLayout)
    FrameLayout LiveFrameLayout;

    @Override
    protected int getLayoutViwe() {
        return R.layout.live_fg_view;
    }

    @Override
    protected void initView(View view) {

    }

    @Override
    protected void initloadData() {

    }

    @Override
    protected void initListener() {

    }

}
