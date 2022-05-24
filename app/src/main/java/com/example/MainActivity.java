package com.example.mypoltel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnStart, btnAboutGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnStart = findViewById(R.id.btnStart);
        btnStart.setOnClickListener(this);

        btnAboutGame = findViewById(R.id.btnAboutGame);
        btnAboutGame.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view == btnStart) {
            // connectToDataBase();
            Intent intent = new Intent(this, GameActivity.class);
            startActivity(intent);
            finish();
        }
        if (view == btnAboutGame) {
            Intent intent = new Intent(this, AboutGameActivity.class);
            startActivity(intent);
            finish();
        }
    }

    public void connectToDataBase()
    {
        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");
        myRef.setValue("Hello, World!");
    }

}