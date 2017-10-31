package test.jiyun.com.shiguangdemo.fragment.home.info;

import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.androidkun.PullToRefreshRecyclerView;
import com.androidkun.callback.PullToRefreshListener;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.adapter.home.info.Info_Fg_Vp_Adapter;
import test.jiyun.com.shiguangdemo.base.BaseFragment;
import test.jiyun.com.shiguangdemo.modle.bean.info.InfoBean;
import test.jiyun.com.shiguangdemo.modle.callback.MyCallback;
import test.jiyun.com.shiguangdemo.modle.entivity.IInformationModel;
import test.jiyun.com.shiguangdemo.modle.entivity.InformationModel;

/**
 * 项目名称:时光网
 * 类描述:
 * 创建人:LENOVO
 * 创建时间:2017-6-23 23:38
 * 修改人:
 * 修改内容:
 */

public class Info_Fg_View extends BaseFragment {
    @Bind(R.id.Home_fg_Vp_RecyclerView)
    PullToRefreshRecyclerView HomeFgVpRecyclerView;

    private List<InfoBean.DataBean.ListBean> infoList;
    private IInformationModel infoModel;
    private Info_Fg_Vp_Adapter adapter;
    private int pageIndex = 1;

    @Override
    protected int getLayoutViwe() {
        return R.layout.home_fg_vp_view;
    }

    @Override
    protected void initView(View view) {
        infoList = new ArrayList<>();
        infoModel = new InformationModel();

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        HomeFgVpRecyclerView.setLayoutManager(llm);

        HomeFgVpRecyclerView.setPullRefreshEnabled(false);
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
                        pageIndex++;
                        initloadData();
                        HomeFgVpRecyclerView.setLoadMoreComplete();
                    }
                }, 2000);
            }
        });
        adapter = new Info_Fg_Vp_Adapter(getActivity(), infoList);
        HomeFgVpRecyclerView.setAdapter(adapter);


    }

    @Override
    protected void initloadData() {
        infoModel.list(pageIndex, new MyCallback() {
            @Override
            public void successful(String body) {
                Gson gson = new Gson();
                InfoBean infoBean = gson.fromJson(body, InfoBean.class);
                infoList.addAll(infoBean.getData().getList());
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
