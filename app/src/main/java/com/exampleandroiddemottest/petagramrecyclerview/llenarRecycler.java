package com.exampleandroiddemottest.petagramrecyclerview;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class   llenarRecycler {

    public void inicializarAdactador(ArrayList<Pets> pets, Activity activity, RecyclerView recyclerViewlistaPets){
        PetsAdapter adaptador = new PetsAdapter(pets,activity);
        recyclerViewlistaPets.setAdapter(adaptador);
    }

    public ArrayList<Pets> inicializarListadePets(){


        ArrayList<Pets>  pets = new ArrayList<Pets>();

        pets.add(new Pets(R.drawable.uno,"Perro1",0));
        pets.add(new Pets(R.drawable.dos,"Perro2",0));
        pets.add(new Pets(R.drawable.tres,"Perro3",0));
        pets.add(new Pets(R.drawable.cuatro,"Perro4",0));
        pets.add(new Pets(R.drawable.cinco,"Perro5",0));
        return pets;
    }
}
