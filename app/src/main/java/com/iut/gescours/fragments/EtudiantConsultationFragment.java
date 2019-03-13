package com.iut.gescours.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iut.gescours.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class EtudiantConsultationFragment extends android.support.v4.app.Fragment {


    public EtudiantConsultationFragment() {
        // Required empty public constructor
    }

    public static EtudiantConsultationFragment newInstance() {
        return (new EtudiantConsultationFragment());
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_etudiant_consultation, container, false);
    }

}
