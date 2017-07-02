package test.jiyun.com.shiguangdemo.fragment.mall;


import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.androidkun.PullToRefreshRecyclerView;
import com.bumptech.glide.Glide;

import com.google.gson.Gson;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;

import java.util.ArrayList;
import java.util.List;

import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.adapter.mall.CycloRVAdapter;
import test.jiyun.com.shiguangdemo.adapter.mall.DieplayAdapter;
import test.jiyun.com.shiguangdemo.adapter.mall.InterestPVAdapter;
import test.jiyun.com.shiguangdemo.adapter.mall.SlideAdapter;
import test.jiyun.com.shiguangdemo.adapter.mall.StaticPVAdapter;
import test.jiyun.com.shiguangdemo.base.BaseFragment;
import test.jiyun.com.shiguangdemo.fragment.ticket.GlideImage;
import test.jiyun.com.shiguangdemo.modle.bean.mall.InterestBean;
import test.jiyun.com.shiguangdemo.modle.bean.mall.MarkerTopBean;
import test.jiyun.com.shiguangdemo.modle.callback.MyCallback;
import test.jiyun.com.shiguangdemo.modle.entivity.ClassBiz;
import test.jiyun.com.shiguangdemo.modle.entivity.InterBiz;

/**
 * Created by liuwangping on 2017/6/12.
 */

public class MarkerFragment extends BaseFragment implements View.OnClickListener {
    //轮播
    private Banner banner;
    //模玩
    private PullToRefreshRecyclerView frag_marker_dieplay_pullRV;
    private List<MarkerTopBean.DataBean.MallBean.NavigatorIconBean> navigatorlist=new ArrayList<>();
    private DieplayAdapter dieplayAdapter;

    //一张大图片下面有小图片可以水平滑
    private ArrayList<MarkerTopBean.DataBean.SpecialTopicListBean> speciallist = new ArrayList<>();
    private PullToRefreshRecyclerView frag_marker_two_pullRV;
    private SlideAdapter slideAdapter;
    //一张大图片下面有小图片不可移动
    private PullToRefreshRecyclerView frag_marker_static_pullRV;
    private List<MarkerTopBean.DataBean.MallBean.CategoryBean> categorylist = new ArrayList<>();
    private StaticPVAdapter staticPVAdapter;
    //你可能感兴趣的
    private PullToRefreshRecyclerView frag_marker_interest_pullRV;
    private List<InterestBean.GoodsListBean> interestlist = new ArrayList<>();
    private InterBiz classbizmodel = new ClassBiz();
    private InterestPVAdapter interestPVAdapter;
    //四张图凑一起的
    private ImageView marker_img4_left, marker_img4_right_up, marker_img4_right_down, marker_img4_bottom;
    private MarkerTopBean.DataBean.MallBean.CellABean cellA;
    private MarkerTopBean.DataBean.MallBean.CellBBean cellB;
    private MarkerTopBean.DataBean.MallBean.CellCBean cellC;
    //五张圆形图
    private TextView frag_marker_cyclo_titleEn,frag_marker_cyclo_titleCn;
    private ImageView frag_marker_bgimg,frag_marker_cyclo_img1,frag_marker_cyclo_img2,
            frag_marker_cyclo_img3,frag_marker_cyclo_img4,frag_marker_cyclo_img5;
    private PullToRefreshRecyclerView frag_marker_cyclo_pullRV;
    private List<MarkerTopBean.DataBean.MallBean.TopicBean> topic;
    private ArrayList<MarkerTopBean.DataBean.MallBean.TopicBean.SubListBeanX> subListBeanXes = new ArrayList<>();
    private CycloRVAdapter cycloRVAdapter;
    private List<MarkerTopBean.DataBean.MallBean.TopicBean.SubListBeanX> subList;
    private List<MarkerTopBean.DataBean.MallBean.TopicBean.SubListBeanX> subList1;
    private List<MarkerTopBean.DataBean.MallBean.TopicBean.SubListBeanX> subList2;
    private List<MarkerTopBean.DataBean.MallBean.TopicBean.SubListBeanX> subList3;
    private List<MarkerTopBean.DataBean.MallBean.TopicBean.SubListBeanX> subList4;


    private List<String> topictitle = new ArrayList<>();


    @Override
    protected int getLayoutViwe() {
        return R.layout.fragment_marker;
    }

