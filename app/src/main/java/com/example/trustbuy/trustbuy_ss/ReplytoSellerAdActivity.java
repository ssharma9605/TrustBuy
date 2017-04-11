package com.example.trustbuy.trustbuy_ss;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class ReplytoSellerAdActivity extends PostedAdscreenActivity {
//private View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.replytoseller_ad_activity);
    }

    public void SendMessage(View view)
    {
        Toast.makeText(this, "Message Sent!", Toast.LENGTH_SHORT)
                .show();
       Intent intent = new Intent(this, PostedAdscreenActivity.class);
        startActivity(intent);
    }
    public void Cancel(View view)
    {
        finish();
    }
}
