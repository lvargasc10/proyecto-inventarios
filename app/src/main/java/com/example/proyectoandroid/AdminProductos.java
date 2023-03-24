package com.example.proyectoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AdminProductos extends AppCompatActivity implements View.OnClickListener {

    private Button btnReg , btnBu, btnLi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);

        btnReg = (Button)findViewById(R.id.btnReg);
        btnBu = (Button)findViewById(R.id.btnBu);
        btnLi = (Button)findViewById(R.id.btnLi);

        btnReg.setOnClickListener(this);
        btnBu.setOnClickListener(this);
        btnLi.setOnClickListener(this);

    }

    //Metodo para mostrar y ocultar el menu
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;
    }

    //Metodo para asignar las funciones correspondientes a las opciones
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id == R.id.opRegistrar){
            Intent intent = new Intent( AdminProductos.this, RegistrarProductos.class);
            startActivity(intent);

        }else if ( id == R.id.opMostrar ){
            Intent intent = new Intent( AdminProductos.this, MostrarProductos.class);
            startActivity(intent);

        }else if(id == R.id.opListar){
            Intent intent = new Intent( AdminProductos.this, ListarProductos.class);
            startActivity(intent);

        }else{
            finish();
            System.exit(0);
        }
        return super.onOptionsItemSelected(item);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnReg:
                Intent in = new Intent( AdminProductos.this, RegistrarProductos.class);
                startActivity(in);
                break;
            case R.id.btnBu:
                Intent in2 = new Intent( AdminProductos.this, MostrarProductos.class);
                startActivity(in2);
                break;
            case R.id.btnLi:
                Intent in3 = new Intent( AdminProductos.this, ListarProductos.class);
                startActivity(in3);
                break;
        }

    }
}
