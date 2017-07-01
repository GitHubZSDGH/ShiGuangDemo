package test.jiyun.com.shiguangdemo.fragment.ticket;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;


import com.google.gson.Gson;
import com.jude.rollviewpager.RollPagerView;
import com.jude.rollviewpager.hintview.ColorPointHintView;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.base.BaseFragment;
import test.jiyun.com.shiguangdemo.modle.bean.ticket.SoonBean;
import test.jiyun.com.shiguangdemo.modle.bean.ticket.SoonRVAdapter;
import test.jiyun.com.shiguangdemo.modle.callback.MyCallback;
import test.jiyun.com.shiguangdemo.modle.https.HttpFactory;
import test.jiyun.com.shiguangdemo.modle.https.OkHttpUtils;

import static java.security.AccessController.getContext;

/**
 * Created by liuwangping on 2017/6/20.
 */

public class SoonFragment extends BaseFragment {
    private RadioGroup buyicket_movies_soon_rg;
    private RadioButton attention,eight,seven,nine,hopeful;
    private FrameLayout soon_frame;
    private RollPagerView soon_pollpv;
    private RecyclerView soon_recyclerview2;
    private SoonTypeRgFragment soonTypeRgFragment;
    private SoonRVAdapter soonRVAdapter;
    private ArrayList<SoonBean.DataBean.MoviecomingsBean> list=new ArrayList<>();

    private String url = "https://ticket-api-m.mtime.cn/movie/mobilemoviecoming.api?locationId=290";

    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.obj != null && msg.obj instanceof SoonBean) {
                SoonBean bean = (SoonBean) msg.obj;
                list.addAll(bean.getData().getMoviecomings());
               soonRVAdapter=new SoonRVAdapter(getContext(),list);
                soon_recyclerview2.setAdapter(soonRVAdapter);
            }
        }
    };


    @Override
    protected int getLayoutViwe() {
        return  R.layout.buyticket_movies_fragment_soon;
    }

    @Override
    protected void initView(View view) {
        buyicket_movies_soon_rg= (RadioGroup) view.findViewById(R.id.buyicket_movies_soon_rg);
        attention= (RadioButton) view.findViewById(R.id.attention);
        eight= (RadioButton) view.findViewById(R.id.eight);
        seven= (RadioButton) view.findViewById(R.id.seven);
        nine= (RadioButton) view.findViewById(R.id.nine);
        hopeful= (RadioButton) view.findViewById(R.id.hopeful);
        soon_frame= (FrameLayout) view.findViewById(R.id.soon_frame);
        soon_recyclerview2= (RecyclerView) view.findViewById(R.id.soon_recyclerview2);
        soon_pollpv= (RollPagerView) view.findViewById(R.id.soon_pollpv);

        soon_pollpv.setPlayDelay(1000); //设置播放时间间隔
        soon_pollpv.setAnimationDurtion(1500); //设置透明度
        soon_pollpv.setAdapter(new SoonRollAdapter());//设置适配器
        soon_pollpv.setHintView(new ColorPointHintView(getContext(), Color.RED, Color.WHITE));//设置圆点指示器颜色

        soonTypeRgFragment = new SoonTypeRgFragment();
        FragmentManager manager =getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.soon_frame, soonTypeRgFragment);
        transaction.commit();

        soon_recyclerview2.setLayoutManager(new LinearLayoutManager(getContext()));
        soon_recyclerview2.setHasFixedSize(true);
        soonRVAdapter=new SoonRVAdapter(getContext(),list);
        soon_recyclerview2.setAdapter(soonRVAdapter);

    }

    @Override
    protected void initloadData() {
        HttpFactory.getFactory().wGet(url, new MyCallback() {
            @Override
            public void successful(String body) {
                Gson gson = new Gson();
                SoonBean soonBean = gson.fromJson(body, SoonBean.class);
                Message message = new Message();
                message.obj = soonBean;
                handler.sendMessage(message);
            }

            @Override
            public void failure(String errorMessage) {

            }
        });

//        loadData();

    }



    @Override
    protected void initListener() {
        buyicket_movies_soon_rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                FragmentManager manager =getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                switch (checkedId){
                    case R.id.attention:
                        transaction.replace(R.id.soon_frame,soonTypeRgFragment);
                        break;
                    case R.id.seven:
                        transaction.replace(R.id.soon_frame,soonTypeRgFragment);
                        break;
                    case R.id.eight:
                        transaction.replace(R.id.soon_frame,soonTypeRgFragment);
                        break;
                    case R.id.nine:
                        transaction.replace(R.id.soon_frame,soonTypeRgFragment);
                        break;
                    case R.id.hopeful:
                        transaction.replace(R.id.soon_frame,soonTypeRgFragment);
                        break;
                }
                transaction.commit();
            }
        });
    }


//    protected void loadData() {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//                OkHttpUtils.getInstance(getContext()).sendGetAsync(url, new Callback() {
//                    @Override
//                    public void onFailure(Call call, IOException e) {
//                        Log.e("TAG", "请求失败");
//                    }
//
//                    @Override
//                    public void onResponse(Call call, Response response) throws IOException {
//                        String str = response.body().string();
//                        Log.e("TAG", str);
//
//                    }
//                });
//            }
//        }).start();
//
//    }





}
