package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mypoltel.R;

public class AboutGameActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnBackToMainMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_game);

        btnBackToMainMenu = findViewById(R.id.btnBackToMainMenu);
        btnBackToMainMenu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v == btnBackToMainMenu) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }
}