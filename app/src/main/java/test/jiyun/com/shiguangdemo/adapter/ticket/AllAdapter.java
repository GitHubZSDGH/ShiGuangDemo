package test.jiyun.com.shiguangdemo.adapter.ticket;

import android.content.Context;

import com.androidkun.adapter.BaseAdapter;
import com.androidkun.adapter.ViewHolder;


import java.util.List;

import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.modle.bean.ticket.CinemaBean;

/**
 * Created by liuwangping on 2017/6/27.
 */

public class AllAdapter extends BaseAdapter<CinemaBean> {

    public AllAdapter(Context context, List<CinemaBean> datas) {
        super(context, R.layout.item_buytickets_cinema_all, datas);
    }

    @Override
    public void convert(ViewHolder holder, CinemaBean cinmeraBean) {
        holder.setText(R.id.item_cinmera_name,cinmeraBean.getCinameName());
        holder.setText(R.id.item_cinmera_price,cinmeraBean.getMinPrice()/100+"");
        holder.setText(R.id.item_cinmera_address,cinmeraBean.getAddress());
    }
}