package com.lionelnkeoua.com.bwala.view.fragment.youlou;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lionelnkeoua.com.bwala.R;

/**
 * Created by Lionel on 25/07/2018.
 */
public class FragmentAboutUs extends DialogFragment {

    public static FragmentAboutUs newInstance(){
        FragmentAboutUs fm = new FragmentAboutUs();
        Bundle args = new Bundle();
        args.putString("title", "eeeeee");
        fm.setArguments(args);
        return  fm;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_about_us, container, false);
        TextView textView = (TextView)view.findViewById(R.id.titre);
//        getDialog().setTitle(getArguments().getString("title"));
        return view;
    }
}
