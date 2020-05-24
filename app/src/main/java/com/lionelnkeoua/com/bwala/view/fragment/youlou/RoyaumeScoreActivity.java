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

public class RoyaumeScoreActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    TextView mCurrentScore;
    TextView mCurrentScoreText;
    TextView mHighScore;
    TextView mHighScoreText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_royaume_score);

        mCurrentScore = (TextView)findViewById(R.id.current_score);
        mCurrentScoreText = (TextView)findViewById(R.id.text_current_score);
        mHighScore = (TextView)findViewById(R.id.high_score);
        mHighScoreText = (TextView)findViewById(R.id.text_high_score);


        int score = getIntent().getExtras().getInt("royaumescore");
        mCurrentScore.setText(""+score);
        // use preference for save my best score
        SharedPreferences sp = getPreferences(MODE_PRIVATE);
        int highScore = sp.getInt("HighScore", 0);
        if (highScore >= score){
            mHighScore.setText(""+highScore);
        }else {

            if (score > 7){
                mHighScore.setText(""+score);
                mHighScore.setTextColor(Color.GREEN);
                SharedPreferences.Editor editor = sp.edit();
                editor.putInt("HighScore", score);
                editor.commit();
            }else if(score >=5 && score <= 7){
                mHighScore.setText(""+score);
                mHighScore.setTextColor(Color.YELLOW);
                SharedPreferences.Editor editor = sp.edit();
                editor.putInt("HighScore", score);
                editor.commit();
            }else {
                mHighScore.setText(""+score);
                mHighScore.setTextColor(Color.RED);
                SharedPreferences.Editor editor = sp.edit();
                editor.putInt("HighScore", score);
                editor.commit();
            }
        }

        Button button = (Button)findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RoyaumesQuestion.class);
                startActivity(intent);
                finish();
            }
        });

        Button btn = (Button)findViewById(R.id.btn_quitte);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
