package com.example.trustbuy.trustbuy_ss;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;


public class MenubarActivity extends AppCompatActivity {

    private MenuItem menuItem;
    public Intent i ;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainmenu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()) {
            // action with ID action_refresh was selected
            case R.id.action_home:
                setContentView(R.layout.activity_main);
                i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                break;
            // action with ID action_inbox was selected
            case R.id.action_UserInbox:
                Toast.makeText(this, "Inbox", Toast.LENGTH_SHORT)
                        .show();
                i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                break;
            case R.id.action_createad:
                Toast.makeText(this, "Build your Ad", Toast.LENGTH_SHORT)
                        .show();
                i = new Intent(getApplicationContext(), CreateAdActivity.class);
                startActivity(i);
                break;
            case R.id.action_signout:
                Toast.makeText(this, "Logged out", Toast.LENGTH_SHORT)
                        .show();
                i = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(i);
                break;
            case R.id.action_friends:
                Toast.makeText(this, "Friend List", Toast.LENGTH_SHORT)
                        .show();
                i = new Intent(getApplicationContext(), FriendsActivity.class);
                startActivity(i);
                item.setTitle("Friends");
                break;
            case R.id.action_watchlist:
                Toast.makeText(this, "Watchlist", Toast.LENGTH_SHORT)
                        .show();
                 i = new Intent(getApplicationContext(), WatchlistActivity.class);
                startActivity(i);
             break;
            case R.id.action_history:
                Toast.makeText(this, "History", Toast.LENGTH_SHORT)
                        .show();
                i = new Intent(getApplicationContext(), PostedAdscreenActivity.class);
                startActivity(i);
                break;
            default:
                break;
        }

        return true;
    }

}