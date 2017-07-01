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
 * Created by liuwangping on 2017/6/24.
 */

public class CycloRVAdapter extends BaseAdapter<MarkerTopBean.DataBean.MallBean.TopicBean.SubListBeanX> {

    public CycloRVAdapter(Context context, List<MarkerTopBean.DataBean.MallBean.TopicBean.SubListBeanX> datas) {
        super(context, R.layout.item_marker_cyclorv, datas);
    }

    @Override
    public void convert(ViewHolder holder, MarkerTopBean.DataBean.MallBean.TopicBean.SubListBeanX subListBeanX) {
        holder.setText(R.id.marker_cyclorv_title,subListBeanX.getTitle());
     //   holder.setText(R.id.top_list_rv_price,);
        ImageView imageView= (ImageView) holder.itemView.findViewById(R.id.marker_cyclorv_img);
        Glide.with(context).load(subListBeanX.getImage()).into(imageView);
    }
}
