package com.radomir.logocrack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button enterCompetitiveButton;
    private Button enterSoloButton;
    private Button highScoresButton;
    private Button statisticsButton;
    private Button optionsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterCompetitiveButton = findViewById(R.id.EnterCompetitiveButton);
        enterSoloButton = findViewById(R.id.EnterSoloButton);
        highScoresButton = findViewById(R.id.HighScoresButton);
        statisticsButton = findViewById(R.id.StatisticsButton);
        optionsButton = findViewById(R.id.OptionsButton);

        enterSoloButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pickLevel = new Intent(MainActivity.this, PickLevelActivity.class);
                startActivity(pickLevel);
            }
        });
    }
}
