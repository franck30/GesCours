package com.iut.gescours.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

import com.iut.gescours.R;

public class MainActivity extends AppCompatActivity {

    private Button mButtonEnseignant;
    private Button mButtonEtudiant;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        mButtonEnseignant = (Button) findViewById(R.id.button_enseignant);
        mButtonEtudiant = (Button) findViewById(R.id.button_etudiant);


        mButtonEnseignant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchEnseignantActivity();
            }
        });

        mButtonEtudiant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchEtudiantActivity();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_tool_bar, menu );
        return true;
    }

    private void launchEnseignantActivity(){
        Intent myIntent = new Intent(MainActivity.this, EnseignantActivity.class);
        this.startActivity(myIntent);
    }

    private void launchEtudiantActivity(){
        Intent myIntent = new Intent(MainActivity.this, EtudiantActivity.class);
        this.startActivity(myIntent);
    }


}
