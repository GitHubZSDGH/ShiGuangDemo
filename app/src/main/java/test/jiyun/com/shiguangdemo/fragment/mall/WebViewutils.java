package test.jiyun.com.shiguangdemo.fragment.mall;

import android.content.Context;
import android.content.Intent;

import test.jiyun.com.shiguangdemo.activity.WebActivity;

/**
 * Created by lenovo on 2017/7/4.
 */

public class WebViewutils {

    public static void mIntent(Context context,String url){
        Intent intent = new Intent(context, WebActivity.class);
        intent.putExtra("url",url);
        context.startActivity(intent);

    }
}
