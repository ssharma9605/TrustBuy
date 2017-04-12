package com.example.trustbuy.trustbuy_ss;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.Toast;


public class UserAccountsettingsActivity extends MenubarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_accountsettings_activity);

            }


    public void UpdateAccount(View view) {
        Toast.makeText(this, "Updated !", Toast.LENGTH_LONG).show();

    }

    public void CancelUpdate(View view) {
    finish();

    }

    public void ChangePassword(View view) {
        Intent intent = new Intent(this, UpdatePasswordactivity.class);
        startActivity(intent);

    }

}


