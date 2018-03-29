package com.example.jc.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.content.Intent;

public class ConfirmacionDron extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion_dron);

        ImageButton bMapa = findViewById(R.id.bMapa);
        TextView textoConfirmacion = findViewById(R.id.textoConfirmacion);
        ImageButton bMenu = findViewById(R.id.bMenu);

        setTitle("Confirmación");

        textoConfirmacion.setText("El dron se ha enviado exitosamente");

        bMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent change = new Intent(ConfirmacionDron.this, MainActivity.class);
                startActivity(change);
            }
        });

        bMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

}
