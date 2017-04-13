package com.example.trustbuy.trustbuy_ss;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForgotPasswordActivity extends LoginActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_password_activity);

    }

    public void ForgotPasswordUpdate(View view) {
        Intent intent = new Intent(this, PasswordResetSucessActivity.class);
        startActivity(intent);
    }
    public void CancelPwdchange(View view) {
        finish();
    }
}

