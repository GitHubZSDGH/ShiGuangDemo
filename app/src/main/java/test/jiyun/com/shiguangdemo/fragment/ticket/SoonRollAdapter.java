package test.jiyun.com.shiguangdemo.fragment.ticket;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.jude.rollviewpager.adapter.StaticPagerAdapter;

import test.jiyun.com.shiguangdemo.R;

/**
 * Created by liuwangping on 2017/6/23.
 */

public class SoonRollAdapter extends StaticPagerAdapter {
    private int[] imgs = {
            R.drawable.home_img,R.drawable.home_img2
    };

    @Override
    public View getView(ViewGroup container, int position) {
        ImageView view = new ImageView(container.getContext());
        view.setImageResource(imgs[position]);
        view.setScaleType(ImageView.ScaleType.CENTER_CROP);
        view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        return view;
    }

    @Override
    public int getCount() {
        return imgs.length;
    }

}

