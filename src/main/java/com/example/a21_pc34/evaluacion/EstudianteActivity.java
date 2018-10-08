package com.example.a21_pc34.evaluacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EstudianteActivity extends AppCompatActivity {
    //declaracion de variables
    private EditText txtNombre,txtCodigo,txtMateria,txtParcial1,txtParcial2,txtParcial3;
    private Button btnGuardar,btnLista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudiante);

        //inicializando variables
        txtNombre   = (EditText) findViewById(R.id.txt_Nombre);
        txtCodigo   = (EditText) findViewById(R.id.txt_Codigo);
        txtMateria   = (EditText) findViewById(R.id.txt_Materia);
        txtParcial1   = (EditText) findViewById(R.id.txt_Parcial1);
        txtParcial2   = (EditText) findViewById(R.id.txt_Parcial2);
        txtParcial3  = (EditText) findViewById(R.id.txt_Parcial3);
        btnGuardar  = (Button  ) findViewById(R.id.btnGuardar);
        btnLista  = (Button  ) findViewById(R.id.btnLista);


        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //si alguno de los dos campos estan vacios
                if(txtNombre.getText().toString().isEmpty() || txtCodigo.getText().toString().isEmpty()
                        || txtMateria.getText().toString().isEmpty() || txtParcial1.getText().toString().isEmpty()
                        || txtParcial2.getText().toString().isEmpty()|| txtParcial3.getText().toString().isEmpty()){
                    Toast.makeText(EstudianteActivity.this,"Ingresa los datos del estudiante",Toast.LENGTH_SHORT).show();
                }else{//de lo contrario los campos estan llenos
                    //envio los datos al MainActivity
                    Intent resultIntent = new Intent();
                    // TODO envio los datos mediante el intent
                    resultIntent.putExtra("NOMBRE",txtNombre.getText().toString());
                    resultIntent.putExtra("CODIGO",txtCodigo.getText().toString());
                    resultIntent.putExtra("MATERIA",txtMateria.getText().toString());
                    resultIntent.putExtra("PARCIAL1",txtParcial1.getText().toString());
                    resultIntent.putExtra("PARCIAL2",txtParcial2.getText().toString());
                    resultIntent.putExtra("PARCIAL3",txtParcial3.getText().toString());
                    setResult(MainActivity.GUARDADO, resultIntent);
                    finish();
                }
            }
        });

    }
}
