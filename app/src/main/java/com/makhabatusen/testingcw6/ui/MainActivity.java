package com.makhabatusen.testingcw6.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.makhabatusen.testingcw6.databinding.ActivityMainBinding;
import com.makhabatusen.testingcw6.domain.Math;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding ui;
    private Math math;
    private Double operator1;
    private Double operator2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());
        math = new Math();
//        ui.btnAdd.setOnClickListener(v -> {
//            ui.tvResult.setVisibility(View.INVISIBLE);
//        });

        ui.btnAdd.setOnClickListener(v -> {
            convertValues();
            ui.tvResult.setText(String.valueOf(math.add(operator1, operator2)));
        });

        ui.btnSubtract.setOnClickListener(v -> {
            convertValues();
            ui.tvResult.setText(String.valueOf(math.subtract(operator1, operator2)));
        });
        ui.btnDivide.setOnClickListener(v -> {
            convertValues();
            ui.tvResult.setText(String.valueOf(math.divide(operator1, operator2)));
        });
        ui.btnMultiply.setOnClickListener(v -> {
            convertValues();
            ui.tvResult.setText(String.valueOf(math.multiply(operator1, operator2)));
        });
        ui.btnPow.setOnClickListener(v -> {
            convertValues();
            ui.tvResult.setText(String.valueOf(math.pow(operator1, operator2)));
        });

        ui.btnSqrt.setOnClickListener(v -> {
            operator1 = Double.parseDouble(ui.etOperatorOne.getText().toString());
            ui.tvResult.setText(String.valueOf(math.sqrt( operator1)));
        });

    }


    private void convertValues() {
        operator1 = Double.parseDouble(ui.etOperatorOne.getText().toString());
        operator2 = Double.parseDouble(ui.etOperatorTwo.getText().toString());

    }
}
