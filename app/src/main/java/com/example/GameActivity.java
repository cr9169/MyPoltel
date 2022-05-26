package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mypoltel.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

// NbaPlayer(String team, Conference conference, Division division,
//                     Position position, String height, int age, int jerseyNumber)
public class GameActivity extends AppCompatActivity implements View.OnClickListener {

    NbaPlayer selectedPlayer;

    TextView guess1Square1;
    TextView guess1Square2;
    TextView guess1Square3;
    TextView guess1Square4;
    TextView guess1Square5;
    TextView guess1Square6;
    TextView guess1Square7;
    TextView guess2Square1;
    TextView guess2Square2;
    TextView guess2Square3;
    TextView guess2Square4;
    TextView guess2Square5;
    TextView guess2Square6;
    TextView guess2Square7;
    TextView guess3Square1;
    TextView guess3Square2;
    TextView guess3Square3;
    TextView guess3Square4;
    TextView guess3Square5;
    TextView guess3Square6;
    TextView guess3Square7;
    TextView guess4Square1;
    TextView guess4Square2;
    TextView guess4Square3;
    TextView guess4Square4;
    TextView guess4Square5;
    TextView guess4Square6;
    TextView guess4Square7;
    TextView guess5Square1;
    TextView guess5Square2;
    TextView guess5Square3;
    TextView guess5Square4;
    TextView guess5Square5;
    TextView guess5Square6;
    TextView guess5Square7;
    TextView guess6Square1;
    TextView guess6Square2;
    TextView guess6Square3;
    TextView guess6Square4;
    TextView guess6Square5;
    TextView guess6Square6;
    TextView guess6Square7;
    TextView guess7Square1;
    TextView guess7Square2;
    TextView guess7Square3;
    TextView guess7Square4;
    TextView guess7Square5;
    TextView guess7Square6;
    TextView guess7Square7;

    EditText edAnswer;

    Button btnBackToMainMenu;
    Button btnSubmitAnswer;

    HashMap<String, NbaPlayer> players = new HashMap<String, NbaPlayer>();

    boolean isWinner = false;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        btnBackToMainMenu = findViewById(R.id.btnBackToMainMenu);
        btnBackToMainMenu.setOnClickListener(this);
        btnSubmitAnswer = findViewById(R.id.btnSubmitAnswer);
        btnSubmitAnswer.setOnClickListener(this);

        edAnswer = findViewById(R.id.edAnswer);

        guess1Square1 = findViewById(R.id.guess1Square1);
        guess1Square2 = findViewById(R.id.guess1Square2);
        guess1Square3 = findViewById(R.id.guess1Square3);
        guess1Square4 = findViewById(R.id.guess1Square4);
        guess1Square5 = findViewById(R.id.guess1Square5);
        guess1Square6 = findViewById(R.id.guess1Square6);
        guess1Square7 = findViewById(R.id.guess1Square7);
        guess2Square1 = findViewById(R.id.guess2Square1);
        guess2Square2 = findViewById(R.id.guess2Square2);
        guess2Square3 = findViewById(R.id.guess2Square3);
        guess2Square4 = findViewById(R.id.guess2Square4);
        guess2Square5 = findViewById(R.id.guess2Square5);
        guess2Square6 = findViewById(R.id.guess2Square6);
        guess2Square7 = findViewById(R.id.guess2Square7);
        guess3Square1 = findViewById(R.id.guess3Square1);
        guess3Square2 = findViewById(R.id.guess3Square2);
        guess3Square3 = findViewById(R.id.guess3Square3);
        guess3Square4 = findViewById(R.id.guess3Square4);
        guess3Square5 = findViewById(R.id.guess3Square5);
        guess3Square6 = findViewById(R.id.guess3Square6);
        guess3Square7 = findViewById(R.id.guess3Square7);
        guess4Square1 = findViewById(R.id.guess4Square1);
        guess4Square2 = findViewById(R.id.guess4Square2);
        guess4Square3 = findViewById(R.id.guess4Square3);
        guess4Square4 = findViewById(R.id.guess4Square4);
        guess4Square5 = findViewById(R.id.guess4Square5);
        guess4Square6 = findViewById(R.id.guess4Square6);
        guess4Square7 = findViewById(R.id.guess4Square7);
        guess5Square1 = findViewById(R.id.guess5Square1);
        guess5Square2 = findViewById(R.id.guess5Square2);
        guess5Square3 = findViewById(R.id.guess5Square3);
        guess5Square4 = findViewById(R.id.guess5Square4);
        guess5Square5 = findViewById(R.id.guess5Square5);
        guess5Square6 = findViewById(R.id.guess5Square6);
        guess5Square7 = findViewById(R.id.guess5Square7);
        guess6Square1 = findViewById(R.id.guess6Square1);
        guess6Square2 = findViewById(R.id.guess6Square2);
        guess6Square3 = findViewById(R.id.guess6Square3);
        guess6Square4 = findViewById(R.id.guess6Square4);
        guess6Square5 = findViewById(R.id.guess6Square5);
        guess6Square6 = findViewById(R.id.guess6Square6);
        guess6Square7 = findViewById(R.id.guess6Square7);
        guess7Square1 = findViewById(R.id.guess7Square1);
        guess7Square2 = findViewById(R.id.guess7Square2);
        guess7Square3 = findViewById(R.id.guess7Square3);
        guess7Square4 = findViewById(R.id.guess7Square4);
        guess7Square5 = findViewById(R.id.guess7Square5);
        guess7Square6 = findViewById(R.id.guess7Square6);
        guess7Square7 = findViewById(R.id.guess7Square7);

