package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.databinding.ActivityMain4Binding;

public class MainActivity4 extends AppCompatActivity {

    private ActivityMain4Binding b4;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
            Intent i4=new Intent(MainActivity4.this,MainActivity2.class);
            finish();
            startActivity(i4);
        }
    }
