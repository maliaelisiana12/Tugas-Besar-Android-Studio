package com.example.asus.foodlover;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Foodies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodies);
    }
    // pindah layout food1
    public void Food1(View view) {
        Intent intent = new Intent(Foodies.this, Food1.class);
        startActivity(intent);
    }
    // pindah layout food2
    public void Food2(View view) {
        Intent intent = new Intent(Foodies.this, Food2.class);
        startActivity(intent);
    }
    // pindah layout food3
    public void Food3(View view) {
        Intent intent = new Intent(Foodies.this, Food3.class);
        startActivity(intent);
    }
    // pindah layout food4
    public void Food4(View view) {
        Intent intent = new Intent(Foodies.this, Food4.class);
        startActivity(intent);
    }
    // pindah layout main
    public void Foodies(View view) {
        Intent intent = new Intent(Foodies.this, MainActivity.class);
        startActivity(intent);
    }
}
