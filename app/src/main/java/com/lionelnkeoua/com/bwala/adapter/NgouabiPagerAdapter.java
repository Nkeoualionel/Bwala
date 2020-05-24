package com.lionelnkeoua.com.bwala.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.lionelnkeoua.com.bwala.view.fragment.youlou.ngouabi.FinPresidence;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.ngouabi.AscentionPolitique;
import  com.lionelnkeoua.com.bwala.view.fragment.youlou.ngouabi.ConqueteDuPouvoir;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.ngouabi.DebutEnPolitique;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.ngouabi.NaissanceEtude;


/**
 * Created by Lionel on 24/02/2018.
 */
public class NgouabiPagerAdapter extends FragmentStatePagerAdapter{
    private int NUM_ITEM ;


    public NgouabiPagerAdapter(FragmentManager fm, int a) {
        super(fm);
        this.NUM_ITEM = a;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: NaissanceEtude naissanceEtude = new NaissanceEtude();
                return naissanceEtude;
            case 1: DebutEnPolitique debutEnPolitique = new DebutEnPolitique();
                return debutEnPolitique;
            case 2: ConqueteDuPouvoir conqueteDuPouvoir = new ConqueteDuPouvoir();
                return conqueteDuPouvoir;
            case 3: AscentionPolitique ascentionPolitique = new AscentionPolitique();
                return ascentionPolitique;
            case 4: FinPresidence finPresidence = new FinPresidence();
                return finPresidence;
            default:return null;
        }

    }

    @Override
    public int getCount() {
        return NUM_ITEM;
    }

}
