package test.jiyun.com.shiguangdemo.fragment.home.prevue;

import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.androidkun.PullToRefreshRecyclerView;
import com.androidkun.callback.PullToRefreshListener;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.adapter.home.prevue.Home_Fg_Vp_Prevue_Adapter;
import test.jiyun.com.shiguangdemo.base.BaseFragment;
import test.jiyun.com.shiguangdemo.modle.bean.prevue.PrevueBean;
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
    private String url ="https://ticket-api-m.mtime.cn/discovery/trailerList.api";



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
//        prevueModel.prevue(new MyCallback() {
//            @Override
//            public void successful(String body) {
//                Gson gson = new Gson();
//                Log.e("预告片请求的数据---->>>", body.toString());
//
//                PrevueBean prevueBean = gson.fromJson(body, PrevueBean.class);
//                List<PrevueBean.DataBean.TrailersBean> trailers = prevueBean.getData().getTrailers();
//                traiBeen.addAll(trailers);
//                adapter.notifyDataSetChanged();
//
//            }
//
//            @Override
//            public void failure(String errorMessage) {
//
//            }
//        });

        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();

                Gson gson = new Gson();
                PrevueBean prevueBean = gson.fromJson(string, PrevueBean.class);
                List<PrevueBean.DataBean.TrailersBean> trailers = prevueBean.getData().getTrailers();
                traiBeen.addAll(trailers);
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        adapter.notifyDataSetChanged();
                    }
                });



            }
        });


    }

    @Override
    protected void initListener() {

    }


}
