package com.lionelnkeoua.com.bwala.view.fragment.youlou;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.lionelnkeoua.com.bwala.R;

/**
 * Created by Lionel on 24/06/2018.
 */
public class DatesFragment extends Fragment {

    View view;
    ListView listView;
    ArrayAdapter<String> arrayAdapter;
    Context context;
    CallBackMethode callBackMethode;
    SearchView searchView;
    public DatesFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_dates_liste, container, false);
        TextView textView = (TextView)view.findViewById(R.id.desc);
        InitUI();
        return view;
    }

    public void setCallBackMethode(CallBackMethode callBackMethode){
        this.callBackMethode = callBackMethode;
    }

    public void InitUI(){
        context = getContext();
        final String []  checkDay = getResources().getStringArray(R.array.day);
        final String [] checkDate = getResources().getStringArray(R.array.dateDetails);
        listView = (ListView)view.findViewById(R.id.dates_liste);
        arrayAdapter = new ArrayAdapter<String>(context, R.layout.fragment_dates_liste_item,R.id.desc, checkDay);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (callBackMethode!=null){
                    callBackMethode.callOtherFragment(checkDate[position]);
                }
            }
        });
    }

}
