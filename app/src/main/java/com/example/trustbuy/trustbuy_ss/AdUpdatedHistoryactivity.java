package com.example.trustbuy.trustbuy_ss;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class AdUpdatedHistoryactivity extends PostedAdscreenActivity implements AdapterView.OnItemClickListener {

    public static final String[] titles = new String[]{"Murach PHP textbook",
            "Murach PHP textbook", "Murach PHP textbook", "Murach PHP textbook"};
    public static final String[] prices = new String[]{"$20","$20","$20","$20"            };

    public static final String[] descriptions = new String[]{
            "Updated Ad on April 3 2017",
            "Updated Ad on February 25 2017", "Updated Ad on February 20 2017",
            "Posted Ad on February 19 2017"};

    public static final Integer[] images = {R.drawable.murach,
            R.drawable.murach, R.drawable.murach, R.drawable.murach};
    ListView listView;
    List<AdUpdatedHistoryLayoutActivity> rowItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ad_updatedhistory_activity);
        rowItems = new ArrayList<AdUpdatedHistoryLayoutActivity>();
        for (int i = 0; i < titles.length; i++) {
            AdUpdatedHistoryLayoutActivity item = new AdUpdatedHistoryLayoutActivity(images[i], titles[i],prices[i],descriptions[i]);
            rowItems.add(item);
        }

        listView = (ListView) findViewById(R.id.list);
        AdUpdatedHistoryAdapter adapter = new  AdUpdatedHistoryAdapter(this,
                R.layout.ad_updatedhistory_layout_activity, rowItems);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Item " + (position + 1) + ": " + rowItems.get(position),
                Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();
    }

}
