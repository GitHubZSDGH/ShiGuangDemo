package test.jiyun.com.shiguangdemo.modle.entivity;

import java.util.HashMap;
import java.util.Map;

import test.jiyun.com.shiguangdemo.modle.Urls;
import test.jiyun.com.shiguangdemo.modle.callback.MyCallback;
import test.jiyun.com.shiguangdemo.modle.https.HttpFactory;

/**
 * 项目名称:时光网
 * 类描述:首页网络接口实现类
 * 创建人:LENOVO
 * 创建时间:2017-6-22 17:17
 * 修改人:
 * 修改内容:
 */

public class HomeModel implements IHomeModel {

    /**
     * 精选 -- 正在售票
     *
     * @param locationId
     * @param callback
     */
    @Override
    public void ticket(int locationId, MyCallback callback) {
        Map<String, String> tick = new HashMap<>();
        tick.put("locationId", String.valueOf(locationId));

        HttpFactory.getFactory().Get(Urls.TICKET,tick,callback);

    }

    /**
     *
     * 精选 -- 精彩直播和正版商城
     *
     * @param callback
     */
    @Override
    public void live(MyCallback callback) {
        HttpFactory.getFactory().wGet(Urls.LIVE,callback);
    }

    /**
     * 精选 -- 其他内容
     *
     * @param pageIndex
     * @param callback
     */
    @Override
    public void other(int pageIndex, MyCallback callback) {
        Map<String,String> page = new HashMap<>();
        page.put("pageIndex", String.valueOf(pageIndex));

        HttpFactory.getFactory().Get(Urls.OTHER,page,callback);
    }

    /**
     * 选电影 -- 分类标题和每日佳片
     * @param callback
     */
    @Override
    public void movie(MyCallback callback) {
        HttpFactory.getFactory().wGet(Urls.MOVIE,callback);
    }

    /**
     * 选电影 -- 推荐影单
     * @param pageIndex
     * @param callback
     */
    @Override
    public void movielist(int pageIndex, MyCallback callback) {
        Map<String,String> mo = new HashMap<>();
        mo.put("pageIndex", String.valueOf(pageIndex));
        HttpFactory.getFactory().Get(Urls.MOVIELIST,mo,callback);

    }

    /**
     * 预告片
     * @param callback
     */
    @Override
    public void prevue(MyCallback callback) {
        HttpFactory.getFactory().wGet(Urls.PREVUE,callback);
    }

    /**
     * 影评
     * @param needTop
     * @param callback
     */
    @Override
    public void film(String needTop, MyCallback callback) {
        Map<String,String> map = new HashMap<>();
        map.put("needTop",needTop);
        HttpFactory.getFactory().Get(Urls.FILM,map,callback);
    }
}
