package test.jiyun.com.shiguangdemo.activity;

import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import butterknife.Bind;
import butterknife.OnClick;
import test.jiyun.com.shiguangdemo.App;
import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.base.BaseActivity;
import test.jiyun.com.shiguangdemo.base.BaseFragment;
import test.jiyun.com.shiguangdemo.config.FragmentBuilder;
import test.jiyun.com.shiguangdemo.fragment.home.Home_Fg_View;
import test.jiyun.com.shiguangdemo.fragment.live.Live_Fg_View;
import test.jiyun.com.shiguangdemo.fragment.mall.Mall_fg_View;
import test.jiyun.com.shiguangdemo.fragment.ticket.Ticket_Fg_View;


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

    private FragmentManager fragmentManager = getSupportFragmentManager();

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
                FragmentBuilder.getInstance().start(Live_Fg_View.class,R.id.Main_FrameLayout).builder();
                break;
            case R.id.mine_Rbt://我的
                break;
        }
    }

    /**
     * 自定义回退栈管理；
     * 获取栈顶的fragment的名字，判断名字是否和主页的名字是否一样，
     * 如果一样就退出应用，如果不是就回退上一个fragment；
     */
    @Override
    public void onBackPressed() {
        String simpleName = fragmentManager.getBackStackEntryAt(fragmentManager.getBackStackEntryCount() - 1).getName();
        if ("Home_Fg_View".equals(simpleName) ||
                "Ticket_Fg_View".equals(simpleName) ||
                "Mall_fg_View".equals(simpleName) ||
                "Live_Fg_View".equals(simpleName)||
                "Live_Fg_View".equals(simpleName)) {

            finish();
        } else {
            if (fragmentManager.getBackStackEntryCount() > 1) {
                fragmentManager.popBackStackImmediate();
                String name = fragmentManager.getBackStackEntryAt(fragmentManager.getBackStackEntryCount() - 1).getName();
                App.BaselastFragment = (BaseFragment) fragmentManager.findFragmentByTag(name);
            }
        }
    }

}
