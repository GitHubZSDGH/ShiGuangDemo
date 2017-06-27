package test.jiyun.com.shiguangdemo.fragment.home;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidkun.PullToRefreshRecyclerView;
import com.androidkun.callback.PullToRefreshListener;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.adapter.home.Home_Fg_Vp_Adapter;
import test.jiyun.com.shiguangdemo.adapter.home.Home_Fg_Vp_Ticket_Adapter;
import test.jiyun.com.shiguangdemo.base.BaseFragment;
import test.jiyun.com.shiguangdemo.fragment.ticket.Ticket_Fg_View;
import test.jiyun.com.shiguangdemo.modle.bean.HomeListBean;
import test.jiyun.com.shiguangdemo.modle.bean.HomeLiveMallBean;
import test.jiyun.com.shiguangdemo.modle.bean.HomeTicketBean;
import test.jiyun.com.shiguangdemo.modle.callback.MyCallback;
import test.jiyun.com.shiguangdemo.modle.entivity.HomeModel;
import test.jiyun.com.shiguangdemo.modle.entivity.IHomeModel;

import static android.R.attr.x;

/**
 * 项目名称:时光网
 * 类描述: 精选 --  (item --> home_fg_vp_item_one.xml)
 * 创建人:LENOVO
 * 创建时间:2017-6-22 11:41
 * 修改人:
 * 修改内容:
 */

public class Home_Fg_Vp_View extends BaseFragment implements View.OnClickListener {
    @Bind(R.id.Home_fg_Vp_RecyclerView)
    PullToRefreshRecyclerView HomeFgVpRecyclerView;

    private TextView  tvTicketAll, tvLiveAll, tvLiveBoay, tvMallmore;//
    private ImageView ivLiveImage, ivMallImageDa, ivMallImageXiaoShang, ivmallImageXiaoXia;//
    private PullToRefreshRecyclerView ticketRecyclerView;//

    private List<ImageView> imageList;//

    private Home_Fg_Vp_Adapter adapter;//
    private List<HomeListBean.DataBeanX.DataBean> dataList;//
    private IHomeModel homeModel;//
    private int pageIndex = 1;//

    private Home_Fg_Vp_Ticket_Adapter ticketAdapter;//
    private List<HomeTicketBean.MoviesBean> ticketList;//
    private int page = 290;//


    @Override
    protected int getLayoutViwe() {
        return R.layout.home_fg_vp_view;
    }

    @Override
    protected void initView(View view) {
        // 精彩直播 和 正版商城 的布局初始化；

        dataList = new ArrayList<>();
        homeModel = new HomeModel();
        imageList = new ArrayList<>();
        ticketList = new ArrayList<>();

        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.home_fg_vp_live, null);
        // 正在售票
        tvTicketAll = (TextView) inflate.findViewById(R.id.Home_fg_Vp_ticket_all);
        tvTicketAll.setOnClickListener(this);
        ticketRecyclerView = (PullToRefreshRecyclerView) inflate.findViewById(R.id.Home_fg_Vp_ticket_RecyclerView);
        LinearLayoutManager llma = new LinearLayoutManager(getActivity());
        llma.setOrientation(LinearLayoutManager.HORIZONTAL);
        ticketRecyclerView.setLayoutManager(llma);
        ticketRecyclerView.setPullRefreshEnabled(false);
        ticketRecyclerView.displayLastRefreshTime(false);
        ticketRecyclerView.setLoadingMoreEnabled(false);
        initticket();

        //精彩直播 和 正版商城 ；
        tvLiveAll = (TextView) inflate.findViewById(R.id.Home_fg_Vp_live_all);// 全部
        tvLiveAll.setOnClickListener(this);
        tvLiveBoay = (TextView) inflate.findViewById(R.id.Home_fg_Vp_live_body);// 内容
        tvMallmore = (TextView) inflate.findViewById(R.id.Home_fg_Vp_mall_more);// 更多
        tvMallmore.setOnClickListener(this);
        ivLiveImage = (ImageView) inflate.findViewById(R.id.Home_fg_Vp_live_imag);// 单张大图
        ivLiveImage.setOnClickListener(this);
        ivMallImageDa = (ImageView) inflate.findViewById(R.id.Home_fg_Vp_mall_imageDa);// 三张图中的大图
        ivMallImageDa.setOnClickListener(this);
        ivMallImageXiaoShang = (ImageView) inflate.findViewById(R.id.Home_fg_Vp_mall_imageXiaoShang);// 三张图的上面小图
        ivMallImageXiaoShang.setOnClickListener(this);
        ivmallImageXiaoXia = (ImageView) inflate.findViewById(R.id.Home_fg_Vp_mall_imageXiaoXia);// 三张图的下面小图
        ivmallImageXiaoXia.setOnClickListener(this);
        //
        HomeFgVpRecyclerView.addHeaderView(inflate);
        //
        imageList.add(ivMallImageDa);
        imageList.add(ivMallImageXiaoShang);
        imageList.add(ivmallImageXiaoXia);

