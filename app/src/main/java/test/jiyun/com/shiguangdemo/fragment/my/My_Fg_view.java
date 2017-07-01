package test.jiyun.com.shiguangdemo.fragment.my;


import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.activity.LoginActivity;
import test.jiyun.com.shiguangdemo.base.BaseFragment;

/**
 * 项目名称: 时光网
 * 类描述:
 * 创建人:lenovo
 * 创建时间:2017/6/28 11:46
 * 修改人:
 * 修改内容:
 */

public class My_Fg_view extends BaseFragment implements View.OnClickListener {
    private ImageButton fragment_me_login_user;
    private Button fragment_me_login,fragment_me_register;
    private LinearLayout fragment_me_filmreview,fragment_me_see,fragment_me_misssee,
            fragment_home_attention,fragment_me_collect;
    private LinearLayout me_menu_coupon,me_menu_red_packet,me_menu_giftblock,me_menu_balance;

    private LinearLayout fragment_me_ticketindent,fragment_me_goodsindent,fragment_me_shoppingcart,
            fragment_me_activity,fragment_me_livetelecast,fragment_me_feedback,fragment_me_set,
            fragment_me_aboutwe;
    @Override
    protected int getLayoutViwe() {
        return R.layout.fragment_me;
    }

    @Override
    protected void initView(View view) {
        fragment_me_login_user = (ImageButton)view.findViewById(R.id.fragment_me_login_user);
        fragment_me_login_user.setOnClickListener(this);
        fragment_me_login = (Button) view.findViewById(R.id.fragment_me_login);
        fragment_me_login.setOnClickListener(this);
        fragment_me_register = (Button)view.findViewById(R.id.fragment_me_register);
        fragment_me_register.setOnClickListener(this);
        fragment_me_filmreview = (LinearLayout) view.findViewById(R.id.fragment_me_filmreview);
        fragment_me_filmreview.setOnClickListener(this);
        fragment_me_see = (LinearLayout) view.findViewById(R.id.fragment_me_see);
        fragment_me_see.setOnClickListener(this);
        fragment_me_misssee = (LinearLayout)view.findViewById(R.id.fragment_me_misssee);
        fragment_me_misssee.setOnClickListener(this);
        fragment_home_attention = (LinearLayout)view.findViewById(R.id.fragment_home_attention);
        fragment_home_attention.setOnClickListener(this);
        fragment_me_collect = (LinearLayout) view.findViewById(R.id.fragment_me_collect);
        fragment_me_collect.setOnClickListener(this);

        me_menu_coupon = (LinearLayout) view.findViewById(R.id.me_menu_coupon);
        me_menu_coupon.setOnClickListener(this);
        me_menu_red_packet = (LinearLayout) view.findViewById(R.id.me_menu_red_packet);
        me_menu_red_packet.setOnClickListener(this);
        me_menu_giftblock = (LinearLayout) view.findViewById(R.id.me_menu_giftblock);
        me_menu_giftblock.setOnClickListener(this);
        me_menu_balance = (LinearLayout)view.findViewById(R.id.me_menu_balance);
        me_menu_balance.setOnClickListener(this);

        fragment_me_ticketindent = (LinearLayout)view.findViewById(R.id.fragment_me_ticketindent);
        fragment_me_ticketindent.setOnClickListener(this);
        fragment_me_goodsindent = (LinearLayout) view.findViewById(R.id.fragment_me_goodsindent);
        fragment_me_goodsindent.setOnClickListener(this);
        fragment_me_shoppingcart = (LinearLayout)view.findViewById(R.id.fragment_me_shoppingcart);
        fragment_me_shoppingcart.setOnClickListener(this);
        fragment_me_activity = (LinearLayout)view.findViewById(R.id.fragment_me_activity);
        fragment_me_activity.setOnClickListener(this);
        fragment_me_livetelecast = (LinearLayout)view.findViewById(R.id.fragment_me_livetelecast);
        fragment_me_livetelecast.setOnClickListener(this);
        fragment_me_feedback = (LinearLayout) view.findViewById(R.id.fragment_me_feedback);
        fragment_me_feedback.setOnClickListener(this);
        fragment_me_set = (LinearLayout) view.findViewById(R.id.fragment_me_set);
        fragment_me_set.setOnClickListener(this);
        fragment_me_aboutwe = (LinearLayout) view.findViewById(R.id.fragment_me_aboutwe);
        fragment_me_aboutwe.setOnClickListener(this);
    }

    @Override
    protected void initloadData() {

    }

    @Override
    protected void initListener() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fragment_me_login_user:

                break;
            case R.id.fragment_me_login:
                Intent loginintent=new Intent(getContext(), LoginActivity.class);
                startActivity(loginintent);
                break;
            case R.id.fragment_me_register:
//                Intent registerintent=new Intent(getContext(),RegisterActivity.class);
//                startActivity(registerintent);
                break;
            case R.id.fragment_me_filmreview:
                Intent filmintent=new Intent(getContext(), LoginActivity.class);
                startActivity(filmintent);
                break;
            case R.id.fragment_me_see:
                Intent seeintent=new Intent(getContext(), LoginActivity.class);
                startActivity(seeintent);
                break;
            case R.id.fragment_me_misssee:
                Intent missseeintent=new Intent(getContext(), LoginActivity.class);
                startActivity(missseeintent);
                break;
            case R.id.fragment_home_attention:
                Intent attentionintent=new Intent(getContext(), LoginActivity.class);
                startActivity(attentionintent);
                break;
            case R.id.fragment_me_collect:
                Intent collectintent=new Intent(getContext(), LoginActivity.class);
                startActivity(collectintent);
                break;
            case R.id.me_menu_coupon:
                Intent couponintent=new Intent(getContext(), LoginActivity.class);
                startActivity(couponintent);
                break;
            case R.id.me_menu_red_packet:

                break;

            case R.id.me_menu_giftblock:
                Intent giftblockintent=new Intent(getContext(), LoginActivity.class);
                startActivity(giftblockintent);
                break;
            case R.id.me_menu_balance:

                break;
            case R.id.fragment_me_ticketindent:
                Intent ticketindent=new Intent(getContext(), LoginActivity.class);
                startActivity(ticketindent);
                break;
            case R.id.fragment_me_goodsindent:
                Intent goodsindent=new Intent(getContext(), LoginActivity.class);
                startActivity(goodsindent);
                break;
            case R.id.fragment_me_shoppingcart:
//                Intent shoppingcart=new Intent(getContext(), ShopCarActivity.class);
//                startActivity(shoppingcart);

                break;
            case R.id.fragment_me_activity:
                Intent activity=new Intent(getContext(), LoginActivity.class);
                startActivity(activity);
                break;
            case R.id.fragment_me_livetelecast:
                Intent livetelecast=new Intent(getContext(), LoginActivity.class);
                startActivity(livetelecast);
                break;

            case R.id.fragment_me_feedback:

                break;
            case R.id.fragment_me_set:

                break;
            case R.id.fragment_me_aboutwe:
//                Intent aboutwe=new Intent(getContext(), AboutActivity.class);
//                startActivity(aboutwe);
                break;
        }
    }
}
