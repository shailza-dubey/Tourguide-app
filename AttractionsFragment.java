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
public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.delhi_list, container, false);


        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.attract_1), getString(R.string.att_add_1),
                R.drawable.redfort));
        places.add(new Place(getString(R.string.attract_2), getString(R.string.att_add_2),
                R.drawable.qutubminar));
        places.add(new Place(getString(R.string.attract_3), getString(R.string.att_add_3),
                R.drawable.banglasahib));
        places.add(new Place(getString(R.string.attract_4), getString(R.string.att_add_4),
                R.drawable.indiagate));
        places.add(new Place(getString(R.string.attract_5), getString(R.string.att_add_5),
                R.drawable.jamamasjid));
        places.add(new Place(getString(R.string.attract_6), getString(R.string.att_add_6),
                R.drawable.humayauntomb));
        places.add(new Place(getString(R.string.attract_7), getString(R.string.att_add_7),
                R.drawable.akshardham));
        places.add(new Place(getString(R.string.attract_8), getString(R.string.att_add_8),
                R.drawable.rajpath));
        places.add(new Place(getString(R.string.attract_9), getString(R.string.att_add_9),
                R.drawable.jantarmantar));



        // Create an {@link DelhiAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        DelhiAdapter adapter = new DelhiAdapter(getActivity(), places, R.color.category_attractions);

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