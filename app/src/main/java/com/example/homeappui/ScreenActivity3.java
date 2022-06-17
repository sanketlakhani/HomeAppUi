package com.example.homeappui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ScreenActivity3 extends AppCompatActivity {


    LinearLayout linearelecticity;
    LinearLayout linearactivity;
    LinearLayout linearlight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR); // set status text dark
        window.setStatusBarColor(ContextCompat.getColor(ScreenActivity3.this,R.color.color));

        setContentView(R.layout.activity_screen3);

        linearelecticity=findViewById(R.id.linearelecticity);
        linearlight=findViewById(R.id.linearlight);
        linearactivity=findViewById(R.id.linearactivity);

        linearlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(ScreenActivity3.this,ScreenActivity4.class);
                startActivity(i);
            }
        });
        linearactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(ScreenActivity3.this,ScreenActivity5.class);
                startActivity(i);

            }
        });
        linearelecticity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(ScreenActivity3.this,ScreenActivity6.class);
                startActivity(i);

            }
        });
    }
}