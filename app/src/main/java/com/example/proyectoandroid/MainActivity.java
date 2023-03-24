package com.example.proyectoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnClie , btnRepre, btnProdu,btnPedi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClie = (Button)findViewById(R.id.btnClientes);
        btnRepre = (Button)findViewById(R.id.btnVentas);
        btnProdu = (Button)findViewById(R.id.btnProductos);
        btnPedi = (Button)findViewById(R.id.btnPedidos);

        btnClie.setOnClickListener(this);
        btnRepre.setOnClickListener(this);
        btnProdu.setOnClickListener(this);
        btnPedi.setOnClickListener(this);

    }

    //Metodo para mostrar y ocultar el menu
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnClientes:
                Intent in = new Intent( MainActivity.this, Clientes.class);
                startActivity(in);
                break;
            case R.id.btnVentas:
                Intent in2 = new Intent( MainActivity.this, Vendedores.class);
                startActivity(in2);
                break;
            case R.id.btnProductos:
                Intent in3 = new Intent( MainActivity.this, AdminProductos.class);
                startActivity(in3);
                break;
            case R.id.btnPedidos:
                Intent in4 = new Intent( MainActivity.this, ListarProductos.class);
                startActivity(in4);
                break;
        }

    }
}
