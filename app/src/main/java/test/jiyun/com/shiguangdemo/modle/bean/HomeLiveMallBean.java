package test.jiyun.com.shiguangdemo.modle.bean;

import java.util.List;

/**
 * 项目名称:时光网
 * 类描述:精彩直播和正版商城的实体类；
 * 创建人:LENOVO
 * 创建时间:2017-6-23 14:47
 * 修改人:
 * 修改内容:
 */

public class HomeLiveMallBean {

    /**
     * code : 1
     * data : {"liveList":[{"img":"http://img5.mtime.cn/mg/2017/06/22/122526.12621301.jpg","liveId":665,"playNumTag":"","playTag":"","status":4,"title":"《变形金刚5：最后的骑士》时光网特别节目","url":""}],"mallDiv":{"buttonText":"更多","divList":[{"areaName":"M17_R_APP_HOMEPAGE_MALL_MODULE_AREA_A","gotoPage":{"gotoType":"gotourl","isGoH5":false,"parameters":{},"parameters1":{},"relatedId":0,"relatedTypeUrl":"","url":"https://feature.mtime.cn/mobile/item/2017/TF5/"},"imgSrc":"http://img5.mtime.cn/mg/2017/06/19/174518.30204647.jpg","url":"http://feature.mtime.cn/mobile/item/2017/TF5/"},{"areaName":"M17_R_APP_HOMEPAGE_MALL_MODULE_AREA_B","gotoPage":{"gotoType":"gotourl","isGoH5":false,"parameters":{},"parameters1":{},"relatedId":0,"relatedTypeUrl":"","url":"https://mall-wv.mtime.cn/#!/commerce/list/?q=T%E6%81%A4"},"imgSrc":"http://img5.mtime.cn/mg/2017/06/19/174609.36487944.jpg","url":"http://mall.wv.mtime.cn/#!/commerce/list/?q=T%E6%81%A4"},{"areaName":"M17_R_APP_HOMEPAGE_MALL_MODULE_AREA_C","gotoPage":{"gotoType":"gotogoodsinfo","isGoH5":false,"parameters":{"goodsId":105712},"parameters1":{"goodsId":"105712"},"relatedId":105712,"relatedTypeUrl":"","url":"https://mall-wv.mtime.cn/#!/commerce/item/105712/"},"imgSrc":"http://img5.mtime.cn/mg/2017/06/19/175120.53822700.jpg","url":"http://mall.wv.mtime.cn/#!/commerce/item/105712/"}],"gotoPage":{"gotoType":"gotomallindex","isGoH5":false,"parameters":{},"parameters1":{},"relatedId":0,"relatedTypeUrl":"","url":"https://m.mtime.cn/#!/mall/index/"},"link":"https://m.mtime.cn/#!/mall/index/","showStatus":true}}
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
         * liveList : [{"img":"http://img5.mtime.cn/mg/2017/06/22/122526.12621301.jpg","liveId":665,"playNumTag":"","playTag":"","status":4,"title":"《变形金刚5：最后的骑士》时光网特别节目","url":""}]
         * mallDiv : {"buttonText":"更多","divList":[{"areaName":"M17_R_APP_HOMEPAGE_MALL_MODULE_AREA_A","gotoPage":{"gotoType":"gotourl","isGoH5":false,"parameters":{},"parameters1":{},"relatedId":0,"relatedTypeUrl":"","url":"https://feature.mtime.cn/mobile/item/2017/TF5/"},"imgSrc":"http://img5.mtime.cn/mg/2017/06/19/174518.30204647.jpg","url":"http://feature.mtime.cn/mobile/item/2017/TF5/"},{"areaName":"M17_R_APP_HOMEPAGE_MALL_MODULE_AREA_B","gotoPage":{"gotoType":"gotourl","isGoH5":false,"parameters":{},"parameters1":{},"relatedId":0,"relatedTypeUrl":"","url":"https://mall-wv.mtime.cn/#!/commerce/list/?q=T%E6%81%A4"},"imgSrc":"http://img5.mtime.cn/mg/2017/06/19/174609.36487944.jpg","url":"http://mall.wv.mtime.cn/#!/commerce/list/?q=T%E6%81%A4"},{"areaName":"M17_R_APP_HOMEPAGE_MALL_MODULE_AREA_C","gotoPage":{"gotoType":"gotogoodsinfo","isGoH5":false,"parameters":{"goodsId":105712},"parameters1":{"goodsId":"105712"},"relatedId":105712,"relatedTypeUrl":"","url":"https://mall-wv.mtime.cn/#!/commerce/item/105712/"},"imgSrc":"http://img5.mtime.cn/mg/2017/06/19/175120.53822700.jpg","url":"http://mall.wv.mtime.cn/#!/commerce/item/105712/"}],"gotoPage":{"gotoType":"gotomallindex","isGoH5":false,"parameters":{},"parameters1":{},"relatedId":0,"relatedTypeUrl":"","url":"https://m.mtime.cn/#!/mall/index/"},"link":"https://m.mtime.cn/#!/mall/index/","showStatus":true}
         */

