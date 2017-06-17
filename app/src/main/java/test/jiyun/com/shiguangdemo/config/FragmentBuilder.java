package test.jiyun.com.shiguangdemo.config;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import test.jiyun.com.shiguangdemo.App;
import test.jiyun.com.shiguangdemo.base.BaseFragment;

import static test.jiyun.com.shiguangdemo.App.BaselastFragment;

/**
 * 项目名称:时光网
 * 类描述:fragment管理类
 * 创建人:lenovo
 * 创建时间:2017/6/15 11:55
 * 修改人:
 * 修改内容:
 */

public class FragmentBuilder {
    private FragmentManager fragmentManager;
    private BaseFragment baseFragment;
    FragmentTransaction fragmentTransaction;
    private String simpleName;

    private FragmentBuilder(){
        init();
    }
    private static FragmentBuilder fragmentBuilder;
    public static synchronized FragmentBuilder getInstance(){
        if (fragmentBuilder == null) {
            fragmentBuilder = new FragmentBuilder();
        }
        return fragmentBuilder;
    }

    private void init() {
        //  //初始化并得到fragmentManger管理者对象
        fragmentManager = App.baseActivity.getSupportFragmentManager();
    }
    public FragmentBuilder start(Class<? extends BaseFragment> baseClass,int ViewId){
        //开启事务
        fragmentTransaction = fragmentManager.beginTransaction();
        //要跳转Fragment的类
        simpleName = baseClass.getSimpleName();
        //用tag做标记
        baseFragment = (BaseFragment) fragmentManager.findFragmentByTag(simpleName);
        if (baseFragment == null) {
            try {
                baseFragment = baseClass.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            //添加到事务
            fragmentTransaction.add(ViewId, baseFragment, simpleName);
        }
        if (BaselastFragment != null) {
            fragmentTransaction.hide(BaselastFragment);
        }
        //展示当前页面
        fragmentTransaction.show(baseFragment);
        //添加到回退栈
        fragmentTransaction.addToBackStack(simpleName);
        return this;
    }

    //传参
    public FragmentBuilder setParms(Bundle bundle) {
        baseFragment.setParmars(bundle);
        return this;
    }

    public BaseFragment builder() {
        //赋给上一个页面
        BaselastFragment = baseFragment;
        //提交事务
        fragmentTransaction.commit();
        return baseFragment;
    }

    //清空
    public static void clean() {
        fragmentBuilder = null;
    }
}
