package com.lionelnkeoua.com.bwala.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Lionel on 19/06/2018.
 */
public class GeorgeDiossoPagerAdapter extends FragmentStatePagerAdapter{
    private  int NUM_ITEM;

    public GeorgeDiossoPagerAdapter(FragmentManager fm, int a) {
        super(fm);
        this.NUM_ITEM=a;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){

        }
        return null;
    }

    @Override
    public int getCount() {
        return NUM_ITEM;
    }
}
