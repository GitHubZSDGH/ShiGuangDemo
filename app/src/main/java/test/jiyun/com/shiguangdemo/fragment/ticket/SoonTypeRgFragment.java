package test.jiyun.com.shiguangdemo.fragment.ticket;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;

import com.androidkun.PullToRefreshRecyclerView;

import com.google.gson.Gson;

import java.util.ArrayList;

import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.base.BaseFragment;
import test.jiyun.com.shiguangdemo.modle.bean.ticket.SoonBean;
import test.jiyun.com.shiguangdemo.modle.callback.MyCallback;
import test.jiyun.com.shiguangdemo.modle.entivity.ClassBiz;
import test.jiyun.com.shiguangdemo.modle.entivity.InterBiz;

/**
 * Created by liuwangping on 2017/6/21.
 */

public class SoonTypeRgFragment extends BaseFragment {
    private PullToRefreshRecyclerView soon_rv;
    private ArrayList<SoonBean.DataBean.MoviecomingsBean> list=new ArrayList<>();
    private InterBiz bizmodel=new ClassBiz();
    private SoonHorizontalAdapter soonHorizontalAdapter;




    @Override
    protected int getLayoutViwe() {
        return R.layout.buytickets_soon_fragment;
    }

    @Override
    protected void initView(View view) {
        soon_rv= (PullToRefreshRecyclerView) view.findViewById(R.id.soon_rv);

        soon_rv.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL,true));
        soon_rv.setHasFixedSize(true);
        soonHorizontalAdapter=new SoonHorizontalAdapter(getContext(),list);
        soon_rv.setAdapter(soonHorizontalAdapter);
    }

    @Override
    protected void initloadData() {

    }



    @Override
    protected void initListener() {
        bizmodel.getMoviesSoon(290, new MyCallback() {
            @Override
            public void successful(String body) {
//                Log.e("soon成功", response);
                Gson gson=new Gson();
                SoonBean soonBean = gson.fromJson(body, SoonBean.class);
                list.addAll(soonBean.getData().getMoviecomings());
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        soonHorizontalAdapter.notifyDataSetChanged();
                    }
                });
            }

            @Override
            public void failure(String errorMessage) {

            }

        });
    }



}
