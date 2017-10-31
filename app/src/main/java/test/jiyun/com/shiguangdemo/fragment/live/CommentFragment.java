package test.jiyun.com.shiguangdemo.fragment.live;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;

import com.androidkun.PullToRefreshRecyclerView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.adapter.live.video.CommentAdapter;
import test.jiyun.com.shiguangdemo.base.BaseFragment;
import test.jiyun.com.shiguangdemo.modle.bean.live.video.CommentBean;
import test.jiyun.com.shiguangdemo.modle.callback.MyCallback;
import test.jiyun.com.shiguangdemo.modle.entivity.ClassBiz;
import test.jiyun.com.shiguangdemo.modle.entivity.InterBiz;

import static java.security.AccessController.getContext;

/**
 * Created by liuwangping on 2017/6/30.
 */

public class CommentFragment extends BaseFragment {
    private PullToRefreshRecyclerView comment_pullrv;
    private List<CommentBean.DataBean.ListBean> listBeanList = new ArrayList<>();
    private CommentAdapter commentAdapter;
    private InterBiz commentmodel = new ClassBiz();


    @Override
    protected int getLayoutViwe() {
        return R.layout.fragment_telecast_comment;
    }

    @Override
    protected void initView(View view) {
        comment_pullrv = (PullToRefreshRecyclerView) view.findViewById(R.id.comment_pullrv);
        comment_pullrv.setLayoutManager(new LinearLayoutManager(getContext()));
        comment_pullrv.setHasFixedSize(true);
        commentAdapter = new CommentAdapter(getContext(), listBeanList);
        comment_pullrv.setAdapter(commentAdapter);
    }

    @Override
    protected void initloadData() {
        commentmodel.getTelecastComment(0, 665, new MyCallback() {
            @Override
            public void successful(String response) {
                Log.e("Comment成功", response);
                Gson gson = new Gson();
                CommentBean commentBean = gson.fromJson(response, CommentBean.class);
                List<CommentBean.DataBean.ListBean> list = commentBean.getData().getList();
                listBeanList.addAll(list);
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        commentAdapter.notifyDataSetChanged();
                    }
                });
            }

            @Override
            public void failure(String errorMessage) {

            }
        });
    }


    @Override
    protected void initListener() {

    }


}
