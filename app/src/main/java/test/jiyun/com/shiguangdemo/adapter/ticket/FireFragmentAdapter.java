package test.jiyun.com.shiguangdemo.adapter.ticket;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.ViewGroup;



import java.util.List;

import test.jiyun.com.shiguangdemo.base.BaseFragment;

/**
 * Created by liuwangping on 2017/4/19.
 */

public class FireFragmentAdapter extends FragmentStatePagerAdapter {
    private List<String> ListName;
    private List<BaseFragment> mList;
    public FireFragmentAdapter(FragmentManager fm, List<String> ListName, List<BaseFragment> mList) {
        super(fm);
        this.ListName = ListName;
        this.mList = mList;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

    }

    @Override
    public Fragment getItem(int position) {
        return mList.get(position);
    }

    @Override
    public int getCount() {
        return mList.size();

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return ListName.get(position);
    }
}
