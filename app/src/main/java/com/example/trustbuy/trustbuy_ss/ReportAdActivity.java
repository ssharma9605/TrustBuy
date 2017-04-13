package com.example.trustbuy.trustbuy_ss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class ReportAdActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reportad_activity);
    }
    public void ReportAd (View view){
        Toast.makeText(this, "Admin will take appropriate Action!", Toast.LENGTH_SHORT)
                .show();
        Intent intent = new Intent(getApplicationContext(), PostedAdscreenActivity.class);
        startActivity(intent);
    }
    public void Cancel(View view){
        finish();
    }
}