    @Override
    protected void initView(View view) {
        banner = (Banner) view.findViewById(R.id.frag_marker_banner);
        //模玩
        frag_marker_dieplay_pullRV= (PullToRefreshRecyclerView) view.findViewById(R.id.frag_marker_dieplay_pullRV);


        //四张图片凑一起的
        marker_img4_left = (ImageView) view.findViewById(R.id.marker_img4_left);
        marker_img4_right_up = (ImageView) view.findViewById(R.id.marker_img4_right_up);
        marker_img4_right_down = (ImageView) view.findViewById(R.id.marker_img4_right_down);
        marker_img4_bottom = (ImageView) view.findViewById(R.id.marker_img4_bottom);
        //一张大图片下面有小图片可以水平滑
        frag_marker_two_pullRV = (PullToRefreshRecyclerView) view.findViewById(R.id.frag_marker_two_pullRV);
        //五张圆形图
        frag_marker_cyclo_titleEn= (TextView) view.findViewById(R.id.frag_marker_cyclo_titleEn);
        frag_marker_cyclo_titleCn= (TextView) view.findViewById(R.id.frag_marker_cyclo_titleCn);
        frag_marker_bgimg = (ImageView) view.findViewById(R.id.frag_marker_bgimg);
        frag_marker_cyclo_img1 = (ImageView) view.findViewById(R.id.frag_marker_cyclo_img1);
        frag_marker_cyclo_img2 = (ImageView) view.findViewById(R.id.frag_marker_cyclo_img2);
        frag_marker_cyclo_img3 = (ImageView) view.findViewById(R.id.frag_marker_cyclo_img3);
        frag_marker_cyclo_img4 = (ImageView) view.findViewById(R.id.frag_marker_cyclo_img4);
        frag_marker_cyclo_img5 = (ImageView) view.findViewById(R.id.frag_marker_cyclo_img5);
        frag_marker_cyclo_pullRV = (PullToRefreshRecyclerView) view.findViewById(R.id.frag_marker_cyclo_pullRV);
        frag_marker_cyclo_img1.setOnClickListener(this);
        frag_marker_cyclo_img2.setOnClickListener(this);
        frag_marker_cyclo_img3.setOnClickListener(this);
        frag_marker_cyclo_img4.setOnClickListener(this);
        frag_marker_cyclo_img5.setOnClickListener(this);

        //一张大图片下面有小图片不可移动
        frag_marker_static_pullRV = (PullToRefreshRecyclerView) view.findViewById(R.id.frag_marker_static_pullRV);
        //你可能更感兴趣的
        frag_marker_interest_pullRV = (PullToRefreshRecyclerView) view.findViewById(R.id.frag_marker_interest_pullRV);

        initData();
    }

    @Override
    protected void initloadData() {
        loadData();
    }


    protected void initData() {
        List<Integer> imaglist = new ArrayList<>();
        imaglist.add(R.drawable.marker_img1);
        imaglist.add(R.drawable.marker_img2);
        imaglist.add(R.drawable.marker_img3);
        imaglist.add(R.drawable.marker_img4);
        imaglist.add(R.drawable.marker_img5);
        banner.setImages(imaglist)
                .setDelayTime(2000)
                .setBannerStyle(BannerConfig.CIRCLE_INDICATOR)
                .setImageLoader(new GlideImage())
                .setIndicatorGravity(BannerConfig.CENTER)
                .start();

        //模玩
        frag_marker_dieplay_pullRV.setLayoutManager(new GridLayoutManager(getContext(),4));
        frag_marker_dieplay_pullRV.setHasFixedSize(true);
        frag_marker_dieplay_pullRV.setPullRefreshEnabled(false);
        frag_marker_dieplay_pullRV.setLoadingMoreEnabled(false);
        dieplayAdapter=new DieplayAdapter(getContext(),navigatorlist);
        frag_marker_dieplay_pullRV.setAdapter(dieplayAdapter);

        //一张大图片下面有小图片可以水平滑
        frag_marker_two_pullRV.setLayoutManager(new LinearLayoutManager(getContext()));
        frag_marker_two_pullRV.setHasFixedSize(true);
        frag_marker_two_pullRV.setPullRefreshEnabled(false);
        frag_marker_two_pullRV.setLoadingMoreEnabled(false);
        slideAdapter = new SlideAdapter(getContext(), speciallist);
        frag_marker_two_pullRV.setAdapter(slideAdapter);
        //五张圆形图
        frag_marker_cyclo_pullRV.setLayoutManager(new GridLayoutManager(getContext(), 3));
        frag_marker_cyclo_pullRV.setHasFixedSize(true);
        frag_marker_cyclo_pullRV.setPullRefreshEnabled(false);
        cycloRVAdapter = new CycloRVAdapter(getContext(), subListBeanXes);
        frag_marker_cyclo_pullRV.setAdapter(cycloRVAdapter);

        //一张大图片下面有小图片不可移动
        frag_marker_static_pullRV.setLayoutManager(new LinearLayoutManager(getContext()));
        frag_marker_static_pullRV.setHasFixedSize(true);
        frag_marker_static_pullRV.setPullRefreshEnabled(false);
        frag_marker_static_pullRV.setLoadingMoreEnabled(false);
        staticPVAdapter = new StaticPVAdapter(getContext(), categorylist);
        frag_marker_static_pullRV.setAdapter(staticPVAdapter);

        //你可能感兴趣的
        frag_marker_interest_pullRV.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        frag_marker_interest_pullRV.setHasFixedSize(true);
        frag_marker_interest_pullRV.setPullRefreshEnabled(false);
        frag_marker_interest_pullRV.setLoadingMoreEnabled(false);
        interestPVAdapter = new InterestPVAdapter(getContext(), interestlist);
        frag_marker_interest_pullRV.setAdapter(interestPVAdapter);

    }

