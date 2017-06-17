package test.jiyun.com.shiguangdemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * 项目名称:时光网
 * 类描述:
 * 创建人:lenovo
 * 创建时间:2017/6/15 11:55
 * 修改人:
 * 修改内容:
 */
public abstract class BaseFragment extends Fragment {
    private boolean boo;
    private Bundle bundle;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        bundle = savedInstanceState;
        return inflater.inflate(getLayoutViwe(),container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this,view);
        //找布局ID
        initView(view);
        //实现组件监听
        initListener();
    }

    @Override
    public void onResume() {
        super.onResume();
        if(boo){
            //加载数据
            initloadData();
            //更新操作栏
            updateActionBar();
        }
    }

    //获得view视图
    protected abstract  int getLayoutViwe();
    //找布局ID
    protected abstract void initView(View view);
    //加载数据
    protected abstract void initloadData();
    //实现组件监听
    protected abstract void initListener();
    public void setParmars(Bundle bundle) {

//        this.bundle = bundle;
    }
    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if(hidden){
            //隐藏fragment视图
            onHidden();
        }else {
            //显示fragment视图
            onShow();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        boo=false;
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    //更新操作栏
    protected void updateActionBar() {

    }


//显示fragment视图
    protected void onShow() {
        updateActionBar();
    }
//隐藏fragment视图
    protected void onHidden() {
    }
}
