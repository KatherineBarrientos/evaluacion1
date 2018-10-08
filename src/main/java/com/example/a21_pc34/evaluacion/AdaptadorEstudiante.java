package com.example.a21_pc34.evaluacion;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class AdaptadorEstudiante extends ArrayAdapter<Estudiante> {
    public AdaptadorEstudiante(@NonNull Context context, @NonNull List<Estudiante> objects) {
        super(context, 0, objects);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Estudiante estudiante = getItem(position);
        //TODO inicializando el layout correspondiente al item (Estudiante)
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_estudiante, parent, false);

        }
        TextView lblNombre = (TextView) convertView.findViewById(R.id.lblNombre);
        TextView lblCodigo = (TextView) convertView.findViewById(R.id.lblCodigo);
        TextView lblMateria = (TextView) convertView.findViewById(R.id.lblMateria);

        // mostrar los datos
        lblNombre.setText(estudiante.nombre);
        lblCodigo.setText(estudiante.codigo);
        lblMateria.setText(estudiante.materia);


        // Return la convertView ya con los datos
        return convertView;
    }
}
