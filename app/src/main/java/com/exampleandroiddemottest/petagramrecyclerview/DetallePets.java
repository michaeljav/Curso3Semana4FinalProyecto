package com.exampleandroiddemottest.petagramrecyclerview;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.exampleandroiddemottest.petagramrecyclerview.pojo.Pets;

import java.util.ArrayList;

public class DetallePets extends CreateMenuOpctions {


    private RecyclerView recyclerViewsegundaPantalla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_pets);

        Toolbar toolbar = findViewById(R.id.miActionBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        recyclerViewsegundaPantalla = findViewById(R.id.rvPetDetalles);

        //Forma en mostrar  el en el recycler;
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewsegundaPantalla.setLayoutManager(llm);


        llenarRecycler llenarRecycler = new llenarRecycler();
        ArrayList<Pets> pets=llenarRecycler.inicializarListadePets();
        llenarRecycler.inicializarAdactador(pets,this,recyclerViewsegundaPantalla);


    }




}
