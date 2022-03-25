package com.example.projetoexercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {
    private static final long SPLASH_TIME_OUT = 2850;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash_screen);

        //evento que server para trocar de tela depois um tempo
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent telaApresentacao1 = new Intent(SplashScreen.this,
                        TelaApresentacao1.class);
                startActivity(telaApresentacao1);

                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}