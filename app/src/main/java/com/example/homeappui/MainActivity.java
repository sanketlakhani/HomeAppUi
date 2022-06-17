package com.example.homeappui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView imgright, imgservice;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR); // set status text dark
        window.setStatusBarColor(ContextCompat.getColor(MainActivity.this, R.color.color));

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initt();

    }

    private void initt() {

        imgright = findViewById(R.id.imgright);
        imgservice = findViewById(R.id.imgservice);

        imgright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, ScreenActivity2.class);
                startActivity(i);
            }
        });

        imgservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, ScreenActivity3.class);
                startActivity(i);
            }
        });
    }
}