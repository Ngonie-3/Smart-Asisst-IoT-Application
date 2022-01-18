package com.example.homeassist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ThirdActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;


    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        bottomNavigationView=findViewById(R.id.bottom_nav);

        bottomNavigationView.setOnNavigationItemSelectedListener(bottomNavMethod);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new LightsOnFragment()).commit();

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener bottomNavMethod = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

            Fragment fragment = null;

            switch(menuItem.getItemId()){
                case R.id.LightsOn:
                    fragment=new LightsOnFragment();
                    break;

                case R.id.LightsOff:
                    fragment=new LightsOffFragment();
                    break;

                case R.id.FanOn:
                    fragment=new FanOnFragment();
                    break;

                case R.id.FanOff:
                    fragment=new FanOffFragment();
                    break;
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();

            return true;
        }
    };

}