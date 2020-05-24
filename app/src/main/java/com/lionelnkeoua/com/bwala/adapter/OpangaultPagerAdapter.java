package com.lionelnkeoua.com.bwala.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.lionelnkeoua.com.bwala.view.fragment.youlou.opangault.CarrierProfessionelle;
import  com.lionelnkeoua.com.bwala.view.fragment.youlou.opangault.DebutEnPolitique;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.opangault.FinPresidence;
import  com.lionelnkeoua.com.bwala.view.fragment.youlou.opangault.NaissanceEtude;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.opangault.Presidence;



/**
 * Created by Lionel on 08/03/2018.
 */
public class OpangaultPagerAdapter extends FragmentStatePagerAdapter {
    private  int NUM_ITEM ;

    public OpangaultPagerAdapter(FragmentManager fm, int tab) {
        super(fm);
        this.NUM_ITEM=tab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: NaissanceEtude naissanceEtude = new NaissanceEtude();
                return naissanceEtude;
            case 1: DebutEnPolitique debutEnPolitique = new DebutEnPolitique();
                return debutEnPolitique;
            case 2: CarrierProfessionelle carrierProfessionelle = new CarrierProfessionelle();
                return carrierProfessionelle;
            case 3: Presidence presidence = new Presidence();
                return presidence;
            case 4: FinPresidence finPresidence = new FinPresidence();
                return finPresidence;
            default: return null;
        }

    }

    @Override
    public int getCount() {
        return NUM_ITEM;
    }

}
