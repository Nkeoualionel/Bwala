package com.lionelnkeoua.com.bwala.view.fragment.youlou;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.lionelnkeoua.com.bwala.R;

public class DatesHistoriqueQuestion extends AppCompatActivity {


    DateHistoriqueQuestionBank dhqb = new DateHistoriqueQuestionBank();
    MediaPlayer mediaPlayer;
    private TextView mTextView, questions;
    private Button mFirstButton;
    private Button mSecondeButton;
    private Button mThirdButton;
    private Button mFourButton;
    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dates_historique_question);

        questions = (TextView)findViewById(R.id.questions);
        mFirstButton = (Button)findViewById(R.id.first_choice);
        mSecondeButton = (Button)findViewById(R.id.second_choice);
        mThirdButton = (Button)findViewById(R.id.third_choice);
        mFourButton = (Button)findViewById(R.id.four_choice);
        mTextView = (TextView)findViewById(R.id.your_current_score);

        updateQuestion();
        updateScore(mScore);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    public void updateQuestion(){
        if (mQuestionNumber < dhqb.getLenght()){
            questions.setText(dhqb.getDateQuestion(mQuestionNumber));
            mFirstButton.setText(dhqb.getDateProposition(mQuestionNumber, 0));
            mSecondeButton.setText(dhqb.getDateProposition(mQuestionNumber, 1));
            mThirdButton.setText(dhqb.getDateProposition(mQuestionNumber, 2));
            mFourButton.setText(dhqb.getDateProposition(mQuestionNumber, 3));
            mAnswer = dhqb.getDateAnswer(mQuestionNumber);
            mQuestionNumber++;

        }else {
                Toast.makeText(getApplicationContext(), "C'était la dernière question", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), DateScoreActivity.class);
                intent.putExtra("datescore", mScore);
                startActivity(intent);
                finish();
            }

    }

    public void updateScore(int score){
        mTextView.setText(mScore + "/" + dhqb.getLenght());
    }

    public void reponse(View view){
        Button button = (Button) view;
        if (button.getText().equals(mAnswer)){
            mScore++;
            Toast.makeText(getApplicationContext(), "Bonne réponse", Toast.LENGTH_SHORT).show();
            mediaPlayer = MediaPlayer.create(this, R.raw.trues);
            mediaPlayer.start();
            updateQuestion();
            updateScore(mScore);

        }else{
            Toast.makeText(getApplicationContext(), "Mauvaise réponse", Toast.LENGTH_SHORT).show();
            mediaPlayer = MediaPlayer.create(this, R.raw.bads);
            mediaPlayer.start();
            updateQuestion();
            updateScore(mScore);
        }
    }
}
