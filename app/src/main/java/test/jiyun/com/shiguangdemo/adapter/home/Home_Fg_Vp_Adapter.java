package test.jiyun.com.shiguangdemo.adapter.home;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.androidkun.adapter.BaseAdapter;
import com.androidkun.adapter.ViewHolder;
import com.bumptech.glide.Glide;

import java.util.List;

import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.modle.bean.HomeListBean;



/**
 * 项目名称:时光网
 * 类描述:
 * 创建人:LENOVO
 * 创建时间:2017-6-23 9:48
 * 修改人:
 * 修改内容:
 */

public class Home_Fg_Vp_Adapter extends BaseAdapter<HomeListBean.DataBeanX.DataBean> {


    public Home_Fg_Vp_Adapter(Context context, List<HomeListBean.DataBeanX.DataBean> datas) {

        super(context, R.layout.home_fg_vp_item_one, datas);

    }


    @Override
    public void convert(ViewHolder holder, HomeListBean.DataBeanX.DataBean dataBean) {
//        if (dataBean.getDataType() == 0) {
        holder.setText(R.id.Home_fg_Vp_ListOne_title, dataBean.getTitle());
        holder.setText(R.id.Home_fg_Vp_ListOne_Body, dataBean.getContent());
        holder.setText(R.id.Home_fg_Vp_ListOne_Name, dataBean.getPublicName());
        holder.setText(R.id.Home_fg_Vp_ListOne_Comment, String.valueOf(dataBean.getCommentCount()));

        ImageView image = holder.getView(R.id.Home_fg_Vp_ListOne_xiaoImag);
        Glide.with(context).load(dataBean.getPublicHeadImage()).into(image);

        ImageView imageView = holder.getView(R.id.Home_fg_Vp_ListOne_imag);
        Glide.with(context).load(dataBean.getImg1()).into(imageView);
//        }else {
//
//        }

    }

//    public int getitemLayout( List<HomeListBean.DataBeanX.DataBean> datas) {
//
//        HomeListBean.DataBeanX.DataBean da = new HomeListBean.DataBeanX.DataBean();
//        int dataType = da.getDataType();
//        if (dataType == 0){
//            return R.layout.home_fg_vp_item_one;
//        }else {
//            return R.layout.home_fg_vp_item_two;
//        }
//
//    }
}
