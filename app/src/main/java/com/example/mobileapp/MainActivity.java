package com.example.mobileapp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    public TextView FullName;
    public TextView Group;
    public ImageView img;
    public Button textButton;
    public ImageButton svgButton;
    public boolean textVisible = true;
    public boolean imageVisible = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        FullName = findViewById(R.id.studentFullName);
        Group = findViewById(R.id.studentGroup);
        textButton = findViewById(R.id.button);
        svgButton = findViewById(R.id.imageButton);
        img = findViewById(R.id.imageCenter);

        textButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textVisible) {
                    textButton.setBackgroundColor(Color.RED);
                    FullName.setVisibility((View.INVISIBLE));
                    Group.setVisibility(View.INVISIBLE);
                    textVisible = false;
                }
                else {
                    textButton.setBackgroundColor(Color.BLACK);
                    FullName.setVisibility((View.VISIBLE));
                    Group.setVisibility(View.VISIBLE);
                    textVisible = true;
                }

            }
        });
        svgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imageVisible) {
                    img.setVisibility(View.INVISIBLE);
                    imageVisible = false;
                }
                else {
                    img.setVisibility(View.VISIBLE);
                    imageVisible = true;
                }

            }
        });



    }
}