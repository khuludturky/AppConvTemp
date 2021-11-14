package com.example.convertemp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Button cTof , fToc ;
    private TextView result;
    private EditText enterTemp;
    double result0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cTof = findViewById(R.id.cToF);
        fToc = findViewById(R.id.fToc);
        result = findViewById(R.id.result);
        enterTemp = findViewById(R.id.enterTemp);

        cTof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(enterTemp.getText().toString());
                result0 =Math.round ((temp * 1.8) + 32);
                result.setText(String.valueOf(result0)+"°F");
            }
        });
        fToc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(enterTemp.getText().toString());
                result0 = Math.round((temp - 32) / 1.8);
                result.setText(String.valueOf(result0)+"°C");
            }
        });
    }
    }