package test.jiyun.com.shiguangdemo.modle.bean;

import java.util.List;
import java.util.concurrent.Callable;

import test.jiyun.com.shiguangdemo.utils.PinYinUtils;

/**
 * 项目名称:时光网
 * 类描述:  选择城市的实体类
 * 创建人:LENOVO
 * 创建时间:2017-6-30 21:13
 * 修改人:
 * 修改内容:
 */

public class CityListBean  {


    private List<PBean> p;

    public List<PBean> getP() {
        return p;
    }

    public void setP(List<PBean> p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return
                "p=" + p ;
    }



    public static class PBean implements Comparable<CityListBean.PBean>{
        @Override
        public String toString() {
            return
                    "count=" + count +
                    ", id=" + id +
                    ", n='" + n +
                    ", pinyinFull='" + pinyinFull +
                    ", pinyinShort='" + pinyinShort ;

        }

        /**
         * count : 239
         * id : 292
         * n : 上海
         * pinyinFull : Shanghai
         * pinyinShort : sh
         */


        private int count;
        private int id;
        private String n;
        private String pinyinFull;
        private String pinyinShort;


        // 拼音字母(字典顺序 )
        @Override
        public int compareTo(CityListBean.PBean city) {
            return getPinyinFull().compareTo(city.getPinyinFull());
        }
        public PBean(int count, int id, String n, String pinyinFull, String pinyinShort) {
//            super();
            this.count = count;
            this.id = id;
            this.n = n;
            this.pinyinFull = pinyinFull;
            this.pinyinShort = pinyinShort;
            setPinyinFull(pinyinShort);
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getN() {
            return n;
        }

        public void setN(String n) {
            this.n = n;
        }

        public String getPinyinFull() {
            return pinyinFull;
        }

        public void setPinyinFull(String pinyinFull) {
            this.pinyinFull = pinyinFull;
        }

        public String getPinyinShort() {
            return pinyinShort;
        }

        public void setPinyinShort(String pinyinShort) {
            this.pinyinShort = pinyinShort;
        }



    }

}
