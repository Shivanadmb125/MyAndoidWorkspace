package com.startup.shivanand.guessme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void MakeToast(String string){

        Toast.makeText(MainActivity.this,string,Toast.LENGTH_SHORT).show();
    }

    public void GuessNum(View view){

        EditText editText=findViewById(R.id.guessEditText);

        String guessNo=editText.getText().toString();

        int guessNoInt=Integer.parseInt(guessNo);

        if(guessNoInt > randomNumber){
            MakeToast("Higher..!!!");
        } else if (guessNoInt < randomNumber){
            MakeToast("Lower...!!!");
        } else {
            MakeToast("You're right...!!! Let's try again :) ");
            Random rand= new Random();
            randomNumber=rand.nextInt(19+1)+1;
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand= new Random();
        randomNumber=rand.nextInt(19+1)+1;

        /*
        private int getRandomNumber(int min,int max) {
        return (new Random()).nextInt((max - min) + 1) + min;
        */

    }
}
