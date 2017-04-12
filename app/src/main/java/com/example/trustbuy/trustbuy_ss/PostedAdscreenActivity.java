package com.example.trustbuy.trustbuy_ss;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ZoomButton;


public class PostedAdscreenActivity extends MainActivity {
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.posted_adscreen_activity);


    }
    public void Login (View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
    public void MessageSeller (View view) {
        Intent intent = new Intent(this, ReplytoSellerAdActivity.class);
        startActivity(intent);
    }
    public void AdUpdatedHistory (View view) {
        Intent intent = new Intent(this, AdUpdatedHistoryactivity.class);
        startActivity(intent);
    }


}

