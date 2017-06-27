package test.jiyun.com.shiguangdemo.adapter.home.info;

import android.content.Context;
import android.widget.ImageView;

import com.androidkun.adapter.BaseAdapter;
import com.androidkun.adapter.ViewHolder;
import com.bumptech.glide.Glide;

import java.util.List;

import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.modle.bean.info.InfoBean;

/**
 * 项目名称:时光网
 * 类描述:
 * 创建人:LENOVO
 * 创建时间:2017-6-23 23:40
 * 修改人:
 * 修改内容:
 */

public class Info_Fg_Vp_Adapter extends BaseAdapter<InfoBean.DataBean.ListBean> {

    public Info_Fg_Vp_Adapter(Context context, List<InfoBean.DataBean.ListBean> datas) {
        super(context, R.layout.home_fg_vp_item_one, datas);
    }

    @Override
    public void convert(ViewHolder holder, InfoBean.DataBean.ListBean listBean) {

        holder.setText(R.id.Home_fg_Vp_ListOne_title, listBean.getTitle());
        holder.setText(R.id.Home_fg_Vp_ListOne_Body, listBean.getIntroduction());
        holder.setText(R.id.Home_fg_Vp_ListOne_Name, listBean.getPublicName());
//        holder.setText(R.id.Home_fg_Vp_ListOne_Comment, String.valueOf(dataBean.getCommentCount()));
//        holder.setText(R.id.Home_fg_Vp_ListOne_Praise, String.valueOf(dataBean.getCommentCount()));


        ImageView image = holder.getView(R.id.Home_fg_Vp_ListOne_xiaoImag);
        Glide.with(context).load(listBean.getPublicHeadImage()).into(image);

        ImageView imageView = holder.getView(R.id.Home_fg_Vp_ListOne_imag);
        Glide.with(context).load(listBean.getImage()).into(imageView);

    }


}
