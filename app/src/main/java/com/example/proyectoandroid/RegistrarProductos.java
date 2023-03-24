package com.example.proyectoandroid;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrarProductos extends AppCompatActivity implements View.OnClickListener{

    private Spinner spinner;
    private EditText edtId, edtNombre, edtCant;
    private Button btnRegistrar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        edtId = (EditText)findViewById(R.id.edtId);
        edtNombre = (EditText)findViewById(R.id.edtNombre);
        edtCant = (EditText)findViewById(R.id.edtCant);
        spinner = (Spinner)findViewById(R.id.spinner);
        btnRegistrar = (Button)findViewById(R.id.btnMostrar);
        btnRegistrar.setOnClickListener(this);

        String [] opciones = {"Detergente Top","Blanqueador","Fab de Color","Ambientador" };


        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spinner.setAdapter(adapter);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void registrarProducto(){



    }

    @Override
    public void onClick(View view) {
        registrarProducto();

    }
}
