package test.jiyun.com.shiguangdemo.base;

import android.app.Activity;
import android.content.Intent;

import io.vov.vitamio.Vitamio;

/**
 * 项目名称:时光网
 * 类描述:
 * 创建人:LENOVO
 * 创建时间:2017-7-4 10:52
 * 修改人:
 * 修改内容:
 */
public class LibsChecker {

    public static final String FROM_ME = "fromVitamioInitActivity";

    public static final boolean checkVitamioLibs(Activity ctx) {
        if (!Vitamio.isInitialized(ctx) && !ctx.getIntent().getBooleanExtra(FROM_ME, false)) {
            Intent i = new Intent();
            i.setClassName(Vitamio.getVitamioPackage(), "io.vov.vitamio.activity.InitActivity");
            i.putExtras(ctx.getIntent());
            i.setData(ctx.getIntent().getData());
            i.putExtra("package", ctx.getPackageName());
            i.putExtra("className", ctx.getClass().getName());
            ctx.startActivity(i);
            ctx.finish();
            return false;
        }
        return true;
    }

}
