package com.example.trustbuy.trustbuy_ss;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by PC User on 2017-04-13.
 */

public class InboxActivity extends UserAccountsettingsActivity implements AdapterView.OnItemClickListener {
        ListView listView;
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inbox_activity);
        listView = (ListView) findViewById(R.id.messages);
        listView.setOnItemClickListener((AdapterView.OnItemClickListener) this);
        }
public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {
        if (position == 0) {
        Intent india = new Intent(getApplicationContext(), InboxMsgDisplayActivity.class);
        startActivity(india);
        } else if (position == 1) {
        Intent pakistan = new Intent(getApplicationContext(), InboxMsgDisplayActivity.class);
        startActivity(pakistan);
        } else if (position == 2) {
        Intent china = new Intent(getApplicationContext(), InboxMsgDisplayActivity.class);
        startActivity(china);
        }
        else if (position == 3) {
        Intent canada = new Intent(getApplicationContext(), InboxMsgDisplayActivity.class);
        startActivity(canada);
        }
        else if (position == 4) {
        Intent usa = new Intent(getApplicationContext(), InboxMsgDisplayActivity.class);
        startActivity(usa);
        }
        }
        }
