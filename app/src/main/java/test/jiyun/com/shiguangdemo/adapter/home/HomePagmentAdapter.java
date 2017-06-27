package test.jiyun.com.shiguangdemo.adapter.home;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.base.BaseFragment;

/**
 * Created by LENOVO on 2017/5/9.
 */

public class HomePagmentAdapter extends FragmentPagerAdapter {

    private Context context;
    List<String> nameList;
    List<BaseFragment> listfragment;

    private int [] imagview = {
            R.drawable.ic_home_xin,
            R.drawable.ic_home_zixun,
            R.drawable.ic_home_xuandianying,
            R.drawable.ic_home_yugaopian,
            R.drawable.ic_home_yingping};
    private String titles[] = {"精选", "资讯", "选电影", "预告片","影评"};


    public HomePagmentAdapter(FragmentManager fm,  List<BaseFragment> listfragment,Context context) {
        super(fm);
//        this.nameList = nameList;
        this.listfragment = listfragment;
        this.context  = context;
    }

    @Override
    public Fragment getItem(int position) {
        return listfragment.get(position);
    }

    @Override
    public int getCount() {
        return listfragment.isEmpty() ? 0 : listfragment.size();
    }

//    @Override
//    public CharSequence getPageTitle(int position) {
//        return listname.get(position);
//    }

    public View getTabView(int position){
        //首先为子tab布置一个布局
        View v = LayoutInflater.from(context).inflate(R.layout.home_fg_tab_item,null);
        TextView tv = (TextView) v.findViewById(R.id.home_fg_tab_name);
        tv.setText(titles[position]);
        ImageView iv = (ImageView) v.findViewById(R.id.home_fg_tab_image);
        iv.setImageResource(imagview[position]);
        return v;
    }



}
