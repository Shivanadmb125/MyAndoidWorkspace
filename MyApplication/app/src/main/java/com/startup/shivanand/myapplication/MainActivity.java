package com.startup.shivanand.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){

        Log.i("###INFO LOG###","This is just a simple app onClick log....!!!");

        EditText name=(EditText) findViewById(R.id.nameText);
        Log.i("YOUR NAME IS :",name.getText().toString());

        Toast.makeText(this, "Hi.... " +name.getText().toString(), Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
