package test.jiyun.com.shiguangdemo.fragment.home;

import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.jude.rollviewpager.RollPagerView;
import com.jude.rollviewpager.adapter.LoopPagerAdapter;
import com.jude.rollviewpager.hintview.ColorPointHintView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.adapter.home.HomePagmentAdapter;
import test.jiyun.com.shiguangdemo.base.BaseFragment;
import test.jiyun.com.shiguangdemo.fragment.home.film.Home_Fg_Vp_Film;
import test.jiyun.com.shiguangdemo.fragment.home.info.Info_Fg_View;
import test.jiyun.com.shiguangdemo.fragment.home.movie.Movie_Fg_Vp_View;
import test.jiyun.com.shiguangdemo.fragment.home.prevue.Home_Fg_Vp_Prevue;
import test.jiyun.com.shiguangdemo.view.MyScrollView;

/**
 * 项目名称:时光网
 * 类描述: TabLayout悬停和轮播图
 * 创建人:LENOVO
 * 创建时间:2017-6-21 10:49
 * 修改人:
 * 修改内容:
 */

public class Home_Fg_Tab_View extends BaseFragment implements MyScrollView.OnScrollListener {
    @Bind(R.id.roll_view_pager)
    RollPagerView rollViewPager;
    @Bind(R.id.Home_fg_TabLayout)
    TabLayout HomeFgTabLayout;
    @Bind(R.id.Home_fg_viewPager)
    ViewPager HomeFgViewPager;
    @Bind(R.id.Home_fg_TabLayout_two)
    TabLayout HomeFgTabLayoutTwo;
    @Bind(R.id.layout_hover_scroll)
    LinearLayout layoutHoverScroll;
    @Bind(R.id.Home_fg_MyScrollView)
    MyScrollView HomeFgMyScrollView;


    private List<String> nameList;
    private List<BaseFragment> fragList;
    private int size;
    private HomePagmentAdapter mAdapter;
    private String[] IURL = {
            "https://imgproxy.mtime.cn/get.ashx?uri=http://img5.mtime.cn/mg/2017/06/12/084627.64452307.jpg&width=1080&height=504&quality=70&clipType=4&iswebp=true",
            "https://imgproxy.mtime.cn/get.ashx?uri=http://img5.mtime.cn/mg/2017/06/22/081602.73276536.jpg&width=1080&height=504&quality=70&clipType=4&iswebp=true",
            "https://imgproxy.mtime.cn/get.ashx?uri=http://img5.mtime.cn/mg/2017/06/22/112052.22639037.jpg&width=1080&height=504&quality=70&clipType=4&iswebp=true",
            "https://imgproxy.mtime.cn/get.ashx?uri=http://img5.mtime.cn/mg/2017/06/20/105504.15964683.jpg&width=1080&height=504&quality=70&clipType=4&iswebp=true",
            "https://imgproxy.mtime.cn/get.ashx?uri=http://img5.mtime.cn/mg/2017/06/19/101649.25970742.jpg&width=1080&height=504&quality=70&clipType=4&iswebp=true",
            "https://imgproxy.mtime.cn/get.ashx?uri=http://img5.mtime.cn/mg/2017/06/22/083630.53788820.jpg&width=1080&height=504&quality=70&clipType=4&iswebp=true",
            "https://imgproxy.mtime.cn/get.ashx?uri=http://img5.mtime.cn/mg/2017/06/17/101824.18680812.jpg&width=1080&height=504&quality=70&clipType=4&iswebp=true",
            "https://imgproxy.mtime.cn/get.ashx?uri=http://img5.mtime.cn/mg/2017/06/22/163603.97963341.jpg&width=1080&height=504&quality=70&clipType=4&iswebp=true",
            "https://imgproxy.mtime.cn/get.ashx?uri=http://img5.mtime.cn/mg/2017/06/08/084230.87800106.jpg&width=1080&height=504&quality=70&clipType=4&iswebp=true"

    };


