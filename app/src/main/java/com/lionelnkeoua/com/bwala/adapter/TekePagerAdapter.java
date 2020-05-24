package com.lionelnkeoua.com.bwala.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.lionelnkeoua.com.bwala.royaumes.teke.Croyance;
import com.lionelnkeoua.com.bwala.royaumes.teke.Histoire;
import com.lionelnkeoua.com.bwala.royaumes.teke.Mariage;
import com.lionelnkeoua.com.bwala.royaumes.teke.Organisation;
import com.lionelnkeoua.com.bwala.royaumes.teke.Origine;

/**
 * Created by Lionel on 24/04/2018.
 */
public class TekePagerAdapter extends FragmentStatePagerAdapter {
    private int NUM_ITEM;

    public TekePagerAdapter(FragmentManager fm, int a) {
        super(fm);
        this.NUM_ITEM = a;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: Origine origine = new Origine();
                return origine;
            case 1: Histoire histoire = new Histoire();
                return histoire;
            case 2: Organisation organisation = new Organisation();
                return organisation;
            case 3: Mariage mariage = new Mariage();
                return mariage;
            case 4:Croyance croyance = new Croyance();
                return croyance;
            default: return null;
        }

    }

    @Override
    public int getCount() {
        return NUM_ITEM;
    }
}
