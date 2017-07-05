package test.jiyun.com.shiguangdemo.adapter.home;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.androidkun.adapter.BaseAdapter;
import com.androidkun.adapter.ViewHolder;
import com.bumptech.glide.Glide;

import java.util.List;

import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.modle.bean.HomeTicketBean;

/**
 * 项目名称:时光网
 * 类描述:
 * 创建人:LENOVO
 * 创建时间:2017-6-23 19:32
 * 修改人:
 * 修改内容:
 */

public class Home_Fg_Vp_Ticket_Adapter extends BaseAdapter<HomeTicketBean.MoviesBean>{

    public Home_Fg_Vp_Ticket_Adapter(Context context,  List<HomeTicketBean.MoviesBean> datas) {
        super(context, R.layout.home_fg_vp_ticket_item, datas);
    }

    @Override
    public void convert(ViewHolder holder, HomeTicketBean.MoviesBean moviesBean) {
        holder.setText(R.id.Home_fg_Vp_Item_name,moviesBean.getTitleCn());

        ImageView imageView = holder.getView(R.id.Home_fg_Vp_Item_Imag);
        Glide.with(context).load(moviesBean.getImg())
                .asBitmap()
                .placeholder(R.drawable.horrorfilm_cover)
                .into(imageView);


    }
}
