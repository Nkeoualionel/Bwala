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
 * Created by Lionel on 08/03/2018.
 */
public class AscentionPolitique extends Fragment{
    private int textSize;
    private int textColor = 10;
    public AscentionPolitique() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_lissouba_ascention_politique, container, false);
        FloatingActionButton fab = (FloatingActionButton)view.findViewById(R.id.fab);
        FloatingActionButton fabs = (FloatingActionButton)view.findViewById(R.id.fabs);
        final TextView mFirstText = (TextView)view.findViewById(R.id.one);
        final TextView mSecondeText = (TextView)view.findViewById(R.id.two);
        final TextView mThirdText = (TextView)view.findViewById(R.id.three);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textSize+=5;
                if (textSize <=30){
                    mFirstText.setTextSize(textSize);
                    mSecondeText.setTextSize(textSize);
                    mThirdText.setTextSize(textSize);

                    if (textSize==30){
                        textSize = 10;
                        mFirstText.setTextSize(textSize);
                        mSecondeText.setTextSize(textSize);
                        mThirdText.setTextSize(textSize);

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
                    mSecondeText.setTextColor(Color.BLACK);
                    mThirdText.setTextColor(Color.BLACK);
                } else {
                    mFirstText.setTextColor(Color.GRAY);
                    mSecondeText.setTextColor(Color.GRAY);
                    mThirdText.setTextColor(Color.GRAY);
                    textColor = 0;
                }
            }
        });
        return view;
    }
}
