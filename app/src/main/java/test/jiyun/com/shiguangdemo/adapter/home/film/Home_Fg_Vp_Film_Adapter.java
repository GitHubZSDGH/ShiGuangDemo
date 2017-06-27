package test.jiyun.com.shiguangdemo.adapter.home.film;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.view.View;
import android.widget.ImageView;

import com.androidkun.adapter.BaseAdapter;
import com.androidkun.adapter.ViewHolder;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.BitmapImageViewTarget;

import java.util.List;

import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.modle.bean.film.FilmBean;

import static android.R.attr.x;

/**
 * 项目名称:时光网
 * 类描述:
 * 创建人:LENOVO
 * 创建时间:2017-6-26 23:44
 * 修改人:
 * 修改内容:
 */

public class Home_Fg_Vp_Film_Adapter extends BaseAdapter<FilmBean> {

    public Home_Fg_Vp_Film_Adapter(Context context, List<FilmBean> datas) {
        super(context, R.layout.home_fg_vp_film_item, datas);
    }

    @Override
    public void convert(ViewHolder holder, FilmBean filmBean) {

        holder.setText(R.id.Home_fg_Vp_Film_title, filmBean.getTitle());
        holder.setText(R.id.Home_fg_Vp_Film_Body, filmBean.getSummary());
        ImageView image = holder.getView(R.id.Home_fg_Vp_Film_image);
        Glide.with(context).load(filmBean.getRelatedObj().getImage()).into(image);
        holder.setText(R.id.Home_fg_vp_Film_name, filmBean.getRelatedObj().getTitle());
        holder.setText(R.id.Home_fg_vp_Film_english, filmBean.getRelatedObj().getTitleEn());

        final ImageView userimage = holder.getView(R.id.Home_fg_Vp_Film_authorImage);
        Glide.with(context)
                .load(filmBean.getUserImage())
                .asBitmap()
                .placeholder(R.drawable.ic_tab_my01)// 设置默认图片
                .centerCrop()
                .into(new BitmapImageViewTarget(userimage) {
                    @Override
                    protected void setResource(Bitmap resource) {
                        RoundedBitmapDrawable ciDrawable = RoundedBitmapDrawableFactory.create(context.getResources(), resource);//裁剪成圆形图片
                        ciDrawable.setCircular(true);// 设置循环
                        userimage.setImageDrawable(ciDrawable);
                    }
                });

        holder.setText(R.id.Home_fg_Vp_Film_authorName, filmBean.getNickname());
        holder.setText(R.id.Home_fg_Vp_Film_score, "评" + filmBean.getRating() + "分");
        holder.setText(R.id.Home_fg_Vp_Film_Conmment, String.valueOf("  " + filmBean.getCommentCount()));

        //右下角的三个点的监听
        holder.setOnclickListener(R.id.Home_fg_Vp_Film_sandian, new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
