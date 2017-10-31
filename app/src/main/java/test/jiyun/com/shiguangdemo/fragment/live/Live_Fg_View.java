package test.jiyun.com.shiguangdemo.fragment.live;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import test.jiyun.com.shiguangdemo.App;
import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.activity.VideoActivity;
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
    private ArrayList<OrderBean.DataBean.LivePreviewsBean> orderlist = new ArrayList<>();

    private InterBiz classBizmodel;
    private RecyclerView telecast_playback_rv;
    private BackRvAdapter backRvAdapter;
    private ArrayList<BackBean.DataBean> backlist = new ArrayList<BackBean.DataBean>();

    private FragmentManager manager;

    @Override
    protected int getLayoutViwe() {
        return R.layout.fragment_livetelecast;
    }

    @Override
    protected void initView(View view) {
        classBizmodel = new ClassBiz();
        telecast_playback_rv = (RecyclerView) view.findViewById(R.id.telecast_playback_rv);

//        telecast_order_rv= (RecyclerView) view.findViewById(R.id. telecast_order_rv);

        telecast_playback_rv.setLayoutManager(new GridLayoutManager(getContext(), 2));
        telecast_playback_rv.setHasFixedSize(true);
        backRvAdapter = new BackRvAdapter(getContext(), backlist);
        telecast_playback_rv.setAdapter(backRvAdapter);
        backRvAdapter.setOnListener(new BackRvAdapter.OnListener() {
            @Override
            public void onItemClick(int position) {

                startActivity(new Intent(getContext(), VideoActivity.class));

            }
        });

    }

    @Override
    protected void initloadData() {

        classBizmodel.getTelecastPlayBack(1, 10, new MyCallback() {
                    @Override
                    public void successful(String body) {

                        String str = body.toString();
                        Log.d("Back", "ssssssssssssss" + str);
                        Gson gson = new Gson();
                        BackBean backBean = gson.fromJson(str, BackBean.class);
                        List<BackBean.DataBean> data = backBean.getData();
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
                });


//        classBizmodel.getTelecastOrder(new MyCallback() {
//            @Override
//            public void successful(String response) {
//                String str=response.toString();
//                Log.d("Order","ssssssssssssss"+str);
//                Gson gson=new Gson();
//                OrderBean orderBean = gson.fromJson(str, OrderBean.class);
//                List<OrderBean.DataBean.LivePreviewsBean> livePreviews = orderBean.getData().getLivePreviews();
//                orderlist.addAll(livePreviews);
//                getActivity().runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        orderRVAdapter.notifyDataSetChanged();
//
//                    }
//                });
//            }
//
//            @Override
//            public void failure(String errorMessage) {
//
//            }
//        });

    }

    @Override
    protected void initListener() {

    }

}
