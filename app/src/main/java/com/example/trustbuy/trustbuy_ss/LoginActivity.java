package com.example.trustbuy.trustbuy_ss;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends UserAccountsettingsActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

    }

    public void SignIn(View view) {
        Intent intent = new Intent(this, UserAccountsettingsActivity.class);
        startActivity(intent);
    }
    public void CreateNewAccount(View view) {
        Intent intent = new Intent(this, CreateUseraccountActivity.class);
        startActivity(intent);
    }

    public void Cancel(View view) {
       // Intent intent = new Intent(this, PostedAdscreenActivity.class);
       // startActivity(intent);
        finish();
    }

    public void ForgotPassword(View view) {
        Intent intent = new Intent(this, ForgotPasswordActivity.class);
        startActivity(intent);
    }
}