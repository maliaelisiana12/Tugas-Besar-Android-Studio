package com.example.asus.foodlover;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Food3 extends AppCompatActivity {

    // variabel lokal
    ImageView imgsoto;
    Button btnCamera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food3);
        imgsoto = (ImageView) findViewById(R.id.soto);
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
    @Override

    //perintah untuk mengganti gambar
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        if(1 == requestCode && resultCode == RESULT_OK)
        {
            Bitmap bitmap = (Bitmap)data.getExtras().get("data");
            imgsoto.setImageBitmap(bitmap);
        }
    }

    public void Food3(View view) {
        Intent intent = new Intent(Food3.this, Foodies.class);
        startActivity(intent);
    }
}
