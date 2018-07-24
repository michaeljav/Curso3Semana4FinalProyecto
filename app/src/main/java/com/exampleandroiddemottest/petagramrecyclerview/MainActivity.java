package com.exampleandroiddemottest.petagramrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends CreateMenuOpctions {

    ArrayList<Pets> pets;
    private ImageButton SegundaPantalla;
    private RecyclerView recyclerViewlistaPets;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.miActionBar);
        setSupportActionBar(toolbar);

        SegundaPantalla = findViewById(R.id.SegundaPantalla);

        SegundaPantalla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"click",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,DetallePets.class);
                startActivity(intent);
            }
        });

        recyclerViewlistaPets = findViewById(R.id.rvPets);

        //Forma en mostrar  el en el recycler;
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewlistaPets.setLayoutManager(llm);


        llenarRecycler llenarRecycler = new llenarRecycler();
       pets=llenarRecycler.inicializarListadePets();
        llenarRecycler.inicializarAdactador(pets,this,recyclerViewlistaPets);



    }


}
