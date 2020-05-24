package com.lionelnkeoua.com.bwala.view.fragment.youlou.youlou;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

import com.lionelnkeoua.com.bwala.R;
import com.lionelnkeoua.com.bwala.adapter.YoulouPagerAdapter;
import com.lionelnkeoua.com.bwala.transformer.ZoumoutPageTransformer;


public class YoulouActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youlou);

        final TabLayout tabLayout = (TabLayout)findViewById(R.id.tab);
        tabLayout.addTab(tabLayout.newTab().setText("Naissance et etude"));
        tabLayout.addTab(tabLayout.newTab().setText("Debut en politique"));
        tabLayout.addTab(tabLayout.newTab().setText("La présidence"));
        tabLayout.addTab(tabLayout.newTab().setText("Fin "));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager)findViewById(R.id.youlou_pager);
        final YoulouPagerAdapter youlouPagerAdapter = new YoulouPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(youlouPagerAdapter);
        viewPager.setPageTransformer(true, new ZoumoutPageTransformer());
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    }

