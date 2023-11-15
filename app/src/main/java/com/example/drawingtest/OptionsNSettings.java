package com.example.drawingtest;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class OptionsNSettings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_nsettings);

        // Find views
        RadioGroup radioGroupTheme = findViewById(R.id.radioGroupTheme);
        RadioButton radioLight = findViewById(R.id.radioLight);
        RadioButton radioDark = findViewById(R.id.radioDark);
        EditText editTextParticipants = findViewById(R.id.editTextParticipants);
        Button btnCredits = findViewById(R.id.btnCredits);
        SeekBar seekBarVolume = findViewById(R.id.seekBarVolume);
        SeekBar seekBarSoundEffect = findViewById(R.id.seekBarSoundEffect);

        // Handle UI events and implement your logic here
        // For example, set onClickListener for the credits button, handle seekbar changes, etc.

    }
    }
