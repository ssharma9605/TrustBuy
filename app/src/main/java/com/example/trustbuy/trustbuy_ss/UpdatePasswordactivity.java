package com.example.trustbuy.trustbuy_ss;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class UpdatePasswordactivity extends UserAccountsettingsActivity{
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.update_password_activity);
        }
    public void UpdateNewPassword(View view) {
        Toast.makeText(this, "Please Login Using new Password !", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
