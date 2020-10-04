package com.example.zmail;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.zmail.models.CorreoElectronico;
import com.squareup.picasso.Picasso;

public class DetalleCorreo extends AppCompatActivity {

    private CorreoElectronico Correo;
    private TextView Nombre, Tema, Mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_correo);

        Correo= (CorreoElectronico) getIntent().getSerializableExtra("Detalles");

        Nombre = (TextView) findViewById(R.id.txtRemitenteDetalleCorreo);
        Tema = (TextView) findViewById(R.id.txtAsuntoDetalleCorreo);
        Mensaje = (TextView) findViewById(R.id.txtCuerpoMensajeDetalleCorreo);

        Nombre.setText(Correo.getNombreRemitente( ));
        Tema.setText(Correo.getAsuntoMensaje( ));
        Mensaje.setText(Correo.getCuerpoMensaje( ));
    }
}

