package com.example.quiz1_eco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class PrepActivity extends AppCompatActivity {
private TextView titlePrep,textPrep;
private CheckBox prepCheck1,prepCheck2,prepCheck3;
private Button prepContButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prep);
        titlePrep = findViewById(R.id.titlePrep);
        textPrep = findViewById(R.id.textPrep);
        prepCheck1 = findViewById(R.id.prepCheck1);
        prepCheck2 = findViewById(R.id.prepCheck2);
        prepCheck3 = findViewById(R.id.prepCheck3);
        prepContButton = findViewById(R.id.prepContButton);

    }
}