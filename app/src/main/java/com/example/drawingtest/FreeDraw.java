package com.example.drawingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ToggleButton;


public class FreeDraw extends AppCompatActivity {

    private DrawingView drawingView;
    private LinearLayout sideMenu;
    private ToggleButton btnToggleMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_draw);



        drawingView = findViewById(R.id.drawingView);
        sideMenu = findViewById(R.id.sideMenu);
        btnToggleMenu = findViewById(R.id.btnToggleMenu);

        setupMenuButtons();
        setupToggleButton();

    }

    private void setupMenuButtons() {
        Button btnTool1 = findViewById(R.id.btnTool1);
        // Set up other buttons as needed

        btnTool1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle tool 1 click
            }
        });
        // Set up other button click listeners
    }

    private void setupToggleButton() {
        btnToggleMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnToggleMenu.isChecked()) {
                    // Show the side menu
                    sideMenu.setVisibility(View.VISIBLE);
                } else {
                    // Hide the side menu
                    sideMenu.setVisibility(View.GONE);
                }
            }
        });
    }


}
