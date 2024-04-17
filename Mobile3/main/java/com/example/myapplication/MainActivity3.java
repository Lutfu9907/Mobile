package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.databinding.ActivityMain3Binding;

public class MainActivity3 extends AppCompatActivity {
   private ActivityMain3Binding b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b3=ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(b3.getRoot());

        b3.button8.setOnClickListener(view ->{
            Intent i3=new Intent(MainActivity3.this,MainActivity.class);
        });
    }
}