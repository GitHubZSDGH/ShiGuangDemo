package test.jiyun.com.shiguangdemo.fragment.home.movie;

import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidkun.PullToRefreshRecyclerView;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.adapter.home.movie.MovieAdapter;
import test.jiyun.com.shiguangdemo.base.BaseFragment;
import test.jiyun.com.shiguangdemo.modle.bean.movie.MovieBean;
import test.jiyun.com.shiguangdemo.modle.bean.movie.MovielistBean;
import test.jiyun.com.shiguangdemo.modle.callback.MyCallback;
import test.jiyun.com.shiguangdemo.modle.entivity.HomeModel;
import test.jiyun.com.shiguangdemo.modle.entivity.IHomeModel;

import static test.jiyun.com.shiguangdemo.R.id.home_fg_Vp_Hot_all;

/**
 * 项目名称:时光网
 * 类描述: 首页 选电影模块
 * 创建人:LENOVO
 * 创建时间:2017-6-24 18:38
 * 修改人:
 * 修改内容:
 */

public class Movie_Fg_Vp_View extends BaseFragment implements View.OnClickListener {
    @Bind(R.id.Home_fg_Vp_movie_RecyclerView)
    PullToRefreshRecyclerView HomeFgVpMovieRecyclerView;
    // 下层列表 的初始化
    private List<MovielistBean.DataBean.ListBean> movielistBeen;
    private IHomeModel movieModel;
    private MovieAdapter adapter;
    private int pageIndex = 0;

    //上层布局 的初始化

    //初始化热门分类的标题  1.全部 2. 动作 3.喜剧 4.科幻 5动画 6.美国 7.中国 8.日本 9.韩国 10. 90年代
    private TextView tvHotAll, tvHotAction, tvHotComedy, tvHotSciencefiction, tvHotAnim, tvHotUS, tvHotChina, tvHotJapan, tvHotSouthkorea, tvHot90Time;
    //初始化热门专题 的更多按钮 和 每日佳片的历史推荐按钮
    private TextView tvMovieMore, tvMovieHistory,tvMovieTitle;
    //初始化热门专题图片
    private ImageView ivMovieOne, ivMovieTwo, ivMovieThree, ivMovieFour, ivMovieDa;
    //初始化热门专题的标题和部数；
    private TextView tvMovieTitleOne, tvMovieTitleTwo, tvMovieTitleThree, tvMovieTitleFour;
    private TextView tvMovieCountOne, tvMovieCountTwo, tvMovieCountThree, tvMovieCountFour;

    private List<TextView> tvHotList,tvCountList;// 热门专题的标题集合
    private List<ImageView> imageHotLIst; //热门专题的图片集合
    private List<TextView> tvCateList;//热门分类的标题集合


    @Override
    protected int getLayoutViwe() {
        return R.layout.home_fg_vp_movie_list;
    }

    @Override
    protected void initView(View view) {

        tvHotList = new ArrayList<>();
        imageHotLIst = new ArrayList<>();
        tvCateList = new ArrayList<>();
        tvCountList = new ArrayList<>();

        movielistBeen = new ArrayList<>();//  初始化列表集合
        movieModel = new HomeModel();//  初始化网络请求接口
        //分类标题初始化
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.home_fg_vp_movie, null);
        tvHotAll = (TextView) inflate.findViewById(home_fg_Vp_Hot_all);
        tvHotAction = (TextView) inflate.findViewById(R.id.home_fg_Vp_Hot_action);
        tvHotComedy = (TextView) inflate.findViewById(R.id.home_fg_Vp_Hot_comedy);
        tvHotSciencefiction = (TextView) inflate.findViewById(R.id.home_fg_Vp_Hot_sciencefiction);
        tvHotAnim = (TextView) inflate.findViewById(R.id.home_fg_Vp_Hot_anim);
        tvHotUS = (TextView) inflate.findViewById(R.id.home_fg_Vp_Hot_US);
        tvHotChina = (TextView) inflate.findViewById(R.id.home_fg_Vp_Hot_china);
        tvHotJapan = (TextView) inflate.findViewById(R.id.home_fg_Vp_Hot_japan);
        tvHotSouthkorea = (TextView) inflate.findViewById(R.id.home_fg_Vp_Hot_southkorea);
        tvHot90Time = (TextView) inflate.findViewById(R.id.home_fg_Vp_Hot_90time);
        //分类标题监听初始化
        tvHotAll.setOnClickListener(this);
        tvHotAction.setOnClickListener(this);
        tvHotComedy.setOnClickListener(this);
        tvHotSciencefiction.setOnClickListener(this);
        tvHotAnim.setOnClickListener(this);
        tvHotUS.setOnClickListener(this);
        tvHotChina.setOnClickListener(this);
        tvHotJapan.setOnClickListener(this);
        tvHotSouthkorea.setOnClickListener(this);
        tvHot90Time.setOnClickListener(this);

