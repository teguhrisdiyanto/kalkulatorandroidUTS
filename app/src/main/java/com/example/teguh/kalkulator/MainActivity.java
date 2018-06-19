package com.example.teguh.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
        EditText vTxtA, vTxtB, vTxtC;
        protected float yTxtA, yTxtB, yTxtC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vTxtA = (EditText) findViewById(R.id.txtA);
        vTxtB = (EditText) findViewById(R.id.txtB);
        vTxtC = (EditText) findViewById(R.id.txtC);

        Button vbtnTambah = (Button) findViewById(R.id.btnTambah);
        Button vbtnKurang = (Button) findViewById(R.id.btnKurang);
        Button vbtnKali = (Button) findViewById(R.id.btnKali);
        Button vbtnBagi = (Button) findViewById(R.id.btnBagi);

        vbtnTambah.setOnClickListener(this);
        vbtnKurang.setOnClickListener(this);
        vbtnKali.setOnClickListener(this);
        vbtnBagi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        yTxtA = Float.parseFloat(vTxtA.getText().toString());
        yTxtB = Float.parseFloat(vTxtB.getText().toString());

        switch (v.getId()){
            case R.id.btnTambah:
                yTxtC = yTxtA + yTxtB;

                vTxtC.setText(Float.toString(yTxtC));
                break;

            case R.id.btnKurang:
                yTxtC = yTxtA - yTxtB;

                vTxtC.setText(Float.toString(yTxtC));
                break;

            case R.id.btnKali:
                yTxtC = yTxtA * yTxtB;

                vTxtC.setText(Float.toString(yTxtC));
                break;


            case R.id.btnBagi:
                yTxtC = yTxtA / yTxtB;

                vTxtC.setText(Float.toString(yTxtC));
                break;
        }
    }
}
