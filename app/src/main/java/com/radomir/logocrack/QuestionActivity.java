package com.radomir.logocrack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class QuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        Intent showResults = new Intent(QuestionActivity.this, ResultsActivity.class);
        startActivity(showResults);
    }
}
