package com.example.proyecto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PaginaInicial extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProductoAdapter adapter;
    private List<Producto> productos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_inicial);


        // Inicializar la lista de productos
        productos = new ArrayList<>();
        productos.add(new Producto("Patas sucias", "Fotos y videos de patas sucias de lodo", 10.99, R.drawable.icono));
        productos.add(new Producto("Cosplay de patas", "Me disfrazo de pata y hago un video diciendo uwu", 20.99, R.drawable.icono));

        // Configurar el RecyclerView
        recyclerView = findViewById(R.id.productRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ProductoAdapter(productos);
        recyclerView.setAdapter(adapter);
    }

    public void perfil (View view){
        Intent intent = new Intent(view.getContext(), Perfil.class);
        startActivity(intent);
    }
}
