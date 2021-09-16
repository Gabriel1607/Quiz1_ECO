package com.example.quiz1_eco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button regButton;
private TextView titleMain;
private TextView studentList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        regButton = findViewById(R.id.regButton);
        titleMain = findViewById(R.id.titleMain);
        studentList = findViewById(R.id.studentList);
    }
}