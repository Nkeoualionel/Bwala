package com.lionelnkeoua.com.bwala.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.lionelnkeoua.com.bwala.royaumes.loango.DenominationEtFrontiere;
import com.lionelnkeoua.com.bwala.royaumes.loango.HistoireFondation;
import com.lionelnkeoua.com.bwala.royaumes.loango.Monarchie;
import com.lionelnkeoua.com.bwala.royaumes.loango.RencontreAvecNavigateur;

/**
 * Created by Lionel on 26/04/2018.
 */
public class LoangoPagerAdapter extends FragmentStatePagerAdapter {
    private int NUM_ITEM;

    public LoangoPagerAdapter(FragmentManager fm, int a) {
        super(fm);
        this.NUM_ITEM = a;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: DenominationEtFrontiere denominationEtFrontiere = new DenominationEtFrontiere();
                return denominationEtFrontiere;
            case 1: Monarchie monarchie = new Monarchie();
                return monarchie;
            case 2: HistoireFondation histoireFondation = new HistoireFondation();
                return histoireFondation;
            case 3: RencontreAvecNavigateur rencontreAvecNavigateur = new RencontreAvecNavigateur();
                return rencontreAvecNavigateur;
            default:return null;
        }

    }

    @Override
    public int getCount() {
        return NUM_ITEM;
    }
}
