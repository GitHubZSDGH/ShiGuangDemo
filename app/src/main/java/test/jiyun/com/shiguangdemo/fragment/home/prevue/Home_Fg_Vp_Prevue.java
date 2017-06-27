package test.jiyun.com.shiguangdemo.fragment.home.prevue;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidkun.PullToRefreshRecyclerView;
import com.androidkun.callback.PullToRefreshListener;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.adapter.home.Home_Fg_Vp_Adapter;
import test.jiyun.com.shiguangdemo.adapter.home.prevue.Home_Fg_Vp_Prevue_Adapter;
import test.jiyun.com.shiguangdemo.base.BaseFragment;
import test.jiyun.com.shiguangdemo.modle.bean.prevue.PrevueBean;
import test.jiyun.com.shiguangdemo.modle.callback.MyCallback;
import test.jiyun.com.shiguangdemo.modle.entivity.HomeModel;
import test.jiyun.com.shiguangdemo.modle.entivity.IHomeModel;

/**
 * 项目名称:时光网
 * 类描述: 预告片
 * 创建人:LENOVO
 * 创建时间:2017-6-26 20:11
 * 修改人:
 * 修改内容:
 */

public class Home_Fg_Vp_Prevue extends BaseFragment {
    @Bind(R.id.Home_fg_Vp_RecyclerView)
    PullToRefreshRecyclerView HomeFgVpRecyclerView;

    private List<PrevueBean.DataBean.TrailersBean> traiBeen;
    private Home_Fg_Vp_Prevue_Adapter adapter;
    private IHomeModel prevueModel;



    @Override
    protected int getLayoutViwe() {
        return R.layout.home_fg_vp_view;
    }

    @Override
    protected void initView(View view) {

        traiBeen = new ArrayList<>();
        prevueModel = new HomeModel();


        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        HomeFgVpRecyclerView.setLayoutManager(llm);

        HomeFgVpRecyclerView.setPullRefreshEnabled(true);
        HomeFgVpRecyclerView.displayLastRefreshTime(true);
        HomeFgVpRecyclerView.setLoadingMoreEnabled(true);
        HomeFgVpRecyclerView.setPullToRefreshListener(new PullToRefreshListener() {
            @Override
            public void onRefresh() {
                HomeFgVpRecyclerView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        initloadData();
                        HomeFgVpRecyclerView.setRefreshComplete();
                    }
                }, 2000);
            }

            @Override
            public void onLoadMore() {
                HomeFgVpRecyclerView.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        initloadData();
                        HomeFgVpRecyclerView.setLoadMoreComplete();
                    }
                }, 2000);
            }
        });
        adapter = new Home_Fg_Vp_Prevue_Adapter(getContext(), traiBeen);
        HomeFgVpRecyclerView.setAdapter(adapter);

    }

    @Override
    protected void initloadData() {
        prevueModel.prevue(new MyCallback() {
            @Override
            public void successful(String body) {
                Gson gson = new Gson();
//                List<PrevueBean.DataBean.TrailersBean> trailersBeen = (List<PrevueBean.DataBean.TrailersBean>) gson.fromJson(body, new TypeToken<List<PrevueBean.DataBean.TrailersBean>>() {
//                }.getType());
//                for (PrevueBean.DataBean.TrailersBean trailersBean : trailersBeen) {
//                    traiBeen.add(trailersBean);
//                }

                Log.e("预告片请求的数据---->>>", body.toString());

                PrevueBean prevueBean = gson.fromJson(body, PrevueBean.class);
                traiBeen.addAll(prevueBean.getData().getTrailers());
                adapter.notifyDataSetChanged();

            }

            @Override
            public void failure(String errorMessage) {

            }
        });
    }

    @Override
    protected void initListener() {

    }


}
