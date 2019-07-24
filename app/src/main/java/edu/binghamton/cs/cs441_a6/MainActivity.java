package edu.binghamton.cs.cs441_a6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mPlayButton;
    private Button mHowToPlayButton;
    private Button mHiScoreButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPlayButton = findViewById(R.id.button);
        mHowToPlayButton = findViewById(R.id.button2);
        mHiScoreButton = findViewById(R.id.button3);

        mPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGameActivity();
            }
        });
        mHowToPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInstructionsActivity();
            }
        });
        mHiScoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHiScoresActivity();
            }
        });
    }

    public void openGameActivity() {
        Intent i = new Intent(this, GameActivity.class);
        startActivity(i);
    }

    public void openInstructionsActivity() {
        Intent i = new Intent(this, InstructionsActivity.class);
        startActivity(i);
    }

    public void openHiScoresActivity() {
        Intent i = new Intent(this, HiScoresActivity.class);
        startActivity(i);
    }
}
