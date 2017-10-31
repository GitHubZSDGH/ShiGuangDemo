package test.jiyun.com.shiguangdemo.adapter.live.video;

import android.content.Context;
import android.widget.ImageView;

import com.androidkun.adapter.BaseAdapter;
import com.androidkun.adapter.ViewHolder;
import com.bumptech.glide.Glide;

import java.util.List;

import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.modle.bean.live.video.NewBean;

/**
 * Created by liuwangping on 2017/7/2.
 */

public class NewAdapter extends BaseAdapter<NewBean.NewsListBean>{
    public NewAdapter(Context context,List<NewBean.NewsListBean> datas) {
        super(context, R.layout.item_telecast_new, datas);
    }

    @Override
    public void convert(ViewHolder holder, NewBean.NewsListBean newsListBean) {
        holder.setText(R.id.new_title,newsListBean.getTitle());
        holder.setText(R.id.new_title2,newsListBean.getTitle2());
        holder.setText(R.id.new_count,"评论"+newsListBean.getCommentCount());
        holder.setText(R.id.new_date,newsListBean.getPublishTime()+"");
        ImageView imageView=holder.getView(R.id.new_img);
        Glide.with(context).load(newsListBean.getImage()).into(imageView);
    }
}
