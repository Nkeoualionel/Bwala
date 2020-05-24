package com.lionelnkeoua.com.bwala.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.lionelnkeoua.com.bwala.royaumes.kongo.EtatKongo;
import com.lionelnkeoua.com.bwala.royaumes.kongo.Histoire;
import com.lionelnkeoua.com.bwala.royaumes.kongo.MytheEtFondation;
import com.lionelnkeoua.com.bwala.royaumes.kongo.OrganisationEtTerritoire;

/**
 * Created by Lionel on 22/04/2018.
 */
public class KongoPagerAdapter extends FragmentStatePagerAdapter {
    private int NUM_ITEM;

    public KongoPagerAdapter(FragmentManager fm, int a) {
        super(fm);
        this.NUM_ITEM=a;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: OrganisationEtTerritoire organisationEtTerritoire = new OrganisationEtTerritoire();
                return organisationEtTerritoire;
            case 1: MytheEtFondation mytheEtFondation = new MytheEtFondation();
                return mytheEtFondation;
            case 2: EtatKongo etatKongo = new EtatKongo();
                return etatKongo;
            case 3: Histoire histoire = new Histoire();
                return histoire;
            default: return null;
        }

    }

    @Override
    public int getCount() {
        return NUM_ITEM;
    }
}
