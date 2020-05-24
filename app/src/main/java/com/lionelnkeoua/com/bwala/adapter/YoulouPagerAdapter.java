package com.lionelnkeoua.com.bwala.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.lionelnkeoua.com.bwala.view.fragment.youlou.youlou.ConqueteDuPouvoir;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.youlou.DebutPolitique;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.youlou.FinPresidence;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.youlou.Naissance;

/**
 * Created by Lionel on 09/02/2018.
 */
public class YoulouPagerAdapter extends FragmentStatePagerAdapter {
    public int NUM_ITEM;

    public YoulouPagerAdapter(FragmentManager fm, int tab) {
        super(fm);
        this.NUM_ITEM = tab;
    }

    @Override
    public Fragment getItem(int position) {
       switch (position){
           case 0: Naissance naissance = new Naissance();
               return naissance;
           case 1: DebutPolitique debutPolitique = new DebutPolitique();
               return debutPolitique;
           case 2: ConqueteDuPouvoir conqueteDuPouvoir = new ConqueteDuPouvoir();
               return conqueteDuPouvoir;
           case 3: FinPresidence finPresidence = new FinPresidence();
               return finPresidence;
           default: return null;
       }
    }

    @Override
    public int getCount() {
        return   NUM_ITEM;
    }


}