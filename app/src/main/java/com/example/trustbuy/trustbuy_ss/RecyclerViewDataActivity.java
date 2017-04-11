package com.example.trustbuy.trustbuy_ss;


public class RecyclerViewDataActivity {
    public String title;
    public String description;
    public String price;
    public int imageId;

    RecyclerViewDataActivity(String title,String price, String description, int imageId) {
        this.title = title;
        this.price = price;
        this.description = description;
        this.imageId = imageId;
    }
}
