package test.jiyun.com.shiguangdemo.fragment.ticket;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;

import com.androidkun.PullToRefreshRecyclerView;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.adapter.ticket.AllAdapter;
import test.jiyun.com.shiguangdemo.base.BaseFragment;
import test.jiyun.com.shiguangdemo.modle.bean.ticket.CinemaBean;
import test.jiyun.com.shiguangdemo.modle.callback.MyCallback;
import test.jiyun.com.shiguangdemo.modle.entivity.ClassBiz;
import test.jiyun.com.shiguangdemo.modle.entivity.InterBiz;

import static java.security.AccessController.getContext;

/**
 * Created by liuwangping on 2017/6/27.
 */

public class AllFragment extends BaseFragment {
    private PullToRefreshRecyclerView buy_cinema_pulltorv;
    private AllAdapter allAdapter;
    private List<CinemaBean> cinmeraBeanList=new ArrayList<>();
    private InterBiz bizmodel=new ClassBiz();



    @Override
    protected int getLayoutViwe() {
        return R.layout.fragment_buytickt_cinema_all;
    }

    @Override
    protected void initView(View view) {
        buy_cinema_pulltorv= (PullToRefreshRecyclerView) view.findViewById(R.id.buy_cinema_pulltorv);

        buy_cinema_pulltorv.setLayoutManager(new LinearLayoutManager(getContext()));
        buy_cinema_pulltorv.setHasFixedSize(true);
        allAdapter=new AllAdapter(getContext(),cinmeraBeanList);
        buy_cinema_pulltorv.setAdapter(allAdapter);
    }



    @Override
    protected void initloadData() {
        bizmodel.getBuyCinmera(290, new MyCallback() {
            @Override
            public void successful(String body) {
//                Log.e("CinmeraBean成功",body);
                try {
                    JSONArray jsonArray = new JSONArray(body);
                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject jsonObj = jsonArray.getJSONObject(i);
                        CinemaBean bean = new CinemaBean();
                        bean.setCinameName(jsonObj.optString("cinameName"));
                        bean.setAddress(jsonObj.optString("address"));
                        bean.setMinPrice(jsonObj.optInt("minPrice"));
                        bean.setRatingFinal(jsonObj.optInt("ratingFinal"));
                        cinmeraBeanList.add(bean);
                        JSONObject featureObject = jsonObj.getJSONObject("feature");
                        Log.e("featureObject",featureObject.getString("has3D"));
                        getActivity().runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                allAdapter.notifyDataSetChanged();
                            }
                        });
                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void failure(String errorMessage) {
                Log.e("CinmeraBean失败",errorMessage);
            }


        });
    }


    @Override
    protected void initListener() {

    }




}
