package com.seattleshinebox.dinodictionary.UI;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;

import com.seattleshinebox.dinodictionary.R;
import com.seattleshinebox.dinodictionary.dinodata.DinoDataDisplay;
import com.seattleshinebox.dinodictionary.dinodata.DinoDataModel;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

public class dinoSelectActivity extends Activity {

    private Button mTestButton;
    private DinoDataModel mDinoDataModel;

    private DinoDataModel parseDinoDetails(String jsonData) {
        DinoDataModel currentDinoData = new DinoDataModel();
        currentDinoData.setDinoDataDisplay(getDinoDataDisplay);
        return currentDinoData;
    }

    private DinoDataDisplay getDinoDataDisplay(String jsonData) throws JSONException {
        JSONObject currentDinoData = new JSONObject(jsonData);

    }
    /*public static String AssetJSONFile (String filename, Context context throws IOException {
        AssetManager = context.getAssets();
        InputStream file = manager.open(filename);
        byte[] formArray = new byte[file.available()];
        file.read(formArray);
        file.close();

        return new String(formArray);
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dino_select);

        mTestButton = (Button) findViewById(R.id.testButton1);

        mTestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(elementsSelectMainActivity.this, name, Toast.LENGTH_LONG).show();
                startTimePeriodSelection();
            }
        });

    }

    private void startTimePeriodSelection() {
        Intent intent = new Intent(this, timeperiodSelectActivity.class);
        startActivity(intent);
    }
}
