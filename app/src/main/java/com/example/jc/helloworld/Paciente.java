package com.example.jc.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class Paciente extends AppCompatActivity {

    String estado_paciente = "   El paciente se encuentra bien";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paciente);

        TextView textoEstadoP = findViewById(R.id.textoEstadoP);
        ImageView visualEstadoP = findViewById(R.id.visualEstadoP);
        ImageButton bMenu = findViewById(R.id.bMenu);

        textoEstadoP.setText(estado_paciente);


        bMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Paciente.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
