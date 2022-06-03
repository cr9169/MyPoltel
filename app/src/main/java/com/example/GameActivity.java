package com.example;

import static com.example.Position.C;
import static com.example.Position.PF;
import static com.example.Position.PG;
import static com.example.Position.SF;
import static com.example.Position.SG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

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

    int countGuesses = 0;

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

        // guess1Square1.setVisibility(TextView.INVISIBLE);

        // HashMap of the players is gets filled
        PlayersContainer.fillContainer(players);

        resetGame();

        System.out.println(selectedPlayer); // TODO: Erase line after checking.
    }


    @Override
    public void onClick(View v) {

        if (v == btnBackToMainMenu) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }
        if (v == btnSubmitAnswer && countGuesses == 0) {
            String name =  edAnswer.getText().toString();

            setSquaresTextAccordingToGuess(guess1Square1,  guess1Square2,  guess1Square3,
                     guess1Square4, guess1Square5,  guess1Square6, guess1Square7, name);


            setSquaresColorsAccordingToGuess(guess1Square4, guess1Square5,  guess1Square6, guess1Square7, name);

            countGuesses++;
            actIfWon();
        }
        if (v == btnSubmitAnswer && countGuesses == 1) {
            String name =  edAnswer.getText().toString();

            setSquaresTextAccordingToGuess(guess2Square1,  guess2Square2,  guess2Square3,
                    guess2Square4, guess2Square5,  guess2Square6, guess2Square7, name);


            setSquaresColorsAccordingToGuess(guess2Square4, guess2Square5,  guess2Square6, guess2Square7, name);

            countGuesses++;
            actIfWon();
        }
        if (v == btnSubmitAnswer && countGuesses == 2) {
            String name =  edAnswer.getText().toString();

            setSquaresTextAccordingToGuess(guess3Square1,  guess3Square2,  guess3Square3,
                    guess3Square4, guess3Square5,  guess3Square6, guess3Square7, name);


            setSquaresColorsAccordingToGuess(guess3Square4, guess3Square5,  guess3Square6, guess3Square7, name);

            countGuesses++;
            actIfWon();
        }
        if (v == btnSubmitAnswer && countGuesses == 3) {
            String name =  edAnswer.getText().toString();

            setSquaresTextAccordingToGuess(guess4Square1,  guess4Square2,  guess4Square3,
                    guess4Square4, guess4Square5, guess4Square6, guess4Square7, name);


            setSquaresColorsAccordingToGuess(guess4Square4, guess4Square5, guess4Square6, guess4Square7, name);

            countGuesses++;
            actIfWon();
        }
        if (v == btnSubmitAnswer && countGuesses == 4) {
            String name =  edAnswer.getText().toString();

            setSquaresTextAccordingToGuess(guess5Square1,  guess5Square2,  guess5Square3,
                    guess5Square4, guess5Square5,  guess5Square6, guess5Square7, name);


            setSquaresColorsAccordingToGuess(guess5Square4, guess5Square5,  guess5Square6, guess5Square7, name);

            countGuesses++;
            actIfWon();
        }
        if (v == btnSubmitAnswer && countGuesses == 5) {
            String name =  edAnswer.getText().toString();

            setSquaresTextAccordingToGuess(guess6Square1,  guess6Square2,  guess6Square3,
                    guess6Square4, guess6Square5,  guess6Square6, guess6Square7, name);


            setSquaresColorsAccordingToGuess(guess6Square4, guess6Square5,  guess6Square6, guess6Square7, name);

            countGuesses++;
            actIfWon();
        }
        if (v == btnSubmitAnswer && countGuesses == 6) {
            String name =  edAnswer.getText().toString();

            setSquaresTextAccordingToGuess(guess7Square1,  guess7Square2,  guess7Square3,
                    guess7Square4, guess7Square5,  guess7Square6, guess7Square7, name);


            setSquaresColorsAccordingToGuess(guess7Square4, guess7Square5,  guess7Square6, guess7Square7, name);

            if(actIfWon() == 0)
                actIfLost();
        }
    }

