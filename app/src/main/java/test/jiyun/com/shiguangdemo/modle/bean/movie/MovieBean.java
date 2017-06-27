package test.jiyun.com.shiguangdemo.modle.bean.movie;

import java.util.List;

/**
 * 项目名称:时光网
 * 类描述:  分类标题和每日佳片
 * 创建人:LENOVO
 * 创建时间:2017-6-24 19:47
 * 修改人:
 * 修改内容:
 */

public class MovieBean {

    /**
     * code : 1
     * data : {"category":[{"areas":"全部地区","genreTypes":"全部类型","name":"全部","years":"全部年代"},{"areas":"","genreTypes":"动作","name":"动作","years":""},{"areas":"中国","genreTypes":"喜剧","name":"喜剧","years":"2010"},{"areas":"","genreTypes":"科幻","name":"科幻","years":""},{"areas":"","genreTypes":"动画","name":"动画","years":""},{"areas":"美国","genreTypes":"","name":"美国","years":""},{"areas":"中国","genreTypes":"","name":"中国","years":""},{"areas":"日本","genreTypes":"","name":"日本","years":""},{"areas":"韩国","genreTypes":"","name":"韩国","years":""},{"areas":"","genreTypes":"","name":"90年代","years":"90年代"}],"goodMovie":{"gmId":0,"gmType":3,"image":"http://img5.mtime.cn/mg/2017/06/22/100259.82299821.jpg","title":"相爱逢时，是何等的幸运，或许每个人心中都有一个《昼颜》的结局","url":"https://m.mtime.cn/#!/movie/240384/"},"hotTopic":[{"bgImage":"http://img5.mtime.cn/mg/2017/06/14/112247.13704558.jpg","introduction":"","movieCount":100,"name":"《帝国》杂志新百大佳片","topId":1483},{"bgImage":"http://img5.mtime.cn/mg/2017/05/18/155301.67111661.jpg","introduction":"","movieCount":20,"name":"21世纪恐怖片TOP20","topId":1482},{"bgImage":"http://img5.mtime.cn/mg/2017/05/08/151819.95238321.jpg","introduction":"","movieCount":40,"name":"40部女同电影推荐","topId":1479},{"bgImage":"http://img5.mtime.cn/mg/2017/04/28/113749.26118309.jpg","introduction":"","movieCount":15,"name":"21世纪好莱坞歌舞片TOP15","topId":1473}]}
     * msg : 成功
     * showMsg :
     */

    private String code;
    private DataBean data;
    private String msg;
    private String showMsg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getShowMsg() {
        return showMsg;
    }

    public void setShowMsg(String showMsg) {
        this.showMsg = showMsg;
    }

    public static class DataBean {
        /**
         * category : [{"areas":"全部地区","genreTypes":"全部类型","name":"全部","years":"全部年代"},{"areas":"","genreTypes":"动作","name":"动作","years":""},{"areas":"中国","genreTypes":"喜剧","name":"喜剧","years":"2010"},{"areas":"","genreTypes":"科幻","name":"科幻","years":""},{"areas":"","genreTypes":"动画","name":"动画","years":""},{"areas":"美国","genreTypes":"","name":"美国","years":""},{"areas":"中国","genreTypes":"","name":"中国","years":""},{"areas":"日本","genreTypes":"","name":"日本","years":""},{"areas":"韩国","genreTypes":"","name":"韩国","years":""},{"areas":"","genreTypes":"","name":"90年代","years":"90年代"}]
         * goodMovie : {"gmId":0,"gmType":3,"image":"http://img5.mtime.cn/mg/2017/06/22/100259.82299821.jpg","title":"相爱逢时，是何等的幸运，或许每个人心中都有一个《昼颜》的结局","url":"https://m.mtime.cn/#!/movie/240384/"}
         * hotTopic : [{"bgImage":"http://img5.mtime.cn/mg/2017/06/14/112247.13704558.jpg","introduction":"","movieCount":100,"name":"《帝国》杂志新百大佳片","topId":1483},{"bgImage":"http://img5.mtime.cn/mg/2017/05/18/155301.67111661.jpg","introduction":"","movieCount":20,"name":"21世纪恐怖片TOP20","topId":1482},{"bgImage":"http://img5.mtime.cn/mg/2017/05/08/151819.95238321.jpg","introduction":"","movieCount":40,"name":"40部女同电影推荐","topId":1479},{"bgImage":"http://img5.mtime.cn/mg/2017/04/28/113749.26118309.jpg","introduction":"","movieCount":15,"name":"21世纪好莱坞歌舞片TOP15","topId":1473}]
         */

        private GoodMovieBean goodMovie;
        private List<CategoryBean> category;
        private List<HotTopicBean> hotTopic;

        public GoodMovieBean getGoodMovie() {
            return goodMovie;
        }

        public void setGoodMovie(GoodMovieBean goodMovie) {
            this.goodMovie = goodMovie;
        }

        public List<CategoryBean> getCategory() {
            return category;
        }

        public void setCategory(List<CategoryBean> category) {
            this.category = category;
        }

        public List<HotTopicBean> getHotTopic() {
            return hotTopic;
        }

        public void setHotTopic(List<HotTopicBean> hotTopic) {
            this.hotTopic = hotTopic;
        }

        public static class GoodMovieBean {
            /**
             * gmId : 0
             * gmType : 3
             * image : http://img5.mtime.cn/mg/2017/06/22/100259.82299821.jpg
             * title : 相爱逢时，是何等的幸运，或许每个人心中都有一个《昼颜》的结局
             * url : https://m.mtime.cn/#!/movie/240384/
             */

            private int gmId;
            private int gmType;
            private String image;
            private String title;
            private String url;

            public int getGmId() {
                return gmId;
            }

            public void setGmId(int gmId) {
                this.gmId = gmId;
            }

            public int getGmType() {
                return gmType;
            }

            public void setGmType(int gmType) {
                this.gmType = gmType;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class CategoryBean {
            /**
             * areas : 全部地区
             * genreTypes : 全部类型
             * name : 全部
             * years : 全部年代
             */

            private String areas;
            private String genreTypes;
            private String name;
            private String years;

            public String getAreas() {
                return areas;
            }

            public void setAreas(String areas) {
                this.areas = areas;
            }

            public String getGenreTypes() {
                return genreTypes;
            }

            public void setGenreTypes(String genreTypes) {
                this.genreTypes = genreTypes;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getYears() {
                return years;
            }

            public void setYears(String years) {
                this.years = years;
            }
        }

        public static class HotTopicBean {
            /**
             * bgImage : http://img5.mtime.cn/mg/2017/06/14/112247.13704558.jpg
             * introduction :
             * movieCount : 100
             * name : 《帝国》杂志新百大佳片
             * topId : 1483
             */

            private String bgImage;
            private String introduction;
            private int movieCount;
            private String name;
            private int topId;

            public String getBgImage() {
                return bgImage;
            }

            public void setBgImage(String bgImage) {
                this.bgImage = bgImage;
            }

            public String getIntroduction() {
                return introduction;
            }

            public void setIntroduction(String introduction) {
                this.introduction = introduction;
            }

            public int getMovieCount() {
                return movieCount;
            }

            public void setMovieCount(int movieCount) {
                this.movieCount = movieCount;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getTopId() {
                return topId;
            }

            public void setTopId(int topId) {
                this.topId = topId;
            }
        }
    }
}
