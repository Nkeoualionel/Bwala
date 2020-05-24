package com.lionelnkeoua.com.bwala.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.lionelnkeoua.com.bwala.view.fragment.youlou.sassou.AscentionPolitique;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.sassou.ConferenceNationale;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.sassou.RetourAuxAffaires;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.sassou.SecondMandat;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.sassou.SommetDetat;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.sassou.TraverserDesert;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.sassou.Naissance;

/**
 * Created by Lionel on 10/04/2018.
 */
public class SassouPagerAdapter extends FragmentStatePagerAdapter {
    public int NUM_ITEM;

    public SassouPagerAdapter(FragmentManager fm, int tab) {
        super(fm);
        this.NUM_ITEM = tab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:  Naissance naissance = new Naissance();
                return naissance;
            case 1:  AscentionPolitique ascentionPolitique = new AscentionPolitique();
                return ascentionPolitique;
            case 2:  SommetDetat sommetDetat = new SommetDetat();
                return sommetDetat;
            case 3:  ConferenceNationale conferenceNationale = new ConferenceNationale();
                return conferenceNationale;
            case 4:  TraverserDesert traverserDesert = new TraverserDesert();
                return traverserDesert;
            case 5:  RetourAuxAffaires retourAuxAffaires = new RetourAuxAffaires();
                return retourAuxAffaires;
            case 6:  SecondMandat secondMandat = new SecondMandat();
                return secondMandat;
            default: return null;
        }

    }

    @Override
    public int getCount() {
        return NUM_ITEM;
    }
}
