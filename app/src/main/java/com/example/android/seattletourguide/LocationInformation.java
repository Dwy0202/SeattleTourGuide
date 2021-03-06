package com.example.android.seattletourguide;

/**
 * Created by Derek on 7/9/18.
 */

public class LocationInformation {

    private String mAttractionName;

    private String mAddress;

    private String mAttractionInfo;

    private int mImageResourceId = NO_IMAGE;

    private static final int NO_IMAGE = -1;

    private String mWebAddress;


    public LocationInformation(String attractionName, String address, String attractionInfo, Integer imageResourceId, String webAddress) {
        mAttractionName = attractionName;
        mAddress = address;
        mAttractionInfo = attractionInfo;
        mImageResourceId = imageResourceId;
        mWebAddress = webAddress;

    }

    public String getmWebAddress() {
        return mWebAddress;
    }


    public String getmAttractionName() {
        return mAttractionName;
    }

    public String getmAddress() {
        return mAddress;
    }

    public String getmAttractionInfo() {
        return mAttractionInfo;
    }


    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {

        return mImageResourceId != NO_IMAGE;
    }


}