//    public boolean checkIfPlayerIsTheSelectedPlayer(NbaPlayer selectedPlayer)
//    {
//        for (Map.Entry<String, NbaPlayer> entry : players.entrySet()) {
//            if (entry.getValue().equals(selectedPlayer))
//                return true;
//        }
//        return false;
//    }
    public void resetGame()
    {
         selectedPlayer = generateRandomPlayerFromPlayerContainer(players);

         guess1Square1.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess1Square3.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess1Square4.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess1Square5.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess1Square2.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess1Square6.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess1Square7.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess2Square1.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess2Square2.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess2Square3.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess2Square4.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess2Square5.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess2Square6.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess2Square7.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess3Square1.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess3Square2.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess3Square3.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess3Square4.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess3Square5.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess3Square6.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess3Square7.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess4Square1.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess4Square2.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess4Square3.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess4Square4.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess4Square5.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess4Square6.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess4Square7.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess5Square1.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess5Square2.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess5Square3.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess5Square4.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess5Square5.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess5Square6.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess5Square7.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess6Square1.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess6Square2.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess6Square3.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess6Square4.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess6Square5.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess6Square6.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess6Square7.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess7Square1.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess7Square2.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess7Square3.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess7Square4.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess7Square5.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess7Square6.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
         guess7Square7.setBackgroundColor(ContextCompat.getColor(this, R.color.white));

         guess1Square1.setText("");
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
    public boolean checkIfWinner(Map.Entry<String, NbaPlayer> name) // name of a player from container (hashmap key)
    {
        if(edAnswer.getText().equals(name))
            return true;
        return false;
    }

    public NbaPlayer generateRandomPlayerFromPlayerContainer(HashMap<String, NbaPlayer> players)
    {
        List<String> keysAsArray = new ArrayList<>(players.keySet());
        Random random = new Random();
        selectedPlayer = players.get(keysAsArray.get(random.nextInt(keysAsArray.size())));

        return selectedPlayer;
    }

    public void setSquaresTextAccordingToGuess(TextView square1, TextView square2, TextView square3,
                                               TextView square4, TextView square5, TextView square6,
                                               TextView square7, String name)
    {
        square1.setText(players.get(name).getTeam());
        square2.setText(players.get(name).getConference().toString());
        square3.setText(players.get(name).getDivision().toString());
        square4.setText(players.get(name).getPosition().toString());
        square5.setText(players.get(name).getHeight());
        square6.setText(String.valueOf((players.get(name).getAge())));
        square7.setText(String.valueOf(players.get(name).getJerseyNumber()));
    }

    public void setSquaresColorsAccordingToGuess(TextView square4, TextView square5, TextView square6,
                                                 TextView square7, String name)
    {
        if(Math.abs(getPositionMargin(square4, name)) == 0)
            square4.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
        if(Math.abs(getPositionMargin(square4, name)) == 1 || Math.abs(getPositionMargin(square4, name)) == 2)
            square4.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow));
        if(Math.abs(getPositionMargin(square4, name)) > 2)
            square4.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
        if(Math.abs(getHeightMargin(square5, name)) == 0)
            square5.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
        if(Math.abs(getHeightMargin(square5, name)) == 1 || Math.abs(getHeightMargin(square5, name)) == 2)
            square5.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow));
        if(Math.abs(getHeightMargin(square5, name)) > 2)
            square5.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
        if(Math.abs(getAgeMargin(square6, name)) == 0)
            square6.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
        if(Math.abs(getAgeMargin(square6, name)) == 1 || Math.abs(getAgeMargin(square6, name)) == 2)
            square6.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow));
        if(Math.abs(getAgeMargin(square6, name)) > 2)
            square6.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
        if(Math.abs(getJerseyNumberMargin(square7, name)) == 0)
            square7.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
        if(Math.abs(getJerseyNumberMargin(square7, name)) == 1 || Math.abs(getJerseyNumberMargin(square7, name)) == 2)
            square7.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow));
        if(Math.abs(getJerseyNumberMargin(square7, name)) > 2)
            square7.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
    }

    public int getAgeMargin(TextView square, String name)
    {
        int margin = 0;
        margin = players.get(edAnswer.getText()).getAge() - players.get(name).getAge();
        return margin;
    }
    public int getHeightMargin(TextView square, String name)
    {
        int margin = 0;
        margin = Integer.parseInt(players.get(edAnswer.getText()).getHeight()) -
                Integer.parseInt(players.get(name).getHeight());
        return margin;
    }
    public int getJerseyNumberMargin(TextView square, String name)
    {
        int margin = 0;
        margin = players.get(edAnswer.getText()).getJerseyNumber() - players.get(name).getJerseyNumber();
        return margin;
    }
    public int getPositionMargin(TextView square, String name)
    {
        int margin = 0;
        margin = PositionIndex(players.get(edAnswer.getText()).getPosition()) -
                PositionIndex(players.get(name).getPosition());
        return margin;
    }
    public int PositionIndex(Enum Position)
    {
        if(Position == PG)
            return 1;
        if(Position == SG)
            return 2;
        if(Position == SF)
            return 3;
        if(Position == PF)
            return 4;
        else
            return 5;
    }
    public int actIfWon()
    {
        for (Map.Entry<String, NbaPlayer> entry : players.entrySet()) {
            // if give value is equal to value from entry
            if (entry.getValue() == selectedPlayer) {
                if (checkIfWinner(entry) == true) {
                    System.out.println("You Won!!!"); // TODO: Change to opening a winning dialog!
                    resetGame();
                }
                break;
            }
        }
        return 0;
    }
    public void actIfLost()
    {
        System.out.println("You Lost ):"); // TODO: Change to opening a Losing dialog!
        resetGame();
    }

}