package com.example.jc.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class DronInfo extends AppCompatActivity {
int v = 0;
    String dronS = (v + "m/s");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dron_info);

setTitle("Dron");
        ImageView mapaFrame= findViewById(R.id.mapaFrame);
        TextView title = findViewById(R.id.titulo);
        TextView speed = findViewById(R.id.speed);
        ImageButton bMenu = findViewById(R.id.bMenu);

        speed.setText(dronS);

       bMenu.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(DronInfo.this, MainActivity.class);
               startActivity(intent);
           }
       });
    }

}
