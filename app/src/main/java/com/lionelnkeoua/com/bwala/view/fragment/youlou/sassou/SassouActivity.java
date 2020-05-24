package com.lionelnkeoua.com.bwala.view.fragment.youlou.sassou;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lionelnkeoua.com.bwala.R;
import com.lionelnkeoua.com.bwala.adapter.SassouPagerAdapter;
import com.lionelnkeoua.com.bwala.transformer.ZoumoutPageTransformer;

public class SassouActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sassou);

        final TabLayout tabLayout = (TabLayout)findViewById(R.id.tab);
        tabLayout.addTab(tabLayout.newTab().setText("Naissance et etude"));
        tabLayout.addTab(tabLayout.newTab().setText("Debut en Politique"));
        tabLayout.addTab(tabLayout.newTab().setText("Conquete du pouvoir"));
        tabLayout.addTab(tabLayout.newTab().setText("La conférence nationale"));
        tabLayout.addTab(tabLayout.newTab().setText("La guere civile"));
        tabLayout.addTab(tabLayout.newTab().setText("L'après guerre"));
        tabLayout.addTab(tabLayout.newTab().setText("Le second mandat"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager)findViewById(R.id.sassou_pager);
        final SassouPagerAdapter sassouPagerAdapter = new SassouPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(sassouPagerAdapter);
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
}
