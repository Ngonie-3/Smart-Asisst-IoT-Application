package com.example.homeassist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FourthActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        bottomNavigationView=findViewById(R.id.unterseite_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(unterseiteNavMethod);
        getSupportFragmentManager().beginTransaction().replace(R.id.container1, new LichterAnFragment()).commit();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener unterseiteNavMethod = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

            Fragment fragment = null;

            switch (menuItem.getItemId()){
                case R.id.LichterAn:
                    fragment=new LichterAnFragment();
                    break;

                case R.id.LichtenAus:
                    fragment=new LichtenAusFragment();
                    break;

                case R.id.LüfterAn:
                    fragment=new LufterAnFragment();
                    break;

                case R.id.LüfterAus:
                    fragment=new LufterAusFragment();
                    break;
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.container1, fragment).commit();

            return true;
        }
    };
}