package com.lionelnkeoua.com.bwala.view;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;

import com.lionelnkeoua.com.bwala.R;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.CallBackMethode;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.DatesFragment;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.DatesFragmentDetails;

public class DatesActivity extends AppCompatActivity implements CallBackMethode {

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    DatesFragment datesFragment;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dates);


        fragmentManager = getSupportFragmentManager();
        addFragmentDates();
    }

    public void addFragmentDates(){
        fragmentTransaction = fragmentManager.beginTransaction();
        datesFragment = new DatesFragment();
        datesFragment.setCallBackMethode(this);
        fragmentTransaction.add(R.id.fragment_contenaire, datesFragment);
        fragmentTransaction.commit();
    }

    public void addFragmentDetails(String date){

        fragmentTransaction = fragmentManager.beginTransaction();
        DatesFragmentDetails datesFragmentDetails = new DatesFragmentDetails();

        Bundle bundle = new Bundle();
        bundle.putString(CallBackMethode.KEY_SELECT_COUNTRY, date);
        datesFragmentDetails.setArguments(bundle);

        fragmentTransaction.replace(R.id.fragment_contenaire, datesFragmentDetails);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }


    @Override
    public void callOtherFragment(String country) {
            addFragmentDetails(country);
    }

}
