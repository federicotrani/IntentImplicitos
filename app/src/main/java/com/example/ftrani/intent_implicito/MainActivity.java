package com.example.ftrani.intent_implicito;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void marcarLlamada(View v){
        Intent intent = new Intent(this, TelefonoActivity.class);
        startActivity(intent);
    }

    public void enviarSms(View v){
        Intent intent = new Intent(this, SmsActivity.class);
        startActivity(intent);
    }

    public void enviarEmail(View v){
        Intent intent = new Intent(this, EmailActivity.class);
        startActivity(intent);
    }

    public void mostrarMapa(View v){
        Intent intent = new Intent(this, MapaActivity.class);
        startActivity(intent);
    }


    public void cerrarApp(View v){
        finish();
    }


}
