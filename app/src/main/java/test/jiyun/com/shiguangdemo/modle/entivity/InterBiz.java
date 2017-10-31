package test.jiyun.com.shiguangdemo.modle.entivity;


import test.jiyun.com.shiguangdemo.modle.callback.MyCallback;

/**
 * Created by lizhuofang on 2017/6/14.
 */

public interface InterBiz {
    //业务处理
    void getBuyticketNow(int locationId, MyCallback myCallBack);

    void getcity(MyCallback myCallBack);

    void getNowFire(int locationId, MyCallback myCallBack);

    void getShopcarNull(int pageIndex, MyCallback myCllBack);

    void getMoviesSoon(int locationId, MyCallback myCallBack);

    void getBuyCinmera(int locationId, MyCallback myCallBack);

    void getMarkerTop(MyCallback myCallBack);

    void getMarkerInterest(int pageIndex, MyCallback myCallBack);

    void getTelecastOrder(MyCallback myCallBack);

    void getTelecastPlayBack(int pageNo, int pageSize, MyCallback myCallBack);

    void getPlayVideo(String clientId, int locationId, int liveId, MyCallback myCallBack);

    void getTelecastComment(int commentId, int liveId, MyCallback myCallBack);

    void getTelecastNews(int pageIndex, int movieId, MyCallback myCallBack);

}
