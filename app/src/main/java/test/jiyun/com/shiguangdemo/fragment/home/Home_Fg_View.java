package test.jiyun.com.shiguangdemo.fragment.home;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import test.jiyun.com.shiguangdemo.App;
import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.base.BaseFragment;
import test.jiyun.com.shiguangdemo.config.FragmentBuilder;

/**
 * 项目名称:时光网
 * 类描述: 首页标题和容器
 * 创建人:LENOVO
 * 创建时间:2017-6-19 20:43
 * 修改人:
 * 修改内容:
 */

public class Home_Fg_View extends BaseFragment {
    @Bind(R.id.Home_fg_title_city)
    TextView HomeFgTitleCity;
    @Bind(R.id.Home_fg_title_SaoYiSao)
    ImageView HomeFgTitleSaoYiSao;
    @Bind(R.id.Home_fg_title_Search)
    ImageView HomeFgTitleSearch;
    @Bind(R.id.Home_fg_framerLayout)
    FrameLayout HomeFgFramerLayout;

    private FragmentManager manager;

    @Override
    protected int getLayoutViwe() {
        return R.layout.home_fg_view;
    }

    @Override
    protected void initView(View view) {

        manager = App.baseActivity.getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.Home_fg_framerLayout,new Home_Fg_Tab_View());
        transaction.commit();


    }

    @Override
    protected void initloadData() {


    }

    @Override
    protected void initListener() {

    }


    @OnClick({R.id.Home_fg_title_city, R.id.Home_fg_title_SaoYiSao, R.id.Home_fg_title_Search})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.Home_fg_title_city:// 选择城市
                break;
            case R.id.Home_fg_title_SaoYiSao:// 扫一扫
                break;
            case R.id.Home_fg_title_Search:// 搜索
                break;
        }
    }


}
