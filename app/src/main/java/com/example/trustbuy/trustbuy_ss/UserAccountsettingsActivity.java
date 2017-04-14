package com.example.trustbuy.trustbuy_ss;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.Toast;
import com.sa90.materialarcmenu.ArcMenu;


public class UserAccountsettingsActivity extends MenubarActivity implements View.OnClickListener{
    ArcMenu arcMenuAndroid;
    private FloatingActionButton fab_item_delete,fab_item_change_password,fab_item_update_account;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_accountsettings_activity);
        arcMenuAndroid = (ArcMenu) findViewById(R.id.Fab_menu);
        fab_item_delete = (FloatingActionButton) findViewById(R.id.fab_item_delete);
        fab_item_change_password= (FloatingActionButton) findViewById(R.id.fab_item_change_password);
        fab_item_update_account= (FloatingActionButton) findViewById(R.id.fab_item_update_account);

        fab_item_delete.setOnClickListener(this);
        fab_item_change_password.setOnClickListener(this);
        fab_item_update_account.setOnClickListener(this);
            }
    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent i;
        switch (id){
            case R.id.fab_item_delete:
                setContentView(R.layout.delete_account_dialog_activity);
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
//                Log.d("Raj", "Fab 2");
                break;
        }
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


