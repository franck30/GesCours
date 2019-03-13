package com.iut.gescours.adapters;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.iut.gescours.fragments.EnseignantConsultationFragment;
import com.iut.gescours.fragments.EnseignantEnregistrementFragment;
import com.iut.gescours.fragments.EnseignantPresenceFragment;

public class EnseignantPageAdapter extends FragmentPagerAdapter {

    public EnseignantPageAdapter(FragmentManager mgr) {

        super(mgr);
    }

    @Override
    public int getCount() {
        return (3);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: //Page number 1
                return EnseignantEnregistrementFragment.newInstance();
            case 1: //Page number 2
                return EnseignantPresenceFragment.newInstance();
            case 2: //Page number 3
                return EnseignantConsultationFragment.newInstance();
            default:
                return null;
        }

    }


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
