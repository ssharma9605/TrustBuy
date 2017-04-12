package com.example.trustbuy.trustbuy_ss;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Created by PC User on 2017-04-11.
 */

public class DeleteAccDialogActivity extends UserAccountsettingsActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delete_acc_cofirmdialog_activity);
    }
    public void Delete(View view){
        Toast.makeText(this, "Deleted", Toast.LENGTH_SHORT)
                .show();
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
    public void Cancel(View view){
        finish();
    }
}
