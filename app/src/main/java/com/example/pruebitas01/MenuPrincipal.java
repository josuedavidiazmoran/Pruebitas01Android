package com.example.pruebitas01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }

    public void Regresar(View view){
        Intent regresar = new Intent(this, LoginActivity.class);
        startActivity(regresar);
    }
    public void Sumar (View view){
        Intent sumar = new Intent(this, SumaActivity.class);
        startActivity(sumar);
    }
    public void Raiz (View view){
        Intent raiz = new Intent(this, RaizActivity.class);
        startActivity(raiz);
    }
    public void ParImpar (View view){
        Intent parimpar = new Intent(this, ParImparActivity.class);
        startActivity(parimpar);
    }
}