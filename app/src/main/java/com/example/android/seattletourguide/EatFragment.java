package com.example.android.seattletourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/*
Food Image Sources

Un Bien:
http://res.cloudinary.com/sagacity/image/upload/c_crop,h_1068,w_1200,x_91,y_0/c_limit,w_640/v1446074696/unBien_BestRest-3246_nj6gd4.jpg

Walrus and the Carpenter
https://www.theinfatuation.com/seattle/reviews/the-walrus-and-the-carpenter

Seattle Fish Guy
https://www.flickr.com/photos/kenlund/1283106290

 */


public class EatFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);


        final ArrayList<LocationInformation> location = new ArrayList<LocationInformation>();


        location.add(new LocationInformation(getString(R.string.unbien), getString(R.string.unbien_address),getString(R.string.unbien_info),R.drawable.unbien));
        location.add(new LocationInformation(getString(R.string.walrus), getString(R.string.walrus_address), getString(R.string.walrus_info),R.drawable.walrus));
        location.add(new LocationInformation(getString(R.string.seattle_fish_guy), getString(R.string.seattle_fish_guy_address), getString(R.string.seattle_fish_guy_info),R.drawable.seattlefish));



        LocationAdapter adapter = new LocationAdapter(getActivity(), location);



        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);



        return rootView;
    }
}
