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

public class SlideTwoRVAdapter extends BaseAdapter<MarkerTopBean.DataBean.SpecialTopicListBean.RelatedGoodsListBean> {

    public SlideTwoRVAdapter(Context context, List<MarkerTopBean.DataBean.SpecialTopicListBean.RelatedGoodsListBean> datas) {
        super(context, R.layout.item_marker_top_slide_rvitem, datas);
    }

    @Override
    public void convert(ViewHolder holder, MarkerTopBean.DataBean.SpecialTopicListBean.RelatedGoodsListBean relatedGoodsListBean) {
        holder.setText(R.id.top_list_rv_name,relatedGoodsListBean.getName());
        holder.setText(R.id.top_list_rv_price,relatedGoodsListBean.getPrice());
        ImageView imageView= (ImageView) holder.itemView.findViewById(R.id.top_list_rv_img);
        Glide.with(context).load(relatedGoodsListBean.getImg()).into(imageView);
    }
}
