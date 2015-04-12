package com.seattleshinebox.dinodictionary.UI;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;
import android.widget.Toast;

import com.seattleshinebox.dinodictionary.R;

public class elementsSelectMainActivity extends Activity {

    private ImageButton mWaterButton;
    private ImageButton mAirButton;
    private ImageButton mLandButton;
    private ImageButton mAllButton;
    private String buttonSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elements_select_main);

        mWaterButton = (ImageButton)findViewById(R.id.waterElementButton);
        mAirButton = (ImageButton)findViewById(R.id.airElementButton);
        mLandButton = (ImageButton)findViewById(R.id.landElementButton);
        mAllButton = (ImageButton)findViewById(R.id.allElementButton);

        mWaterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // On Click show Toast message and make method call to start new activity
                buttonSelection="water";
                Toast.makeText(elementsSelectMainActivity.this, "Water Button Clicked", Toast.LENGTH_LONG).show();
                startTimePeriodSelection();
            }
        });

        mAirButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonSelection="air";
                Toast.makeText(elementsSelectMainActivity.this, "Air Button Clicked", Toast.LENGTH_LONG).show();
                startTimePeriodSelection();
            }
        });

        mLandButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonSelection="land";
                Toast.makeText(elementsSelectMainActivity.this, "Land Button Clicked", Toast.LENGTH_LONG).show();
                startTimePeriodSelection();
            }
        });

        mAllButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonSelection="all";
                Toast.makeText(elementsSelectMainActivity.this, "All Button Clicked", Toast.LENGTH_LONG).show();
                startTimePeriodSelection();
            }
        });

    }

    private String setButtonSelection (String buttonSelection) {
        return buttonSelection;
    };

    public void startTimePeriodSelection() {
        //Start new activity called timeperiodSelectActivity
        Intent intent = new Intent(this, timeperiodSelectActivity.class);
        startActivity(intent);
    }
}
