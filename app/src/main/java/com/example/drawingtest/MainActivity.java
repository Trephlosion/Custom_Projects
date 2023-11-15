package com.example.drawingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu); // Create a menu layout file (main_menu.xml)
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        int itemId = item.getItemId();
        if (itemId == R.id.menu_free_style) {
            startActivity(new Intent(this, FreeDraw.class));
            return true;
        } else if (itemId == R.id.menu_options || itemId == R.id.menu_gear_icon) {
            startActivity(new Intent(this, OptionsNSettings.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    // Click event for the images
    public void onImageClick(View view) {
        int viewId = view.getId();

        if (viewId == R.id.ivGuess) {// Handle click for image 1
            showToast("Image 1 Clicked");
        } else if (viewId == R.id.ivCollab) {// Handle click for image 2
            showToast("Image 2 Clicked");
        } else if (viewId == R.id.ivBlind) {// Handle click for image 3
            showToast("Image 3 Clicked");
        } else if (viewId == R.id.ivTrace) {// Handle click for image 4
            showToast("Image 4 Clicked");
            // Add more cases for other images as needed
        }
    }

    // Click event for the "Rules" buttons
    public void onRulesButtonClick(View view) {
        showToast("Rules Button Clicked");
        // You can add logic to open a rules activity or show rules dialog
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    // This method is called when the options menu is created.

}
