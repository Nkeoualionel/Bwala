package com.lionelnkeoua.com.bwala.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.lionelnkeoua.com.bwala.view.fragment.youlou.lissouba.ConquetePouvoir;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.lissouba.DebutPresidence;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.lissouba.ElectionAnticiper;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.lissouba.Exil;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.lissouba.TraverserDesert;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.lissouba.FinPresidence;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.lissouba.Naissance;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.lissouba.AscentionPolitique;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.lissouba.RetraiteEtRetour;


/**
 * Created by Lionel on 08/03/2018.
 */
public class LissoubaPagerAdapter extends FragmentStatePagerAdapter {
    private int NUM_ITEM;

    public LissoubaPagerAdapter(FragmentManager fm, int a) {
        super(fm);
        this.NUM_ITEM = a;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: Naissance naissance = new Naissance();
                return naissance;
            case 1: AscentionPolitique ascentionPolitique = new AscentionPolitique();
                return ascentionPolitique;
            case 2:  TraverserDesert traverserDesert = new TraverserDesert();
            return traverserDesert;
            case 3:  RetraiteEtRetour retraiteEtRetour = new RetraiteEtRetour();
            return retraiteEtRetour;
            case 4: ConquetePouvoir conquetePouvoir = new ConquetePouvoir();
                return conquetePouvoir;
            case 5: DebutPresidence debutPresidence = new DebutPresidence();
                return debutPresidence;
            case 6:ElectionAnticiper electionAnticiper = new ElectionAnticiper();
                return electionAnticiper;
            case 7: FinPresidence finPresidence = new FinPresidence();
                return finPresidence;
            case 8: Exil exil = new Exil();
                return exil;
            default: return null;
        }

    }

    @Override
    public int getCount() {
        return NUM_ITEM;
    }

}
