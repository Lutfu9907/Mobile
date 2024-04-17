package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b2=ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(b2.getRoot());

        //String m2=getIntent().getStringExtra("mesaj");
        //b2.textView3.setText(m2);

        Ogrenci m1=(Ogrenci) getIntent().getSerializableExtra("mesaj");
        b2.textView4.setText(m1.getIsmi());

        //int m3=getIntent().getIntExtra("123",0);
        //String m22=String.valueOf(m2);
        //b2.textView4.setText(m22);

        //double m4=getIntent().getDoubleExtra("mesaj3",0.0);
        //String m44=String.valueOf(m4);
        //b2.textView3.setText(m44);


        b2.button.setOnClickListener(view ->{
            Intent i2=new Intent(MainActivity2.this,MainActivity3.class);
            finish();//sayfa geçişinde 2.sayfayı yok eder.
            startActivity(i2);
        });
    }
}