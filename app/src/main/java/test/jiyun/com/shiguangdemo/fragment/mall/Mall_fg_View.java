package test.jiyun.com.shiguangdemo.fragment.mall;

import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.OnClick;
import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.base.BaseFragment;
import test.jiyun.com.shiguangdemo.utils.ObservableScrollView;

/**
 * 项目名称:时光网
 * 类描述:商城模块 二层布局
 * 创建人:LENOVO
 * 创建时间:2017-6-20 20:56
 * 修改人:
 * 修改内容:
 */

public class Mall_fg_View extends BaseFragment implements ObservableScrollView.ScrollViewListener {
    @Bind(R.id.Mall_fg_Title_SaoYiSao)
    ImageView MallFgTitleSaoYiSao;
    @Bind(R.id.Mall_fg_Title_Search)
    EditText MallFgTitleSearch;
    @Bind(R.id.Mall_fg_Title_Cart)
    ImageView MallFgTitleCart;


    private ObservableScrollView scrollView;

    private ListView listView;

    private ImageView imageView;

    private TextView textView;

    private int imageHeight;

    private FragmentManager manager;


    @Override
    protected int getLayoutViwe() {
        return R.layout.mall_fg_view;
    }

    @Override
    protected void initView(View view) {
        MallFgTitleSearch.setKeyListener(null);

//        manager = App.baseActivity.getSupportFragmentManager();
//        FragmentTransaction transaction = manager.beginTransaction();
//        transaction.add(R.id.Home_fg_framerLayout,new Home_Fg_Tab_View());
//        transaction.commit();

    }

    @Override
    protected void initloadData() {

    }

    @Override
    protected void initListener() {

    }


    @OnClick({R.id.Mall_fg_Title_SaoYiSao, R.id.Mall_fg_Title_Search, R.id.Mall_fg_Title_Cart})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.Mall_fg_Title_SaoYiSao:
                break;
            case R.id.Mall_fg_Title_Search:
                break;
            case R.id.Mall_fg_Title_Cart:
                break;
        }
    }

    @Override
    public void onScrollChanged(ObservableScrollView scrollView, int x, int y, int oldx, int oldy) {

        // Log.i("TAG", "y--->" + y + "    height-->" + height);
        if (y <= 0) {
            textView.setBackgroundColor(Color.argb((int) 0, 227, 29, 26));//AGB由相关工具获得，或者美工提供
        } else if (y > 0 && y <= imageHeight) {
            float scale = (float) y / imageHeight;
            float alpha = (255 * scale);
            // 只是layout背景透明(仿知乎滑动效果)
            textView.setBackgroundColor(Color.argb((int) alpha, 227, 29, 26));
        } else {
            textView.setBackgroundColor(Color.argb((int) 255, 227, 29, 26));
        }
    }


}
