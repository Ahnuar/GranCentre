package com.example.grancentre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View b1 = findViewById(R.id.b1);
        b1.setOnClickListener(this);
        View b2 = findViewById(R.id.b2);
        b2.setOnClickListener(this);
    }

    public void onClick(View view) {
        View v = (View)view;

        if (v.getId() == R.id.b1 ) {
            //Obrim l'activitat 2 amb el Intent

            Intent intent1 = new Intent(this, restaurantes.class);  //.class és l'arxiu java compilat
            startActivity(intent1);

        } else if (v.getId() == R.id.b2){
            Intent intent2 = new Intent(this, parkings.class);  //.class és l'arxiu java compilat
            startActivity(intent2);
        }
    }
}