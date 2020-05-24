package com.lionelnkeoua.com.bwala.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.lionelnkeoua.com.bwala.R;
import com.lionelnkeoua.com.bwala.adapter.PresidentsAdapter;
import com.lionelnkeoua.com.bwala.model.Acceuil;

import java.util.ArrayList;
import java.util.List;

public class PresidentsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    List<Acceuil> acceuilList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presidents);

        add();

        recyclerView = (RecyclerView)findViewById(R.id.presidents_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new PresidentsAdapter(acceuilList, getApplicationContext()));


    }


    private void add(){
        acceuilList.add(new Acceuil(R.drawable.youlou_naissance, "Fulbert Youlou", "Fulbert Youlou fut le premier président de la République du Congo de 1959 à 1963."));
        acceuilList.add(new Acceuil(R.drawable.alphonse, "Alphonse Massamba Debat", "Alphonse Massamba-Débat est un homme d'État congolais, né en 1921 à Nkolo. Il a dirigé le congo de 1963 à 1968."));
        acceuilList.add(new Acceuil(R.drawable.marien, "Marien Ngouabi", " Né  le 31 Décembre 1938 à Ombele, Marien Ngouabi est un homme d\'Etat officier congolais mort assasiné le 18 mars 1977."));
        acceuilList.add(new Acceuil(R.drawable.yhombi_opangault, "Yhombi Opangault", "Joachim Yhomby-Opango est un général et homme politique congolais, né le 12 janvier 1939 à Fort-Rousset."));
        acceuilList.add(new Acceuil(R.drawable.lissouba_reunion, "Pascal Lissouba", "Pascal Lissouba est un homme d'État congolais né le 15 novembre 1931i. Il a dirigé le congo de 1992 à 1997. "));
        acceuilList.add(new Acceuil(R.drawable.sassou, "Denis Sassou Nguesso", "Denis Sassou-Nguesso est un militaire et homme d'État congolais né le 23 novembre 1943 à Edou."));



    }
}
