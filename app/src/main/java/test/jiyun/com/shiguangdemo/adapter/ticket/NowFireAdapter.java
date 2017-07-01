package test.jiyun.com.shiguangdemo.adapter.ticket;

import android.content.Context;
import android.widget.ImageView;

import com.androidkun.adapter.BaseAdapter;
import com.androidkun.adapter.ViewHolder;
import com.bumptech.glide.Glide;


import java.util.List;

import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.modle.bean.ticket.NowFireBean;



public class NowFireAdapter extends BaseAdapter<NowFireBean.MsBean> {
    public NowFireAdapter(Context context, List<NowFireBean.MsBean> datas) {
        super(context, R.layout.item_buyticket_nowfire, datas);
    }

    @Override
    public void convert(ViewHolder holder, NowFireBean.MsBean msBean) {
        holder.setText(R.id.item_buyticket_nowfire_tCn,msBean.getTCn());
        holder.setText(R.id.item_buyticket_nowfire_r, String.valueOf(msBean.getR()));
        holder.setText(R.id.item_buyticket_nowfire_commonSpecial,msBean.getCommonSpecial());
        holder.setText(R.id.item_buyticket_nowfire_actors,msBean.getActors());
        ImageView imageView= (ImageView) holder.itemView.findViewById(R.id.item_buyticket_nowfire_img);
        Glide.with(context).load(msBean.getImg()).into(imageView);

    }
}