    @Override
    protected void initListener() {

    }


    protected void loadData() {

        classbizmodel.getMarkerTop(new MyCallback() {
            @Override
            public void successful(String body) {
                String img4str = body.toString();
                Log.e("MarkerTop成功", img4str);
                Gson gson = new Gson();
                MarkerTopBean markerTopBean = gson.fromJson(img4str, MarkerTopBean.class);
                //轮播
                List<MarkerTopBean.DataBean.MallBean.ScrollImgBean> scrollImg= markerTopBean.getData().getMall().getScrollImg();
                //模玩
                navigatorlist.addAll(markerTopBean.getData().getMall().getNavigatorIcon());
                //五张圆形图
                topic = markerTopBean.getData().getMall().getTopic();
                subList = markerTopBean.getData().getMall().getTopic().get(0).getSubList();
                subList1 = markerTopBean.getData().getMall().getTopic().get(1).getSubList();
                subList2 = markerTopBean.getData().getMall().getTopic().get(2).getSubList();
                subList3 = markerTopBean.getData().getMall().getTopic().get(3).getSubList();
                subList4 = markerTopBean.getData().getMall().getTopic().get(4).getSubList();

                for (int i = 0; i < markerTopBean.getData().getMall().getTopic().size(); i++) {
                    List<MarkerTopBean.DataBean.MallBean.TopicBean>  topic1 = markerTopBean.getData().getMall().getTopic();
                    MarkerTopBean.DataBean.MallBean.TopicBean topicBean = topic1.get(i);
                    String titleCn = topicBean.getTitleCn();
                    String titleEn = topicBean.getTitleEn();
                    topictitle.add(titleCn);
                    topictitle.add(titleEn);

                }


                //四张图片
                cellA = markerTopBean.getData().getMall().getCellA();
                cellB = markerTopBean.getData().getMall().getCellB();
                cellC = markerTopBean.getData().getMall().getCellC();

                //一张大图片下面有小图片可以水平滑
                speciallist.addAll(markerTopBean.getData().getSpecialTopicList());

                //一张大图片下面有小图片不可移动
                categorylist.addAll(markerTopBean.getData().getMall().getCategory());


                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        //模玩
                        dieplayAdapter.notifyDataSetChanged();
                        //四张图片
                        Glide.with(getContext()).load(cellA.getImg()).into(marker_img4_left);
                        Glide.with(getContext()).load(cellB.getImg()).into(marker_img4_bottom);
                        Glide.with(getContext()).load(cellC.getList().get(0).getImage()).into(marker_img4_right_up);
                        Glide.with(getContext()).load(cellC.getList().get(1).getImage()).into(marker_img4_right_down);

                        //一张大图片下面有小图片可以水平滑
                        slideAdapter.notifyDataSetChanged();
                        //五张圆形图
                        Glide.with(getContext()).load(MarkerFragment.this.topic.get(0).getBackgroupImage()).into(frag_marker_bgimg);
                        Glide.with(getContext()).load(MarkerFragment.this.topic.get(0).getCheckedImage()).into(frag_marker_cyclo_img1);
                        Glide.with(getContext()).load(MarkerFragment.this.topic.get(1).getCheckedImage()).into(frag_marker_cyclo_img2);
                        Glide.with(getContext()).load(MarkerFragment.this.topic.get(2).getCheckedImage()).into(frag_marker_cyclo_img3);
                        Glide.with(getContext()).load(MarkerFragment.this.topic.get(3).getCheckedImage()).into(frag_marker_cyclo_img4);
                        Glide.with(getContext()).load(MarkerFragment.this.topic.get(4).getCheckedImage()).into(frag_marker_cyclo_img5);

                        //一张大图片下面有小图片不可移动
                        staticPVAdapter.notifyDataSetChanged();
                    }
                });
            }

