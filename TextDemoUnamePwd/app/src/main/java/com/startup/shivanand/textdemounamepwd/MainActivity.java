package com.startup.shivanand.textdemounamepwd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickedLogin(View view){

        EditText uname=findViewById(R.id.username);
        EditText pwd=findViewById(R.id.password);

        Log.i("Username: ",uname.getText().toString());
        Log.i("Password: ",pwd.getText().toString());


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
