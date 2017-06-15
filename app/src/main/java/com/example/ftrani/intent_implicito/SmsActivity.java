package com.example.ftrani.intent_implicito;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SmsActivity extends AppCompatActivity {

    private EditText edtTelefono;
    private EditText edtMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        edtTelefono = (EditText) findViewById(R.id.edtTelefono);
        edtMensaje = (EditText) findViewById(R.id.edtMensaje);
    }

    public void cerrarActividad(View v){
        finish();
    }

    public void componerSms(View v){
        String telefono = edtTelefono.getText().toString();
        String mensaje = edtMensaje.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("smsto:"+telefono));

        intent.putExtra("sms_body",mensaje);

        startActivity(intent);


    }
}
