package com.example.ftrani.intent_implicito;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MapaActivity extends AppCompatActivity {

    private EditText edtLongitud, edtLatitud;
    private Button btnMostrarMapa, btnCerrarMapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);

        //instanciando controles de UI
        edtLatitud = (EditText) findViewById(R.id.edtLatitud);
        edtLongitud = (EditText) findViewById(R.id.edtLongitud);
        btnCerrarMapa = (Button) findViewById(R.id.btnCerrarMapa);
        btnMostrarMapa = (Button) findViewById(R.id.btnMostrarMapa);


        //cerrar actividad
        btnCerrarMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //boton mostrar mapa
        btnMostrarMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mostrarMapa();
            }
        });

    }

    private void mostrarMapa() {
        String longitud = edtLongitud.getText().toString();
        String latitud = edtLatitud.getText().toString();
        Uri geo = Uri.parse("geo:"+latitud+","+longitud);

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(geo);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
