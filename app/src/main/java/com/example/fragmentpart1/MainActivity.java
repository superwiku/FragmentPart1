package com.example.fragmentpart1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;


import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    Toolbar toolbar;
    Fragment fragment = null;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=(Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("FRAGMENT SERI PERTAMA");

        tabLayout=(TabLayout)findViewById(R.id.tab_layout);
        tabLayout.setTabTextColors(getResources().getColor(R.color.colorPrimaryDark),getResources().getColor(R.color.colorWhite));
        frameLayout=(FrameLayout)findViewById(R.id.frame_layout);

        fragment=new HomeFragment();
        fragmentManager=getSupportFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout,fragment);
        fragmentTransaction.setTransition(fragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.commit();

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch ((tab.getPosition())){
                    case 0:
                        fragment=new HomeFragment();
                        break;
                    case 1:
                        fragment=new JavaFragment();
                        break;
                    case 2:
                        fragment=new CplusplusFragment();
                        break;
                    case 3:
                        fragment=new PhytonFragment();
                        break;
                }
                FragmentManager fUbah = getSupportFragmentManager();
                FragmentTransaction ftUbah = fUbah.beginTransaction();
                ftUbah.replace(R.id.frame_layout,fragment);
                ftUbah.setTransition(ftUbah.TRANSIT_FRAGMENT_OPEN);
                ftUbah.commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }
}