package ga.sertxu.www.mercatmedievalxativa2016;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Miercoles extends Fragment {

    private AdView mAdView;
    public Miercoles() {
    }

    public static Miercoles newInstance() {
        Miercoles miercoles = new Miercoles();
        return miercoles;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_inicio_3, container, false);
        mAdView = (AdView) rootView.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        return rootView;
    }
}