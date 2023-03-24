package com.example.proyectoandroid;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MostrarProductos extends AppCompatActivity implements View.OnClickListener{

    private EditText edtRut, edtNombre, edtCant,edtTipo;
    private Button btnBuscar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);

        edtRut = (EditText)findViewById(R.id.edtId);
        edtNombre = (EditText)findViewById(R.id.edtNombre);
        edtCant = (EditText)findViewById(R.id.edtCant);
        edtTipo = (EditText)findViewById(R.id.edtTipo);
        btnBuscar = (Button)findViewById(R.id.btnMostrar);
        btnBuscar.setOnClickListener(this);


    }

    private void BuscarPersona(){
    }


    @Override
    public void onClick(View view) {
        BuscarPersona();
    }
}
