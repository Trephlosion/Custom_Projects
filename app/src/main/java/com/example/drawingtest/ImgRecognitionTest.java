package com.example.drawingtest;



import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;
import java.util.Date;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.PopupWindow;

import java.util.ArrayList;
import java.util.Stack;





public class ImgRecognitionTest extends AppCompatActivity {

    private DrawingView imgRecog;
    private LinearLayout sideMenu;
    private ToggleButton btnToggleMenu;

    private double totalTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img_recognition_test);

        imgRecog = findViewById(R.id.EchoSketchView);

        initTrainingSet();



// acquire gesture points from user and construct the candidate gesture
        pt[] points = new pt[] {
                /* points come from the acquisition device, e.g., mouse/pen/touch */
        };
        Gesture candidate = new Gesture(points);

// classify the candidate gesture with the preferred recognizer
// $P+
        String gestureClass = PDollarPlus.Classify(candidate, trainingSet);




    }

   void initTrainingSet()
   {
       Gesture[] trainingSet = new Gesture[] {
               new Gesture(new Point[] { /* point data here */ }, "arrow"),
               new Gesture(new Point[] { /* point data here */ }, "star"),
               new Gesture(new Point[] { /* point data here */ }, "asterisk"),
               /* more training samples here */
       };
   }
}