        tvCateList.add(tvHotAll);
        tvCateList.add(tvHotAction);
        tvCateList.add(tvHotComedy);
        tvCateList.add(tvHotSciencefiction);
        tvCateList.add(tvHotAnim);
        tvCateList.add(tvHotUS);
        tvCateList.add(tvHotChina);
        tvCateList.add(tvHotJapan);
        tvCateList.add(tvHotSouthkorea);
        tvCateList.add(tvHot90Time);


        //初始化热门专题的更多按钮和每日佳片的历史推荐按钮和监听初始化
        tvMovieMore = (TextView) inflate.findViewById(R.id.Home_fg_Vp_movie_more);
        tvMovieHistory = (TextView) inflate.findViewById(R.id.Home_fg_Vp_movie_history);
        tvMovieTitle = (TextView) inflate.findViewById(R.id.Homt_fg_Vp_movie_title);
        tvMovieTitle.setOnClickListener(this);
        ivMovieDa = (ImageView) inflate.findViewById(R.id.Home_fg_Vp_movie_Image);
        ivMovieDa.setOnClickListener(this);
        tvMovieMore.setOnClickListener(this);
        tvMovieHistory.setOnClickListener(this);
        //初始化热门专题的四张图片 和监听
        ivMovieOne = (ImageView) inflate.findViewById(R.id.Home_fg_Vp_movie_Ome);
        ivMovieTwo = (ImageView) inflate.findViewById(R.id.Home_fg_Vp_movie_two);
        ivMovieThree = (ImageView) inflate.findViewById(R.id.Home_fg_Vp_movie_three);
        ivMovieFour = (ImageView) inflate.findViewById(R.id.Home_fg_Vp_movie_four);
        ivMovieOne.setOnClickListener(this);
        ivMovieTwo.setOnClickListener(this);
        ivMovieThree.setOnClickListener(this);
        ivMovieFour.setOnClickListener(this);
        imageHotLIst.add(ivMovieOne);
        imageHotLIst.add(ivMovieTwo);
        imageHotLIst.add(ivMovieThree);
        imageHotLIst.add(ivMovieFour);

        //初始化热门专题的图片标题和部数
        tvMovieTitleOne = (TextView) inflate.findViewById(R.id.Home_fg_Vp_movie_title_one);
        tvMovieTitleTwo = (TextView) inflate.findViewById(R.id.Home_fg_Vp_movie_title_two);
        tvMovieTitleThree = (TextView) inflate.findViewById(R.id.Home_fg_Vp_movie_title_three);
        tvMovieTitleFour = (TextView) inflate.findViewById(R.id.Home_fg_Vp_movie_title_four);
        tvMovieCountOne = (TextView) inflate.findViewById(R.id.Home_fg_Vp_movie_shu_One);
        tvMovieCountTwo = (TextView) inflate.findViewById(R.id.Home_fg_Vp_movie_shu_two);
        tvMovieCountThree = (TextView) inflate.findViewById(R.id.Home_fg_Vp_movie_shu_three);
        tvMovieCountFour = (TextView) inflate.findViewById(R.id.Home_fg_Vp_movie_shu_four);
        tvHotList.add(tvMovieTitleOne);
        tvHotList.add(tvMovieTitleTwo);
        tvHotList.add(tvMovieTitleThree);
        tvHotList.add(tvMovieTitleFour);
        tvCountList.add(tvMovieCountOne);
        tvCountList.add(tvMovieCountTwo);
        tvCountList.add(tvMovieCountThree);
        tvCountList.add(tvMovieCountFour);

        //初始化热门专题的图片标题和部数监听初始化
        tvMovieTitleOne.setOnClickListener(this);
        tvMovieTitleTwo.setOnClickListener(this);
        tvMovieTitleThree.setOnClickListener(this);
        tvMovieTitleFour.setOnClickListener(this);
        tvMovieCountOne.setOnClickListener(this);
        tvMovieCountTwo.setOnClickListener(this);
        tvMovieCountThree.setOnClickListener(this);
        tvMovieCountFour.setOnClickListener(this);


