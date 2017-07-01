package test.jiyun.com.shiguangdemo.fragment.ticket;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;


import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;

import java.util.ArrayList;
import java.util.List;

import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.base.BaseFragment;

/**
 * Created by liuwangping on 2017/6/21.
 */

public class CinemaFragment extends BaseFragment {
    private Banner buy_cinema_banner;
    private RadioGroup rg_cinema_choose;
    private RadioButton rb_cinema_total, rb_cinema_price, rb_cinema_near, rb_cinema_screen;
    private FrameLayout buy_cinema_frame;



    @Override
    protected int getLayoutViwe() {
        return R.layout.buyticket_cinema_fragment;
    }

    @Override
    protected void initView(View view) {
        rg_cinema_choose = (RadioGroup) view.findViewById(R.id.rg_cinema_choose);
        rb_cinema_total = (RadioButton) view.findViewById(R.id.rb_cinema_total);
        rb_cinema_price = (RadioButton) view.findViewById(R.id.rb_cinema_price);
        rb_cinema_near = (RadioButton) view.findViewById(R.id.rb_cinema_near);
        rb_cinema_screen = (RadioButton) view.findViewById(R.id.rb_cinema_screen);
        buy_cinema_banner = (Banner) view.findViewById(R.id.buy_cinema_banner);
        buy_cinema_frame= (FrameLayout) view.findViewById(R.id.buy_cinema_frame);


        List<Integer> imaglist = new ArrayList<>();
        imaglist.add(R.drawable.marker_img1);
        imaglist.add(R.drawable.marker_img2);
        buy_cinema_banner.setImages(imaglist)
                .setDelayTime(2000)
                .setBannerStyle(BannerConfig.CIRCLE_INDICATOR)
                .setImageLoader(new GlideImage())
                .setIndicatorGravity(BannerConfig.RIGHT)
                .setOffscreenPageLimit(2)
                .isAutoPlay(true)
                .start();

        FragmentManager manager=getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.buy_cinema_frame,new AllFragment());
        transaction.commit();

    }

    @Override
    protected void initloadData() {

    }



    @Override
    protected void initListener() {
        rg_cinema_choose.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                FragmentManager manager=getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();

                switch (checkedId) {
                    case R.id.rb_cinema_total:
                        transaction.replace(R.id.buy_cinema_frame,new AllFragment());
                        break;
                    case R.id.rb_cinema_price:
                        break;
                    case R.id.rb_cinema_near:
                        break;
                    case R.id.rb_cinema_screen:
                        break;


                }
                transaction.commit();
            }
        });
    }



}
