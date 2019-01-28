package com.example.android.seattletourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/*
Play Image Sources:

Deception Pass Image
https://upload.wikimedia.org/wikipedia/commons/9/9d/Deception_Pass_Bridge_03.jpg

Mount Rainier
https://commons.wikimedia.org/wiki/Mount_Rainier#/media/File:Mount_Rainier_from_northwest.jpg

San Juan Island
https://www.flickr.com/photos/mypubliclands/15988106935
 */

public class PlayFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);


        final ArrayList<LocationInformation> location = new ArrayList<LocationInformation>();


        location.add(new LocationInformation(getString(R.string.deception), getString(R.string.deception_address), getString(R.string.deception_info), R.drawable.deception));
        location.add(new LocationInformation(getString(R.string.mtrainier), getString(R.string.mtrainier_address), getString(R.string.mtrainier_info), R.drawable.mountrainier));
        location.add(new LocationInformation(getString(R.string.sanjuan), getString(R.string.sanjuan_address), getString(R.string.sanjuan_info), R.drawable.sanjuan));


        LocationAdapter adapter = new LocationAdapter(getActivity(), location);


        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);


        return rootView;
    }
}

