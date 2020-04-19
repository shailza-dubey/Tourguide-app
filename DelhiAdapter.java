package com.example.delhidarshan;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import com.example.delhidarshan.Place;
import com.example.delhidarshan.R;

import java.util.ArrayList;

public class DelhiAdapter extends ArrayAdapter<Place> {
    /** Resource ID for the backgroundd color for the list of words.*/
    private int mColorResourceId;

    public DelhiAdapter(Activity context, ArrayList<Place> places, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name_text_view
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Get the version name from the current Place object and
        // set this text on the name TextView
        nameTextView.setText(currentPlace.getmPlaceName());

        // Find the TextView in the list_item.xml layout with the ID address_text_view
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        // Get the version number from the current Place object and
        // set this text on the number TextView
        addressTextView.setText(currentPlace.getmPlaceAddress());

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
        //Set the ImageView to the image resource specified in the current Place
        iconView.setImageResource(currentPlace.getmImageResourceId());

        // Set the theme color for the list item.
        View textContainer = listItemView.findViewById(R.id.item_container);
        // Find the color that the resource ID maps to.
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View.
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
