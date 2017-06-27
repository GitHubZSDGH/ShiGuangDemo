package test.jiyun.com.shiguangdemo.adapter.home.movie;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;

import com.androidkun.PullToRefreshRecyclerView;
import com.androidkun.adapter.BaseAdapter;
import com.androidkun.adapter.ViewHolder;

import java.util.List;

import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.modle.bean.movie.MovielistBean;


/**
 * 项目名称:时光网
 * 类描述:
 * 创建人:LENOVO
 * 创建时间:2017-6-24 19:56
 * 修改人:
 * 修改内容:
 */

public class MovieAdapter extends BaseAdapter<MovielistBean.DataBean.ListBean> {


    public MovieAdapter(Context context,  List<MovielistBean.DataBean.ListBean> datas) {
        super(context, R.layout.home_fg_vp_movie_list_item, datas);
    }

    @Override
    public void convert(ViewHolder holder, MovielistBean.DataBean.ListBean listBean) {
        holder.setText(R.id.Home_fg_Vp_movie_Item_Title,listBean.getName());
        holder.setText(R.id.Home_fg_Vp_movie_item_more, String.valueOf(listBean.getMovieCount()+" 部"));

        PullToRefreshRecyclerView pullRV=holder.getView(R.id.Home_fg_vp_movie_item_RecyclerView);
        pullRV.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,true));
        for (int i = 0; i < listBean.getMovieList().size(); i++) {
            MovieListAdapter adapter = new MovieListAdapter(context,  listBean.getMovieList());
            pullRV.setAdapter(adapter);
        }



//        List<MarkerTopBean.DataBean.SpecialTopicListBean.RelatedGoodsListBean> relatedGoodsList =specialTopicListBean.getRelatedGoodsList();
//        TwoRVAdapter adapter=new TwoRVAdapter(context,relatedGoodsList);
//        pullRV.setAdapter(adapter);


    }
}
