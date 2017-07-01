package test.jiyun.com.shiguangdemo.modle.bean.ticket;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


import java.util.ArrayList;

import test.jiyun.com.shiguangdemo.R;

/**
 * Created by liuwangping on 2017/6/21.
 */

public class SoonRVAdapter extends RecyclerView.Adapter {
    private Context context;
    private ArrayList<SoonBean.DataBean.MoviecomingsBean> list;

    public SoonRVAdapter(Context context, ArrayList<SoonBean.DataBean.MoviecomingsBean> list) {
        this.context = context;
        this.list = list;
    }
    public interface OnListener{
        void onItemClick(int position);
        void onClick(int position);
    }
    public OnListener onListener;

    public void setOnListener(OnListener onListener) {
        this.onListener =onListener;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_buytickets_soon_type2,null);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        MyHolder myHolder= (MyHolder) holder;
        SoonBean.DataBean.MoviecomingsBean data=list.get(position);
        myHolder.date.setText(data.getRMonth()+"月"+data.getRDay()+"日");
        myHolder.title.setText(data.getTitle());
        myHolder.count.setText(data.getWantedCount()+"人想看");
        myHolder.type.setText("-"+data.getType());
        myHolder.actors.setText(data.getActors());
        Glide.with(context).load(data.getImage()).into(myHolder.imageView);
        myHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null!=onListener) {
                    onListener.onItemClick(position);
                }
            }
        });

        myHolder.presell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null!=onListener) {
                    onListener.onClick(position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyHolder extends RecyclerView.ViewHolder {
        private TextView date,title,count,type,actors;
        private ImageView imageView;
        private Button presell;
        public MyHolder(View itemView) {
            super(itemView);
            imageView= (ImageView) itemView.findViewById(R.id.item_soon_img);
            date= (TextView) itemView.findViewById(R.id.item_soon_date);
            title= (TextView) itemView.findViewById(R.id.item_soon_title);
            count= (TextView) itemView.findViewById(R.id.item_soon_wantedCount);
            type= (TextView) itemView.findViewById(R.id.item_soon_type);
            actors= (TextView) itemView.findViewById(R.id.item_soon_actors);
            presell= (Button) itemView.findViewById(R.id.item_soon_presell);
        }
    }
}
