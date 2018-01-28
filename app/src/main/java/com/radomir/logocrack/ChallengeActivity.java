package com.radomir.logocrack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ChallengeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge);

        Intent startMatching = new Intent(ChallengeActivity.this, MatchingActivity.class);
        startActivity(startMatching);

    }
}