        private MallDivBean mallDiv;
        private List<LiveListBean> liveList;

        public MallDivBean getMallDiv() {
            return mallDiv;
        }

        public void setMallDiv(MallDivBean mallDiv) {
            this.mallDiv = mallDiv;
        }

        public List<LiveListBean> getLiveList() {
            return liveList;
        }

        public void setLiveList(List<LiveListBean> liveList) {
            this.liveList = liveList;
        }

        public static class MallDivBean {
            /**
             * buttonText : 更多
             * divList : [{"areaName":"M17_R_APP_HOMEPAGE_MALL_MODULE_AREA_A","gotoPage":{"gotoType":"gotourl","isGoH5":false,"parameters":{},"parameters1":{},"relatedId":0,"relatedTypeUrl":"","url":"https://feature.mtime.cn/mobile/item/2017/TF5/"},"imgSrc":"http://img5.mtime.cn/mg/2017/06/19/174518.30204647.jpg","url":"http://feature.mtime.cn/mobile/item/2017/TF5/"},{"areaName":"M17_R_APP_HOMEPAGE_MALL_MODULE_AREA_B","gotoPage":{"gotoType":"gotourl","isGoH5":false,"parameters":{},"parameters1":{},"relatedId":0,"relatedTypeUrl":"","url":"https://mall-wv.mtime.cn/#!/commerce/list/?q=T%E6%81%A4"},"imgSrc":"http://img5.mtime.cn/mg/2017/06/19/174609.36487944.jpg","url":"http://mall.wv.mtime.cn/#!/commerce/list/?q=T%E6%81%A4"},{"areaName":"M17_R_APP_HOMEPAGE_MALL_MODULE_AREA_C","gotoPage":{"gotoType":"gotogoodsinfo","isGoH5":false,"parameters":{"goodsId":105712},"parameters1":{"goodsId":"105712"},"relatedId":105712,"relatedTypeUrl":"","url":"https://mall-wv.mtime.cn/#!/commerce/item/105712/"},"imgSrc":"http://img5.mtime.cn/mg/2017/06/19/175120.53822700.jpg","url":"http://mall.wv.mtime.cn/#!/commerce/item/105712/"}]
             * gotoPage : {"gotoType":"gotomallindex","isGoH5":false,"parameters":{},"parameters1":{},"relatedId":0,"relatedTypeUrl":"","url":"https://m.mtime.cn/#!/mall/index/"}
             * link : https://m.mtime.cn/#!/mall/index/
             * showStatus : true
             */

            private String buttonText;
            private GotoPageBean gotoPage;
            private String link;
            private boolean showStatus;
            private List<DivListBean> divList;

            public String getButtonText() {
                return buttonText;
            }

            public void setButtonText(String buttonText) {
                this.buttonText = buttonText;
            }

            public GotoPageBean getGotoPage() {
                return gotoPage;
            }

