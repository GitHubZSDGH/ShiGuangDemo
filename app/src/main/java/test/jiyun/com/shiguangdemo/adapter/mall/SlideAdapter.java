package test.jiyun.com.shiguangdemo.adapter.mall;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.ImageView;

import com.androidkun.PullToRefreshRecyclerView;
import com.androidkun.adapter.BaseAdapter;
import com.androidkun.adapter.ViewHolder;
import com.bumptech.glide.Glide;

import java.util.List;

import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.modle.bean.mall.MarkerTopBean;

/**
 * Created by liuwangping on 2017/6/23.
 */

public class SlideAdapter extends BaseAdapter<MarkerTopBean.DataBean.SpecialTopicListBean> {

    public SlideAdapter(Context context, List<MarkerTopBean.DataBean.SpecialTopicListBean> datas) {
        super(context, R.layout.item_marker_top_slide, datas);
    }

    @Override
    public void convert(ViewHolder holder, MarkerTopBean.DataBean.SpecialTopicListBean specialTopicListBean) {
        ImageView imageView= (ImageView) holder.itemView.findViewById(R.id.marker_top_list_img);
        Glide.with(context).load(specialTopicListBean.getSpecialTopicImg()).into(imageView);

        PullToRefreshRecyclerView pullRV=holder.getView(R.id.marker_top_list_pullrv);
        pullRV.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,true));
        List<MarkerTopBean.DataBean.SpecialTopicListBean.RelatedGoodsListBean> relatedGoodsList =specialTopicListBean.getRelatedGoodsList();
        SlideTwoRVAdapter adapter=new SlideTwoRVAdapter(context,relatedGoodsList);
        pullRV.setAdapter(adapter);


    }

}