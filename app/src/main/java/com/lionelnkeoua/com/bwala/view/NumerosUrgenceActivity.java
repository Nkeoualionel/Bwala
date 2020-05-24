package com.lionelnkeoua.com.bwala.view;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.lionelnkeoua.com.bwala.R;
import com.lionelnkeoua.com.bwala.adapter.NumerosUrgenceAdapter;
import com.lionelnkeoua.com.bwala.model.NumerosUrgence;

import java.util.ArrayList;
import java.util.List;

public class NumerosUrgenceActivity extends AppCompatActivity {
    private Context context;
    private List<NumerosUrgence> numerosUrgenceList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros_urgence);

        services();
        recyclerView = (RecyclerView)findViewById(R.id.numeros_urgence_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(new NumerosUrgenceAdapter(context, numerosUrgenceList));
    }

    public void services(){
        numerosUrgenceList.add(new NumerosUrgence(R.drawable.pompier, R.drawable.ic_call_black_24dp, "Pompier", "118"));
        numerosUrgenceList.add(new NumerosUrgence(R.drawable.police, R.drawable.ic_call_black_24dp, "Police", "117"));
        numerosUrgenceList.add(new NumerosUrgence(R.drawable.sne, R.drawable.ic_call_black_24dp, "SNE ", "4242"));
        numerosUrgenceList.add(new NumerosUrgence(R.drawable.sndes, R.drawable.ic_call_black_24dp, "SNDE ", "056484060"));
        numerosUrgenceList.add(new NumerosUrgence(R.drawable.arpces, R.drawable.ic_call_black_24dp, "ARPCE " , "056484060"));
    }
}
