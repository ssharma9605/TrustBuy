package com.example.trustbuy.trustbuy_ss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class InboxMsgDisplayActivity extends UserAccountsettingsActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inbox_msg_display_activity);
    }
    public void Cancel(View view){
        finish();
    }
    public void Reply(View view){
        Intent intent = new Intent(getApplicationContext(), ReplytoSellerAdActivity.class);
        startActivity(intent);
    }
    }
