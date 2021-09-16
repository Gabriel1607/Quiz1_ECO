package com.example.quiz1_eco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
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
regButton.setOnClickListener(
        (v)->{
            Intent i = new Intent(this,RegisterActivity.class);
            startActivity(i);

        }
);
    }
    @Override
    protected void onResume() {
        super.onResume();
String usuarios = getSharedPreferences("data",MODE_PRIVATE).getString("User&ScoreList","Aún no hay datos almacenados..."+"\n"+"¿Por qué no intentas darle al botón de Registrar? ");
studentList.setText(usuarios);
    }
}