        initlive();


        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        HomeFgVpRecyclerView.setLayoutManager(llm);

        HomeFgVpRecyclerView.setPullRefreshEnabled(true);
        HomeFgVpRecyclerView.displayLastRefreshTime(true);
        HomeFgVpRecyclerView.setLoadingMoreEnabled(true);
        HomeFgVpRecyclerView.setPullToRefreshListener(new PullToRefreshListener() {
            @Override
            public void onRefresh() {
                HomeFgVpRecyclerView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        initloadData();
                        HomeFgVpRecyclerView.setRefreshComplete();
                    }
                }, 2000);
            }

            @Override
            public void onLoadMore() {
                HomeFgVpRecyclerView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        pageIndex++;
                        initloadData();
                        HomeFgVpRecyclerView.setLoadMoreComplete();
                    }
                }, 2000);
            }
        });
        adapter = new Home_Fg_Vp_Adapter(getActivity(), dataList);
        HomeFgVpRecyclerView.setAdapter(adapter);

    }

    @Override
    protected void initloadData() {
        homeModel.other(pageIndex, new MyCallback() {
            @Override
            public void successful(String body) {
                Gson gson = new Gson();
                HomeListBean homeListBean = gson.fromJson(body, HomeListBean.class);
                dataList.addAll(homeListBean.getData().getData());
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


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            // 精彩直播和正版商城
            case R.id.Home_fg_Vp_ticket_all:// 正在售票 -- 更多
                break;
            case R.id.Home_fg_Vp_live_all:// 精彩直播 --全部
                break;
            case R.id.Home_fg_Vp_mall_more:// 正版商城 -- 更多
                break;
            case R.id.Home_fg_Vp_live_imag:// 精彩直播 --单张大图
                break;
            case R.id.Home_fg_Vp_mall_imageDa:// 正版商城 --三张图的大图
                break;
            case R.id.Home_fg_Vp_mall_imageXiaoShang://正版商城 -- 三张图的上面的小图
                break;
            case R.id.Home_fg_Vp_mall_imageXiaoXia:// 正版商城 --三张图的下面的小图
                break;

            // 正在售票

        }
    }

    // 精彩直播和正版商城 网络请求和解析
    private void initlive() {
        homeModel.live(new MyCallback() {
            @Override
            public void successful(String body) {
                Gson gson = new Gson();
                HomeLiveMallBean homeLiveMallBean = gson.fromJson(body, HomeLiveMallBean.class);
                List<HomeLiveMallBean.DataBean.LiveListBean> liveList = homeLiveMallBean.getData().getLiveList();
                for (HomeLiveMallBean.DataBean.LiveListBean liveListBean : liveList) {
                    tvLiveBoay.setText(liveListBean.getTitle());
                    int liveId = liveListBean.getLiveId();
                    initimage(liveListBean.getImg(), ivLiveImage);

                }
                List<HomeLiveMallBean.DataBean.MallDivBean.DivListBean> divList = homeLiveMallBean.getData().getMallDiv().getDivList();
                for (int i = 0; i < divList.size(); i++) {
                    HomeLiveMallBean.DataBean.MallDivBean.DivListBean divListBean1 = divList.get(i);
                    initimage(String.valueOf(divListBean1.getImgSrc()), imageList.get(i));
                }
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

    private void initticket(){
        homeModel.ticket(page, new MyCallback() {
            @Override
            public void successful(String body) {
                Gson gson = new Gson();
                HomeTicketBean homeTicketBean = gson.fromJson(body, HomeTicketBean.class);
                ticketList.addAll(homeTicketBean.getMovies());
                ticketAdapter = new Home_Fg_Vp_Ticket_Adapter(getContext(),ticketList);
                ticketRecyclerView.setAdapter(ticketAdapter);
                ticketAdapter.notifyDataSetChanged();
            }

            @Override
            public void failure(String errorMessage) {

            }
        });

    }


}
