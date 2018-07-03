package com.startup.shivanand.phrases;

import android.media.MediaPlayer;
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
        Log.i("ID==================>",Integer.toString(id));
        String ourId="";

        ourId=view.getResources().getResourceEntryName(id);
        Log.i("OURID===============>",ourId);

        int resourceID=getResources().getIdentifier(ourId,"raw","com.startup.shivanand.phrases");

        MediaPlayer mediaPlayer=MediaPlayer.create(this,resourceID);
        mediaPlayer.start();
    }
}
