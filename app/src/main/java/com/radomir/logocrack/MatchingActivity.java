package com.radomir.logocrack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MatchingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matching);

        Intent startQuestions = new Intent(MatchingActivity.this, QuestionActivity.class);
        startActivity(startQuestions);
    }
}
