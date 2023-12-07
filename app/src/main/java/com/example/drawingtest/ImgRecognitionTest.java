package com.example.drawingtest;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class ImgRecognitionTest extends AppCompatActivity {

    private DrawingView imgRecog;
    private LinearLayout sideMenu;
    private ToggleButton btnToggleMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img_recognition_test);

        imgRecog = findViewById(R.id.EchoSketchView);









    }
}
