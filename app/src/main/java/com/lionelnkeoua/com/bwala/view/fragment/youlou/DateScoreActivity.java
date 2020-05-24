package com.lionelnkeoua.com.bwala.view.fragment.youlou;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.lionelnkeoua.com.bwala.R;

public class DateScoreActivity extends AppCompatActivity {
    TextView mCurrentScore;
    TextView mCurrentScoreText;
    TextView mHighScore;
    TextView mHighScoreText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_score);

        mCurrentScore = (TextView)findViewById(R.id.current_score);
        mCurrentScoreText = (TextView)findViewById(R.id.text_current_score);
        mHighScore = (TextView)findViewById(R.id.high_score);
        mHighScoreText = (TextView)findViewById(R.id.text_high_score);

        int scores = getIntent().getExtras().getInt("datescore");

        mCurrentScore.setText(""+scores);
        // use preference for save my score
        SharedPreferences sp = getPreferences(MODE_PRIVATE);
        int highScore = sp.getInt("HighScore", 0);
        if (highScore >= scores){
            mHighScore.setText(""+highScore);
        }else {
                if(scores > 7){
                    mHighScore.setText(""+scores);
                    mHighScore.setTextColor(Color.GREEN);
                    SharedPreferences.Editor editor = sp.edit();
                    editor.putInt("HighScore", scores);
                    editor.commit();
                }else if(scores >= 5 && scores <= 7) {
                    mHighScore.setText(""+scores);
                    mHighScore.setTextColor(Color.YELLOW);
                    SharedPreferences.Editor editor = sp.edit();
                    editor.putInt("HighScore", scores);
                    editor.commit();
                }else {
                    mHighScore.setText(""+scores);
                    mHighScore.setTextColor(Color.RED);
                    SharedPreferences.Editor editor = sp.edit();
                    editor.putInt("HighScore", scores);
                    editor.commit();

                }
        }

        Button button = (Button)findViewById(R.id.btn);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getApplicationContext(), DatesHistoriqueQuestion.class);
               startActivity(intent);
               finish();
           }
       });

        Button button1 = (Button)findViewById(R.id.btn_quitte);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
