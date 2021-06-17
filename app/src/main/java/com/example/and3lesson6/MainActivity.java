package com.example.and3lesson6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.and3lesson6.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding ui;
    private Math math = new Math();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());

        ui.add.setOnClickListener(v -> {
            int oper1 = Integer.parseInt(ui.oper1.getText().toString());
            int oper2 = Integer.parseInt(ui.oper2.getText().toString());
            ui.result.setText(String.valueOf(math.add(oper1, oper2)));
        });
        ui.minus.setOnClickListener(v -> {
            int oper1 = Integer.parseInt(ui.oper1.getText().toString());
            int oper2 = Integer.parseInt(ui.oper2.getText().toString());
            ui.result.setText(String.valueOf(math.minus(oper1, oper2)));
        });
        ui.multiply.setOnClickListener(v -> {
            int oper1 = Integer.parseInt(ui.oper1.getText().toString());
            int oper2 = Integer.parseInt(ui.oper2.getText().toString());
            ui.result.setText(String.valueOf(math.multiply(oper1, oper2)));
        });
        ui.divide.setOnClickListener(v -> {
            int oper1 = Integer.parseInt(ui.oper1.getText().toString());
            int oper2 = Integer.parseInt(ui.oper2.getText().toString());
            ui.result.setText(String.valueOf(math.div(oper1, oper2)));
        });
        ui.add.setOnClickListener(v -> {
            int oper1 = Integer.parseInt(ui.oper1.getText().toString());
            int oper2 = Integer.parseInt(ui.oper2.getText().toString());
            ui.result.setText(String.valueOf(math.add(oper1, oper2)));
        });
        ui.sqrt.setOnClickListener(v -> {
            int oper1 = Integer.parseInt(ui.oper1.getText().toString());
            ui.result.setText(String.valueOf(math.sqrt(oper1)));
        });
    }
}