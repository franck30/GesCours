package com.iut.gescours.activities;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageView;

import com.iut.gescours.AuthBfdCap;
import com.iut.gescours.MorphoTabletFPSensorDevice;
import com.iut.gescours.R;
import com.iut.gescours.adapters.EnseignantPageAdapter;
import com.morpho.morphosmart.sdk.MorphoDevice;

public class EnseignantActivity extends AppCompatActivity implements AuthBfdCap{


    private MorphoTabletFPSensorDevice fpSensorCap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enseignant);




        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        ActionBar ab = getSupportActionBar();
        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);


        this.configureViewPagerAndTabs();

        fpSensorCap = new MorphoTabletFPSensorDevice(this);
        fpSensorCap.open(this);


        try {
            fpSensorCap.startCapture();
        } catch (Exception e) {
            Log.e(this.getClass().toString(), "capture", e);
        }

    }

    private void configureViewPagerAndTabs(){

        //get view pager from layout

        ViewPager pager = (ViewPager) findViewById(R.id.activity_enseignant_viewpager);


        pager.setAdapter(new EnseignantPageAdapter(getSupportFragmentManager()));

        // 1 - Get TabLayout from layout
        TabLayout tabs= (TabLayout)findViewById(R.id.activity_enseignant_tabs);
        // 2 - Glue TabLayout and ViewPager together
        tabs.setupWithViewPager(pager);
        // 3 - Design purpose. Tabs have the same width
        tabs.setTabMode(TabLayout.MODE_FIXED);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_tool_bar, menu );
        return true;
    }

    @Override
    public void updateImageView(ImageView imgPreview, Bitmap previewBitmap, String message, boolean flagComplete, int captureError) {

    }

}
