package test.jiyun.com.shiguangdemo.activity;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import io.vov.vitamio.MediaPlayer;
import io.vov.vitamio.Vitamio;
import io.vov.vitamio.widget.MediaController;
import io.vov.vitamio.widget.VideoView;
import test.jiyun.com.shiguangdemo.App;
import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.adapter.live.TabAdaper;
import test.jiyun.com.shiguangdemo.base.BaseActivity;
import test.jiyun.com.shiguangdemo.base.BaseFragment;
import test.jiyun.com.shiguangdemo.fragment.live.CommentFragment;
import test.jiyun.com.shiguangdemo.fragment.live.DetailsFragment;
import test.jiyun.com.shiguangdemo.fragment.live.NewsFragment;
import test.jiyun.com.shiguangdemo.modle.bean.live.LiveVideoBean;
import test.jiyun.com.shiguangdemo.modle.callback.MyCallback;
import test.jiyun.com.shiguangdemo.modle.entivity.ClassBiz;
import test.jiyun.com.shiguangdemo.modle.entivity.InterBiz;


/**
 * Created by liuwangping on 2017/6/30.
 */

public class VideoActivity extends BaseActivity {
    //    private WebView livetelecast_webview;
    private TabLayout livetelecast_tablayout;
    private ViewPager livetelecast_viewPager;
    private List<LiveVideoBean.DataBean.VideoBean> list = new ArrayList<>();
    private InterBiz videomodel = new ClassBiz();
    private String clientId = "e36e1f24304a0d60QMSDU15A30004375";
    private LiveVideoBean.DataBean.VideoBean videoBean;
    private String hightUrl;
    private ArrayList<BaseFragment> mlist = new ArrayList<>();
    private TabAdaper tabadapter;

    private SharedPreferences mshare = App.baseActivity.getSharedPreferences("city", Context.MODE_PRIVATE);
    private int cityid;
    private int videoId;

    @Bind(R.id.video_view)
    public VideoView video_view;


    @Override
    protected int getLayoutViwe() {
        return R.layout.activity_livetelecast;
    }

    @Override
    protected void initView() {
        Vitamio.isInitialized(this);


        cityid = mshare.getInt("cityid", 290);
        if (cityid == 0) {
            cityid = 290;
        }

//        livetelecast_webview = (WebView) findViewById(R.id.livetelecast_webview);
        livetelecast_tablayout = (TabLayout) findViewById(R.id.livetelecast_tablayout);
        livetelecast_viewPager = (ViewPager) findViewById(R.id.livetelecast_viewPager);


    }

    @Override
    protected void initloadData() {
        mlist.add(new DetailsFragment());
        mlist.add(new CommentFragment());
        mlist.add(new NewsFragment());
        tabadapter = new TabAdaper(getSupportFragmentManager(), mlist);
        livetelecast_viewPager.setAdapter(tabadapter);
        livetelecast_tablayout.setupWithViewPager(livetelecast_viewPager);
        livetelecast_tablayout.setTabMode(TabLayout.MODE_FIXED);
        // 设置WebView属性，能够执行Javascript脚本
//        livetelecast_webview.getSettings().setJavaScriptEnabled(true);
//        livetelecast_webview.getSettings().setPluginState(WebSettings.PluginState.ON);
//        livetelecast_webview.setVisibility(View.VISIBLE);
//        livetelecast_webview.getSettings().setUseWideViewPort(true);

        getData();
    }

    @Override
    protected void initListener() {

    }

    private void getData() {

        videomodel.getPlayVideo(clientId, cityid, videoId, new MyCallback() {
            @Override
            public void successful(String response) {
                Log.e("viedo成功", response);
                Gson gson = new Gson();
//                LiveVideoBean liveVideoBean = gson.fromJson(response, LiveVideoBean.class);
//                final List<LiveVideoBean.DataBean.VideoBean> video = liveVideoBean.getData().getVideo();
//                for (int i = 0; i < video.size(); i++) {
//                    videoBean = video.get(i);
//                }
//                hightUrl = videoBean.getHightUrl();
//                videoId = videoBean.getVideoId();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        video_view.setVideoPath("http://172.16.46.32:8080/hzw_One.Piece_1999_TV_250-251.rmvb");
                        video_view.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                            @Override
                            public void onPrepared(MediaPlayer mp) {
                                video_view.start();
                            }
                        });

                        video_view.setMediaController(new MediaController(VideoActivity.this));
                    }
                });
            }

            @Override
            public void failure(String errorMessage) {

            }
        });
    }


}