    // 悬停的
    private Handler mHandler = new Handler() {

        public void handleMessage(Message msg) {
            if (msg.what == 1) {
                // 顶部高度为0时，表示布局未完成，继续轮询
                if (rollViewPager.getHeight() == 0) {
                    mHandler.sendEmptyMessageDelayed(1, 10);
                    return;
                }
                size = rollViewPager.getHeight();
            }
        }

    };


    @Override
    protected int getLayoutViwe() {
        return R.layout.home_fg_tab_view;
    }


    @Override
    protected void initView(View view) {

        HomeFgTabLayoutTwo.setVisibility(View.GONE);

        rollViewPager.setPlayDelay(3000);
        rollViewPager.setAnimationDurtion(500);
        rollViewPager.setAdapter(new TestLoopAdapter(rollViewPager));
        rollViewPager.setHintView(new ColorPointHintView(getActivity(), Color.YELLOW, Color.WHITE));

        fragList = new ArrayList<>();

        fragList.add(new Home_Fg_Vp_View());
        fragList.add(new Info_Fg_View());
        fragList.add(new Movie_Fg_Vp_View());
        fragList.add(new Home_Fg_Vp_Prevue());
        fragList.add(new Home_Fg_Vp_Film());

        //滑动的TabLayout；
//        HomeFgTabLayout. setTabMode(TabLayout.MODE_FIXED);//tablayout滑动效果；
        mAdapter = new HomePagmentAdapter(getFragmentManager(), fragList, getContext());
        HomeFgViewPager.setAdapter(mAdapter);
        HomeFgTabLayout.setupWithViewPager(HomeFgViewPager);

        for (int i = 0; i < HomeFgTabLayout.getTabCount(); i++) {
            TabLayout.Tab tab = HomeFgTabLayout.getTabAt(i);
            if (tab != null) {
                tab.setCustomView(mAdapter.getTabView(i));
            }
        }


//        //悬停的TabLayout；
        HomeFgTabLayoutTwo.setupWithViewPager(HomeFgViewPager);

        for (int i = 0; i < HomeFgTabLayoutTwo.getTabCount(); i++) {
            TabLayout.Tab tab = HomeFgTabLayoutTwo.getTabAt(i);
            if (tab != null) {
                tab.setCustomView(mAdapter.getTabView(i));
            }
        }

        rollViewPager.setFocusable(true);
        rollViewPager.setFocusableInTouchMode(true);
        rollViewPager.requestFocus();


//        initBundle() {
//
//        }

    }

    @Override
    protected void initloadData() {


    }

    @Override
    protected void initListener() {
        HomeFgMyScrollView.setOnScrollListener(this);

        mHandler.sendEmptyMessageDelayed(1, 10);
    }


    @Override
    public void onScroll(int scrollY) {
//        Log.e("scroll::", "size::" + size + ", scrollY::" + scrollY);
        if (scrollY >= size) {

            HomeFgTabLayoutTwo.setVisibility(View.VISIBLE);
        } else {


            HomeFgTabLayoutTwo.setVisibility(View.INVISIBLE);
        }
    }




    //轮播图适配器
    private class TestLoopAdapter extends LoopPagerAdapter {



        private int[] imgs = {
                R.drawable.get01,
                R.drawable.get02,
                R.drawable.get03,
                R.drawable.get04,
                R.drawable.get05,
                R.drawable.get06,
                R.drawable.get07,
                R.drawable.get08,
                R.drawable.get09,
        };

        public TestLoopAdapter(RollPagerView viewPager) {
            super(viewPager);
        }

        @Override
        public View getView(ViewGroup container, int position) {
            ImageView view = new ImageView(container.getContext());
            view.setImageResource(imgs[position]);
            view.setScaleType(ImageView.ScaleType.CENTER_CROP);
            view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            return view;
        }

        @Override
        public int getRealCount() {
            return imgs.length;
        }
    }


}
