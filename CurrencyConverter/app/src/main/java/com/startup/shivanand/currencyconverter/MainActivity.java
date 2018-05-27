package com.startup.shivanand.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertOnClick (View view){

        EditText dollar=(EditText) findViewById(R.id.currencyValue);
        Log.i("Amount entered:",dollar.getText().toString());


        Double dollarDouble=Double.parseDouble(dollar.getText().toString());

        Double rupeesDouble=dollarDouble * 63;

        Toast.makeText(MainActivity.this,"In Rupees="+String.format("%.2f",rupeesDouble),Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
