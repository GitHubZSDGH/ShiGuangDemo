package test.jiyun.com.shiguangdemo.modle.bean;

import java.util.List;

/**
 * 项目名称:时光网
 * 类描述:
 * 创建人:LENOVO
 * 创建时间:2017-6-23 19:34
 * 修改人:
 * 修改内容:
 */

public class HomeTicketBean {

    /**
     * count : 15
     * movies : [{"actorName1":"迈克尔·法斯宾德","actorName2":"凯瑟琳·沃特森","btnText":"","commonSpecial":"人类殖民者陷入太空梦魇","directorName":"雷德利·斯科特","img":"http://img5.mtime.cn/mt/2017/06/13/151710.71675009_1280X720X2.jpg","is3D":false,"isDMAX":true,"isFilter":true,"isHot":false,"isIMAX":true,"isIMAX3D":false,"isNew":false,"length":116,"movieId":200612,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":91,"nearestShowDay":1498204800,"nearestShowtimeCount":240},"rDay":16,"rMonth":6,"rYear":2017,"ratingFinal":7.4,"titleCn":"异形：契约","titleEn":"Alien: Covenant","type":"恐怖 / 科幻 / 惊悚","wantedCount":6872},{"actorName1":"马克·沃尔伯格","actorName2":"安东尼·霍普金斯","btnText":"","commonSpecial":"擎天柱黑化震撼对决大黄蜂","directorName":"迈克尔·贝","img":"http://img5.mtime.cn/mt/2017/06/15/110834.10533198_1280X720X2.jpg","is3D":true,"isDMAX":true,"isFilter":false,"isHot":true,"isIMAX":false,"isIMAX3D":true,"isNew":true,"length":150,"movieId":211901,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":159,"nearestShowDay":1498204800,"nearestShowtimeCount":3282},"rDay":23,"rMonth":6,"rYear":2017,"ratingFinal":5.5,"titleCn":"变形金刚5：最后的骑士","titleEn":"Transformers: The Last Knight","type":"动作 / 冒险 / 科幻","wantedCount":10629},{"actorName1":"戴夫·帕特尔","actorName2":"鲁妮·玛拉","btnText":"","commonSpecial":"千山万水难阻返家乡愁","directorName":"加斯·戴维斯","img":"http://img5.mtime.cn/mt/2017/06/21/171258.38600757_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":119,"movieId":220307,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":85,"nearestShowDay":1498204800,"nearestShowtimeCount":209},"rDay":22,"rMonth":6,"rYear":2017,"ratingFinal":7.4,"titleCn":"雄狮","titleEn":"Lion","type":"家庭 / 剧情","wantedCount":846},{"actorName1":"杨培","actorName2":"尼玛扎堆","btnText":"","commonSpecial":"聚焦朝圣路上虔诚灵魂","directorName":"张杨","img":"http://img5.mtime.cn/mt/2017/05/19/103610.29135980_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":117,"movieId":228270,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":49,"nearestShowDay":1498204800,"nearestShowtimeCount":100},"rDay":20,"rMonth":6,"rYear":2017,"ratingFinal":7.7,"titleCn":"冈仁波齐","titleEn":"Paths of the Soul","type":"剧情","wantedCount":444},{"actorName1":"白举纲","actorName2":"热依扎","btnText":"","commonSpecial":"枪支犯罪拷问人性是非","directorName":"徐兵","img":"http://img5.mtime.cn/mt/2017/06/06/103146.35181508_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":true,"length":104,"movieId":244049,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":67,"nearestShowDay":1498204800,"nearestShowtimeCount":142},"rDay":23,"rMonth":6,"rYear":2017,"ratingFinal":-1,"titleCn":"缉枪","titleEn":"Strangers","type":"动作 / 剧情 / 犯罪","wantedCount":95},{"actorName1":"郭采洁","actorName2":"杨祐宁","btnText":"","commonSpecial":"台湾年度本土票房冠军","directorName":"邱瓈宽","img":"http://img5.mtime.cn/mt/2017/06/14/123007.67950376_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":true,"length":93,"movieId":230194,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":68,"nearestShowDay":1498204800,"nearestShowtimeCount":159},"rDay":23,"rMonth":6,"rYear":2017,"ratingFinal":6.6,"titleCn":"我不做大哥好多年","titleEn":"David Loman II","type":"剧情 / 喜剧","wantedCount":57},{"actorName1":"汤姆·克鲁斯","actorName2":"索菲亚·宝特拉","btnText":"","commonSpecial":"木乃伊大闹伦敦城阿汤哥迎战","directorName":"艾里克斯·库兹曼","img":"http://img5.mtime.cn/mt/2017/05/15/093545.56698457_1280X720X2.jpg","is3D":true,"isDMAX":true,"isFilter":true,"isHot":false,"isIMAX":false,"isIMAX3D":true,"isNew":false,"length":106,"movieId":207927,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":55,"nearestShowDay":1498204800,"nearestShowtimeCount":88},"rDay":9,"rMonth":6,"rYear":2017,"ratingFinal":5.8,"titleCn":"新木乃伊","titleEn":"The Mummy","type":"动作 / 冒险 / 奇幻","wantedCount":6328},{"actorName1":"阿米尔·汗","actorName2":"法缇玛·萨那·纱卡","btnText":"","commonSpecial":"阿米尔汗领衔摔跤娘子军","directorName":"尼特什·提瓦瑞","img":"http://img5.mtime.cn/mt/2017/05/05/095011.35177856_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":140,"movieId":232932,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":38,"nearestShowDay":1498204800,"nearestShowtimeCount":60},"rDay":5,"rMonth":5,"rYear":2017,"ratingFinal":8.6,"titleCn":"摔跤吧！爸爸","titleEn":"Dangal","type":"喜剧 / 动作 / 家庭","wantedCount":1921},{"actorName1":"盖尔·加朵","actorName2":"克里斯·派恩","btnText":"","commonSpecial":"用长腿踢开了DC雪耻大门","directorName":"派蒂·杰金斯","img":"http://img5.mtime.cn/mt/2017/06/07/165220.57640158_1280X720X2.jpg","is3D":true,"isDMAX":true,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":true,"isNew":false,"length":141,"movieId":40205,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":34,"nearestShowDay":1498204800,"nearestShowtimeCount":57},"rDay":2,"rMonth":6,"rYear":2017,"ratingFinal":7.6,"titleCn":"神奇女侠","titleEn":"Wonder Woman","type":"动作 / 冒险 / 奇幻","wantedCount":6003},{"actorName1":"霍建华","actorName2":"杨幂","btnText":"","commonSpecial":"","directorName":"尹鸿承","img":"http://img5.mtime.cn/mt/2017/06/22/103704.71288709_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":0,"movieId":230633,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":1,"nearestShowDay":1498723200,"nearestShowtimeCount":1},"rDay":30,"rMonth":6,"rYear":2017,"ratingFinal":-1,"titleCn":"逆时营救","titleEn":"Reset","type":"动作 / 科幻","wantedCount":1266},{"actorName1":"蔡卓妍","actorName2":"周柏豪","btnText":"","commonSpecial":"爱情里难容忍不信任","directorName":"邱礼涛","img":"http://img5.mtime.cn/mt/2017/06/20/141106.47547702_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":true,"length":97,"movieId":236269,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":44,"nearestShowDay":1498204800,"nearestShowtimeCount":91},"rDay":23,"rMonth":6,"rYear":2017,"ratingFinal":-1,"titleCn":"原谅他77次","titleEn":"77 Heartbreaks","type":"爱情","wantedCount":179},{"actorName1":"水田山葵","actorName2":"大原惠美","btnText":"","commonSpecial":"五人组闯南极拯救地球","directorName":"高桥敦史","img":"http://img5.mtime.cn/mt/2017/05/25/115319.63026558_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":101,"movieId":236948,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":9,"nearestShowDay":1498204800,"nearestShowtimeCount":11},"rDay":30,"rMonth":5,"rYear":2017,"ratingFinal":6.7,"titleCn":"哆啦A梦：大雄的南极冰冰凉大冒险","titleEn":"Eiga Doraemon: Nobita no Nankyoku Kachikochi Daibôken","type":"动画","wantedCount":675},{"actorName1":"李微漪","actorName2":"亦风","btnText":"","commonSpecial":"成都女孩\u201c千里送狼\u201d","directorName":"亦风","img":"http://img5.mtime.cn/mt/2017/06/08/104709.39137079_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":98,"movieId":245075,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":28,"nearestShowDay":1498204800,"nearestShowtimeCount":45},"rDay":16,"rMonth":6,"rYear":2017,"ratingFinal":6.7,"titleCn":"重返·狼群","titleEn":"Return To The Wolves","type":"剧情","wantedCount":161},{"actorName1":"约翰尼·德普","actorName2":"哈维尔·巴登","btnText":"","commonSpecial":"找回了观看系列第一部时的感觉","directorName":"乔阿吉姆·罗恩尼","img":"http://img5.mtime.cn/mt/2017/04/26/104828.45826051_1280X720X2.jpg","is3D":true,"isDMAX":true,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":true,"isNew":false,"length":129,"movieId":151657,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":28,"nearestShowDay":1498204800,"nearestShowtimeCount":44},"rDay":26,"rMonth":5,"rYear":2017,"ratingFinal":7.6,"titleCn":"加勒比海盗5：死无对证","titleEn":"Pirates of the Caribbean: Dead Men Tell No Tales","type":"动作 / 冒险 / 奇幻","wantedCount":5852},{"actorName1":"夏雨","actorName2":"闫妮","btnText":"","commonSpecial":"","directorName":"伍仕贤","img":"http://img5.mtime.cn/mt/2017/06/14/102756.92094848_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":0,"movieId":225821,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":1,"nearestShowDay":1498723200,"nearestShowtimeCount":1},"rDay":30,"rMonth":6,"rYear":2017,"ratingFinal":-1,"titleCn":"反转人生","titleEn":"Wished","type":"喜剧 / 奇幻","wantedCount":3422}]
     * totalCinemaCount : 188
     * totalComingMovie : 51
     * totalHotMovie : 52
     */

