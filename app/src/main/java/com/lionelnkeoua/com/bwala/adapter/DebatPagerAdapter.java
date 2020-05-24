package com.lionelnkeoua.com.bwala.adapter;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.lionelnkeoua.com.bwala.view.fragment.youlou.debat.FinPresidence;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.debat.NaissanceEtude;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.debat.DebutEnPolitique;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.debat.AscentionPolitique;

/**
 * Created by Lionel on 24/02/2018.
 */
public class DebatPagerAdapter extends FragmentStatePagerAdapter {
    private int NUM_ITEM ;

    public DebatPagerAdapter(FragmentManager fm, int a) {
        super(fm);
        this.NUM_ITEM = a;
    }


    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        switch (position){
            case 0: NaissanceEtude naissanceEtude = new NaissanceEtude();
                return naissanceEtude;
            case 1: DebutEnPolitique debutEnPolitique = new DebutEnPolitique();
                return debutEnPolitique;
            case 2: AscentionPolitique ascentionPolitique = new AscentionPolitique();
                return ascentionPolitique;
            case 3: FinPresidence finPresidence = new FinPresidence();
                return finPresidence;
            default: return null;
        }

    }

    @Override
    public int getCount() {
        return NUM_ITEM;
    }

}

