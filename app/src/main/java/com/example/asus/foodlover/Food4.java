package com.example.asus.foodlover;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class Food4 extends AppCompatActivity {

    //varibel lokal
    ImageView imgseblak;
    Button btnCamera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food4);
        imgseblak = (ImageView) findViewById(R.id.seblak);
        //CAMERA API
        btnCamera = (Button) findViewById(R.id.btn_camera);
        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i, 1);
            }
        });
    }

    //perintah untuk mengganti gambar
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        if(1 == requestCode && resultCode == RESULT_OK)
        {
            Bitmap bitmap = (Bitmap)data.getExtras().get("data");
            imgseblak.setImageBitmap(bitmap);
        }
    }


    public void Food4(View view) {
        Intent intent = new Intent(Food4.this, Foodies.class);
        startActivity(intent);
    }
}
