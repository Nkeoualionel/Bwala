package com.lionelnkeoua.com.bwala.view.fragment.youlou.lissouba;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lionelnkeoua.com.bwala.R;

/**
 * Created by Lionel on 18/04/2018.
 */
public class Exil extends Fragment {

    private int textSize = 10;
    private int textColor;

    public Exil(){

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.activity_lissouba_exil, container, false);
        FloatingActionButton fab = (FloatingActionButton)view.findViewById(R.id.fab);
        FloatingActionButton fabs = (FloatingActionButton)view.findViewById(R.id.fabs);
        final TextView mFirstText = (TextView)view.findViewById(R.id.one);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textSize+=5;
                if (textSize <=30){
                    mFirstText.setTextSize(textSize);

                    if (textSize==30){
                        textSize = 10;
                        mFirstText.setTextSize(textSize);

                    }
                }
            }
        });

        fabs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textColor++;
                if (textColor == 1){
                    mFirstText.setTextColor(Color.BLACK);
                } else {
                    mFirstText.setTextColor(Color.GRAY);
                    textColor = 0;
                }
            }
        });
        return view;
    }
}
