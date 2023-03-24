package com.example.proyectoandroid;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListarProductos extends AppCompatActivity {

    ListView listViewMateriales;
    ArrayList<String> listaInformacion;
    ArrayList<Producto> listaProducto;
    //SQLUtilities conexion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);

        listViewMateriales = (ListView) findViewById(R.id.listViewPersonas);


        //conexion = new SQLUtilities(this, "Material", null,1);

        consultarListaMateriales();
        ArrayAdapter adaptador = new ArrayAdapter(this,android.R.layout.simple_list_item_1,listaInformacion);
        listViewMateriales.setAdapter(adaptador);

        listViewMateriales.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                String informacion = "Id: " + listaProducto.get(pos).getId() + "\n";
                informacion += "Nombre: "+ listaProducto.get(pos).getNombre() + "\n";
                informacion += "Cantidad: "+ listaProducto.get(pos).getCantidad() + "\n";
                informacion += "Tipo: "+ listaProducto.get(pos).getTipo() + "\n";

                Toast.makeText(ListarProductos.this,informacion, Toast.LENGTH_LONG).show();
            }
        });

    }

    private void consultarListaMateriales() {
        /*
        //SQLiteDatabase db = conexion.getReadableDatabase();
        Producto producto = null;
        listaProducto = new ArrayList<Producto>();

        //Cursor cursor = db.rawQuery("SELECT * FROM Material", null);

        while (cursor.moveToNext()){
            producto = new Producto();
            producto.setId(cursor.getString(0));
            producto.setNombre(cursor.getString(1));
            producto.setCantidad(cursor.getString(2));
            producto.setTipo(cursor.getString(3));

            listaProducto.add(producto);

        }
        obtenerLista();

*/

    }

    private void obtenerLista() {
        listaInformacion = new ArrayList<String>();

        for (int i = 0; i< listaProducto.size(); i++){
            listaInformacion.add("Nombre: " + listaProducto.get(i).getNombre() + " | Cantidad: " + listaProducto.get(i).getCantidad() + " | Tipo: " + listaProducto.get(i).getTipo());
        }
    }
}