            public void setGotoPage(GotoPageBean gotoPage) {
                this.gotoPage = gotoPage;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public boolean isShowStatus() {
                return showStatus;
            }

            public void setShowStatus(boolean showStatus) {
                this.showStatus = showStatus;
            }

            public List<DivListBean> getDivList() {
                return divList;
            }

            public void setDivList(List<DivListBean> divList) {
                this.divList = divList;
            }

            public static class GotoPageBean {
                /**
                 * gotoType : gotomallindex
                 * isGoH5 : false
                 * parameters : {}
                 * parameters1 : {}
                 * relatedId : 0
                 * relatedTypeUrl :
                 * url : https://m.mtime.cn/#!/mall/index/
                 */

                private String gotoType;
                private boolean isGoH5;
                private ParametersBean parameters;
                private Parameters1Bean parameters1;
                private int relatedId;
                private String relatedTypeUrl;
                private String url;

                public String getGotoType() {
                    return gotoType;
                }

                public void setGotoType(String gotoType) {
                    this.gotoType = gotoType;
                }

                public boolean isIsGoH5() {
                    return isGoH5;
                }

                public void setIsGoH5(boolean isGoH5) {
                    this.isGoH5 = isGoH5;
                }

                public ParametersBean getParameters() {
                    return parameters;
                }

                public void setParameters(ParametersBean parameters) {
                    this.parameters = parameters;
                }

                public Parameters1Bean getParameters1() {
                    return parameters1;
                }

                public void setParameters1(Parameters1Bean parameters1) {
                    this.parameters1 = parameters1;
                }

                public int getRelatedId() {
                    return relatedId;
                }

                public void setRelatedId(int relatedId) {
                    this.relatedId = relatedId;
                }

                public String getRelatedTypeUrl() {
                    return relatedTypeUrl;
                }

                public void setRelatedTypeUrl(String relatedTypeUrl) {
                    this.relatedTypeUrl = relatedTypeUrl;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public static class ParametersBean {
                }

                public static class Parameters1Bean {
                }
            }

            public static class DivListBean {
                /**
                 * areaName : M17_R_APP_HOMEPAGE_MALL_MODULE_AREA_A
                 * gotoPage : {"gotoType":"gotourl","isGoH5":false,"parameters":{},"parameters1":{},"relatedId":0,"relatedTypeUrl":"","url":"https://feature.mtime.cn/mobile/item/2017/TF5/"}
                 * imgSrc : http://img5.mtime.cn/mg/2017/06/19/174518.30204647.jpg
                 * url : http://feature.mtime.cn/mobile/item/2017/TF5/
                 */

                private String areaName;
                private GotoPageBeanX gotoPage;
                private String imgSrc;
                private String url;

                public String getAreaName() {
                    return areaName;
                }

                public void setAreaName(String areaName) {
                    this.areaName = areaName;
                }

                public GotoPageBeanX getGotoPage() {
                    return gotoPage;
                }

                public void setGotoPage(GotoPageBeanX gotoPage) {
                    this.gotoPage = gotoPage;
                }

                public String getImgSrc() {
                    return imgSrc;
                }

                public void setImgSrc(String imgSrc) {
                    this.imgSrc = imgSrc;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public static class GotoPageBeanX {
                    /**
                     * gotoType : gotourl
                     * isGoH5 : false
                     * parameters : {}
                     * parameters1 : {}
                     * relatedId : 0
                     * relatedTypeUrl :
                     * url : https://feature.mtime.cn/mobile/item/2017/TF5/
                     */

                    private String gotoType;
                    private boolean isGoH5;
                    private ParametersBeanX parameters;
                    private Parameters1BeanX parameters1;
                    private int relatedId;
                    private String relatedTypeUrl;
                    private String url;

                    public String getGotoType() {
                        return gotoType;
                    }

                    public void setGotoType(String gotoType) {
                        this.gotoType = gotoType;
                    }

                    public boolean isIsGoH5() {
                        return isGoH5;
                    }

                    public void setIsGoH5(boolean isGoH5) {
                        this.isGoH5 = isGoH5;
                    }

                    public ParametersBeanX getParameters() {
                        return parameters;
                    }

                    public void setParameters(ParametersBeanX parameters) {
                        this.parameters = parameters;
                    }

                    public Parameters1BeanX getParameters1() {
                        return parameters1;
                    }

                    public void setParameters1(Parameters1BeanX parameters1) {
                        this.parameters1 = parameters1;
                    }

                    public int getRelatedId() {
                        return relatedId;
                    }

                    public void setRelatedId(int relatedId) {
                        this.relatedId = relatedId;
                    }

                    public String getRelatedTypeUrl() {
                        return relatedTypeUrl;
                    }

                    public void setRelatedTypeUrl(String relatedTypeUrl) {
                        this.relatedTypeUrl = relatedTypeUrl;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public static class ParametersBeanX {
                    }

                    public static class Parameters1BeanX {
                    }
                }
            }
        }

        public static class LiveListBean {
            /**
             * img : http://img5.mtime.cn/mg/2017/06/22/122526.12621301.jpg
             * liveId : 665
             * playNumTag :
             * playTag :
             * status : 4
             * title : 《变形金刚5：最后的骑士》时光网特别节目
             * url :
             */

            private String img;
            private int liveId;
            private String playNumTag;
            private String playTag;
            private int status;
            private String title;
            private String url;

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public int getLiveId() {
                return liveId;
            }

            public void setLiveId(int liveId) {
                this.liveId = liveId;
            }

            public String getPlayNumTag() {
                return playNumTag;
            }

            public void setPlayNumTag(String playNumTag) {
                this.playNumTag = playNumTag;
            }

            public String getPlayTag() {
                return playTag;
            }

            public void setPlayTag(String playTag) {
                this.playTag = playTag;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
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
    }
}
