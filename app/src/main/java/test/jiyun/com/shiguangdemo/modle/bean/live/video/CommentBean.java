package test.jiyun.com.shiguangdemo.modle.bean.live.video;

import java.util.List;

/**
 * Created by liuwangping on 2017/7/2.
 */

public class CommentBean {

    /**
     * code : 1
     * data : {"list":[{"replyCount":0,"createTime":"2017-07-01 15:16:28","showTime":"1天前","nickname":"南方姑娘973738216","avator":"https://imgproxy.mtime.cn/get.ashx?uri=http://img5.mtime.cn/up/2017/07/01/145625.53888732_64X64.jpg","id":5953,"userId":26733373,"content":"好看吗，有没有看过的，加我"},{"replyCount":0,"createTime":"2017-06-30 09:08:28","showTime":"2天前","nickname":"时光用户_1498453830946","avator":"https://imgproxy.mtime.cn/get.ashx?uri=http://img2.mtime.cn/images/default/head_64X64.gif","id":5950,"userId":26675330,"content":"好好的ip，拍成一坨华华丽丽的屎"},{"replyCount":0,"createTime":"2017-06-29 15:43:01","showTime":"06月29日","nickname":"小曼龟龟","avator":"https://imgproxy.mtime.cn/get.ashx?uri=http://img22.mtime.cn/up/2010/08/06/132019.18376178_64X64.jpg","id":5949,"userId":2839165,"content":"还没去看呢 蛮期待的"},{"replyCount":0,"createTime":"2017-06-27 15:46:24","showTime":"06月27日","nickname":"闫磊（吓吓）","avator":"https://imgproxy.mtime.cn/get.ashx?uri=http://img2.mtime.cn/images/default/head_64X64.gif","id":5946,"userId":25103265,"content":"刚看完评论一下，变5真的只剩下特技了，还要拍6\u2026\u2026"},{"replyCount":0,"createTime":"2017-06-25 23:55:30","showTime":"06月25日","nickname":"M_1606121332370365426","avator":"https://imgproxy.mtime.cn/get.ashx?uri=http://img2.mtime.cn/images/default/head_64X64.gif","id":5943,"userId":17656594,"content":"一点都不激动，情绪一般般！真的挺失望的"},{"replyCount":0,"createTime":"2017-06-25 17:27:45","showTime":"06月25日","nickname":"时光用户_1498355968569","avator":"https://imgproxy.mtime.cn/get.ashx?uri=http://img2.mtime.cn/images/default/head_64X64.gif","id":5942,"userId":26404407,"content":"总体一般了，只是场面壮观，音效增强。看过动画片的和死忠可以去看，其他的就算了吧。"},{"replyCount":0,"createTime":"2017-06-23 23:02:45","showTime":"06月23日","nickname":"M_1512130951420901185","avator":"https://imgproxy.mtime.cn/get.ashx?uri=http://img2.mtime.cn/images/default/head_64X64.gif","id":5941,"userId":16785310,"content":"听说分不高(⊙o⊙)哦"},{"replyCount":0,"createTime":"2017-06-23 07:22:49","showTime":"06月23日","nickname":"小墨微微","avator":"https://imgproxy.mtime.cn/get.ashx?uri=http://img32.mtime.cn/up/2016/04/10/223924.46846043_64X64.jpg","id":5940,"userId":16444975,"content":"莉莉安"},{"replyCount":0,"createTime":"2017-06-23 00:00:52","showTime":"06月23日","nickname":"沉默017","avator":"https://imgproxy.mtime.cn/get.ashx?uri=http://img2.mtime.cn/images/default/head_64X64.gif","id":5939,"userId":26269818,"content":"变形金刚5开播了"},{"replyCount":0,"createTime":"2017-06-22 23:59:19","showTime":"06月22日","nickname":"Nardoine","avator":"https://imgproxy.mtime.cn/get.ashx?uri=http://img5.mtime.cn/up/2017/01/08/103606.12658128_64X64.jpg","id":5938,"userId":18039673,"content":"话说福利给的啥呀"}],"pager":{"currentPage":0,"hasMore":true,"itemCount":-1,"pageSize":10}}
     * msg :
     * showMsg :
     */

