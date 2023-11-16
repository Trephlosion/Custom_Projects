package com.example.drawingtest;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;


public class FreeDraw extends AppCompatActivity {

    private DrawingView drawingView;
    private LinearLayout sideMenu;
    private ToggleButton btnToggleMenu;

    private Button save;
    private Button undo;
    private Button redo;
    private Button color;
    private Button erase;
    private Button brush;
    private Button pencil;
    private Button bucket;
    private Button more;


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

    private void setupMenuButtons() {  //set up all teh buttons
        save = findViewById(R.id.btnTool1);
        undo = findViewById(R.id.btnTool2);
        redo = findViewById(R.id.btnTool3);
        color = findViewById(R.id.btnTool4);
        erase = findViewById(R.id.btnTool5);
        brush = findViewById(R.id.btnTool6);
        pencil = findViewById(R.id.btnTool7);
        bucket = findViewById(R.id.btnTool8);
        more = findViewById(R.id.btnTool9);
        // Set up other buttons as needed

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle tool 1 click
            }
        });
        // Set up other button click listeners

        undo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle tool 1 click
            }
        });

        redo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle tool 1 click
            }
        });

        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showColorPicker(view);
            }
        });

        erase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle tool 1 click
            }
        });


        brush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle tool 1 click
            }
        });

        pencil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle tool 1 click
            }
        });

        bucket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle tool 1 click
            }
        });


        more.setOnClickListener(new View.OnClickListener() {
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


    private void showColorPicker(View anchorView) {
        // Inflate the color picker layout
        View colorPickerView = LayoutInflater.from(this).inflate(R.layout.color_picker_layout, null);

        // Set up the PopupWindow
        final PopupWindow popupWindow = new PopupWindow(
                colorPickerView,
                GridLayout.LayoutParams.WRAP_CONTENT,
                GridLayout.LayoutParams.WRAP_CONTENT,
                true
        );
        popupWindow.setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        popupWindow.setOutsideTouchable(true);
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                // Handle color picker dismissed
            }
        });

        // Set up color buttons
        Button red = colorPickerView.findViewById(R.id.red);
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle color selection, e.g., set color for your tool
                int selectedColor = ((ColorDrawable) red.getBackground()).getColor();
                // TODO: Apply the selected color to your tool
                popupWindow.dismiss();
            }
        });

        Button orange = colorPickerView.findViewById(R.id.orange);
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle color selection, e.g., set color for your tool
                int selectedColor = ((ColorDrawable) orange.getBackground()).getColor();
                // TODO: Apply the selected color to your tool
                popupWindow.dismiss();
            }
        });

        Button yellow = colorPickerView.findViewById(R.id.yellow);
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle color selection, e.g., set color for your tool
                int selectedColor = ((ColorDrawable) yellow.getBackground()).getColor();
                // TODO: Apply the selected color to your tool
                popupWindow.dismiss();
            }
        });

        Button green = colorPickerView.findViewById(R.id.green);
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle color selection, e.g., set color for your tool
                int selectedColor = ((ColorDrawable) green.getBackground()).getColor();
                // TODO: Apply the selected color to your tool
                popupWindow.dismiss();
            }
        });

        Button lime = colorPickerView.findViewById(R.id.lime);
        lime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle color selection, e.g., set color for your tool
                int selectedColor = ((ColorDrawable) lime.getBackground()).getColor();
                // TODO: Apply the selected color to your tool
                popupWindow.dismiss();
            }
        });

        Button blue = colorPickerView.findViewById(R.id.blue);
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle color selection, e.g., set color for your tool
                int selectedColor = ((ColorDrawable) blue.getBackground()).getColor();
                // TODO: Apply the selected color to your tool
                popupWindow.dismiss();
            }
        });

        Button lightblue = colorPickerView.findViewById(R.id.lightblue);
        lightblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle color selection, e.g., set color for your tool
                int selectedColor = ((ColorDrawable) lightblue.getBackground()).getColor();
                // TODO: Apply the selected color to your tool
                popupWindow.dismiss();
            }
        });

        Button violet = colorPickerView.findViewById(R.id.violet);
        violet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle color selection, e.g., set color for your tool
                int selectedColor = ((ColorDrawable) violet.getBackground()).getColor();
                // TODO: Apply the selected color to your tool
                popupWindow.dismiss();
            }
        });

        Button brown = colorPickerView.findViewById(R.id.brown);
        brown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle color selection, e.g., set color for your tool
                int selectedColor = ((ColorDrawable) brown.getBackground()).getColor();
                // TODO: Apply the selected color to your tool
                popupWindow.dismiss();
            }
        });

        Button pink = colorPickerView.findViewById(R.id.pink);
        pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle color selection, e.g., set color for your tool
                int selectedColor = ((ColorDrawable) pink.getBackground()).getColor();
                // TODO: Apply the selected color to your tool
                popupWindow.dismiss();
            }
        });

        Button white = colorPickerView.findViewById(R.id.white);
        white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle color selection, e.g., set color for your tool
                int selectedColor = ((ColorDrawable) white.getBackground()).getColor();
                // TODO: Apply the selected color to your tool
                popupWindow.dismiss();
            }
        });


        Button gray = colorPickerView.findViewById(R.id.gray);
        gray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle color selection, e.g., set color for your tool
                int selectedColor = ((ColorDrawable) gray.getBackground()).getColor();
                // TODO: Apply the selected color to your tool
                popupWindow.dismiss();
            }
        });

        Button black = colorPickerView.findViewById(R.id.black);
        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle color selection, e.g., set color for your tool
                int selectedColor = ((ColorDrawable) black.getBackground()).getColor();
                // TODO: Apply the selected color to your tool
                popupWindow.dismiss();
            }
        });

        // Add more color buttons and their click listeners as needed

        // Show the PopupWindow
        popupWindow.showAsDropDown(anchorView);
    }

}