        HomeFgVpMovieRecyclerView.addHeaderView(inflate);
        inithttp();

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        HomeFgVpMovieRecyclerView.setLayoutManager(llm);
        HomeFgVpMovieRecyclerView.setPullRefreshEnabled(false);
        HomeFgVpMovieRecyclerView.displayLastRefreshTime(false);
        HomeFgVpMovieRecyclerView.setLoadingMoreEnabled(false);


    }

    @Override
    protected void initloadData() {
        movieModel.movielist(pageIndex, new MyCallback() {
            @Override
            public void successful(String body) {
                Gson gson = new Gson();
                MovielistBean movielistBean = gson.fromJson(body, MovielistBean.class);

                movielistBeen.addAll(movielistBean.getData().getList());
                adapter = new MovieAdapter(getActivity(), movielistBeen);
                HomeFgVpMovieRecyclerView.setAdapter(adapter);
                adapter.notifyDataSetChanged();

            }

            @Override
            public void failure(String errorMessage) {

            }
        });

    }

    @Override
    protected void initListener() {

    }

    private void inithttp() {
        movieModel.movie(new MyCallback() {
            @Override
            public void successful(String body) {
                Gson gson = new Gson();
                MovieBean movieBean = gson.fromJson(body, MovieBean.class);
                List<MovieBean.DataBean.CategoryBean> category = movieBean.getData().getCategory();
                for (int i = 0; i < category.size(); i++) {
                    MovieBean.DataBean.CategoryBean categoryBean = category.get(i);
                    TextView textView = tvCateList.get(i);
                    textView.setText(categoryBean.getName());
                }

                List<MovieBean.DataBean.HotTopicBean> hotTopic = movieBean.getData().getHotTopic();
                for (int i = 0; i < hotTopic.size(); i++) {
                    MovieBean.DataBean.HotTopicBean hotTopicBean = hotTopic.get(i);
                    TextView texttitle = tvHotList.get(i);
                    TextView textcount = tvCountList.get(i);
                    texttitle.setText(hotTopicBean.getName());
                    textcount.setText(hotTopicBean.getMovieCount()+" 部");
                    initimage(hotTopicBean.getBgImage(),imageHotLIst.get(i));
                }

                MovieBean.DataBean.GoodMovieBean goodMovie = movieBean.getData().getGoodMovie();
                tvMovieTitle.setText(goodMovie.getTitle());
                initimage(goodMovie.getImage(),ivMovieDa);

            }

            @Override
            public void failure(String errorMessage) {

            }
        });
    }
    //请求图片
    private void initimage(String url, ImageView view) {
        Glide.with(getContext()).load(url).into(view);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //分类标题初始化
            case R.id.home_fg_Vp_Hot_all://
                break;
            case R.id.home_fg_Vp_Hot_action://
                break;
            case R.id.home_fg_Vp_Hot_comedy://
                break;
            case R.id.home_fg_Vp_Hot_sciencefiction://
                break;
            case R.id.home_fg_Vp_Hot_anim://
                break;
            case R.id.home_fg_Vp_Hot_US://
                break;
            case R.id.home_fg_Vp_Hot_china://
                break;
            case R.id.home_fg_Vp_Hot_japan://
                break;
            case R.id.home_fg_Vp_Hot_southkorea://
                break;
            case R.id.home_fg_Vp_Hot_90time://
                break;
            //初始化热门专题的更多按钮和每日佳片的历史推荐按钮和监听初始化
            case R.id.Home_fg_Vp_movie_more://
                break;//
            case R.id.Home_fg_Vp_movie_history://
                break;//
            case R.id.Home_fg_Vp_movie_Image://
                break;//
            //初始化热门专题的四张图片 和监听
            case R.id.Home_fg_Vp_movie_Ome://
                break;//
            case R.id.Home_fg_Vp_movie_two://
                break;//
            case R.id.Home_fg_Vp_movie_three://
                break;//
            case R.id.Home_fg_Vp_movie_four://
                break;//
            //初始化热门专题的图片标题和部数
            case R.id.Home_fg_Vp_movie_title_one://
                break;//
            case R.id.Home_fg_Vp_movie_title_two://
                break;//
            case R.id.Home_fg_Vp_movie_title_three://
                break;//
            case R.id.Home_fg_Vp_movie_title_four://
                break;//
            case R.id.Home_fg_Vp_movie_shu_One://
                break;//
            case R.id.Home_fg_Vp_movie_shu_two://
                break;//
            case R.id.Home_fg_Vp_movie_shu_three://
                break;//
            case R.id.Home_fg_Vp_movie_shu_four://
                break;
        }
    }
}
