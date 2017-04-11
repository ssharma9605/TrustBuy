package com.example.trustbuy.trustbuy_ss;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends UserAccountsettingsActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<RecyclerViewDataActivity> data = fill_with_data();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        Recycler_View_Adapter adapter = new Recycler_View_Adapter(data, getApplication());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        recyclerView.setItemAnimator(itemAnimator);

    }

    public List<RecyclerViewDataActivity> fill_with_data() {

        List<RecyclerViewDataActivity> data = new ArrayList<>();

        data.add(new RecyclerViewDataActivity("Murach PHP textbook","$20", "Murach second-hand textbook for sale. Almost brand-new. Message if interested.Selling price:20 dollars ", R.drawable.murach));
        data.add(new RecyclerViewDataActivity("Fundamentals Of Java ","$30",  " Sharpen your Java skills.GreatCondition. Great buy for less! ", R.drawable.murachjava));
        data.add(new RecyclerViewDataActivity("Bicycle for sale","$70",  " Love riding to work or school? Reduce your carbon print?Excellent condition. price:70$ ", R.drawable.bicycle));
        data.add(new RecyclerViewDataActivity("Office Chair available","$35",  "If you are looking for a comfortable chair to work in,this is it.good condition.Price:35 dollars", R.drawable.chair));
        data.add(new RecyclerViewDataActivity("Bed & mattress sale ","$150",  "Comfortable bed and mattress from a non-smoking,no pet home. Single owner and used 3 years.Price:150 $", R.drawable.bed));
        data.add(new RecyclerViewDataActivity("Study lamp", "Free", "Black study lamp. works perfectly well. Free. ", R.drawable.lamp));

        return data;
    }


}

