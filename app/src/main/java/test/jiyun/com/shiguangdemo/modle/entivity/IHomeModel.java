package test.jiyun.com.shiguangdemo.modle.entivity;

import test.jiyun.com.shiguangdemo.modle.callback.MyCallback;

/**
 * 项目名称:时光网
 * 类描述: 首页网络接口
 * 创建人:LENOVO
 * 创建时间:2017-6-22 15:28
 * 修改人:
 * 修改内容:
 */

public interface IHomeModel {


    //精选 -- 正在售票
    void  ticket(int locationId,MyCallback callback);

    //精选 -- 精彩直播和正版商城
    void live(MyCallback callback);

    //精选 -- 其他内容
    void other(int pageIndex, MyCallback callback);

    //选电影 -- 分类标题和每日佳片
    void movie(MyCallback callback);

    //选电影 -- 推荐影单
    void movielist(int pageIndex,MyCallback callback);

    //预告片
    void prevue(MyCallback callback);

    //影评
    void film(String needTop,MyCallback callback);

    //首页 -- 选择城市
    void citylist(MyCallback callback);

}
