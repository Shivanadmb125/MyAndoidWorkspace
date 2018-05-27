package com.startup.shivanand.addimages;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void newCat(View view) {

        Log.i("ClickTest", "New Cat button clicked");

        ImageView image = findViewById(R.id.imageView);
        image.setImageResource(R.drawable.cat2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
