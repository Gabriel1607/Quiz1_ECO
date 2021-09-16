package com.example.quiz1_eco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class AutoActivity extends AppCompatActivity {
    private TextView titleAuto,textAuto;
    private CheckBox autoCheck1,autoCheck2,autoCheck3;
    private Button autoContButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto);
        SharedPreferences sp1 = getSharedPreferences("data",MODE_PRIVATE);
        titleAuto = findViewById(R.id.titleAuto);
        textAuto = findViewById(R.id.textAuto);
        autoCheck1 = findViewById(R.id.autoCheck1);
        autoCheck2 = findViewById(R.id.autoCheck2);
        autoCheck3 = findViewById(R.id.autoCheck3);
        autoContButton = findViewById(R.id.autoContButton);
        autoContButton.setOnClickListener(
                (v) ->{
                    if(checkVerify()){
                        int autoScore = prepCalc();
                        int prepScore = getIntent().getExtras().getInt("score");
                        int totalScore = autoScore+prepScore;
                       String list = sp1.getString("User&ScoreList","");
                       sp1.edit().putString("User&ScoreList",list+totalScore+"\n\r").apply();
                    Intent i = new Intent(this, MainActivity.class);
                    startActivity(i);
                }else{
                        Toast.makeText(this, "Checkea al menos una casilla", Toast.LENGTH_SHORT).show();
                    }}

        );
    }
    private int prepCalc(){
        int autoTotal = 0;
        if(autoCheck1.isChecked()) {
            autoTotal += 3;
        }
        if(autoCheck2.isChecked()) {
            autoTotal += 3;
        }
        return autoTotal;
    }
    private boolean checkVerify(){
        if(autoCheck3.isChecked()&&autoCheck1.isChecked()) {
            autoCheck1.toggle();
        }
        if(autoCheck3.isChecked()&&autoCheck2.isChecked()){
            autoCheck2.toggle();
        }
        if(autoCheck1.isChecked()||autoCheck2.isChecked()|autoCheck3.isChecked()){
            return true;
        }
        return  false;
    }
}