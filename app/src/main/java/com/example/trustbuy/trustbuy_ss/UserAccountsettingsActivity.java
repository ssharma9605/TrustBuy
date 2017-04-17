package com.example.trustbuy.trustbuy_ss;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.sa90.materialarcmenu.ArcMenu;
import com.sa90.materialarcmenu.StateChangeListener;


public class UserAccountsettingsActivity extends MenubarActivity implements View.OnClickListener {
    ArcMenu arcMenuAndroid;
    private FloatingActionButton fab_item_delete, fab_item_change_password, fab_item_update_account;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_accountsettings_activity);
        arcMenuAndroid = (ArcMenu) findViewById(R.id.Fab_menu);
        fab_item_delete = (FloatingActionButton) findViewById(R.id.fab_item_delete);
        fab_item_change_password = (FloatingActionButton) findViewById(R.id.fab_item_change_password);
        fab_item_update_account = (FloatingActionButton) findViewById(R.id.fab_item_update_account);

        fab_item_delete.setOnClickListener(this);
        fab_item_change_password.setOnClickListener(this);
        fab_item_update_account.setOnClickListener(this);


        arcMenuAndroid.setStateChangeListener(new StateChangeListener() {

            @Override
            public void onMenuOpened() {
                View view = findViewById(R.id.Fab_menu);
              view.setBackgroundColor(Color.parseColor("#ffffff"));


            }
            @Override
            public void onMenuClosed() {
                //TODO something when menu is closed
            }
        });

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent i;
        switch (id) {
            case R.id.fab_item_delete:
                i = new Intent(getApplicationContext(), DeleteAccDialogActivity.class);
                startActivity(i);

                break;
            case R.id.fab_item_change_password:

                i = new Intent(getApplicationContext(), UpdatePasswordactivity.class);
                startActivity(i);

                break;
            case R.id.fab_item_update_account:

                Toast.makeText(this, "Updated", Toast.LENGTH_SHORT)
                        .show();

                break;

        }

    }

}
