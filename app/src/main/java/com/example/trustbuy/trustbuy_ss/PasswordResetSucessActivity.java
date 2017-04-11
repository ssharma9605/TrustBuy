package com.example.trustbuy.trustbuy_ss;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class PasswordResetSucessActivity extends ForgotPasswordActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.passwordreset_success_activity);

    }
    public void  PwdChangeLogin(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

}
