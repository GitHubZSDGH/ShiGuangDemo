package test.jiyun.com.shiguangdemo.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.base.BaseActivity;
import test.jiyun.com.shiguangdemo.config.FragmentBuilder;
import test.jiyun.com.shiguangdemo.fragment.home.Home_Fg_View;
import test.jiyun.com.shiguangdemo.fragment.home.Mall_fg_View;
import test.jiyun.com.shiguangdemo.fragment.home.Ticket_Fg_View;


/**
 *  主布局
 */
public class MainActivity extends BaseActivity {

    @Bind(R.id.Main_FrameLayout)
    FrameLayout MainFrameLayout;
    @Bind(R.id.home_Rbt)
    RadioButton homeRbt;
    @Bind(R.id.ticket_Rbt)
    RadioButton ticketRbt;
    @Bind(R.id.mall_Rbt1)
    RadioButton mallRbt1;
    @Bind(R.id.live_Rbt)
    RadioButton liveRbt;
    @Bind(R.id.mine_Rbt)
    RadioButton mineRbt;
    @Bind(R.id.Main_RadioGrop)
    RadioGroup MainRadioGrop;

    @Override
    protected int getLayoutViwe() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initloadData() {
        FragmentBuilder.getInstance().start(Home_Fg_View.class,R.id.Main_FrameLayout).builder();
    }

    @Override
    protected void initListener() {

    }



    @OnClick({R.id.home_Rbt, R.id.ticket_Rbt, R.id.mall_Rbt1, R.id.live_Rbt, R.id.mine_Rbt})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.home_Rbt: //首页
                FragmentBuilder.getInstance().start(Home_Fg_View.class,R.id.Main_FrameLayout).builder();
                break;
            case R.id.ticket_Rbt://购票
                FragmentBuilder.getInstance().start(Ticket_Fg_View.class,R.id.Main_FrameLayout).builder();
                break;
            case R.id.mall_Rbt1://商城
                FragmentBuilder.getInstance().start(Mall_fg_View.class,R.id.Main_FrameLayout).builder();
                break;
            case R.id.live_Rbt://直播
                break;
            case R.id.mine_Rbt://我的
                break;
        }
    }
}
