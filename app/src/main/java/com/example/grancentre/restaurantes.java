package com.example.grancentre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class restaurantes extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View bhome = findViewById(R.id.bhome);
        bhome.setOnClickListener(this);
    }

    public void onClick(View view) {
        View v = (View)view;

        if (v.getId() == R.id.bhome ) {
            //Obrim l'activitat 2 amb el Intent

            Intent intent1 = new Intent(this,MainActivity.class);  //.class és l'arxiu java compilat
            startActivity(intent1);

        }
    }
}