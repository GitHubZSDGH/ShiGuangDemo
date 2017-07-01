package test.jiyun.com.shiguangdemo.fragment.live;

import android.support.v4.app.FragmentManager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.adapter.live.BackRvAdapter;
import test.jiyun.com.shiguangdemo.adapter.live.OrderRVAdapter;
import test.jiyun.com.shiguangdemo.base.BaseFragment;
import test.jiyun.com.shiguangdemo.modle.bean.live.BackBean;
import test.jiyun.com.shiguangdemo.modle.bean.live.OrderBean;
import test.jiyun.com.shiguangdemo.modle.callback.MyCallback;
import test.jiyun.com.shiguangdemo.modle.entivity.ClassBiz;
import test.jiyun.com.shiguangdemo.modle.entivity.InterBiz;

/**
 * 项目名称:时光网
 * 类描述: 直播模块 二层布局
 * 创建人:LENOVO
 * 创建时间:2017-6-21 9:39
 * 修改人:
 * 修改内容:
 */

public class Live_Fg_View extends BaseFragment {
    private RecyclerView telecast_order_rv;
    private OrderRVAdapter orderRVAdapter;
    private ArrayList<OrderBean.DataBean.LivePreviewsBean> orderlist=new ArrayList<>();

    private InterBiz classBizmodel;
    private RecyclerView telecast_playback_rv;
    private BackRvAdapter backRvAdapter;
    private ArrayList<BackBean.DataBean> backlist=new ArrayList<BackBean.DataBean>();

    private FragmentManager manager;

    @Override
    protected int getLayoutViwe() {
        return R.layout.fragment_livetelecast;
    }

    @Override
    protected void initView(View view) {
//        manager = App.baseActivity.getSupportFragmentManager();
//        FragmentTransaction transaction = manager.beginTransaction();
//        transaction.add(R.id.Home_fg_framerLayout,new Home_Fg_Tab_View());
//        transaction.commit();
        classBizmodel=new ClassBiz();
//        telecast_order_rv= (RecyclerView) view.findViewById(R.id. telecast_order_rv);
        telecast_playback_rv= (RecyclerView) view.findViewById(R.id. telecast_playback_rv);

    }

    @Override
    protected void initloadData() {
        telecast_playback_rv.setLayoutManager(new GridLayoutManager(getContext(),2));
        telecast_playback_rv.setHasFixedSize(true);
        backRvAdapter= new BackRvAdapter(getContext(),backlist);
        telecast_playback_rv.setAdapter(backRvAdapter);
        classBizmodel.getTelecastPlayBack(1, 10, new MyCallback() {
                    @Override
                    public void successful(String body) {

                        String str=body.toString();
                        Log.d("Back","ssssssssssssss"+str);
                        Gson gson=new Gson();
                        BackBean backBean = gson.fromJson(str, BackBean.class);
                        List<BackBean.DataBean> data =backBean.getData();
                        backlist.addAll(data);

                        getActivity().runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                backRvAdapter.notifyDataSetChanged();

                            }
                        });
                    }

                    @Override
                    public void failure(String errorMessage) {

                    }
                }


        );
    }

    @Override
    protected void initListener() {

    }

}
