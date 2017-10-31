package test.jiyun.com.shiguangdemo.adapter.live;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.modle.bean.live.BackBean;

/**
 * Created by liuwangping on 2017/6/22.
 */

public class BackRvAdapter extends RecyclerView.Adapter {
    private Context context;
    private ArrayList<BackBean.DataBean> list;

    public BackRvAdapter(Context context, ArrayList<BackBean.DataBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_teletast_playback, null);

        return new MyHolder(view);
    }

    public interface OnListener {
        void onItemClick(int position);
    }

    public OnListener listener;

    public void setOnListener(OnListener listener) {
        this.listener = listener;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        MyHolder myHolder = (MyHolder) holder;
        BackBean.DataBean bean = list.get(position);
        Glide.with(context).load(bean.getImage()).into(myHolder.imageView);
        myHolder.title.setText(bean.getTitle());
        myHolder.count.setText(bean.getStatistic() + "人已观看");
        myHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != listener) {
                    listener.onItemClick(position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView title, count;

        public MyHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.item_teletast_playback_img);
            title = (TextView) itemView.findViewById(R.id.item_teletast_playback_title);
            count = (TextView) itemView.findViewById(R.id.item_teletast_playback_count);

        }
    }
}
