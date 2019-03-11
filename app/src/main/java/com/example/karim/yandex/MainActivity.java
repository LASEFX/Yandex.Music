package com.example.karim.yandex;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment = null;

                    switch (menuItem.getItemId()) {
                        case R.id.main:
                            selectedFragment = new Main();
                            break;
                        case R.id.prefer:
                            selectedFragment = new Recomendation();
                            break;
                        case R.id.radio:
                            selectedFragment = new Radio();
                            break;
                        case R.id.mymusic:
                            selectedFragment = new Mymusic();
                            break;
                        case R.id.search:
                            selectedFragment = new Search();
                            break;

                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmnet_container,
                            selectedFragment).commit();
                    return true;

                }
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView bottom = findViewById(R.id.navigation);
        bottom.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmnet_container,
                new Main()).commit();
    }
}