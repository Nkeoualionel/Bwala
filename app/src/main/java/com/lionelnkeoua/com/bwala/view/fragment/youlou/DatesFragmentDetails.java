package com.lionelnkeoua.com.bwala.view.fragment.youlou;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lionelnkeoua.com.bwala.R;

/**
 * Created by Lionel on 24/06/2018.
 */
public class DatesFragmentDetails extends Fragment {
    String description;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_dates_details, container, false);
        Bundle bundle = getArguments();
        String  datesDetail = bundle.getString(String.valueOf(CallBackMethode.KEY_SELECT_COUNTRY), "");
        TextView textView = (TextView)view.findViewById(R.id.details);
        textView.setText(datesDetail);
        return  view;
    }



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }


}
