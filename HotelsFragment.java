package com.example.delhidarshan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.delhi_list, container, false);


        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.hotel_1), getString(R.string.hot_add_1),
                R.drawable.thegrand));
        places.add(new Place(getString(R.string.hotel_2), getString(R.string.hot_add_2),
                R.drawable.novotelaerocity));
        places.add(new Place(getString(R.string.hotel_3), getString(R.string.hot_add_3),
                R.drawable.vivanta));
        places.add(new Place(getString(R.string.hotel_4), getString(R.string.hot_add_4),
                R.drawable.tajpalace));
        places.add(new Place(getString(R.string.hotel_5), getString(R.string.hot_add_5),
                R.drawable.thelalit));
        places.add(new Place(getString(R.string.hotel_6), getString(R.string.hot_add_6),
                R.drawable.thehyattregency));
        places.add(new Place(getString(R.string.hotel_7), getString(R.string.hot_add_7),
                R.drawable.itcmaurya));
        places.add(new Place(getString(R.string.hotel_8), getString(R.string.hot_add_8),
                R.drawable.thelodhi));
        places.add(new Place(getString(R.string.hotel_9), getString(R.string.hot_add_9),
                R.drawable.theleelapalace));
        places.add(new Place(getString(R.string.hotel_10), getString(R.string.hot_add_10),
                R.drawable.jwmarriot));



        // Create an {@link DelhiAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        DelhiAdapter adapter = new DelhiAdapter(getActivity(), places, R.color.category_hotels);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // delhi_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link DelhiAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }


}