package com.lionelnkeoua.com.bwala.view.fragment.youlou.lissouba;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

import com.lionelnkeoua.com.bwala.R;
import com.lionelnkeoua.com.bwala.adapter.LissoubaPagerAdapter;
import com.lionelnkeoua.com.bwala.transformer.ZoumoutPageTransformer;

public class LissoubaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lissouba);

        final TabLayout tabLayout = (TabLayout)findViewById(R.id.tab);
        tabLayout.addTab(tabLayout.newTab().setText("Naissance et Etude"));
        tabLayout.addTab(tabLayout.newTab().setText("Ascention Politique"));
        tabLayout.addTab(tabLayout.newTab().setText("Traverser du Desert"));
        tabLayout.addTab(tabLayout.newTab().setText("De la retraite au retour"));
        tabLayout.addTab(tabLayout.newTab().setText("Conquete du pouvoir"));
        tabLayout.addTab(tabLayout.newTab().setText("Debut presidence"));
        tabLayout.addTab(tabLayout.newTab().setText("Election anticipée"));
        tabLayout.addTab(tabLayout.newTab().setText("Fin"));
        tabLayout.addTab(tabLayout.newTab().setText("Exil"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.lissouba_pager);
        final LissoubaPagerAdapter lissoubaPagerAdapter= new LissoubaPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(lissoubaPagerAdapter);
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
