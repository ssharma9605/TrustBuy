package com.example.trustbuy.trustbuy_ss;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



public class FriendsActivity extends UserAccountsettingsActivity {
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friends_activity);

    }

    public void Accept(View v) {
        btn = (Button) findViewById(R.id.accept1);
        btn.setText("Friends");
        }
    public void Block(View v) {
        btn = (Button) findViewById(R.id.Blocked1);
        btn.setText("Blocked");

    }

    public void UnFriend(View v) {
        btn = (Button) findViewById(R.id.Unfriend1);
        btn.setText("Connect");
        Toast.makeText(this, "Send a request by going to their profile!", Toast.LENGTH_SHORT)
                .show();
        v.setEnabled(false);
    }

    }

