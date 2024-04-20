package com.example.proyecto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void registro (View view){
        Intent intent = new Intent(view.getContext(), Registro.class);
        startActivity(intent);
    }

    public void acceso (View view){
        Intent intent = new Intent(view.getContext(), PaginaInicial.class);
        startActivity(intent);
    }

    public void restablecer_contra (View view){
        Intent intent = new Intent(view.getContext(), Restablecer_contra.class);
        startActivity(intent);
    }
}