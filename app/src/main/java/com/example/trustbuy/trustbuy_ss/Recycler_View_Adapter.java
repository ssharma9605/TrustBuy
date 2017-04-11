package com.example.trustbuy.trustbuy_ss;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;



public class Recycler_View_Adapter extends RecyclerView.Adapter<Recycler_View_Adapter.ViewHolder>
{

    private List<RecyclerViewDataActivity> list ,filterList;
    Context context;
    private AdapterView.OnItemClickListener mItemClickListener;


    public Recycler_View_Adapter(List<RecyclerViewDataActivity> list, Context context) {
        this.list = list;
        this.context = context;
       // this.filterList = new ArrayList<RecyclerViewDataActivity>();
        // we copy the original list to the filter list and use it for setting row values
        this.filterList.addAll(this.list);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Inflate the layout, initialize the View Holder
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_adlayout_activity, parent, false);
        return new ViewHolder(v);


    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        //Use the provided View Holder on the onCreateViewHolder method to populate the current row on the RecyclerView
        RecyclerViewDataActivity listitem = filterList.get(position);
        holder.title.setText(listitem.title);
        holder.description.setText(listitem.description);
        holder.imageView.setImageResource(listitem.imageId);


        //animate(holder);

    }

    @Override
    public int getItemCount() {
        //returns the number of elements the RecyclerView will display
        return (null != filterList ? filterList.size() : 0);
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    // Insert a new item to the RecyclerView on a predefined position
    public void insert(int position, RecyclerViewDataActivity data) {
        list.add(position, data);
        notifyItemInserted(position);
    }

    // Remove a RecyclerView item containing a specified Data object
    public void remove(RecyclerViewDataActivity data) {
        int position = list.indexOf(data);
        list.remove(position);
        notifyItemRemoved(position);
    }

    // Do Search...
    public void filter(final String text) {

        // Searching could be complex..so we will dispatch it to a different thread...
        new Thread(new Runnable() {
            @Override
            public void run() {

                // Clear the filter list
                filterList.clear();

                // If there is no search value, then add all original list items to filter list
                if (TextUtils.isEmpty(text)) {

                    filterList.addAll(list);

                } else {
                    // Iterate in the original List and add it to filter list...
                    for (RecyclerViewDataActivity item : list) {
                        if (item.title.toLowerCase().contains(text.toLowerCase()) ||
                                item.description.toLowerCase().contains(text.toLowerCase())) {
                            // Adding Matched items
                            filterList.add(item);
                        }
                    }
                }

                // Set on UI Thread
                ((Activity) context).runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        // Notify the List that the DataSet has changed...
                        notifyDataSetChanged();
                    }
                });

            }
        }).start();

    }
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        CardView cv;
        TextView title;
        TextView description;
        ImageView imageView;

        ViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.card);
            title = (TextView) itemView.findViewById(R.id.title);
            description = (TextView) itemView.findViewById(R.id.description);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            itemView.setOnClickListener(this);
            context = itemView.getContext();

        }


        @Override
        public void onClick(View view) {
            int position=getAdapterPosition();

            final Intent intent;
            switch (getAdapterPosition()) {
                case 0:
                    intent = new Intent(context, PostedAdscreenActivity.class);
                    break;

                default:
                    intent = new Intent(context, MainActivity.class);
                    break;
            }
            context.startActivity(intent);
        }
    }


  }



