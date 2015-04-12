package com.seattleshinebox.dinodictionary.UI;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.seattleshinebox.dinodictionary.R;

public class FoodSelectActivity extends Activity {

    private ImageButton mHerbivoreButton;
    private ImageButton mCarnivoreButton;
    private ImageButton mBackButton;
    private String buttonSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_select);

        mHerbivoreButton = (ImageButton) findViewById(R.id.herbivoreFoodButton);
        mCarnivoreButton = (ImageButton) findViewById(R.id.carnivoreFoodButton);
        mBackButton = (ImageButton) findViewById(R.id.backFoodButton);

        mHerbivoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // On Click show Toast message and make method call to start new activity
                buttonSelection = "Herbivore";
                Toast.makeText(FoodSelectActivity.this, "Herbivore Button Clicked", Toast.LENGTH_LONG).show();
                startDinoSelection();
            }
        });

        mCarnivoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // On Click show Toast message and make method call to start new activity
                buttonSelection = "Carnivore";
                Toast.makeText(FoodSelectActivity.this, "Carnivore Button Clicked", Toast.LENGTH_LONG).show();
                startDinoSelection();
            }
        });

        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // On Click show Toast message and make method call to start new activity
                return2timeperoidSelection();
            }
        });
    }

    private void startDinoSelection() {
        //Start new activity called FoodSelectActivity
        Intent intent = new Intent(this, dinoSelectActivity.class);
        startActivity(intent);
    }

    private void return2timeperoidSelection() {
        //Start new activity called FoodSelectActivity
        Intent intent = new Intent(this, timeperiodSelectActivity.class);
        startActivity(intent);
    }
}
