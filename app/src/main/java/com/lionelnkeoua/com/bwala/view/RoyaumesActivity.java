package com.lionelnkeoua.com.bwala.view;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.lionelnkeoua.com.bwala.R;
import com.lionelnkeoua.com.bwala.adapter.RoyaumesAdapter;
import com.lionelnkeoua.com.bwala.model.Acceuil;

import java.util.ArrayList;
import java.util.List;

public class RoyaumesActivity extends AppCompatActivity {
    private Context context;
    private List<Acceuil> acceuilList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_royaumes);

        myObject();
        recyclerView = (RecyclerView)findViewById(R.id.les_royaumes);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(new RoyaumesAdapter(context, acceuilList));
    }

    private void myObject(){
        acceuilList.add(new Acceuil(R.drawable.royaume_kongo_vaste, "Royaume kongo", "Le royaume kongo est un empire de l'afrique du Sud-Ouest, " +
                                                         "situé dans le térritoire de l'afrique central."));
        acceuilList.add(new Acceuil(R.drawable.makoko_a, "Royaume téké", "Les tékés forment une population de l'afrique centrale partagé entre au moins trois pays."));
        acceuilList.add(new Acceuil(R.drawable.royaume_kongo, "Royaume loango", "Le royaume loango est un empire situé en afrique subsaherien plus précisement en afrique central."));
    }
}
