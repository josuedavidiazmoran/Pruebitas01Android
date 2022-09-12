package com.example.pruebitas01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SumaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);
    }
    public void MenuPrincipal (View view){
        Intent menu = new Intent(this, MenuPrincipal.class);
        startActivity(menu);
    }
}