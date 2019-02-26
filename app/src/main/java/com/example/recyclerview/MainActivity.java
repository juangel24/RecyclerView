package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.recyclerview.Models.Persona;
import com.example.recyclerview.adapters.AdaptadorPersona;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.list);

        List<Persona> listPersonas = new ArrayList<Persona>();
        listPersonas.add(new Persona(1, "Kiko", "Kikin", 19));
        listPersonas.add(new Persona(2, "Pasillas", "Pasillon", 20));
        listPersonas.add(new Persona(3, "Materia", "Gris", 5));

        AdaptadorPersona adapter = new AdaptadorPersona(listPersonas);

        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(adapter);
    }
}
