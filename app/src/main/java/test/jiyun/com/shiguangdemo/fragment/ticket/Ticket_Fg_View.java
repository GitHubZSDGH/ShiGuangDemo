package test.jiyun.com.shiguangdemo.fragment.ticket;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.base.BaseFragment;

/**
 * 项目名称:时光网
 * 类描述:购票标题和
 * 创建人:LENOVO
 * 创建时间:2017-6-20 11:26
 * 修改人:
 * 修改内容:
 */

public class Ticket_Fg_View extends BaseFragment {
    @Bind(R.id.Ticket_fg_title_city)
    TextView TicketFgTitleCity;
    @Bind(R.id.Ticket_fg_title_film)
    TextView TicketFgTitleFilm;
    @Bind(R.id.Ticket_fg_title_cinema)
    TextView TicketFgTitleCinema;
    @Bind(R.id.Ticket_fg_title_Search)
    ImageView TicketFgTitleSearch;
    @Bind(R.id.Ticket_fg_title_ViewPager)
    FrameLayout TicketFgTitleViewPager;

    private boolean boo = true;

    @Override
    protected int getLayoutViwe() {
        return R.layout.ticket_fg_view;
    }

    @Override
    protected void initView(View view) {

        initcolor(TicketFgTitleFilm);

    }

    @Override
    protected void initloadData() {

    }

    @Override
    protected void initListener() {

    }


    @OnClick({R.id.Ticket_fg_title_city, R.id.Ticket_fg_title_film, R.id.Ticket_fg_title_cinema, R.id.Ticket_fg_title_Search})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.Ticket_fg_title_city:// 选择城市
                break;
            case R.id.Ticket_fg_title_film:// 电影
                if (!boo) {
                    initcolor(TicketFgTitleFilm);
                    initcolorhui(TicketFgTitleCinema);
                    boo = true;
                }


                break;
            case R.id.Ticket_fg_title_cinema:// 影视
                if (boo){

                    initcolor(TicketFgTitleCinema);
                    initcolorhui(TicketFgTitleFilm);
                    boo = false;
                }

                break;
            case R.id.Ticket_fg_title_Search:// 搜索
                break;
        }
    }

    private void initcolor(TextView textView) {
        int bai = getResources().getColor(R.color.colorbai);
        int back = getResources().getColor(R.color.colorback);
        textView.setTextColor(bai);
        textView.setBackgroundColor(back);
    }

    private void initcolorhui(TextView textView) {
        int bai = getResources().getColor(R.color.colorhui);
        int back = getResources().getColor(R.color.colorhuiback);
        textView.setTextColor(bai);
        textView.setBackgroundColor(back);
    }

}
