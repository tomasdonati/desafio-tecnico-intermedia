package com.example.intermedia_challenge.view.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.intermedia_challenge.R;
import com.example.intermedia_challenge.view.Fragments.CharactersFragment;
import com.example.intermedia_challenge.view.Fragments.EventsFragment;
import com.example.intermedia_challenge.view.Fragments.InformationFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.mainactivity_bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.mainactivity_fragment_container,
                new CharactersFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch(item.getItemId()){
                        case R.id.bottomNavBtnCharacters:
                            selectedFragment = new CharactersFragment();
                            break;

                        case R.id.bottomNavBtnEvents:
                            selectedFragment = new EventsFragment();
                            break;

                        case R.id.bottomNavBtnInfo:
                            selectedFragment = new InformationFragment();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.mainactivity_fragment_container,
                            selectedFragment).commit();

                    return true;
                }
            };
}