            @Override
            public void failure(String errorMessage) {
                Log.e("MarkerTop失败", errorMessage);
            }

        });


        //你可能感兴趣的
        classbizmodel.getMarkerInterest(1, new MyCallback() {
            @Override
            public void successful(String body) {
                String str = body.toString();
                Log.e("MarkerInterest成功", str);
                Gson gson = new Gson();
                InterestBean interestBean = gson.fromJson(body, InterestBean.class);
                List<InterestBean.GoodsListBean> goodsList = interestBean.getGoodsList();
                interestlist.addAll(goodsList);
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        interestPVAdapter.notifyDataSetChanged();
                    }
                });

            }

            @Override
            public void failure(String errorMessage) {
                Log.e("MarkerInterest失败", errorMessage);
            }
        });
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.frag_marker_cyclo_img1:
                subListBeanXes.clear();
                Toast.makeText(getActivity(), "点击了图片", Toast.LENGTH_SHORT).show();

                frag_marker_cyclo_titleCn.setText(topictitle.get(0));
                frag_marker_cyclo_titleEn.setText(topictitle.get(1));
                subListBeanXes.addAll(subList);
                cycloRVAdapter.notifyDataSetChanged();
                Glide.with(getContext()).load(topic.get(0).getBackgroupImage()).into(frag_marker_bgimg);
                break;
            case R.id.frag_marker_cyclo_img2:
                subListBeanXes.clear();
                Toast.makeText(getActivity(), "点击了图片", Toast.LENGTH_SHORT).show();
                frag_marker_cyclo_titleCn.setText(topictitle.get(2));
                frag_marker_cyclo_titleEn.setText(topictitle.get(3));
                subListBeanXes.addAll(subList1);
                cycloRVAdapter.notifyDataSetChanged();
                Glide.with(getContext()).load(topic.get(1).getBackgroupImage()).into(frag_marker_bgimg);
                break;
            case R.id.frag_marker_cyclo_img3:
                subListBeanXes.clear();
                Toast.makeText(getActivity(), "点击了图片", Toast.LENGTH_SHORT).show();
                frag_marker_cyclo_titleCn.setText(topictitle.get(4));
                frag_marker_cyclo_titleEn.setText(topictitle.get(5));
                subListBeanXes.addAll(subList2);
                cycloRVAdapter.notifyDataSetChanged();
                Glide.with(getContext()).load(topic.get(2).getBackgroupImage()).into(frag_marker_bgimg);
                break;
            case R.id.frag_marker_cyclo_img4:
                subListBeanXes.clear();
                Toast.makeText(getActivity(), "点击了图片", Toast.LENGTH_SHORT).show();
                frag_marker_cyclo_titleCn.setText(topictitle.get(6));
                frag_marker_cyclo_titleEn.setText(topictitle.get(7));
                subListBeanXes.addAll(subList3);
                cycloRVAdapter.notifyDataSetChanged();
                Glide.with(getContext()).load(topic.get(3).getBackgroupImage()).into(frag_marker_bgimg);
                break;
            case R.id.frag_marker_cyclo_img5:
                subListBeanXes.clear();
                Toast.makeText(getActivity(), "点击了图片", Toast.LENGTH_SHORT).show();
                frag_marker_cyclo_titleCn.setText(topictitle.get(8));
                frag_marker_cyclo_titleEn.setText(topictitle.get(9));
                subListBeanXes.addAll(subList4);
                cycloRVAdapter.notifyDataSetChanged();
                Glide.with(getContext()).load(topic.get(4).getBackgroupImage()).into(frag_marker_bgimg);
                break;
        }
    }

}
