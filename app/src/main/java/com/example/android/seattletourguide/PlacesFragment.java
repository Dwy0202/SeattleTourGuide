package com.example.android.seattletourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/*
    Image Sources:

    Top banner:
    https://www.flickr.com/photos/sworldguy/15248037137

    Pike Market
    https://commons.wikimedia.org/wiki/File:Pike_Place_Market_Entrance.JPG

    Space Needle
    https://www.flickr.com/photos/iip-photo-archive/38089649896


    Gas Work Park Image source
    https://commons.wikimedia.org/wiki/File:Gas_Works_Park-2.jpg
    */

/**
 * A simple {@link Fragment} subclass.
 */
public class PlacesFragment extends Fragment {


    public PlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);


        final ArrayList<LocationInformation> location = new ArrayList<LocationInformation>();


        location.add(new LocationInformation(getString(R.string.pikemarket), getString(R.string.pikemarket_address), getString(R.string.pikemarket_info), R.drawable.pikemarket));
        location.add(new LocationInformation(getString(R.string.spaceneedle), getString(R.string.spaceneedle_address), getString(R.string.spaceneedle_info), R.drawable.spaceneedle));
        location.add(new LocationInformation(getString(R.string.gaswork), getString(R.string.gaswork_address), getString(R.string.gaswork_info), R.drawable.gaswork));


        LocationAdapter adapter = new LocationAdapter(getActivity(), location);


        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);


        return rootView;
    }

}
