package test.jiyun.com.shiguangdemo.fragment.ticket;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;

import com.androidkun.PullToRefreshRecyclerView;

import com.androidkun.callback.PullToRefreshListener;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.adapter.ticket.NowFireAdapter;
import test.jiyun.com.shiguangdemo.base.BaseFragment;
import test.jiyun.com.shiguangdemo.modle.bean.ticket.NowFireBean;
import test.jiyun.com.shiguangdemo.modle.callback.MyCallback;
import test.jiyun.com.shiguangdemo.modle.entivity.ClassBiz;
import test.jiyun.com.shiguangdemo.modle.entivity.InterBiz;

import static java.security.AccessController.getContext;



public class FireFragment extends BaseFragment {
    private PullToRefreshRecyclerView nowfire_pullrv;
    private List<NowFireBean.MsBean> mlist=new ArrayList<>();
    private NowFireAdapter adapter;
    private InterBiz bizmodel=new ClassBiz();

    @Override
    protected int getLayoutViwe() {
        return R.layout.buyticket_movies_fragment_fire;
    }

    @Override
    protected void initView(View view) {
        nowfire_pullrv= (PullToRefreshRecyclerView) view.findViewById(R.id.nowfire_pullrv);
        nowfire_pullrv.setLayoutManager(new LinearLayoutManager(getContext()));
        nowfire_pullrv.setHasFixedSize(true);
        adapter = new NowFireAdapter(getContext(),mlist);
        nowfire_pullrv.setAdapter(adapter);

        nowfire_pullrv.setPullRefreshEnabled(true);
        nowfire_pullrv.setLoadingMoreEnabled(true);
        nowfire_pullrv.displayLastRefreshTime(true);
        nowfire_pullrv.setPullToRefreshListener(new PullToRefreshListener() {
            @Override
            public void onRefresh() {
                nowfire_pullrv.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        initloadData();
                        nowfire_pullrv.setRefreshComplete();
                    }
                },2000);
            }

            @Override
            public void onLoadMore() {
                nowfire_pullrv.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        initloadData();
                        nowfire_pullrv.setLoadMoreComplete();
                    }
                },2000);
            }
        });

    }

    @Override
    protected void initloadData() {
        bizmodel.getNowFire(290, new MyCallback() {
            @Override
            public void successful(String body) {
                Log.e("NowFire成功",body);
                Gson gson=new Gson();
                NowFireBean nowFireBean = gson.fromJson(body, NowFireBean.class);
                mlist.addAll(nowFireBean.getMs());
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        adapter.notifyDataSetChanged();
                    }
                });
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
