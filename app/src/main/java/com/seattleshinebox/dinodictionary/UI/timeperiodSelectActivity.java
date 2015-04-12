package com.seattleshinebox.dinodictionary.UI;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.seattleshinebox.dinodictionary.R;

public class timeperiodSelectActivity extends Activity {

    private ImageButton mJurassicButton;
    private ImageButton mCretaceousButton;
    private ImageButton mTriassicButton;
    private ImageButton mBackButton;
    private String buttonSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeperiod_select);


        mJurassicButton = (ImageButton) findViewById(R.id.jurassicTimeButton);
        mTriassicButton = (ImageButton) findViewById(R.id.triassicTimeButton);
        mCretaceousButton = (ImageButton) findViewById(R.id.herbivoreFoodButton);
        mBackButton = (ImageButton) findViewById(R.id.backTimeButton);

        mJurassicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // On Click show Toast message and make method call to start new activity
                buttonSelection = "Jurassic";
                Toast.makeText(timeperiodSelectActivity.this, "Jurassic Button Clicked", Toast.LENGTH_LONG).show();
                startFoodSelection();
            }
        });

        mTriassicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // On Click show Toast message and make method call to start new activity
                buttonSelection = "Triassic";
                Toast.makeText(timeperiodSelectActivity.this, "Triassic Button Clicked", Toast.LENGTH_LONG).show();
                startFoodSelection();
            }
        });

        mCretaceousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // On Click show Toast message and make method call to start new activity
                buttonSelection = "Cretaceous";
                Toast.makeText(timeperiodSelectActivity.this, "Cretaceous Button Clicked", Toast.LENGTH_LONG).show();
                startFoodSelection();
            }
        });

        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // On Click show Toast message and make method call to start new activity
                 return2elementSelection();
            }
        });
    }

    private void startFoodSelection() {
        //Start new activity called FoodSelectActivity
        Intent intent = new Intent(this, FoodSelectActivity.class);
        startActivity(intent);
    }

    private void return2elementSelection() {
        //Start new activity called FoodSelectActivity
        Intent intent = new Intent(this, elementsSelectMainActivity.class);
        startActivity(intent);
    }
}
