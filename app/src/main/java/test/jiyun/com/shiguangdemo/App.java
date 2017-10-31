package test.jiyun.com.shiguangdemo;

import android.app.Application;

import test.jiyun.com.shiguangdemo.base.BaseActivity;
import test.jiyun.com.shiguangdemo.base.BaseFragment;

/**
 * Created by lenovo on 2017/6/15.
 */

public class App extends Application{
    public static BaseActivity baseActivity;
    public static BaseFragment BaselastFragment;
    public static boolean isVisible = true;
}
