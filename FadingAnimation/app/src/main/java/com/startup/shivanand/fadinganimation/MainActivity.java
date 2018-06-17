package com.startup.shivanand.fadinganimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public void cat1(View view) throws InterruptedException {
        ImageView cat1= findViewById(R.id.cat1);
       // ImageView cat2= findViewById(R.id.cat2);

        cat1.animate()
                .rotation(360*5)
                .scaleX(1)
                .scaleY(1)
                .setDuration(10000);


       //     cat1.animate().rotationBy(360 * 10).setDuration(2000 * 10);
       //     Thread.sleep(10000);



        //cat1.animate().translationX(1500).setDuration(2000);
        //cat2.animate().translationX(0).setDuration(2000);

        /*
        ImageView cat1= findViewById(R.id.cat1);
        ImageView cat2= findViewById(R.id.cat2);
        cat1.animate().alpha(0f).setDuration(2000);
        cat2.animate().alpha(1f).setDuration(2000);
        */
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView cat1= findViewById(R.id.cat1);
        // ImageView cat2= findViewById(R.id.cat2);

        cat1.animate()
                .scaleX(0.5f)
                .scaleY(0.5f)
                .setDuration(200);

        ImageView cat2= findViewById(R.id.cat2);
        cat2.animate().alpha(0);


    }
}
