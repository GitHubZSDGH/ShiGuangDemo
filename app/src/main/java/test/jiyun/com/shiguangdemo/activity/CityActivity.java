package test.jiyun.com.shiguangdemo.activity;

import android.content.ClipData;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.nineoldandroids.view.ViewHelper;
import com.nineoldandroids.view.ViewPropertyAnimator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import test.jiyun.com.shiguangdemo.App;
import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.adapter.home.CityActivityAdapter;
import test.jiyun.com.shiguangdemo.base.BaseActivity;
import test.jiyun.com.shiguangdemo.modle.bean.CityListBean;
import test.jiyun.com.shiguangdemo.modle.callback.MyCallback;
import test.jiyun.com.shiguangdemo.modle.entivity.HomeModel;
import test.jiyun.com.shiguangdemo.modle.entivity.IHomeModel;
import test.jiyun.com.shiguangdemo.view.QuickIndexBar;

import static android.R.attr.name;

/**
 * 项目名称:时光网
 * 类描述:  城市列表；
 * 创建人:LENOVO
 * 创建时间:2017-6-30 20:37
 * 修改人:
 * 修改内容:
 */

public class CityActivity extends BaseActivity  {

    @Bind(R.id.lv)
    ListView lv;
    @Bind(R.id.quickIndexBar)
    QuickIndexBar quickIndexBar;
    @Bind(R.id.center_view)
    TextView centerView;
    @Bind(R.id.city_return)
    ImageView cityReturn;

    private List<CityListBean.PBean> mCity;
    private CityActivityAdapter adapter;
    private IHomeModel cityModel;

    private Handler mHandler = new Handler();
    private boolean mIsScale;
    private SharedPreferences mShare = App.baseActivity.getSharedPreferences("city", MODE_PRIVATE);
    private SharedPreferences.Editor mEditor = mShare.edit();
    private CityListBean cityListBean;
    private List<String> user;


    @Override
    protected int getLayoutViwe() {
        return R.layout.activity_city;
    }

    @Override
    protected void initView() {
        mCity = new ArrayList<>();
        cityModel = new HomeModel();


    }

    @Override
    protected void initloadData() {
        cityModel.citylist(new MyCallback() {
            @Override
            public void successful(String body) {
               //Log.e("城市列表======>>>", body.toString());
                Gson gson = new Gson();
                cityListBean = gson.fromJson(body, CityListBean.class);

                mCity.addAll(cityListBean.getP());

                Collections.sort(mCity);

                adapter = new CityActivityAdapter(CityActivity.this, mCity);
                lv.setAdapter(adapter);
                adapter.notifyDataSetChanged();
                initList();
            }


            @Override
            public void failure(String errorMessage) {

            }
        });

    }

    @Override
    protected void initListener() {
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                CityListBean.PBean name = (CityListBean.PBean) lv.getItemAtPosition(position);
                int id1 = name.getId();
                String n = name.getN();
//                Log.e("CityActivity-----", n + id1);
                mEditor.putString("cityname",n);
                mEditor.putInt("cityid",id1);
                mEditor.commit();

                Toast.makeText(CityActivity.this, "你选了 "+n , Toast.LENGTH_SHORT).show();
                finish();

            }
        });

    }

    private void initList() {
        quickIndexBar.setOnTouchLetterListenner(new QuickIndexBar.onTouchLetterListenner() {
            @Override
            public void onTouchLetter(String letter) {
                for (int i = 0; i < mCity.size(); i++) {
                    String itemLetter = mCity.get(i).getPinyinFull().charAt(0) + "";
                    if (itemLetter.equals(letter)) {
                        lv.setSelection(i);
                        break;
                    }
                }
                showCenterAnimView(letter);
            }
        });
        ViewHelper.setScaleX(centerView, 0);
        ViewHelper.setScaleY(centerView, 0);
    }

    protected void showCenterAnimView(String letter) {
        centerView.setText(letter);
        if (!mIsScale) {
            mIsScale = true;
            ViewPropertyAnimator.animate(centerView).scaleX(1.0F)
                    .setInterpolator(new OvershootInterpolator())
                    .setDuration(400).start();
            ViewPropertyAnimator.animate(centerView).scaleY(1.0F)
                    .setInterpolator(new OvershootInterpolator())
                    .setDuration(400).start();

        }
        mHandler.removeCallbacksAndMessages(null);

        mHandler.postDelayed(new Runnable() {

            @Override
            public void run() {
                ViewPropertyAnimator.animate(centerView).scaleX(0F)
                        .setInterpolator(new OvershootInterpolator())
                        .setDuration(450).start();
                ViewPropertyAnimator.animate(centerView).scaleY(0F)
                        .setInterpolator(new OvershootInterpolator())
                        .setDuration(450).start();

                mIsScale = false;
            }
        }, 1500);
    }


    @OnClick(R.id.city_return)//返回
    public void onViewClicked() {
        finish();
    }


}
