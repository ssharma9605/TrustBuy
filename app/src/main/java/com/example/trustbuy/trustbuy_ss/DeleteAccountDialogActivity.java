package com.example.trustbuy.trustbuy_ss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DeleteAccountDialogActivity extends UserAccountsettingsActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delete_account_dialog_activity);
    }
    public void Gotologin (View view){
        Intent intent = new Intent (this, LoginActivity.class);
        startActivity(intent);
    }
    public void Gotomain (View view){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
}
