package com.example.recyclerview.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.recyclerview.Models.Persona;
import com.example.recyclerview.R;

import java.util.List;

public class AdaptadorPersona extends RecyclerView.Adapter<AdaptadorPersona.ViewHolder> {
    private List<Persona> listPersonas;

    public AdaptadorPersona(List<Persona> listPersonas) {
        this.listPersonas = listPersonas;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.nom.setText(listPersonas.get(i).getNombre());
        viewHolder.ape.setText(listPersonas.get(i).getApellido());
        viewHolder.age.setText(listPersonas.get(i).getEdad().toString());
    }

    @Override
    public int getItemCount() {
        return listPersonas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nom, ape, age;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nom = itemView.findViewById(R.id.nom);
            ape = itemView.findViewById(R.id.ape);
            age = itemView.findViewById(R.id.age);
        }
    }
}
