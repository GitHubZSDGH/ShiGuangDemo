package test.jiyun.com.shiguangdemo.adapter.live;

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
import test.jiyun.com.shiguangdemo.modle.bean.live.OrderBean;

/**
 * Created by liuwangping on 2017/6/22.
 */

public class OrderRVAdapter extends RecyclerView.Adapter {

    private Context context;
    private ArrayList<OrderBean.DataBean.LivePreviewsBean> list;

    public OrderRVAdapter(Context context, ArrayList<OrderBean.DataBean.LivePreviewsBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_telecast_order,null);
        return new OrderHolder(view);
    }
    public interface OnListener{
        void onItemClick(int position);
    }
    public OnListener listener;

    public void setOnListener(OnListener listener){
        this.listener=listener;
    }
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        OrderHolder orderHolder= (OrderHolder) holder;
        OrderBean.DataBean.LivePreviewsBean bean=list.get(position);
        Glide.with(context).load(bean.getImage()).into(orderHolder.imageView);
        orderHolder.title.setText(bean.getTitle());
        orderHolder.date.setText(bean.getStartTime()+"直播");
        orderHolder.people.setText(bean.getStatistic()+"人预约");
        orderHolder.order_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null!=listener) {
                    listener.onItemClick(position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class OrderHolder extends RecyclerView.ViewHolder {
        private TextView title,date,people;
        private ImageView imageView;
        private Button order_btn;
        public OrderHolder(View itemView) {
            super(itemView);
            imageView= (ImageView) itemView.findViewById(R.id.item_order_img);
            title= (TextView) itemView.findViewById(R.id.item_order_title);
            date= (TextView) itemView.findViewById(R.id.item_order_date);
            people= (TextView) itemView.findViewById(R.id.item_order_people);
            order_btn= (Button) itemView.findViewById(R.id.item_order_btn);
        }
    }
}