    private int code;
    private DataBean data;
    private String msg;
    private String showMsg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
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
         * list : [{"replyCount":0,"createTime":"2017-07-01 15:16:28","showTime":"1天前","nickname":"南方姑娘973738216","avator":"https://imgproxy.mtime.cn/get.ashx?uri=http://img5.mtime.cn/up/2017/07/01/145625.53888732_64X64.jpg","id":5953,"userId":26733373,"content":"好看吗，有没有看过的，加我"},{"replyCount":0,"createTime":"2017-06-30 09:08:28","showTime":"2天前","nickname":"时光用户_1498453830946","avator":"https://imgproxy.mtime.cn/get.ashx?uri=http://img2.mtime.cn/images/default/head_64X64.gif","id":5950,"userId":26675330,"content":"好好的ip，拍成一坨华华丽丽的屎"},{"replyCount":0,"createTime":"2017-06-29 15:43:01","showTime":"06月29日","nickname":"小曼龟龟","avator":"https://imgproxy.mtime.cn/get.ashx?uri=http://img22.mtime.cn/up/2010/08/06/132019.18376178_64X64.jpg","id":5949,"userId":2839165,"content":"还没去看呢 蛮期待的"},{"replyCount":0,"createTime":"2017-06-27 15:46:24","showTime":"06月27日","nickname":"闫磊（吓吓）","avator":"https://imgproxy.mtime.cn/get.ashx?uri=http://img2.mtime.cn/images/default/head_64X64.gif","id":5946,"userId":25103265,"content":"刚看完评论一下，变5真的只剩下特技了，还要拍6\u2026\u2026"},{"replyCount":0,"createTime":"2017-06-25 23:55:30","showTime":"06月25日","nickname":"M_1606121332370365426","avator":"https://imgproxy.mtime.cn/get.ashx?uri=http://img2.mtime.cn/images/default/head_64X64.gif","id":5943,"userId":17656594,"content":"一点都不激动，情绪一般般！真的挺失望的"},{"replyCount":0,"createTime":"2017-06-25 17:27:45","showTime":"06月25日","nickname":"时光用户_1498355968569","avator":"https://imgproxy.mtime.cn/get.ashx?uri=http://img2.mtime.cn/images/default/head_64X64.gif","id":5942,"userId":26404407,"content":"总体一般了，只是场面壮观，音效增强。看过动画片的和死忠可以去看，其他的就算了吧。"},{"replyCount":0,"createTime":"2017-06-23 23:02:45","showTime":"06月23日","nickname":"M_1512130951420901185","avator":"https://imgproxy.mtime.cn/get.ashx?uri=http://img2.mtime.cn/images/default/head_64X64.gif","id":5941,"userId":16785310,"content":"听说分不高(⊙o⊙)哦"},{"replyCount":0,"createTime":"2017-06-23 07:22:49","showTime":"06月23日","nickname":"小墨微微","avator":"https://imgproxy.mtime.cn/get.ashx?uri=http://img32.mtime.cn/up/2016/04/10/223924.46846043_64X64.jpg","id":5940,"userId":16444975,"content":"莉莉安"},{"replyCount":0,"createTime":"2017-06-23 00:00:52","showTime":"06月23日","nickname":"沉默017","avator":"https://imgproxy.mtime.cn/get.ashx?uri=http://img2.mtime.cn/images/default/head_64X64.gif","id":5939,"userId":26269818,"content":"变形金刚5开播了"},{"replyCount":0,"createTime":"2017-06-22 23:59:19","showTime":"06月22日","nickname":"Nardoine","avator":"https://imgproxy.mtime.cn/get.ashx?uri=http://img5.mtime.cn/up/2017/01/08/103606.12658128_64X64.jpg","id":5938,"userId":18039673,"content":"话说福利给的啥呀"}]
         * pager : {"currentPage":0,"hasMore":true,"itemCount":-1,"pageSize":10}
         */

        private PagerBean pager;
        private List<ListBean> list;

        public PagerBean getPager() {
            return pager;
        }

        public void setPager(PagerBean pager) {
            this.pager = pager;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class PagerBean {
            /**
             * currentPage : 0
             * hasMore : true
             * itemCount : -1
             * pageSize : 10
             */

            private int currentPage;
            private boolean hasMore;
            private int itemCount;
            private int pageSize;

            public int getCurrentPage() {
                return currentPage;
            }

            public void setCurrentPage(int currentPage) {
                this.currentPage = currentPage;
            }

            public boolean isHasMore() {
                return hasMore;
            }

            public void setHasMore(boolean hasMore) {
                this.hasMore = hasMore;
            }

            public int getItemCount() {
                return itemCount;
            }

            public void setItemCount(int itemCount) {
                this.itemCount = itemCount;
            }

            public int getPageSize() {
                return pageSize;
            }

            public void setPageSize(int pageSize) {
                this.pageSize = pageSize;
            }
        }

        public static class ListBean {
            /**
             * replyCount : 0
             * createTime : 2017-07-01 15:16:28
             * showTime : 1天前
             * nickname : 南方姑娘973738216
             * avator : https://imgproxy.mtime.cn/get.ashx?uri=http://img5.mtime.cn/up/2017/07/01/145625.53888732_64X64.jpg
             * id : 5953
             * userId : 26733373
             * content : 好看吗，有没有看过的，加我
             */

            private int replyCount;
            private String createTime;
            private String showTime;
            private String nickname;
            private String avator;
            private int id;
            private int userId;
            private String content;

            public int getReplyCount() {
                return replyCount;
            }

            public void setReplyCount(int replyCount) {
                this.replyCount = replyCount;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public String getShowTime() {
                return showTime;
            }

            public void setShowTime(String showTime) {
                this.showTime = showTime;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getAvator() {
                return avator;
            }

            public void setAvator(String avator) {
                this.avator = avator;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }
        }
    }
}
