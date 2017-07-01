package test.jiyun.com.shiguangdemo.fragment.ticket;

import android.content.Context;
import android.widget.ImageView;

import com.androidkun.adapter.BaseAdapter;
import com.androidkun.adapter.ViewHolder;
import com.bumptech.glide.Glide;


import java.util.List;

import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.modle.bean.ticket.SoonBean;

/**
 * Created by liuwangping on 2017/6/26.
 */

public class SoonHorizontalAdapter extends BaseAdapter<SoonBean.DataBean.MoviecomingsBean> {
    public SoonHorizontalAdapter(Context context, List<SoonBean.DataBean.MoviecomingsBean> datas) {
        super(context, R.layout.item_buytickets_soon_type1, datas);
    }

    @Override
    public void convert(ViewHolder holder, SoonBean.DataBean.MoviecomingsBean moviecomingsBean) {
        holder.setText(R.id.item_soon_type1_releasedate,moviecomingsBean.getReleaseDate());
        holder.setText(R.id.item_soon_type1_title,moviecomingsBean.getTitle());
        holder.setText(R.id.item_soon_type1_wantedCount,moviecomingsBean.getWantedCount()+"人想看");
        ImageView imageView= (ImageView) holder.itemView.findViewById(R.id.item_soon_type1_image);
        Glide.with(context).load(moviecomingsBean.getImage()).into(imageView);
    }
}
