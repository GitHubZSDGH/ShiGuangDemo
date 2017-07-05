package test.jiyun.com.shiguangdemo.adapter.home;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.modle.bean.CityListBean;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * 项目名称:时光网
 * 类描述:  选择城市列表适配器
 * 创建人:LENOVO
 * 创建时间:2017-6-30 21:12
 * 修改人:
 * 修改内容:
 */

public class CityActivityAdapter extends BaseAdapter {

    private Context context;
    private List<CityListBean.PBean> citylist;

    public CityActivityAdapter(Context context, List<CityListBean.PBean> citylist) {
        this.context = context;
        this.citylist = citylist;
    }

    @Override
    public int getCount() {
        return citylist.size();
    }

    @Override
    public Object getItem(int position) {
        return citylist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = View.inflate(context, R.layout.activity_city_item, null);
        }
        CityListBean.PBean cityBean = citylist.get(position);
//        List<CityListBean.PBean> p = cityBean.getP();
        ViewHolder holder = new ViewHolder(convertView);
//        for (CityListBean.PBean pBean : p) {
            holder.getViewHolder(convertView).tv_item_name.setText(cityBean.getN());
//        }
        // 当前条目对应的字母和上一个条目中的字母一样,就隐藏当前字母对应的条目
        if (position > 0) {
            String lastLetter = citylist.get(position - 1).getPinyinFull().charAt(0) + "";
            String currentLetter = citylist.get(position).getPinyinFull().charAt(0) + "";
            if (lastLetter.equals(currentLetter)){
                holder.getViewHolder(convertView).tv_item_letter.setVisibility(View.GONE);
            }else {
                // 为了防止被隐藏的黑色条目复用，出现字母对应条目显示不全问题，所以就将隐藏的黑色字母条目重新显示
                holder.getViewHolder(convertView).tv_item_letter.setVisibility(View.VISIBLE);
                holder.getViewHolder(convertView).tv_item_letter.setText(cityBean.getPinyinFull().charAt(0)+"");
            }

        }else {
            holder.getViewHolder(convertView).tv_item_letter.setVisibility(View.VISIBLE);
            holder.getViewHolder(convertView).tv_item_letter.setText(cityBean.getPinyinFull().charAt(0)+"");

        }


        return convertView;
    }

    private class ViewHolder {

        private TextView tv_item_name;
        private TextView tv_item_letter;

        public ViewHolder(View convertView) {
            tv_item_letter = (TextView) convertView
                    .findViewById(R.id.tv_letter);
            tv_item_name = (TextView) convertView.findViewById(R.id.tv_name);
        }

        public ViewHolder getViewHolder(View convertView) {
            ViewHolder holder = (ViewHolder) convertView.getTag();
            if (holder == null) {
                holder = new ViewHolder(convertView);
                convertView.setTag(holder);
            }
            return holder;
        }


    }


}
