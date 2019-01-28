package com.example.android.seattletourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Derek on 7/9/18.
 */

public class LocationAdapter extends ArrayAdapter<LocationInformation> {


    public LocationAdapter(Activity context, ArrayList<LocationInformation> place) {

        super(context, 0, place);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        LocationInformation location = getItem(position);


        TextView attractionName = (TextView) listItemView.findViewById(R.id.attraction_name);
        attractionName.setText(location.getmAttractionName());


        TextView address = (TextView) listItemView.findViewById(R.id.attraction_address);
        address.setText(location.getmAddress());

        TextView attractionInfo = (TextView) listItemView.findViewById(R.id.attraction_info);
        attractionInfo.setText(location.getmAttractionInfo());


        ImageView defaultImageView = (ImageView) listItemView.findViewById(R.id.image);

        if (location.hasImage()) {
            defaultImageView.setImageResource(location.getImageResourceId());


            defaultImageView.setVisibility(View.VISIBLE);
        } else {
            defaultImageView.setVisibility(View.GONE);
        }


        return listItemView;

    }


}

