package com.example.trustbuy.trustbuy_ss;

/**
 * Created by PC User on 2017-04-10.
 */

public class AdUpdatedHistoryLayoutActivity {

        private int imageId;
        private String title;
    private String price;
        private String desc;

        public AdUpdatedHistoryLayoutActivity (int imageId, String title,String price, String desc) {
            this.imageId = imageId;
            this.title = title;
            this.price = price;
            this.desc = desc;
        }
        public int getImageId() {
            return imageId;
        }
        public void setImageId(int imageId) {
            this.imageId = imageId;
        }
        public String getDesc() {
            return desc;
        }
        public void setDesc(String desc) {
            this.desc = desc;
        }
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
        @Override
        public String toString() {
            return title + "\n" + price + "\n"+ desc;
        }
    }

