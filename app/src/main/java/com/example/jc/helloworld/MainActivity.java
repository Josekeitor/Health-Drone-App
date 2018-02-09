package com.example.jc.helloworld;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

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
        EditText dronPosX =  findViewById(R.id.dronPX);
        EditText pacientePosX = findViewById(R.id.pacientePX);
        EditText dronPosY =  findViewById(R.id.dronPY);
        EditText pacientePosY = findViewById(R.id.pacientePY);
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
            }
        });

        bDron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                speed.setText("12 m/s");
            }
        });


        bPaciente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pPaciente.setText("12 m/s");
            }
        });


        bMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                distance.setText("12 m/s");
            }
        });
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