    private int count;
    private int totalCinemaCount;
    private int totalComingMovie;
    private int totalHotMovie;
    private List<MoviesBean> movies;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotalCinemaCount() {
        return totalCinemaCount;
    }

    public void setTotalCinemaCount(int totalCinemaCount) {
        this.totalCinemaCount = totalCinemaCount;
    }

    public int getTotalComingMovie() {
        return totalComingMovie;
    }

    public void setTotalComingMovie(int totalComingMovie) {
        this.totalComingMovie = totalComingMovie;
    }

    public int getTotalHotMovie() {
        return totalHotMovie;
    }

    public void setTotalHotMovie(int totalHotMovie) {
        this.totalHotMovie = totalHotMovie;
    }

    public List<MoviesBean> getMovies() {
        return movies;
    }

    public void setMovies(List<MoviesBean> movies) {
        this.movies = movies;
    }

    public static class MoviesBean {
        /**
         * actorName1 : 迈克尔·法斯宾德
         * actorName2 : 凯瑟琳·沃特森
         * btnText :
         * commonSpecial : 人类殖民者陷入太空梦魇
         * directorName : 雷德利·斯科特
         * img : http://img5.mtime.cn/mt/2017/06/13/151710.71675009_1280X720X2.jpg
         * is3D : false
         * isDMAX : true
         * isFilter : true
         * isHot : false
         * isIMAX : true
         * isIMAX3D : false
         * isNew : false
         * length : 116
         * movieId : 200612
         * nearestShowtime : {"isTicket":true,"nearestCinemaCount":91,"nearestShowDay":1498204800,"nearestShowtimeCount":240}
         * rDay : 16
         * rMonth : 6
         * rYear : 2017
         * ratingFinal : 7.4
         * titleCn : 异形：契约
         * titleEn : Alien: Covenant
         * type : 恐怖 / 科幻 / 惊悚
         * wantedCount : 6872
         */

