package com.example.trustbuy.trustbuy_ss;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class WatchlistActivity extends UserAccountsettingsActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.watchlist_activity);

    }
    public void ViewAd(View view){
        Intent intent = new Intent(this, PostedAdscreenActivity.class);
        startActivity(intent);
    }
    public void Delete(View view){
        Toast.makeText(this, "Removed from your Watchlist", Toast.LENGTH_SHORT)
                .show();
        i = new Intent(getApplicationContext(), WatchlistActivity.class);
        startActivity(i);
    }
}

