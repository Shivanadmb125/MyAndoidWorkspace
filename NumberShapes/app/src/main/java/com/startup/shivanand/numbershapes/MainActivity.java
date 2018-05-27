package com.startup.shivanand.numbershapes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    class Number {
        public boolean isTriangular(int input) {
            int currentTriNum = 0;
            int n = 0;

            while (currentTriNum < input) {
                currentTriNum += n;
                n++;
            }

            if (currentTriNum != input)
                return false;
            else
                return true;
        }

        public boolean isSquare(int input) {
            int sqrt = (int) Math.sqrt(input);
            if (sqrt * sqrt == input) {
                return true;
            } else {
                return false;
            }
        }
    }


    public void checkClick(View view) {

        String message = "";

        EditText userNum = findViewById(R.id.userEnterdNumEditText);
        //   Toast.makeText(MainActivity.this,userNum.getText().toString(),Toast.LENGTH_SHORT).show();

        if (userNum.getText().toString().isEmpty()) {
            message = "Please enter a number...!!!";
            Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();

        } else {
            int userNumInt = Integer.parseInt(userNum.getText().toString());
            Number number = new Number();

            if (number.isSquare(userNumInt)) {
                if (number.isTriangular(userNumInt)) {
                    message = userNumInt + " is both Triangular & Square";
                } else {
                    message = userNumInt + " is Square but not Triangular";
                }
            } else if (number.isTriangular(userNumInt)) {
                message = userNumInt + " is Triangular but not Square";
            } else {
                message = userNumInt + " is neither Triangular not Square";
            }

            Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
        }
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
