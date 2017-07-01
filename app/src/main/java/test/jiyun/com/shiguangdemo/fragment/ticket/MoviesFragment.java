package test.jiyun.com.shiguangdemo.fragment.ticket;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;





import java.util.ArrayList;
import java.util.List;

import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.adapter.ticket.FireFragmentAdapter;
import test.jiyun.com.shiguangdemo.base.BaseFragment;


/**
 *
 */
public class MoviesFragment extends BaseFragment {
    private FireFragmentAdapter adapter;
    private List<String> mListName;
    private List<BaseFragment> mList;
    private TabLayout frag_movies_tablayout;
    private ViewPager frag_movies_vp;



    @Override
    protected int getLayoutViwe() {
        return R.layout.buyticket_movies_fragment;
    }

    @Override
    protected void initView(View view) {
        frag_movies_vp= (ViewPager) view.findViewById(R.id.frag_movies_vp);
        frag_movies_tablayout= (TabLayout) view.findViewById(R.id.frag_movies_tablayout);
    }

    @Override
    protected void initloadData() {
        mListName = new ArrayList<>();
        mList = new ArrayList<>();
        mListName.add("正在热映");
        mListName.add("即将上映");
        mList.add(new FireFragment());
        mList.add(new SoonFragment());
        adapter = new FireFragmentAdapter(getChildFragmentManager(), mListName, mList);
        frag_movies_vp.setAdapter(adapter);
        frag_movies_tablayout.setupWithViewPager(frag_movies_vp);
    }


    @Override
    protected void initListener() {

    }


}
