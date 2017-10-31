package test.jiyun.com.shiguangdemo.adapter.live.video;

import android.content.Context;
import android.widget.ImageView;

import com.androidkun.adapter.BaseAdapter;
import com.androidkun.adapter.ViewHolder;
import com.bumptech.glide.Glide;


import java.util.List;

import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.modle.bean.live.video.CommentBean;

/**
 * Created by liuwangping on 2017/7/2.
 */

public class CommentAdapter extends BaseAdapter<CommentBean.DataBean.ListBean> {

    public CommentAdapter(Context context,List<CommentBean.DataBean.ListBean> datas) {
        super(context, R.layout.item_telecast_comment, datas);
    }

    @Override
    public void convert(ViewHolder holder, CommentBean.DataBean.ListBean listBean) {
        holder.setText(R.id.comment_nickname,listBean.getNickname());
        holder.setText(R.id.comment_showtime,listBean.getShowTime());
        holder.setText(R.id.comment_content,listBean.getContent());
        ImageView imageView=holder.getView(R.id.comment_img);
        Glide.with(context).load(listBean.getAvator()).into(imageView);
    }
}
