package com.example.asus.foodlover;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Resep extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep);


    }

    public void Resep(View view) {
        Intent intent = new Intent(Resep.this, MainActivity.class);
        startActivity(intent);
    }
}
