package test.jiyun.com.shiguangdemo.modle.entivity;



import java.util.HashMap;
import java.util.Map;

import test.jiyun.com.shiguangdemo.modle.Urls;
import test.jiyun.com.shiguangdemo.modle.callback.MyCallback;
import test.jiyun.com.shiguangdemo.modle.https.HttpFactory;


/**
 * Created by lizhuofang on 2017/6/14.
 */

public class ClassBiz implements InterBiz {
    //实现业务处理的方法
    //正在热映
    @Override
    public void getBuyticketNow(int locationId, MyCallback myCallBack) {
        Map<String,String> map=new HashMap<>();
        map.put("locationId", String.valueOf(locationId));
        HttpFactory.getFactory().Get(Urls.SHOPPINGNOW,map,myCallBack);
    }

    //城市
    @Override
    public void getcity(MyCallback myCallBack) {
        Map<String,String> map=new HashMap<>();
        HttpFactory.getFactory().Get(Urls.CITY,map,myCallBack);
    }
//电影 --  正在热映
    @Override
    public void getNowFire(int locationId, MyCallback myCallBack) {
        Map<String,String> map=new HashMap<>();
        map.put("locationId", String.valueOf(locationId));
        HttpFactory.getFactory().Get(Urls.NOWISHIT,map,myCallBack);

    }

    //购物车为空
    @Override
    public void getShopcarNull(int pageIndex,MyCallback myCallBack) {
        Map<String,String> map=new HashMap<>();
        map.put("pageIndex", String.valueOf(pageIndex));
        HttpFactory.getFactory().Get(Urls.SHOPPINGCARNULL,map,myCallBack);

    }
// 电影 -- 即将上映
    @Override
    public void getMoviesSoon(int locationId, MyCallback myCallBack) {
        Map<String,String> map=new HashMap<>();
        map.put("locationId", String.valueOf(locationId));
        HttpFactory.getFactory().Get(Urls.COMINGSOON,map,myCallBack);
    }

    //影院 -- 全部
    @Override
    public void getBuyCinmera(int locationId, MyCallback myCallBack) {
        Map<String,String> map=new HashMap<>();
        map.put("locationId", String.valueOf(locationId));
        HttpFactory.getFactory().Get(Urls.CinmeraALL,map,myCallBack);
    }

    //商城上半部分
    @Override
    public void getMarkerTop(MyCallback myCallBack) {
        Map<String,String> map=new HashMap<>();
        HttpFactory.getFactory().Get(Urls.HALFPART,map,myCallBack);
    }

    //商城你可能感兴趣的
    @Override
    public void getMarkerInterest(int pageIndex, MyCallback myCallBack) {
        Map<String,String> map=new HashMap<>();
        map.put("pageIndex", String.valueOf(pageIndex));
        HttpFactory.getFactory().Get(Urls.INTERESTED,map,myCallBack);
    }

    //直播--重磅预约
    @Override
    public void getTelecastOrder(MyCallback myCallBack) {
        Map<String,String> map=new HashMap<>();
        HttpFactory.getFactory().Get(Urls.BLOCKBUSTER,map,myCallBack);
    }
    //直播--精彩回放
    @Override
    public void getTelecastPlayBack(int pageNo, int pageSize, MyCallback myCallBack) {
        Map<String,String> map=new HashMap<>();
        map.put("pageNo", String.valueOf(pageNo));
        map.put("pageSize", String.valueOf(pageSize));
        HttpFactory.getFactory().Get(Urls.REVIEWS,map,myCallBack);
    }

    @Override
    public void getPlayVideo(String clientId, int locationId, int liveId, MyCallback myCallBack) {
        Map<String,String> map=new HashMap<>();
        map.put("clientId", String.valueOf(clientId));
        map.put("locationId", String.valueOf(locationId));
        map.put("liveId", String.valueOf(liveId));
        HttpFactory.getFactory().Get(Urls.PLAYVIDEO,map,myCallBack);
    }

    @Override
    public void getTelecastComment(int commentId, int liveId, MyCallback myCallBack) {
        Map<String,String> map=new HashMap<>();
        map.put("commentId", String.valueOf(commentId));
        map.put("liveId", String.valueOf(liveId));
        HttpFactory.getFactory().Get(Urls.REVIEWSCOMMENT,map,myCallBack);
    }

    @Override
    public void getTelecastNews(int pageIndex, int movieId, MyCallback myCallBack) {
        Map<String,String> map=new HashMap<>();
        map.put("pageIndex", String.valueOf(pageIndex));
        map.put("movieId", String.valueOf(movieId));
        HttpFactory.getFactory().Get(Urls.TELECASTNEW,map,myCallBack);
    }

}
