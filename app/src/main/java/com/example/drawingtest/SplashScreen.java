package com.example.drawingtest;
//
//import androidx.appcompat.app.AppCompatActivity;
//import android.content.Intent;
//import android.os.Bundle;
//import android.os.Handler;
//import android.view.View;
//import android.widget.ImageView;
//import android.widget.ProgressBar;
//import android.widget.TextView;
//
//import java.util.Timer;
//import java.util.TimerTask;
//
//
//public class SplashScreen extends AppCompatActivity {
//
//            private ProgressBar progressBar;
//
////            Create the loading text in the code
//            private TextView loading;
//
//            private ImageView logo;
//
//            @Override
//            protected void onCreate(Bundle savedInstanceState) {
//                super.onCreate(savedInstanceState);
//                setContentView(R.layout.activity_splash_screen);
//
//                loading = findViewById(R.id.tvLoad);
//
//                progressBar = findViewById(R.id.progressBar);
//
//                logo = findViewById(R.id.ivAppName);
//
//                progressBar.setVisibility(View.VISIBLE);
//                loading.setVisibility(View.VISIBLE);
//                logo.setVisibility(View.VISIBLE);
////                Load the screen
//
//                // Call the function to start the loading
//                startLoading();
//            }
//
//
//    private void startLoading() {
//        //            create the amount of time wanted for the app to load
//        final int loadtime = 5000;
//
//        final int totalProgressTime = loadtime; // x seconds
//                final int interval = 100; // 100 milliseconds interval
//
//                final int progressToIncrement = totalProgressTime / interval;
//
//                final Handler handler = new Handler();
//                handler.post(new Runnable() {
//                    @Override
//                    public void run() {
//                        if (progressBar.getProgress() >= 100) {
//
//                            progressBar.setVisibility(View.GONE);
//                            // Loading completed, hide the progress bar
//
//                            loading.setText("Done!");
////                            wait for a few after changing text
//
//                            loading.setVisibility(View.GONE);
//                            logo.setVisibility(View.GONE);
//
////                            hide the loading text and logo
//
////                            startActivity(new Intent(SplashScreen.this, MainActivity.class));
////                            Start main menu
//
//                        } else {
//                            progressBar.incrementProgressBy(progressToIncrement);
//                            handler.postDelayed(this, interval);
//                        }
//                    }
//                });
//            }
//        }



























import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.animation.AnimatorListenerAdapter;
import android.animation.StateListAnimator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class SplashScreen extends AppCompatActivity {

    private ProgressBar progressBar;
    private TextView tvLoad;
    private ImageView ivAppName, ivBrush;
    private Button btStart;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        progressBar = findViewById(R.id.progressBar);
        tvLoad = findViewById(R.id.tvLoad);
        ivAppName = findViewById(R.id.ivAppName);
        ivBrush = findViewById(R.id.ivBrush);
        btStart = findViewById(R.id.btStart);
        sharedPreferences = getPreferences(MODE_PRIVATE);

        // Load the previous progress or start from 0 if not available
        int previousProgress = sharedPreferences.getInt("progress", 0);
        progressBar.setProgress(previousProgress);

        startLoading();
    }

    private void startLoading() {
        final int randomLoadingTime = new Random().nextInt(16) + 30; // 30 to 45 seconds
        final int totalProgressTime = randomLoadingTime * 1000;
        final int interval = 100;

        final int progressToIncrement = totalProgressTime / interval;

        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                if (progressBar.getProgress() >= 100) {
                    showText();
                } else {
                    progressBar.incrementProgressBy(progressToIncrement);
                    moveBrush(progressBar.getProgress());
                    handler.postDelayed(this, interval);
                }
            }
        });
    }

    private void moveBrush(int progress) {
        float translationX = (progress / 100f) * ivBrush.getWidth();
        TranslateAnimation translateAnimation = new TranslateAnimation(0, translationX, 0, 0);
        translateAnimation.setDuration(100);
        translateAnimation.setFillAfter(true);
        ivBrush.startAnimation(translateAnimation);
    }

    private void showText() {
        tvLoad.setText("Done!");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Fade in the start button
                AlphaAnimation fadeIn = new AlphaAnimation(0.0f, 1.0f);
                fadeIn.setDuration(1000); // Adjust the duration as needed
                fadeIn.setFillAfter(true);
                btStart.setText("S T A R T  !");
                btStart.setTypeface(Typeface.DEFAULT_BOLD);
                btStart.setVisibility(View.VISIBLE);
                btStart.startAnimation(fadeIn);

                // Set a click listener for the start button
                btStart.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startTransition();
                    }
                });
            }
        }, 5000); // Wait for 5 seconds after loading is complete
    }
    private void startTransition() {
        AlphaAnimation fadeOut = new AlphaAnimation(1.0f, 0.0f);
        fadeOut.setDuration(1000);
        fadeOut.setFillAfter(true);

        ivAppName.startAnimation(fadeOut);
        tvLoad.startAnimation(fadeOut);
        progressBar.startAnimation(fadeOut);
        ivBrush.startAnimation(fadeOut);
        btStart.startAnimation(fadeOut);

        fadeOut.setAnimationListener(new Animation.AnimationListener() {
            /**
             * <p>Notifies the start of the animation.</p>
             *
             * @param animation The started animation.
             */
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // Save progress to SharedPreferences
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("progress", 0); // Reset progress when the app is re-opened
                editor.apply();

                startActivity(new Intent(SplashScreen.this, MainActivity.class));
                finish();
            }

            /**
             * <p>Notifies the repetition of the animation.</p>
             *
             * @param animation The animation which was repeated.
             */
            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
