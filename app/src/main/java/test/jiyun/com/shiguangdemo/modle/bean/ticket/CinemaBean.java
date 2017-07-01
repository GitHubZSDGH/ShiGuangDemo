package test.jiyun.com.shiguangdemo.modle.bean.ticket;

import java.util.List;

/**
 * Created by liuwangping on 2017/6/26.
 */

public class CinemaBean {

    /**
     * address : 海淀区中关村广场购物中心津乐汇三层（鼎好一期西侧）
     * baiduLatitude : 39.989006
     * baiduLongitude : 116.32011
     * cinameName : 中关村美嘉
     * cinemaId : 1216
     * couponActivityList : []
     * districtID : 1368
     * feature : {"has3D":1,"hasFeature4D":0,"hasFeature4K":1,"hasFeatureDolby":1,"hasFeatureHuge":1,"hasIMAX":0,"hasLoveseat":0,"hasPark":1,"hasServiceTicket":1,"hasVIP":0,"hasWifi":1}
     * isETicket : true
     * isTicket : true
     * latitude : 39.982906
     * longitude : 116.31255
     * minPrice : 7000
     * movieCount : 14
     * ratingFinal : 8.083075
     * showtimeCount : 103
     */

    private String address;
    private double baiduLatitude;
    private double baiduLongitude;
    private String cinameName;
    private int cinemaId;
    private int districtID;
    private FeatureBean feature;
    private boolean isETicket;
    private boolean isTicket;
    private double latitude;
    private double longitude;
    private int minPrice;
    private int movieCount;
    private double ratingFinal;
    private int showtimeCount;
    private List<?> couponActivityList;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBaiduLatitude() {
        return baiduLatitude;
    }

    public void setBaiduLatitude(double baiduLatitude) {
        this.baiduLatitude = baiduLatitude;
    }

    public double getBaiduLongitude() {
        return baiduLongitude;
    }

    public void setBaiduLongitude(double baiduLongitude) {
        this.baiduLongitude = baiduLongitude;
    }

    public String getCinameName() {
        return cinameName;
    }

    public void setCinameName(String cinameName) {
        this.cinameName = cinameName;
    }

    public int getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(int cinemaId) {
        this.cinemaId = cinemaId;
    }

    public int getDistrictID() {
        return districtID;
    }

    public void setDistrictID(int districtID) {
        this.districtID = districtID;
    }

    public FeatureBean getFeature() {
        return feature;
    }

    public void setFeature(FeatureBean feature) {
        this.feature = feature;
    }

    public boolean isIsETicket() {
        return isETicket;
    }

    public void setIsETicket(boolean isETicket) {
        this.isETicket = isETicket;
    }

    public boolean isIsTicket() {
        return isTicket;
    }

    public void setIsTicket(boolean isTicket) {
        this.isTicket = isTicket;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getMovieCount() {
        return movieCount;
    }

    public void setMovieCount(int movieCount) {
        this.movieCount = movieCount;
    }

    public double getRatingFinal() {
        return ratingFinal;
    }

    public void setRatingFinal(double ratingFinal) {
        this.ratingFinal = ratingFinal;
    }

    public int getShowtimeCount() {
        return showtimeCount;
    }

    public void setShowtimeCount(int showtimeCount) {
        this.showtimeCount = showtimeCount;
    }

    public List<?> getCouponActivityList() {
        return couponActivityList;
    }

    public void setCouponActivityList(List<?> couponActivityList) {
        this.couponActivityList = couponActivityList;
    }

    public static class FeatureBean {
        /**
         * has3D : 1
         * hasFeature4D : 0
         * hasFeature4K : 1
         * hasFeatureDolby : 1
         * hasFeatureHuge : 1
         * hasIMAX : 0
         * hasLoveseat : 0
         * hasPark : 1
         * hasServiceTicket : 1
         * hasVIP : 0
         * hasWifi : 1
         */

        private int has3D;
        private int hasFeature4D;
        private int hasFeature4K;
        private int hasFeatureDolby;
        private int hasFeatureHuge;
        private int hasIMAX;
        private int hasLoveseat;
        private int hasPark;
        private int hasServiceTicket;
        private int hasVIP;
        private int hasWifi;

        public int getHas3D() {
            return has3D;
        }

        public void setHas3D(int has3D) {
            this.has3D = has3D;
        }

        public int getHasFeature4D() {
            return hasFeature4D;
        }

        public void setHasFeature4D(int hasFeature4D) {
            this.hasFeature4D = hasFeature4D;
        }

        public int getHasFeature4K() {
            return hasFeature4K;
        }

        public void setHasFeature4K(int hasFeature4K) {
            this.hasFeature4K = hasFeature4K;
        }

        public int getHasFeatureDolby() {
            return hasFeatureDolby;
        }

        public void setHasFeatureDolby(int hasFeatureDolby) {
            this.hasFeatureDolby = hasFeatureDolby;
        }

        public int getHasFeatureHuge() {
            return hasFeatureHuge;
        }

        public void setHasFeatureHuge(int hasFeatureHuge) {
            this.hasFeatureHuge = hasFeatureHuge;
        }

        public int getHasIMAX() {
            return hasIMAX;
        }

        public void setHasIMAX(int hasIMAX) {
            this.hasIMAX = hasIMAX;
        }

        public int getHasLoveseat() {
            return hasLoveseat;
        }

        public void setHasLoveseat(int hasLoveseat) {
            this.hasLoveseat = hasLoveseat;
        }

        public int getHasPark() {
            return hasPark;
        }

        public void setHasPark(int hasPark) {
            this.hasPark = hasPark;
        }

        public int getHasServiceTicket() {
            return hasServiceTicket;
        }

        public void setHasServiceTicket(int hasServiceTicket) {
            this.hasServiceTicket = hasServiceTicket;
        }

        public int getHasVIP() {
            return hasVIP;
        }

        public void setHasVIP(int hasVIP) {
            this.hasVIP = hasVIP;
        }

        public int getHasWifi() {
            return hasWifi;
        }

        public void setHasWifi(int hasWifi) {
            this.hasWifi = hasWifi;
        }
    }
}
