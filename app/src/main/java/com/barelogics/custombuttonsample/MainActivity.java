package com.barelogics.custombuttonsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.barelogics.sahana.CustomButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CustomButton mCustomButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCustomButton = findViewById(R.id.customButton);
        mCustomButton.setImage(R.drawable.ic_baseline_edit_24);
        mCustomButton.setText("edit");
        //mCustomButton.setViewEnable(false);
        mCustomButton.setColor(R.color.purple_200);
        mCustomButton.setOnClickListener(this);
        mCustomButton.setButtonType(CustomButton.ButtonType.COLOR_BACKGROUND);
        mCustomButton.setStrokeWidth(R.dimen.stroke_width);
    }

    @Override
    public void onClick(View view) {

    }
}