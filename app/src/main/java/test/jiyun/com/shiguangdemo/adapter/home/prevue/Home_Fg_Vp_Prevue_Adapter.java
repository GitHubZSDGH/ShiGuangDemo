package test.jiyun.com.shiguangdemo.adapter.home.prevue;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.androidkun.adapter.BaseAdapter;
import com.androidkun.adapter.ViewHolder;
import com.bumptech.glide.Glide;

import java.util.List;

import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.modle.bean.prevue.PrevueBean;

/**
 * 项目名称:时光网
 * 类描述: 预告片 的适配器
 * 创建人:LENOVO
 * 创建时间:2017-6-26 20:20
 * 修改人:
 * 修改内容:
 */

public class Home_Fg_Vp_Prevue_Adapter  extends BaseAdapter<PrevueBean.DataBean.TrailersBean>{
//

    public Home_Fg_Vp_Prevue_Adapter(Context context,  List<PrevueBean.DataBean.TrailersBean> datas) {
        super(context, R.layout.home_fg_vp_prevue_item, datas);
    }

    @Override
    public void convert(ViewHolder holder, PrevueBean.DataBean.TrailersBean trailersBean) {
        holder.setText(R.id.Home_fg_Vp_Parent_Title,trailersBean.getMovieName());

        ImageView imageView = holder.getView(R.id.Home_fg_Vp_parent_image);
        Glide.with(context).load(trailersBean.getCoverImg()).into(imageView);

    }
}
