package test.jiyun.com.shiguangdemo.modle.bean.film;

/**
 * 项目名称:时光网
 * 类描述:
 * 创建人:LENOVO
 * 创建时间:2017-6-26 22:51
 * 修改人:
 * 修改内容:
 */

public class FilmBean {
    @Override
    public String toString() {
        return "FilmBean{" +
                "commentCount=" + commentCount +
                ", id=" + id +
                ", image='" + image + '\'' +
                ", nickname='" + nickname + '\'' +
                ", rating='" + rating + '\'' +
                ", relatedObj=" + relatedObj +
                ", summary='" + summary + '\'' +
                ", title='" + title + '\'' +
                ", userImage='" + userImage + '\'' +
                '}';
    }

    /**
     * commentCount : 9
     * id : 8009419
     * image :
     * nickname : 梦里诗书
     * rating : 8.0
     * relatedObj : {"id":228270,"image":"http://img5.mtime.cn/mt/2017/05/19/103610.29135980_1280X720X2.jpg","rating":"7.6","title":"冈仁波齐","titleEn":"Paths of the Soul","type":1,"year":"2015"}
     * summary : 　　文/梦里诗书
     * <p>
     * 　　《冈仁波齐》伪纪录片式的手法，对藏族匍匐叩拜朝圣之路的聚焦，在导演张扬的镜头下，所为人感受到的是一种淳朴的美，电影这种美的缔结，在却又并不是依靠何般戏剧性的冲突，而是对朝圣者们一言一行的细腻捕捉，使这种美在不经意间便得以跃然光影。
     * <p>
     * <p>
     * <p>
     * 　　“冈仁波齐”是一座山的名字，在普通人眼中他或许就是一座壮丽的山峰，但在无数藏传佛教信徒眼中，它的意义却远不止于是一座山那么简单，...
     * title : 有信仰的电影是如此之美
     * userImage : http://img32.mtime.cn/up/2014/10/27/120847.82885479_128X128.jpg
     */

    private int commentCount;
    private int id;
    private String image;
    private String nickname;
    private String rating;
    private RelatedObjBean relatedObj;
    private String summary;
    private String title;
    private String userImage;

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public RelatedObjBean getRelatedObj() {
        return relatedObj;
    }

    public void setRelatedObj(RelatedObjBean relatedObj) {
        this.relatedObj = relatedObj;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public static class RelatedObjBean {
        @Override
        public String toString() {
            return "RelatedObjBean{" +
                    "id=" + id +
                    ", image='" + image + '\'' +
                    ", rating='" + rating + '\'' +
                    ", title='" + title + '\'' +
                    ", titleEn='" + titleEn + '\'' +
                    ", type=" + type +
                    ", year='" + year + '\'' +
                    '}';
        }

        /**
         * id : 228270
         * image : http://img5.mtime.cn/mt/2017/05/19/103610.29135980_1280X720X2.jpg
         * rating : 7.6
         * title : 冈仁波齐
         * titleEn : Paths of the Soul
         * type : 1
         * year : 2015
         */

        private int id;
        private String image;
        private String rating;
        private String title;
        private String titleEn;
        private int type;
        private String year;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getRating() {
            return rating;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTitleEn() {
            return titleEn;
        }

        public void setTitleEn(String titleEn) {
            this.titleEn = titleEn;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }
    }
}