        private String actorName1;
        private String actorName2;
        private String btnText;
        private String commonSpecial;
        private String directorName;
        private String img;
        private boolean is3D;
        private boolean isDMAX;
        private boolean isFilter;
        private boolean isHot;
        private boolean isIMAX;
        private boolean isIMAX3D;
        private boolean isNew;
        private int length;
        private int movieId;
        private NearestShowtimeBean nearestShowtime;
        private int rDay;
        private int rMonth;
        private int rYear;
        private double ratingFinal;
        private String titleCn;
        private String titleEn;
        private String type;
        private int wantedCount;

        public String getActorName1() {
            return actorName1;
        }

        public void setActorName1(String actorName1) {
            this.actorName1 = actorName1;
        }

        public String getActorName2() {
            return actorName2;
        }

        public void setActorName2(String actorName2) {
            this.actorName2 = actorName2;
        }

        public String getBtnText() {
            return btnText;
        }

        public void setBtnText(String btnText) {
            this.btnText = btnText;
        }

        public String getCommonSpecial() {
            return commonSpecial;
        }

        public void setCommonSpecial(String commonSpecial) {
            this.commonSpecial = commonSpecial;
        }

        public String getDirectorName() {
            return directorName;
        }

        public void setDirectorName(String directorName) {
            this.directorName = directorName;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public boolean isIs3D() {
            return is3D;
        }

        public void setIs3D(boolean is3D) {
            this.is3D = is3D;
        }

        public boolean isIsDMAX() {
            return isDMAX;
        }

        public void setIsDMAX(boolean isDMAX) {
            this.isDMAX = isDMAX;
        }

        public boolean isIsFilter() {
            return isFilter;
        }

        public void setIsFilter(boolean isFilter) {
            this.isFilter = isFilter;
        }

        public boolean isIsHot() {
            return isHot;
        }

        public void setIsHot(boolean isHot) {
            this.isHot = isHot;
        }

        public boolean isIsIMAX() {
            return isIMAX;
        }

        public void setIsIMAX(boolean isIMAX) {
            this.isIMAX = isIMAX;
        }

        public boolean isIsIMAX3D() {
            return isIMAX3D;
        }

        public void setIsIMAX3D(boolean isIMAX3D) {
            this.isIMAX3D = isIMAX3D;
        }

        public boolean isIsNew() {
            return isNew;
        }

        public void setIsNew(boolean isNew) {
            this.isNew = isNew;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public int getMovieId() {
            return movieId;
        }

        public void setMovieId(int movieId) {
            this.movieId = movieId;
        }

        public NearestShowtimeBean getNearestShowtime() {
            return nearestShowtime;
        }

        public void setNearestShowtime(NearestShowtimeBean nearestShowtime) {
            this.nearestShowtime = nearestShowtime;
        }

        public int getRDay() {
            return rDay;
        }

        public void setRDay(int rDay) {
            this.rDay = rDay;
        }

        public int getRMonth() {
            return rMonth;
        }

        public void setRMonth(int rMonth) {
            this.rMonth = rMonth;
        }

        public int getRYear() {
            return rYear;
        }

        public void setRYear(int rYear) {
            this.rYear = rYear;
        }

        public double getRatingFinal() {
            return ratingFinal;
        }

        public void setRatingFinal(double ratingFinal) {
            this.ratingFinal = ratingFinal;
        }

        public String getTitleCn() {
            return titleCn;
        }

        public void setTitleCn(String titleCn) {
            this.titleCn = titleCn;
        }

        public String getTitleEn() {
            return titleEn;
        }

        public void setTitleEn(String titleEn) {
            this.titleEn = titleEn;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getWantedCount() {
            return wantedCount;
        }

        public void setWantedCount(int wantedCount) {
            this.wantedCount = wantedCount;
        }

        public static class NearestShowtimeBean {
            /**
             * isTicket : true
             * nearestCinemaCount : 91
             * nearestShowDay : 1498204800
             * nearestShowtimeCount : 240
             */

            private boolean isTicket;
            private int nearestCinemaCount;
            private int nearestShowDay;
            private int nearestShowtimeCount;

            public boolean isIsTicket() {
                return isTicket;
            }

            public void setIsTicket(boolean isTicket) {
                this.isTicket = isTicket;
            }

            public int getNearestCinemaCount() {
                return nearestCinemaCount;
            }

            public void setNearestCinemaCount(int nearestCinemaCount) {
                this.nearestCinemaCount = nearestCinemaCount;
            }

            public int getNearestShowDay() {
                return nearestShowDay;
            }

            public void setNearestShowDay(int nearestShowDay) {
                this.nearestShowDay = nearestShowDay;
            }

            public int getNearestShowtimeCount() {
                return nearestShowtimeCount;
            }

            public void setNearestShowtimeCount(int nearestShowtimeCount) {
                this.nearestShowtimeCount = nearestShowtimeCount;
            }
        }
    }
}
