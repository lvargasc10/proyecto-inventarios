package com.example.proyectoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Clientes extends AppCompatActivity {

    ListView listViewClientes;
    TextView txv1,txv0,txv3;
    ArrayList<String> listaInformacion;
    ArrayList<Cliente> listaClientes;
    Button btnClientesSinPedidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientes);
        btnClientesSinPedidos = findViewById(R.id.btnClientes2012);
        txv1=findViewById(R.id.textView7);
        txv0=findViewById(R.id.textView6);

        btnClientesSinPedidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                consulta5();
            }
        });
    }

    public void consulta5(){
        try{
            ConnectionHelper connectionHelper = new ConnectionHelper();
            Connection connect = connectionHelper.conexionBD();
            Statement stm = connect.createStatement();

            ResultSet rs=stm.executeQuery("SELECT * FROM pedido WHERE YEAR(fecha_pedido) != 2012");

            while(rs.next())
            {   txv0.setText(rs.getString("num_pedido")+" "
                    + rs.getString("id_vdor")+" "
                    + rs.getString("nit_cliente")+" "
                    + rs.getString("fecha_pedido")+" "
                    + rs.getString("id_producto")+" "
                    + rs.getString("cantidad"));
                StringBuilder builder = new StringBuilder();
                while (rs.next()) {
                    builder.append(rs.getString(1));
                    builder.append(" ");
                    builder.append(rs.getString(2));
                    builder.append(" ");
                    builder.append(rs.getString(3));
                    builder.append(" ");
                    builder.append(rs.getString(4));
                    builder.append(" ");
                    builder.append(rs.getString(5));
                    builder.append(" ");
                    builder.append(rs.getString(6));
                    builder.append("\n");
                }
                txv1.setText(builder.toString());

            }
        }catch (Exception e){
            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
    }
    }

}



