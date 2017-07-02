package test.jiyun.com.shiguangdemo.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.OnClick;
import test.jiyun.com.shiguangdemo.App;
import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.base.BaseActivity;
import test.jiyun.com.shiguangdemo.base.BaseFragment;
import test.jiyun.com.shiguangdemo.config.FragmentBuilder;
import test.jiyun.com.shiguangdemo.fragment.home.Home_Fg_Tab_View;
import test.jiyun.com.shiguangdemo.fragment.live.Live_Fg_View;
import test.jiyun.com.shiguangdemo.fragment.mall.MarkerFragment;
import test.jiyun.com.shiguangdemo.fragment.my.My_Fg_view;
import test.jiyun.com.shiguangdemo.fragment.ticket.CinemaFragment;
import test.jiyun.com.shiguangdemo.fragment.ticket.MoviesFragment;


/**
 * 主布局
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

    @Bind(R.id.Home_fg_title_city)
    TextView HomeFgTitleCity;
    @Bind(R.id.Home_fg_title_SaoYiSao)
    ImageView HomeFgTitleSaoYiSao;
    @Bind(R.id.Home_fg_title_Search)
    ImageView HomeFgTitleSearch;
    @Bind(R.id.Home_fg_tab_Home)
    RelativeLayout HomeFgTabHome;

    @Bind(R.id.Ticket_fg_title_city)
    TextView TicketFgTitleCity;
    @Bind(R.id.Ticket_fg_title_film)
    TextView TicketFgTitleFilm;
    @Bind(R.id.Ticket_fg_title_cinema)
    TextView TicketFgTitleCinema;
    @Bind(R.id.Ticket_fg_title_Search)
    ImageView TicketFgTitleSearch;
    @Bind(R.id.Home_fg_tab_ticket)
    RelativeLayout HomeFgTabTicket;

    @Bind(R.id.Mall_fg_Title_SaoYiSao)
    ImageView MallFgTitleSaoYiSao;
    @Bind(R.id.Mall_fg_Title_Search)
    EditText MallFgTitleSearch;
    @Bind(R.id.Mall_fg_Title_Cart)
    ImageView MallFgTitleCart;
    @Bind(R.id.Home_fg_tab_mall)
    LinearLayout HomeFgTabMall;

    @Bind(R.id.Home_fg_tab_live)
    RelativeLayout HomeFgTabLive;

    private FragmentManager fragmentManager = getSupportFragmentManager();
    private boolean boo = true;

    private SharedPreferences share ;
    private String cityname;


    @Override
    protected int getLayoutViwe() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        share = App.baseActivity.getSharedPreferences("city",MODE_PRIVATE);
        cityname = share.getString("cityname", "北京");


    }

    @Override
    protected void onResume() {
        HomeFgTitleCity.setText(cityname);
        super.onResume();
    }

    @Override
    protected void initloadData() {

        HomeFgTabHome.setVisibility(View.VISIBLE);
        FragmentBuilder.getInstance().start(Home_Fg_Tab_View.class, R.id.Main_FrameLayout).builder();
        initcolor(TicketFgTitleFilm);
        HomeFgTitleCity.setText(cityname);
    }

    @Override
    protected void initListener() {

    }


    @OnClick({R.id.home_Rbt, R.id.ticket_Rbt, R.id.mall_Rbt1, R.id.live_Rbt, R.id.mine_Rbt,
            R.id.Home_fg_title_city, R.id.Home_fg_title_SaoYiSao, R.id.Home_fg_title_Search,
            R.id.Ticket_fg_title_city, R.id.Ticket_fg_title_film, R.id.Ticket_fg_title_cinema,
            R.id.Ticket_fg_title_Search,R.id.Mall_fg_Title_SaoYiSao, R.id.Mall_fg_Title_Search,
            R.id.Mall_fg_Title_Cart
    })
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.home_Rbt: //首页
                HomeFgTitleCity.setText(cityname);
                HomeFgTabHome.setVisibility(View.VISIBLE);
                HomeFgTabTicket.setVisibility(View.GONE);
                HomeFgTabMall.setVisibility(View.GONE);
                HomeFgTabLive.setVisibility(View.GONE);

                FragmentBuilder.getInstance().start(Home_Fg_Tab_View.class, R.id.Main_FrameLayout).builder();
                break;

            case R.id.ticket_Rbt://购票
                HomeFgTitleCity.setText(cityname);
                HomeFgTabHome.setVisibility(View.GONE);
                HomeFgTabTicket.setVisibility(View.VISIBLE);
                HomeFgTabMall.setVisibility(View.GONE);
                HomeFgTabLive.setVisibility(View.GONE);

                FragmentBuilder.getInstance().start(MoviesFragment.class, R.id.Main_FrameLayout).builder();
                break;

            case R.id.mall_Rbt1://商城
                HomeFgTabHome.setVisibility(View.GONE);
                HomeFgTabTicket.setVisibility(View.GONE);
                HomeFgTabMall.setVisibility(View.VISIBLE);
                HomeFgTabLive.setVisibility(View.GONE);

                FragmentBuilder.getInstance().start(MarkerFragment.class, R.id.Main_FrameLayout).builder();
                break;

            case R.id.live_Rbt://直播
                HomeFgTabHome.setVisibility(View.GONE);
                HomeFgTabTicket.setVisibility(View.GONE);
                HomeFgTabMall.setVisibility(View.GONE);
                HomeFgTabLive.setVisibility(View.VISIBLE);

                FragmentBuilder.getInstance().start(Live_Fg_View.class, R.id.Main_FrameLayout).builder();
                break;

            case R.id.mine_Rbt://我的
                HomeFgTabHome.setVisibility(View.GONE);
                HomeFgTabTicket.setVisibility(View.GONE);
                HomeFgTabMall.setVisibility(View.GONE);
                HomeFgTabLive.setVisibility(View.GONE);

                FragmentBuilder.getInstance().start(My_Fg_view.class, R.id.Main_FrameLayout).builder();
                break;

            //首页页面的title监听
            case R.id.Home_fg_title_city:// 选择城市
                startActivity(new Intent(MainActivity.this,CityActivity.class));

                break;
            case R.id.Home_fg_title_SaoYiSao:// 扫一扫
                startActivity(new Intent(MainActivity.this,Sao1SaoActivity.class));
                break;
            case R.id.Home_fg_title_Search:// 搜索

                break;

            //购票页面的title监听
            case R.id.Ticket_fg_title_city:// 选择城市
                startActivity(new Intent(MainActivity.this,CityActivity.class));
                break;

            case R.id.Ticket_fg_title_film:// 电影
                if (!boo) {
                    initcolor(TicketFgTitleFilm);
                    initcolorhui(TicketFgTitleCinema);
                    boo = true;
                }
                HomeFgTabHome.setVisibility(View.GONE);
                HomeFgTabTicket.setVisibility(View.VISIBLE);
                HomeFgTabMall.setVisibility(View.GONE);
                HomeFgTabLive.setVisibility(View.GONE);
                FragmentBuilder.getInstance().start(MoviesFragment.class, R.id.Main_FrameLayout).builder();

                break;
            case R.id.Ticket_fg_title_cinema:// 影视
                if (boo){
                    initcolor(TicketFgTitleCinema);
                    initcolorhui(TicketFgTitleFilm);
                    boo = false;
                }
                HomeFgTabHome.setVisibility(View.GONE);
                HomeFgTabTicket.setVisibility(View.VISIBLE);
                HomeFgTabMall.setVisibility(View.GONE);
                HomeFgTabLive.setVisibility(View.GONE);
                FragmentBuilder.getInstance().start(CinemaFragment.class, R.id.Main_FrameLayout).builder();

                break;
            case R.id.Ticket_fg_title_Search:// 搜索
                break;
            // 商城页面title监听
            case R.id.Mall_fg_Title_SaoYiSao:
                startActivity(new Intent(MainActivity.this,Sao1SaoActivity.class));
                break;
            case R.id.Mall_fg_Title_Search:
                break;
            case R.id.Mall_fg_Title_Cart:

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
                "MoviesFragment".equals(simpleName) ||
                "MarkerFragment".equals(simpleName) ||
                "Live_Fg_View".equals(simpleName) ||
                "My_Fg_view".equals(simpleName)) {

            finish();
        } else {
            if (fragmentManager.getBackStackEntryCount() > 1) {
                fragmentManager.popBackStackImmediate();
                String name = fragmentManager.getBackStackEntryAt(fragmentManager.getBackStackEntryCount() - 1).getName();
                App.BaselastFragment = (BaseFragment) fragmentManager.findFragmentByTag(name);
            }
        }
    }

    private void initcolor(TextView textView) {
        int bai = getResources().getColor(R.color.colorbai);
        int back = getResources().getColor(R.color.colorback);
        textView.setTextColor(bai);
        textView.setBackgroundColor(back);
    }

    private void initcolorhui(TextView textView) {
        int bai = getResources().getColor(R.color.colorhui);
        int back = getResources().getColor(R.color.colorhuiback);
        textView.setTextColor(bai);
        textView.setBackgroundColor(back);
    }

//    @Override
//    public void onScrollChanged(ObservableScrollView scrollView, int x, int y, int oldx, int oldy) {
//
//        // Log.i("TAG", "y--->" + y + "    height-->" + height);
//        if (y <= 0) {
//            textView.setBackgroundColor(Color.argb((int) 0, 227, 29, 26));//AGB由相关工具获得，或者美工提供
//        } else if (y > 0 && y <= imageHeight) {
//            float scale = (float) y / imageHeight;
//            float alpha = (255 * scale);
//            // 只是layout背景透明(仿知乎滑动效果)
//            textView.setBackgroundColor(Color.argb((int) alpha, 227, 29, 26));
//        } else {
//            textView.setBackgroundColor(Color.argb((int) 255, 227, 29, 26));
//        }
//    }


}
