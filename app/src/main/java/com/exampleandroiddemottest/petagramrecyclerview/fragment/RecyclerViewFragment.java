package com.exampleandroiddemottest.petagramrecyclerview.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.exampleandroiddemottest.petagramrecyclerview.R;
import com.exampleandroiddemottest.petagramrecyclerview.llenarRecycler;
import com.exampleandroiddemottest.petagramrecyclerview.pojo.Pets;

import java.util.ArrayList;

public class RecyclerViewFragment  extends Fragment{

    ArrayList<Pets> pets;
    private RecyclerView rvPets;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //    return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_recyclerview,container,false);

            rvPets = v.findViewById(R.id.rvPets);
        //Forma en mostrar  el en el recycler;
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvPets.setLayoutManager(llm);


        llenarRecycler llenarRecycler = new llenarRecycler();
        pets=llenarRecycler.inicializarListadePets();
        llenarRecycler.inicializarAdactador(pets,getActivity(),rvPets);
//


        return v;
    }
}
