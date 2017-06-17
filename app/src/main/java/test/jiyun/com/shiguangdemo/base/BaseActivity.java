package test.jiyun.com.shiguangdemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import test.jiyun.com.shiguangdemo.App;

/**
 * 项目名称:时光网
 * 类描述:
 * 创建人:lenovo
 * 创建时间:2017/6/15 11:55
 * 修改人:
 * 修改内容:
 */

public abstract class BaseActivity extends AppCompatActivity {
    //用于存储上一个fragment；
    private BaseFragment baseFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        App.baseActivity = this;
        //获得view视图
        setContentView(getLayoutViwe());
        ButterKnife.bind(this);
        //找布局ID
         initView();
        //加载数据
        initloadData();
        //实现组件监听
        initListener();
    }
//当Activity再次运行的时候 把this继续复制给baseActivity
    @Override
    protected void onResume() {
        super.onResume();
        App.baseActivity = this;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    //获得view视图
    protected abstract  int getLayoutViwe();
    //找布局ID
    protected abstract void initView();
    //加载数据
    protected abstract void initloadData();
    //实现组件监听
    protected abstract void initListener();
    //back 返回键
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
