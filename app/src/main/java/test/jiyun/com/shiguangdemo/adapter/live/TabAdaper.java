package test.jiyun.com.shiguangdemo.adapter.live;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;



import java.util.ArrayList;

import test.jiyun.com.shiguangdemo.base.BaseFragment;

/**
 * Created by liuwangping on 2017/6/30.
 */

public class TabAdaper extends FragmentPagerAdapter {
    private ArrayList<BaseFragment> mlist;
    private String[] strings=new String[]{"详情","评论","新闻"};

    public TabAdaper(FragmentManager fragmentManager, ArrayList<BaseFragment> mlist) {
        super(fragmentManager);
        this.mlist=mlist;
    }

    @Override
    public Fragment getItem(int position) {
        return mlist.get(position);
    }

    @Override
    public int getCount() {
        return mlist.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return strings[position];
    }
}
