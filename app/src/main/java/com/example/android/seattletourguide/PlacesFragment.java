package com.example.android.seattletourguide;


import android.content.Intent;
import android.database.Cursor;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

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


    private static final String TAG = "";

    public PlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);
        Log.d(TAG, "onCreate: Started.");

        final ArrayList<LocationInformation> location = new ArrayList<LocationInformation>();


        location.add(new LocationInformation(getString(R.string.pikemarket), getString(R.string.pikemarket_address), getString(R.string.pikemarket_info), R.drawable.pikemarket, getString(R.string.pikemarket_web)));
        location.add(new LocationInformation(getString(R.string.spaceneedle), getString(R.string.spaceneedle_address), getString(R.string.spaceneedle_info), R.drawable.spaceneedle, getString(R.string.spaceneedle_web)));
        location.add(new LocationInformation(getString(R.string.gaswork), getString(R.string.gaswork_address), getString(R.string.gaswork_info), R.drawable.gaswork, getString(R.string.gaswork_web)));


        LocationAdapter adapter = new LocationAdapter(getActivity(), location);


        final ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);

        /*
        Creating a onItemClick listener for the places to visit.
        Clicking will launch and implicit intent to web address.
        */
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                LocationInformation item = (LocationInformation) adapterView.getItemAtPosition(position);

                String webUrl = item.getmWebAddress();

                String attractionName = item.getmAttractionName();

                Intent internet = new Intent(Intent.ACTION_VIEW);

                internet.setData(Uri.parse(webUrl));

                startActivity(internet);

                Toast.makeText(getContext(), "Visiting Website For: " + attractionName, Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }


}
