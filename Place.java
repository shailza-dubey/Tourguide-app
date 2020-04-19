package com.example.delhidarshan;

public class Place {
    /*
     *Name of the place
     */
    private String mPlaceName;

    /*
     * Address of the place
     */
    private String mPlaceAddress;

    /*
     * Image Resource ID for the place.
     */
    private int mImageResourceId;


    public Place(String placeName, String placeAddress, int imageResourceId){
        mPlaceName = placeName;
        mPlaceAddress = placeAddress;
        mImageResourceId = imageResourceId;
    }

    /*
     * get the name of the place.
     */
    public String getmPlaceName(){
        return mPlaceName;
    }

    /*
     * get the address of the place.
     */
    public String getmPlaceAddress(){
        return mPlaceAddress;
    }

    /*
     * get the image resource ID of the place.
     */
    public int getmImageResourceId(){
        return mImageResourceId;
    }



}


