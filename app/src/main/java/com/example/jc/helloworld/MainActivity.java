package com.example.jc.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.jc.helloworld";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        float d=0;

        final TextView bpm =  findViewById(R.id.bpm);
        final TextView speed =  findViewById(R.id.speed);
        final TextView pPaciente =  findViewById(R.id.pPaciente);
        final TextView pDron =  findViewById(R.id.pDron);
        final TextView distance =  findViewById(R.id.distance);
        final TextView pPacienteX = findViewById(R.id.pregPacienteX);
        final TextView pDronX =  findViewById(R.id.pregDronX);
        final TextView pPacienteY = findViewById(R.id.pregPacienteY);
        final TextView pDronY =  findViewById(R.id.pregDronY);
        final EditText dronPosX =  findViewById(R.id.dronPX);
        final EditText pacientePosX = findViewById(R.id.pacientePX);
        final EditText dronPosY =  findViewById(R.id.dronPY);
        final EditText pacientePosY = findViewById(R.id.pacientePY);
        Button bSensores =  findViewById(R.id.bSensores);
        Button bDron =  findViewById(R.id.bDron);
        Button bPaciente =  findViewById(R.id.bPaciente);
        Button bMapa = findViewById(R.id.bMapa);


        pPacienteX.setText("Cual es la posicion del paciente? (X)");
        pDronX.setText("Cual es la posicion del dron? (X)");
        pPacienteY.setText("Cual es la posicion del paciente? (Y)");
        pDronY.setText("Cual es la posicion del dron? (Y)");






        bSensores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bpm.setText("98 BPM");
                Intent intent = new Intent(MainActivity.this, InfoDisplay.class);
                startActivity(intent);
            }
        });

        bDron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Dx = dronPosX.getText().toString();
                String Dy = dronPosY.getText().toString();
                speed.setText("12 m/s");

                pDron.setText(Dx + " en X y "+Dy +" en Y");

                Intent intent= new Intent(MainActivity.this, DronInfo.class);
                startActivity(intent);
            }
        });


        bPaciente.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                String Px = pacientePosX.getText().toString();
                String Py = pacientePosY.getText().toString();

                pPaciente.setText(Px + " en X y: " + Py +" en Y");

                Intent intent = new Intent(MainActivity.this, Paciente.class);
                startActivity(intent);
            }
        });


        bMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String xP = pacientePosX.getText().toString();
                int Px = Integer.parseInt(xP);
                String yP = pacientePosY.getText().toString();
                int Py = Integer.parseInt(yP);
                String xD = dronPosX.getText().toString();
                int Dx = Integer.parseInt(xD);
                String yD = dronPosY.getText().toString();
                int Dy = Integer.parseInt(yD);

                distance.setText("Distancia: " + getDist(Dx,Dy,Px,Py));
            }
        });

    }
    public void onResume() {
        super.onResume();




    }



   public int getDist( int Dx,int Dy,int Px,int Py) {
       double dist = (Math.sqrt((Px - Dx) ^ 2 + (Py - Dy) ^ 2));
       return (int) dist;
   }
}
