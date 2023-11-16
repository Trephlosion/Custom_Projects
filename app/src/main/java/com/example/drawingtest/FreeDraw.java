package com.example.drawingtest;

import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.service.credentials.Action;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ToggleButton;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.Stack;


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

//    private static Stack<DrawingAction> drawingActions = new Stack<>();
//    private Stack<DrawingAction> redoActions = new Stack<>();
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

        // Set undo history


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle tool 1 click
            }
        });
        // Set up other button click listeners

//        undo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                undoDrawingAction();
//            }
//        });
//
//        redo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                redoDrawingAction();
//            }
//        });

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
                DrawingView.setColor(selectedColor);
                popupWindow.dismiss();
            }
        });

        Button orange = colorPickerView.findViewById(R.id.orange);
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle color selection, e.g., set color for your tool
                int selectedColor = ((ColorDrawable) orange.getBackground()).getColor();
                DrawingView.setColor(selectedColor);
                popupWindow.dismiss();
            }
        });

        Button yellow = colorPickerView.findViewById(R.id.yellow);
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle color selection, e.g., set color for your tool
                int selectedColor = ((ColorDrawable) yellow.getBackground()).getColor();
                DrawingView.setColor(selectedColor);
                popupWindow.dismiss();
            }
        });

        Button green = colorPickerView.findViewById(R.id.green);
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle color selection, e.g., set color for your tool
                int selectedColor = ((ColorDrawable) green.getBackground()).getColor();
                DrawingView.setColor(selectedColor);
                popupWindow.dismiss();
            }
        });

        Button lime = colorPickerView.findViewById(R.id.lime);
        lime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle color selection, e.g., set color for your tool
                int selectedColor = ((ColorDrawable) lime.getBackground()).getColor();
                DrawingView.setColor(selectedColor);
                popupWindow.dismiss();
            }
        });

        Button blue = colorPickerView.findViewById(R.id.blue);
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle color selection, e.g., set color for your tool
                int selectedColor = ((ColorDrawable) blue.getBackground()).getColor();
                DrawingView.setColor(selectedColor);
                popupWindow.dismiss();
            }
        });

        Button lightblue = colorPickerView.findViewById(R.id.lightblue);
        lightblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle color selection, e.g., set color for your tool
                int selectedColor = ((ColorDrawable) lightblue.getBackground()).getColor();
                DrawingView.setColor(selectedColor);
                popupWindow.dismiss();
            }
        });

        Button violet = colorPickerView.findViewById(R.id.violet);
        violet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle color selection, e.g., set color for your tool
                int selectedColor = ((ColorDrawable) violet.getBackground()).getColor();
                DrawingView.setColor(selectedColor);
                popupWindow.dismiss();
            }
        });

        Button brown = colorPickerView.findViewById(R.id.brown);
        brown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle color selection, e.g., set color for your tool
                int selectedColor = ((ColorDrawable) brown.getBackground()).getColor();
                DrawingView.setColor(selectedColor);
                popupWindow.dismiss();
            }
        });

        Button pink = colorPickerView.findViewById(R.id.pink);
        pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle color selection, e.g., set color for your tool
                int selectedColor = ((ColorDrawable) pink.getBackground()).getColor();
                DrawingView.setColor(selectedColor);
                popupWindow.dismiss();
            }
        });

        Button white = colorPickerView.findViewById(R.id.white);
        white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle color selection, e.g., set color for your tool
                int selectedColor = ((ColorDrawable) white.getBackground()).getColor();
                DrawingView.setColor(selectedColor);
                popupWindow.dismiss();
            }
        });


        Button gray = colorPickerView.findViewById(R.id.gray);
        gray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle color selection, e.g., set color for your tool
                int selectedColor = ((ColorDrawable) gray.getBackground()).getColor();
                DrawingView.setColor(selectedColor);
                popupWindow.dismiss();
            }
        });

        Button black = colorPickerView.findViewById(R.id.black);
        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle color selection, e.g., set color for your tool
                int selectedColor = ((ColorDrawable) black.getBackground()).getColor();
                DrawingView.setColor(selectedColor);
                popupWindow.dismiss();
            }
        });

        // Add more color buttons and their click listeners as needed

        // Show the PopupWindow
        popupWindow.showAsDropDown(anchorView);
    }

//    private void undoDrawingAction() {
//        if (!drawingActions.isEmpty()) {
//            redoActions.push(drawingActions.pop());
//            drawingView.invalidate();
//        }
//    }
//
//    private void redoDrawingAction() {
//        if (!redoActions.isEmpty()) {
//            drawingActions.push(redoActions.pop());
//            drawingView.invalidate();
//        }
//    }
//
//    private static class DrawingView extends View {
//
//        private Paint paint;
//        private Canvas canvas;
//        private Bitmap bitmap;
//        private float startX, startY;
//
//        public DrawingView(Context context) {
//            super(context);
//            init();
//        }
//        public static void setColor(int color) {
//            com.example.drawingtest.DrawingView.setColor(color);
//        }
//
//
//        private void init() {
//            paint = new Paint();
//            paint.setAntiAlias(true);
//            paint.setStrokeCap(Paint.Cap.ROUND);
//            paint.setStrokeWidth(5f);
//            paint.setColor(getResources().getColor(android.R.color.black));
//
//            bitmap = Bitmap.createBitmap(1000, 1000, Bitmap.Config.ARGB_8888);
//            canvas = new Canvas(bitmap);
//        }
//
//        @Override
//        protected void onDraw(Canvas canvas) {
//            super.onDraw(canvas);
//            canvas.drawBitmap(bitmap, 0, 0, null);
//
//            // Draw the current drawing action
//            for (DrawingAction action : drawingActions) {
//                canvas.drawPath(action.path, action.paint);
//            }
//        }
//
//        @Override
//        public boolean onTouchEvent(MotionEvent event) {
//            float x = event.getX();
//            float y = event.getY();
//
//            switch (event.getAction()) {
//                case MotionEvent.ACTION_DOWN:
//                    startDrawingAction(x, y);
//                    break;
//                case MotionEvent.ACTION_MOVE:
//                    updateDrawingAction(x, y);
//                    break;
//                case MotionEvent.ACTION_UP:
//                    endDrawingAction();
//                    break;
//            }
//
//            return true;
//        }
//
//        private void startDrawingAction(float x, float y) {
//            DrawingAction drawingAction = new DrawingAction();
//            drawingAction.paint = new Paint(paint);
//            drawingAction.path.moveTo(x, y);
//            drawingAction.path.lineTo(x, y);
//            drawingActions.push(drawingAction);
//            startX = x;
//            startY = y;
//        }
//
//        private void updateDrawingAction(float x, float y) {
//            if (!drawingActions.isEmpty()) {
//                DrawingAction currentAction = drawingActions.peek();
//                currentAction.path.quadTo(startX, startY, (x + startX) / 2, (y + startY) / 2);
//                startX = x;
//                startY = y;
//                invalidate();
//            }
//        }
//
//        private void endDrawingAction() {
//            // You may want to save the current drawing state here
//            invalidate();
//        }
//    }
//
//    private static class DrawingAction {
//        private Path path;
//        private Paint paint;
//
//        public DrawingAction() {
//            path = new Path();
//        }
//    }
}