        /*
        guess1Square1.setBackgroundColor(ContextCompat.getColor(this, R.color.red));
        guess1Square2.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow));
        guess1Square3.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
        guess1Square4.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
        */
        // TO DO: set backgrounds and texts according to answer submitted.

        // guess1Square1.setVisibility(TextView.INVISIBLE);

        // HashMap of the players is gets filled
        PlayersContainer.fillContainer(players);

        generateRandomPlayerFromPlayerContainer(players);

        if(edAnswer.getText() == selectedPlayer) {
            isWinner = true;
            // winner(); // winning position - open a dialog "you won" with a reset option ()
        }
        }


    @Override
    public void onClick(View v) {

        if (v == btnBackToMainMenu) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }
        if (v == btnSubmitAnswer) {
            String name =  edAnswer.getText().toString();
            edAnswer.setText("");
            // TO DO: perform all the game actions for one guess at the time.
        }
    }

    public boolean checkIfPlayerIsTheSelectedPlayer(NbaPlayer selectedPlayer)
    {
        for (Map.Entry<String, NbaPlayer> entry : players.entrySet()) {
            if (entry.getValue().equals(selectedPlayer))
                return true;
        }
        return false;
    }
    public void resetGame()
    {
        List<String> keysAsArray = new ArrayList<>(players.keySet());
        Random random = new Random();
        selectedPlayer = players.get(keysAsArray.get(random.nextInt(keysAsArray.size())));

        // TO DO: set all the text views text and color to white and no text.
         guess1Square1.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess1Square1.setText("");
         guess1Square3.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess1Square4.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess1Square5.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess1Square2.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess1Square6.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess1Square7.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess2Square1.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess2Square2.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess2Square3.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess2Square4.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess2Square5.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess2Square6.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess2Square7.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess3Square1.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess3Square2.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess3Square3.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess3Square4.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess3Square5.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess3Square6.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess3Square7.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess4Square1.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess4Square2.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess4Square3.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess4Square4.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess4Square5.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess4Square6.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess4Square7.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess5Square1.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess5Square2.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess5Square3.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess5Square4.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess5Square5.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess5Square6.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess5Square7.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess6Square1.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess6Square2.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess6Square3.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess6Square4.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess6Square5.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess6Square6.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess6Square7.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess7Square1.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess7Square2.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess7Square3.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess7Square4.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess7Square5.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess7Square6.setBackgroundColor(Color.parseColor("#FFFFFF"));
         guess7Square7.setBackgroundColor(Color.parseColor("#FFFFFF"));

         guess1Square2.setText("");
         guess1Square3.setText("");
         guess1Square4.setText("");
         guess1Square5.setText("");
         guess1Square6.setText("");
         guess1Square7.setText("");
         guess2Square1.setText("");
         guess2Square2.setText("");
         guess2Square3.setText("");
         guess2Square4.setText("");
         guess2Square5.setText("");
         guess2Square6.setText("");
         guess2Square7.setText("");
         guess3Square1.setText("");
         guess3Square2.setText("");
         guess3Square3.setText("");
         guess3Square4.setText("");
         guess3Square5.setText("");
         guess3Square6.setText("");
         guess3Square7.setText("");
         guess4Square1.setText("");
         guess4Square2.setText("");
         guess4Square3.setText("");
         guess4Square4.setText("");
         guess4Square5.setText("");
         guess4Square6.setText("");
         guess4Square7.setText("");
         guess5Square1.setText("");
         guess5Square2.setText("");
         guess5Square3.setText("");
         guess5Square4.setText("");
         guess5Square5.setText("");
         guess5Square6.setText("");
         guess5Square7.setText("");
         guess6Square1.setText("");
         guess6Square2.setText("");
         guess6Square3.setText("");
         guess6Square4.setText("");
         guess6Square5.setText("");
         guess6Square6.setText("");
         guess6Square7.setText("");
         guess7Square1.setText("");
         guess7Square2.setText("");
         guess7Square3.setText("");
         guess7Square4.setText("");
         guess7Square5.setText("");
         guess7Square6.setText("");
         guess7Square7.setText("");
    }
    // checks if a square a field (in square) is correct.
    public boolean checkIfCorrectAnswer()
    {
        return true;
    }
    public boolean checkIfWinner(String name) // name of a player from container (hashmap key)
    {
        return true;
    }

    // Sets color and text to a square according to name of player guessed, quess index
    // and square.
    public void setSquareColorAndText(String name, TextView guess_XSquare_X, int quess, int square)
    // name of a player from container (hashmap key)
    {
        //guess_XSquare_X.setBackgroundColor(checkIfCorrectAnswer(name));
        // guess_XSquare_X.setText(); // TODO: Check which square it is! (according to the square you
        // are going to know which property to set the text of)
    }

    // Check which square it is according to the square you
    // are going to know which property to set the text of.
    public int[] returnTextViewQuessAndSquareIndexes(TextView guess_XSquare_X)
    {
        int[] indexes = new int[2];
        // TODO: Comlete the function!
        return indexes;
    }

    public NbaPlayer generateRandomPlayerFromPlayerContainer(HashMap<String, NbaPlayer> players)
    {
        List<String> keysAsArray = new ArrayList<>(players.keySet());
        Random random = new Random();
        selectedPlayer = players.get(keysAsArray.get(random.nextInt(keysAsArray.size())));

        return  selectedPlayer;
    }



}