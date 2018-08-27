package com.example.bhawna.togglebuttonexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton rbOn, rbOff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toggle_layout);

        radioGroup = findViewById(R.id.toggle);
        rbOn = findViewById(R.id.on);
        rbOff = findViewById(R.id.off);

        if (rbOn.isChecked()) {
            // do something here

        } else {


        }

    }
}
