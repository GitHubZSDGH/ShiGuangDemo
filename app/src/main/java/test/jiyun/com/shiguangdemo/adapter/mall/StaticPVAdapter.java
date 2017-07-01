package test.jiyun.com.shiguangdemo.adapter.mall;

import android.content.Context;
import android.widget.ImageView;

import com.androidkun.adapter.BaseAdapter;
import com.androidkun.adapter.ViewHolder;
import com.bumptech.glide.Glide;


import java.util.List;

import test.jiyun.com.shiguangdemo.App;
import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.modle.bean.mall.MarkerTopBean;

/**
 * Created by liuwangping on 2017/6/23.
 */

public class StaticPVAdapter extends BaseAdapter<MarkerTopBean.DataBean.MallBean.CategoryBean> {


    public StaticPVAdapter(Context context, List<MarkerTopBean.DataBean.MallBean.CategoryBean> datas) {
        super(context, R.layout.item_marker_top_static, datas);
    }

    @Override
    public void convert(ViewHolder holder, MarkerTopBean.DataBean.MallBean.CategoryBean categoryBean) {

        holder.setText(R.id.marker_top_static_name,categoryBean.getName());
        ImageView imageView= (ImageView) holder.itemView.findViewById(R.id.marker_top_static_img1);
        Glide.with(context).load(categoryBean.getImage()).into(imageView);

        ImageView img2= (ImageView) holder.itemView.findViewById(R.id.marker_top_static_img2);
        ImageView img3= (ImageView) holder.itemView.findViewById(R.id.marker_top_static_img3);
        ImageView img4= (ImageView) holder.itemView.findViewById(R.id.marker_top_static_img4);
        Glide.with(context).load(categoryBean.getSubList().get(0).getImage()).into(img2);
        Glide.with(context).load(categoryBean.getSubList().get(1).getImage()).into(img3);
        Glide.with(context).load(categoryBean.getSubList().get(2).getImage()).into(img4);
        holder.setText(R.id.marker_top_static_tv1,categoryBean.getSubList().get(0).getTitle());
        holder.setText(R.id.marker_top_static_tv2,categoryBean.getSubList().get(1).getTitle());
        holder.setText(R.id.marker_top_static_tv3,categoryBean.getSubList().get(2).getTitle());
    }
}
