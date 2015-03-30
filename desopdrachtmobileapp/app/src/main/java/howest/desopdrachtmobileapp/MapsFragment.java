package howest.desopdrachtmobileapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by chris on 30/03/15.
 */
public class MapsFragment extends android.support.v4.app.Fragment {
    View rootView;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        rootView = inflater.inflate(R.layout.fragment_maps, container, false);
//        return rootView;



        try {
            rootView = inflater.inflate(R.layout.fragment_maps, container, false);
        } catch (InflateException e) {
        /* map is already there, just return view as it is */
        }
        return rootView;

    }

    @Override
    public void onDestroy() {
//        fragmentTransaction.remove(yourfragment).commit();
        super.onDestroy();
    }
}
