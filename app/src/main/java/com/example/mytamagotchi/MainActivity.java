package com.example.mytamagotchi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Tamagochi myTamagochi = new Tamagochi();


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}