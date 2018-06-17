package com.startup.shivanand.connect3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 0=red 1=black
    int activePlayer=0;
 //   boolean isGameActive=true;
    int gameState[] = {2,2,2,2,2,2,2,2,2};
    int winningPositions[][]={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
    public void dropIn (View view) {

        ImageView counter = (ImageView) view;

        int tappedCounter = Integer.parseInt(counter.getTag().toString());
        if (gameState[tappedCounter] == 2 ) {
            counter.setTranslationY(-1000f);
            gameState[tappedCounter] = activePlayer;


            System.out.println("Tag is: ------ "+ tappedCounter+ " ------");

            if (activePlayer == 0) {
                counter.setImageResource(R.drawable.red);
                activePlayer = 1;
            } else {

                counter.setImageResource(R.drawable.black);
                activePlayer = 0;
            }
            counter.animate().translationYBy(1000f).rotation(360 * 1).setDuration(300);

            for (int[] winningPosition : winningPositions){
                if (gameState[winningPosition[0]]==gameState[winningPosition[1]] &&
                        gameState[winningPosition[1]]==gameState[winningPosition[2]] &&
                        gameState[winningPosition[0]] != 2){
                    //Toast.makeText(MainActivity.this,"Winning Position="+winningPosition[0],Toast.LENGTH_SHORT).show();

                   //Someone won
     //               isGameActive=false;
                    String winner="Black";
                    if (gameState[winningPosition[0]]==0){
                        winner="Red";
                    }

                    TextView winnerMessage = findViewById(R.id.winnerMessage);
                    winnerMessage.setText(winner + " has won..!");
                    LinearLayout layout = findViewById(R.id.playAgainLayout);
                    layout.setVisibility(view.VISIBLE);
                }
            }
        }
    }

    public void PlayAgain(View view) {

        LinearLayout layout = findViewById(R.id.playAgainLayout);
        layout.setVisibility(view.INVISIBLE);

     //   isGameActive=true;

        activePlayer = 0;

        for (int i=0; i < gameState.length; i++){
            gameState[i]=2;
        }

        GridLayout gridLayout=(GridLayout) findViewById(R.id.gridLayoutID);

      /*   for (int i=1; i < gridLayout.getChildCount() ; i++){

             System.out.println("=============Count= "+gridLayout.getChildCount());
            ((ImageView)gridLayout.getChildAt(i)).setImageResource(0);
        } */
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}