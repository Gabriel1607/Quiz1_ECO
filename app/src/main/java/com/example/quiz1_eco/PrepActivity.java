package com.example.quiz1_eco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

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
        prepContButton.setOnClickListener(
                (v) ->{
                    if(checkVerify()){
                       int prepScore = prepCalc();
                    Intent i = new Intent(this, AutoActivity.class);
                    i.putExtra("score",prepScore);
                    startActivity(i);
                    finish();
                }else{
                        Toast.makeText(this, "Checkea al menos una casilla", Toast.LENGTH_SHORT).show();
                    }}

        );

    }
    private int prepCalc(){
        int prepTotal = 0;
if(prepCheck1.isChecked()) {
    prepTotal += 1;
}
if(prepCheck2.isChecked()) {
    prepTotal += 3;
}
        return prepTotal;
    }
    private boolean checkVerify(){
        if(prepCheck3.isChecked()&&prepCheck1.isChecked()) {
            prepCheck1.toggle();
        }
        if(prepCheck3.isChecked()&&prepCheck2.isChecked()){
            prepCheck2.toggle();
        }
        if(prepCheck1.isChecked()||prepCheck2.isChecked()||prepCheck3.isChecked()){
            return true;
        }
        return  false;
    }
}