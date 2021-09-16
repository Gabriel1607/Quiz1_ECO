package com.example.quiz1_eco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
private Button contButton;
private TextView titleReg, textReg;
private EditText nombreReg, codReg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        contButton = findViewById(R.id.contButton);
        titleReg = findViewById(R.id.titleReg);
        textReg = findViewById(R.id.textReg);
        nombreReg = findViewById(R.id.nombreReg);
        codReg = findViewById(R.id.codReg);
    }
}