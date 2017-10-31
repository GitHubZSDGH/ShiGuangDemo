package test.jiyun.com.shiguangdemo.fragment.live;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;

import com.androidkun.PullToRefreshRecyclerView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.adapter.live.video.NewAdapter;
import test.jiyun.com.shiguangdemo.base.BaseFragment;
import test.jiyun.com.shiguangdemo.modle.bean.live.video.NewBean;
import test.jiyun.com.shiguangdemo.modle.callback.MyCallback;
import test.jiyun.com.shiguangdemo.modle.entivity.ClassBiz;
import test.jiyun.com.shiguangdemo.modle.entivity.InterBiz;

import static java.security.AccessController.getContext;

/**
 * Created by liuwangping on 2017/6/30.
 */

public class NewsFragment extends BaseFragment {

    private PullToRefreshRecyclerView new_pullrv;
    private List<NewBean.NewsListBean> list=new ArrayList<>();
    private NewAdapter adapter;
    private InterBiz newmodel=new ClassBiz();


    @Override
    protected int getLayoutViwe() {
        return R.layout.fragment_telecast_news;
    }

    @Override
    protected void initView(View view) {
        new_pullrv= (PullToRefreshRecyclerView) view.findViewById(R.id.new_pullrv);
        initData();
    }

    @Override
    protected void initloadData() {
        newmodel.getTelecastNews(1, 211901, new MyCallback() {
            @Override
            public void successful(String response) {
                Log.e("telecasttnews成功",response);
                Gson gson=new Gson();
                NewBean newBean = gson.fromJson(response, NewBean.class);
                list.addAll(newBean.getNewsList());
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


    protected void initData() {
        new_pullrv.setLayoutManager(new LinearLayoutManager(getContext()));
        new_pullrv.setHasFixedSize(true);
        adapter=new NewAdapter(getContext(),list);
        new_pullrv.setAdapter(adapter);
    }

    @Override
    protected void initListener() {

    }


}
