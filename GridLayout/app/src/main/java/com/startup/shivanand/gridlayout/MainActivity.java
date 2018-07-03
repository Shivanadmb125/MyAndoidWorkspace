package com.startup.shivanand.gridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void  clicked(View view){

        int id=view.getId();

        Log.i("ID==================>",Integer.toString(view.getId()));


    }

}
