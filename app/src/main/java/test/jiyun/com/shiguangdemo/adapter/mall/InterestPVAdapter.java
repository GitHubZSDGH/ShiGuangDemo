package test.jiyun.com.shiguangdemo.adapter.mall;


import android.content.Context;
import android.widget.ImageView;

import com.androidkun.adapter.BaseAdapter;
import com.androidkun.adapter.ViewHolder;
import com.bumptech.glide.Glide;

import java.util.List;

import test.jiyun.com.shiguangdemo.App;
import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.modle.bean.mall.InterestBean;

/**
 * Created by liuwangping on 2017/6/23.
 */

public class InterestPVAdapter extends BaseAdapter<InterestBean.GoodsListBean> {
    public InterestPVAdapter(Context context, List<InterestBean.GoodsListBean> datas) {
        super(context, R.layout.item_marker_interest, datas);
    }

    @Override
    public void convert(ViewHolder holder, InterestBean.GoodsListBean goodsListBean) {
        holder.setText(R.id.item_interest_title,goodsListBean.getName());
        holder.setText(R.id.item_interest_price, String.valueOf(goodsListBean.getMinSalePrice()/100.0));
        ImageView imageView= (ImageView) holder.itemView.findViewById(R.id.item_interest_img);
        Glide.with(context).load(goodsListBean.getImage()).into(imageView);
    }
}
