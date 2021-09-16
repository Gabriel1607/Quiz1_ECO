package com.example.quiz1_eco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class AutoActivity extends AppCompatActivity {
    private TextView titleAuto,textAuto;
    private CheckBox autoCheck1,autoCheck2,autoCheck3;
    private Button autoContButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto);
        titleAuto = findViewById(R.id.titleAuto);
        textAuto = findViewById(R.id.textAuto);
        autoCheck1 = findViewById(R.id.autoCheck1);
        autoCheck2 = findViewById(R.id.autoCheck2);
        autoCheck3 = findViewById(R.id.autoCheck3);
        autoContButton = findViewById(R.id.autoContButton);
    }
}