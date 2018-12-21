package com.example.asus.foodlover;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class MainActivity extends AppCompatActivity {

    // variabel untuk gambar carousel
    CarouselView carouselView;
    int[] sampleImages = {R.drawable.gambar1, R.drawable.gambar2, R.drawable.gambar3, R.drawable.gambar4, R.drawable.gambar5};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //mengambil konten yg ada di view dan mengakses toolbar
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        carouselView = findViewById(R.id.carouselView);
        //pengaturan halaman
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);

        //mengambil konten dari layout logout
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Logout", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };

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

    public void Foodies(View view) {
        Intent intent = new Intent(MainActivity.this, Foodies.class);
        startActivity(intent);
    }

    public void Resep(View view) {
        Intent intent = new Intent(MainActivity.this, Resep.class);
        startActivity(intent);
    }

    public void Review(View view) {
        Intent intent = new Intent(MainActivity.this, Review.class);
        startActivity(intent);
    }

    public void MapsActivity(View view) {
        Intent intent = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(intent);
    }
}
