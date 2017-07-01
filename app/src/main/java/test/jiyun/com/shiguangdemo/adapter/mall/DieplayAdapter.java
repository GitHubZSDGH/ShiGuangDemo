package test.jiyun.com.shiguangdemo.adapter.mall;

import android.content.Context;
import android.widget.ImageView;

import com.androidkun.adapter.BaseAdapter;
import com.androidkun.adapter.ViewHolder;
import com.bumptech.glide.Glide;


import java.util.List;

import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.modle.bean.mall.MarkerTopBean;

/**
 * Created by liuwangping on 2017/6/25.
 */

public class DieplayAdapter extends BaseAdapter<MarkerTopBean.DataBean.MallBean.NavigatorIconBean> {

    public DieplayAdapter(Context context, List<MarkerTopBean.DataBean.MallBean.NavigatorIconBean> datas) {
        super(context, R.layout.item_marker_dieplay, datas);
    }

    @Override
    public void convert(ViewHolder holder, MarkerTopBean.DataBean.MallBean.NavigatorIconBean navigatorIconBean) {
        ImageView imageView= (ImageView) holder.itemView.findViewById(R.id.item_marker_dieplay_img);
        Glide.with(context).load(navigatorIconBean.getImage()).into(imageView);
        holder.setText(R.id.item_marker_dieplay_icontitle,navigatorIconBean.getIconTitle());
    }
}
