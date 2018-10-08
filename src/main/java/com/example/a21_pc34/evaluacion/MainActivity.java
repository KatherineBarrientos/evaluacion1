package com.example.a21_pc34.evaluacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static int GUARDADO = 47;


    private AdaptadorEstudiante adaptadorEstudiante;
    private Button btnAgregar;
    private Button btnGuardar;
    private Button btnLista;
    private ListView lstEstudiantes;
    private TextView lblId;
    private ArrayList<Estudiante> estudiantesArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAgregar = (Button) findViewById(R.id.btnAgregar);
        btnGuardar = (Button) findViewById(R.id.btnGuardar);
        btnLista = (Button) findViewById(R.id.btnLista);
        estudiantesArrayList = new ArrayList<>();
        //Inicializando el adaptador
        adaptadorEstudiante = new AdaptadorEstudiante(this, estudiantesArrayList);
        //Inicializando el listView
        ListView listView = (ListView) findViewById(R.id.lstEstudiantes);
        //seteando el adaptador al listview
        //listView.setAdapter(adaptadorEstudiante);

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //preparo el activity
                Intent intent = new Intent(MainActivity.this, EstudianteActivity.class);
                //inicio el activitiy y quiero como mensaje un RESULT_OK
                startActivityForResult(intent, GUARDADO);

            }

        });

    }
/*
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == GUARDADO) {
            if (data == null) return;
            //recibo los datos
            Estudiante e = new Estudiante(
                    data.getStringExtra("NOMBRE"),
                    data.getStringExtra("CODIGO"),
                    data.getStringExtra("MATERIA"),
                    data.getDoubleExtra("PARCIAL1"),
                    data.getDoubleExtra("PARCIAL2"),
                    data.getDoubleExtra("PARCIAL3")

            );

            //TODO agrego a la lista y luego actualizo el adaptador, de lo contrario no se mostraria el cambio
            estudiantesArrayList.add(e);
            adaptadorEstudiante.notifyDataSetChanged();


        }
    }
*/
}