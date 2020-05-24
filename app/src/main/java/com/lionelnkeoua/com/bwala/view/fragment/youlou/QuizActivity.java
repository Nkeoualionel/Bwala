package com.lionelnkeoua.com.bwala.view.fragment.youlou;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.lionelnkeoua.com.bwala.R;

public class QuizActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Button button1 = (Button)findViewById(R.id.first_choice);
        Button button2 = (Button)findViewById(R.id.second_choice);
        Button button3 = (Button)findViewById(R.id.third_choice);
        Button button  = (Button)findViewById(R.id.quitter);

        TextView textView = (TextView)findViewById(R.id.questions);
        textView.setText("Bienvenu dans la partie quiz de Bwala veuillez choisir le type de question");

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PresidentQuestion.class);
                startActivityForResult(intent, 1);
                finish();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DatesHistoriqueQuestion.class);
                startActivityForResult(intent, 2);
                finish();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RoyaumesQuestion.class);
                startActivityForResult(intent, 3);
                finish();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

}
