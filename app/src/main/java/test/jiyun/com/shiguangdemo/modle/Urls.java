package test.jiyun.com.shiguangdemo.modle;

/**
 * 项目名称:时光网
 * 类描述: 网络接口
 * 创建人:LENOVO
 * 创建时间:2017-6-22 15:32
 * 修改人:
 * 修改内容:
 */

public class Urls {


    //首页 -- 选择城市
    public static final String CITYLIST = "https://api-m.mtime.cn/Showtime/HotCitiesByCinema.api";

    //精选 -- 正在售票
    public static final String TICKET = "https://api-m.mtime.cn/PageSubArea/HotPlayMovies.api";

    //精选 -- 精彩直播还包含正版商城
    public static final String LIVE = "https://comm-api-m.mtime.cn/index/middleModule.api";

    //精选 -- 其他内容
    public static final String OTHER = "https://ticket-api-m.mtime.cn/choice/feed.api";

    //资讯  --
    public static final String INFORMATION = "https://ticket-api-m.mtime.cn/information/List.api";

    //选电影 -- 分类标题和每日佳片
    public static final String MOVIE = "https://ticket-api-m.mtime.cn/second/select/movie.api";

    //选电影 -- 推荐影单
    public static final String MOVIELIST = "https://ticket-api-m.mtime.cn/second/recommendMovie/list.api";

    //预告片
    public static final String PREVUE = "https://ticket-api-m.mtime.cn/discovery/trailerList.api";

    //影评
    public static final String FILM = "https://api-m.mtime.cn/MobileMovie/Review.api";

/**----------------------------------------------------------------------------------------------*/

    public static final String BASEURlTICKET = "https://ticket-api-m.mtime.cn/";

    //      2. 电影 -- 即将上映
    public static final String COMINGSOON = BASEURlTICKET + "movie/mobilemoviecoming.api";

    public static final String BASEURl = "https://api-m.mtime.cn/";

    // 精彩回放 -- 详情 -- 新闻
    public static final String TELECASTNEW = BASEURl + "Movie/News.api";

    //正在热映
    public static final String SHOPPINGNOW = BASEURl + "PageSubArea/HotPlayMovies.api";
    //选择城市
    public static final String CITY = BASEURl + "Showtime/HotCitiesByCinema.api";
    //    购票
    //      1.电影 --  正在热映
    public static final String NOWISHIT = BASEURl + "Showtime/LocationMovies.api";
    //      3.影院 -- 全部
    public static final String CinmeraALL = BASEURl + "OnlineLocationCinema/OnlineCinemasByCity.api";
    //             2. 商城 你可能感兴趣的
    public static final String INTERESTED = BASEURl + "ECommerce/RecommendProducts.api";
    //             4.商城 --- 购物车 -- 为空时
    public static final String SHOPPINGCARNULL = BASEURl + "ECommerce/RecommendProducts.api";


    //    商城
    //             1.  上半部分
    public static final String HALFPART = "https://mall-api-m.mtime.cn/mall/index.api";

    //       3.精彩回放 -- 详情
    public static final String REVIEWSDETAIL = "https://live-api-m.mtime.cn/live/detail";
    //       4.精彩回放 --- 详情 -- 评论
    public static final String REVIEWSCOMMENT = "https://live-api-m.mtime.cn/comment/list";



    //    直播
    //       1. 重磅预约
    public static final String BLOCKBUSTER = "https://live-api-m.mtime.cn/live_room/getLiveList";
    //       2.精彩回放
    public static final String REVIEWS = "https://live-api-m.mtime.cn/live_room/getWonderVodList";

    //直播精彩回放 -- 详情视频
    public static final String  PLAYVIDEO="https://live-api-m.mtime.cn/live/detail";







}
