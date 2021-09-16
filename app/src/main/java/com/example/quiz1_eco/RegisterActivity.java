package com.example.quiz1_eco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
private Button contButton;
private TextView titleReg, textReg;
private EditText nombreReg, codReg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        SharedPreferences sp1 = getSharedPreferences("data",MODE_PRIVATE);
        contButton = findViewById(R.id.contButton);
        titleReg = findViewById(R.id.titleReg);
        textReg = findViewById(R.id.textReg);
        nombreReg = findViewById(R.id.nombreReg);
        codReg = findViewById(R.id.codReg);

        contButton.setOnClickListener(
                (v) ->{
                    if(!nombreReg.getText().toString().replaceAll("\\s","").isEmpty()){
                        if(!codReg.getText().toString().replaceAll("\\s","").isEmpty()){
                            if(verificarCodigo()){
                            String nameList = sp1.getString("User&ScoreList","");
                            String nameU =  nombreReg.getText().toString().trim()+": ";
                            String codeList = sp1.getString("CodeList","");
                            String codeU =  codReg.getText().toString().trim()+",";
                            sp1.edit().putString("User&ScoreList", nameList+nameU).apply();
                            sp1.edit().putString("CodeList", codeList+codeU).apply();
                            //Toast.makeText(this, sp1.getString("User&ScoreList","")+sp1.getString("CodeList",""), Toast.LENGTH_LONG).show();
                    Intent i = new Intent(this, PrepActivity.class);
                    startActivity(i);
                }}else{
                            Toast.makeText(this, "Ingrese un código", Toast.LENGTH_SHORT).show();

                        }}else{
                        Toast.makeText(this, "Ingrese un nombre", Toast.LENGTH_SHORT).show();
                    }
                }

        );
    }
    protected boolean verificarCodigo(){
        String verify = getSharedPreferences("data",MODE_PRIVATE).getString("CodeList","NO_CODE").trim();
        if(verify.contains(codReg.getText().toString().trim())){
            Toast.makeText(this, "El código ya está registrado", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}