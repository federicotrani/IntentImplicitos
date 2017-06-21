package com.example.ftrani.intent_implicito;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelefonoActivity extends AppCompatActivity {

    private Button btnMarcar;
    private EditText edtTelefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telefono);

        btnMarcar = (Button) findViewById(R.id.btnMarcar);
        edtTelefono = (EditText) findViewById(R.id.edtTelefono);


    }

    public void marcarLlamada(View v) {
        String numero = edtTelefono.getText().toString();
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + numero));


        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        startActivity(intent);



    }

    public void cerrarActividad(View v){
        finish();
    }


}
