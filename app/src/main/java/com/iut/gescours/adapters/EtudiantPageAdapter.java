package com.iut.gescours.adapters;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.iut.gescours.fragments.EnseignantConsultationFragment;
import com.iut.gescours.fragments.EnseignantEnregistrementFragment;
import com.iut.gescours.fragments.EnseignantPresenceFragment;
import com.iut.gescours.fragments.EtudiantConsultationFragment;
import com.iut.gescours.fragments.EtudiantEnregistrementFragment;
import com.iut.gescours.fragments.EtudiantPresenceFragment;

public class EtudiantPageAdapter extends FragmentPagerAdapter {

    public EtudiantPageAdapter(FragmentManager mgr) {

        super(mgr);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: //Page number 1
                return EtudiantEnregistrementFragment.newInstance();
            case 1: //Page number 2
                return EtudiantPresenceFragment.newInstance();
            case 2: //Page number 3
                return EtudiantConsultationFragment.newInstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return (3);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: //Page number 1
                return "Enregistrement";
            case 1: //Page number 2
                return "Marquer presence";
            case 2: //Page number 3
                return "Programme de cours ";
            default:
                return null;
        }
    }
}
