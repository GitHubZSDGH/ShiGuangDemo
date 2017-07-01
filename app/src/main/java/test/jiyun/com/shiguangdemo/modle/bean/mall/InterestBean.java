package test.jiyun.com.shiguangdemo.modle.bean.mall;

import java.util.List;

/**
 * Created by liuwangping on 2017/6/22.
 */

public class InterestBean {

    /**
     * count : 100
     * goodsIds : 103439,103430,103459,103438,103443,103442,103445,103444,103456,103440,
     * goodsList : [{"background":"#25ACBD","goodsId":103439,"iconText":"新品","image":"http://img31.mtime.cn/mg/2016/08/09/183647.79225990.jpg","longName":"环保材质 轻巧便携 炫酷时尚 绿色出行","marketPrice":26800,"minSalePrice":18800,"name":"盗墓笔记环保时尚手袋","url":"https://mall-wv.mtime.cn/#!/commerce/item/103439/"},{"background":"#25ACBD","goodsId":103430,"iconText":"新品","image":"http://img31.mtime.cn/mg/2016/08/09/182222.25398042.jpg","longName":"小巧便携 懒人必备 炫酷神兽 角度随心","marketPrice":7800,"minSalePrice":5500,"name":"盗墓笔记神兽手机支架","url":"https://mall-wv.mtime.cn/#!/commerce/item/103430/"},{"background":"#25ACBD","goodsId":103459,"iconText":"新品","image":"http://img31.mtime.cn/mg/2016/08/19/172504.63555149.jpg","longName":"可动素体 还原经典造型","marketPrice":186000,"minSalePrice":186000,"name":"现货-NBA科比3.0人偶","url":"https://mall-wv.mtime.cn/#!/commerce/item/103459/"},{"background":"#25ACBD","goodsId":103438,"iconText":"新品","image":"http://img31.mtime.cn/mg/2016/08/09/183835.77156164.jpg","longName":"创意刮画 新意十足 生死同行 探险不停","marketPrice":16800,"minSalePrice":11800,"name":"生死同行之创意刮画","url":"https://mall-wv.mtime.cn/#!/commerce/item/103438/"},{"background":"#25ACBD","goodsId":103443,"iconText":"新品","image":"http://img31.mtime.cn/mg/2016/08/17/151243.87418249.jpg","longName":"纱布材质卡通印花 柔软亲肤 呵护肌肤","marketPrice":7800,"minSalePrice":3590,"name":"轻松小熊甜点纱布纯棉面巾","url":"https://mall-wv.mtime.cn/#!/commerce/item/103443/"},{"background":"#25ACBD","goodsId":103442,"iconText":"新品","image":"http://img31.mtime.cn/mg/2016/08/17/150021.99968276.jpg","longName":"纱布材质 卡通印花 柔软亲肤 呵护肌肤","marketPrice":23800,"minSalePrice":10890,"name":"轻松小熊甜点纱布纯棉浴巾","url":"https://mall-wv.mtime.cn/#!/commerce/item/103442/"},{"background":"#25ACBD","goodsId":103445,"iconText":"新品","image":"http://img31.mtime.cn/mg/2016/08/17/152001.72146921.jpg","longName":"优选材质 卡通印花 柔软亲肤 呵护肌肤","marketPrice":16800,"minSalePrice":5990,"name":"赛车总动员儿童浴巾","url":"https://mall-wv.mtime.cn/#!/commerce/item/103445/"},{"background":"#25ACBD","goodsId":103444,"iconText":"新品","image":"http://img31.mtime.cn/mg/2016/08/17/151556.52514811.jpg","longName":"纱布材质 卡通印花 柔软亲肤 呵护肌肤","marketPrice":4800,"minSalePrice":2190,"name":"轻松小熊甜点纱布纯棉方巾","url":"https://mall-wv.mtime.cn/#!/commerce/item/103444/"},{"background":"#25ACBD","goodsId":103456,"iconText":"新品","image":"http://img31.mtime.cn/mg/2016/08/15/170442.67141198.jpg","longName":"正品保证 Q萌玩偶 送礼佳品","marketPrice":21000,"minSalePrice":21000,"name":"轻松熊牛仔布手掌玩偶公仔","url":"https://mall-wv.mtime.cn/#!/commerce/item/103456/"},{"background":"#25ACBD","goodsId":103440,"iconText":"新品","image":"http://img31.mtime.cn/mg/2016/08/09/182448.43309314.jpg","longName":"随身便携 耐磨耐用 炫酷神兽 彰显个性","marketPrice":35000,"minSalePrice":24500,"name":"盗墓笔记蓝牙音乐智能水杯","url":"https://mall-wv.mtime.cn/#!/commerce/item/103440/"}]
     * pageCount : 10
     */

    private int count;
    private String goodsIds;
    private int pageCount;
    private List<GoodsListBean> goodsList;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getGoodsIds() {
        return goodsIds;
    }

    public void setGoodsIds(String goodsIds) {
        this.goodsIds = goodsIds;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public List<GoodsListBean> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<GoodsListBean> goodsList) {
        this.goodsList = goodsList;
    }

    public static class GoodsListBean {
        /**
         * background : #25ACBD
         * goodsId : 103439
         * iconText : 新品
         * image : http://img31.mtime.cn/mg/2016/08/09/183647.79225990.jpg
         * longName : 环保材质 轻巧便携 炫酷时尚 绿色出行
         * marketPrice : 26800
         * minSalePrice : 18800
         * name : 盗墓笔记环保时尚手袋
         * url : https://mall-wv.mtime.cn/#!/commerce/item/103439/
         */

        private String background;
        private int goodsId;
        private String iconText;
        private String image;
        private String longName;
        private int marketPrice;
        private int minSalePrice;
        private String name;
        private String url;

        public String getBackground() {
            return background;
        }

        public void setBackground(String background) {
            this.background = background;
        }

        public int getGoodsId() {
            return goodsId;
        }

        public void setGoodsId(int goodsId) {
            this.goodsId = goodsId;
        }

        public String getIconText() {
            return iconText;
        }

        public void setIconText(String iconText) {
            this.iconText = iconText;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getLongName() {
            return longName;
        }

        public void setLongName(String longName) {
            this.longName = longName;
        }

        public int getMarketPrice() {
            return marketPrice;
        }

        public void setMarketPrice(int marketPrice) {
            this.marketPrice = marketPrice;
        }

        public int getMinSalePrice() {
            return minSalePrice;
        }

        public void setMinSalePrice(int minSalePrice) {
            this.minSalePrice = minSalePrice;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
