package com.example.proyectoandroid;

import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionHelper {

    public Connection conexionBD(){
        Connection cnn=null;
        try{
            StrictMode.ThreadPolicy politica = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(politica);
            Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance();
            cnn= DriverManager.getConnection("jdbc:jtds:sqlserver://192.168.0.3;" + "databaseName=Inventarios;user=sa;password=3124;");
        }catch (Exception e){
            Log.e("Error", e.getMessage());
        }
        return cnn;
    }

}