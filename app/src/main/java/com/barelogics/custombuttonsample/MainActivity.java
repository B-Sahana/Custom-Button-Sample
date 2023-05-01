package com.barelogics.custombuttonsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.barelogics.sahana.CustomButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout view = findViewById(R.id.linearLayout);
        CustomButton customButton = new CustomButton(this);
        customButton.setText("Programmatic Button");
        //customButton.setImage(R.drawable.ic_baseline_delete_24);
        //customButton.setButtonType(CustomButton.Type.COLOR_BUTTON);
        customButton.setColor(R.color.purple_500);
        customButton.setClickable(true);
        //customButton.setTextMargins(100, 100, null, null);
        // customButton.showImage(CustomButton.Direction.RIGHT);
        view.addView(customButton);
    }

}