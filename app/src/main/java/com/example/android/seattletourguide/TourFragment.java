package com.example.android.seattletourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/*
Tour Image Sources:

Boeing Tour
https://commons.wikimedia.org/wiki/File:Jetstar%27s_first_787_on_the_production_line_(9132370198).jpg

Seattle Underground
https://www.flickr.com/photos/-jvl-/14839058606

Ride The Ducks
http://mediad.publicbroadcasting.net/p/northwestnews/files/styles/x_large/public/201509/ridetheducks.jpg

 */

public class TourFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);


        final ArrayList<LocationInformation> location = new ArrayList<LocationInformation>();

//
//        location.add(new LocationInformation(getString(R.string.boeing), getString(R.string.boeing_address), getString(R.string.boeing_info), R.drawable.boeing));
//        location.add(new LocationInformation(getString(R.string.seattleunderground), getString(R.string.seattleunderground_address), getString(R.string.seattleunderground_info), R.drawable.seattleunderground));
//        location.add(new LocationInformation(getString(R.string.ridetheduck), getString(R.string.ridetheduck_address), getString(R.string.ridetheduck_info), R.drawable.ridetheduck));


        LocationAdapter adapter = new LocationAdapter(getActivity(), location);


        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);


        return rootView;
    }
}
