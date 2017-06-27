package test.jiyun.com.shiguangdemo.adapter.home.movie;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.androidkun.adapter.BaseAdapter;
import com.androidkun.adapter.ViewHolder;
import com.bumptech.glide.Glide;

import java.util.List;

import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.modle.bean.movie.MovielistBean;

/**
 * 项目名称:时光网
 * 类描述:
 * 创建人:LENOVO
 * 创建时间:2017-6-25 15:21
 * 修改人:
 * 修改内容:
 */

public class MovieListAdapter extends BaseAdapter<MovielistBean.DataBean.ListBean.MovieListBean> {


    public MovieListAdapter(Context context,  List<MovielistBean.DataBean.ListBean.MovieListBean> datas) {
        super(context, R.layout.home_fg_vp_ticket_item, datas);
    }

    @Override
    public void convert(ViewHolder holder, MovielistBean.DataBean.ListBean.MovieListBean movieListBean) {

        holder.setText(R.id.Home_fg_Vp_Item_name,movieListBean.getName());
        ImageView imageView = holder.getView(R.id.Home_fg_Vp_Item_Imag);
        Glide.with(context).load(movieListBean.getPosterUrl()).into(imageView);

    }
}
