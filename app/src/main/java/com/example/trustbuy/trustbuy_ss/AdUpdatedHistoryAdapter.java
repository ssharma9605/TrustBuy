package com.example.trustbuy.trustbuy_ss;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by PC User on 2017-04-10.
 */

public class AdUpdatedHistoryAdapter extends ArrayAdapter<AdUpdatedHistoryLayoutActivity> {
        Context context;

public AdUpdatedHistoryAdapter(Context context, int resourceId,
        List<AdUpdatedHistoryLayoutActivity> items) {
        super(context, resourceId, items);
        this.context = context;
        }

/*private view holder class*/
private class ViewHolder {
    ImageView imageView;
    TextView txtTitle;
    TextView txtPrice;
    TextView txtDesc;
}

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        AdUpdatedHistoryLayoutActivity rowItem = getItem(position);

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.ad_updatedhistory_layout_activity, null);
            holder = new ViewHolder();
            holder.txtDesc = (TextView) convertView.findViewById(R.id.desc);
            holder.txtTitle = (TextView) convertView.findViewById(R.id.title);
            holder.txtPrice = (TextView) convertView.findViewById(R.id.price);
            holder.imageView = (ImageView) convertView.findViewById(R.id.icon);
            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();

        holder.txtDesc.setText(rowItem.getDesc());
        holder.txtTitle.setText(rowItem.getTitle());
        holder.txtPrice.setText(rowItem.getPrice());
        holder.imageView.setImageResource(rowItem.getImageId());

        return convertView;
    }
}
