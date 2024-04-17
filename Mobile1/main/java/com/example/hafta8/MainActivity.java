package com.example.hafta8;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.SeekBar;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hafta8.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding b1;
    private String cinsiyet;

    private String ders;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b1= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b1.getRoot());

        b1.switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Snackbar.make(buttonView,"açık",Snackbar.LENGTH_SHORT).show();
                }
                else{
                    Snackbar.make(buttonView,"kapalı",Snackbar.LENGTH_SHORT).show();
                }
            }
        });
        b1.toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Snackbar.make(buttonView,"ON",Snackbar.LENGTH_SHORT).show();
                }
                else{
                    Snackbar.make(buttonView,"OFF",Snackbar.LENGTH_SHORT).show();
                }
            }
        });

        b1.buttonView.setOnClickListener(view->{
           Boolean sw1=b1.switch1.isChecked();
           Boolean tg1=b1.toggleButton.isChecked();
           Snackbar.make(view,"switch butonunun durumu"+sw1+"ve Toggle butonunun durumu"+tg1,Snackbar.LENGTH_SHORT);
        });


        b1.radioButton5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    cinsiyet="erkek";
                    Snackbar.make(buttonView,"erkek",Snackbar.LENGTH_SHORT).show();
                }
            }
        });


        b1.checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ders+="MP";
                    Snackbar.make(buttonView,"MOBİL PROGRAMLAMA",Snackbar.LENGTH_SHORT).show();
                }
            }
        });

        b1.buttonView.setOnClickListener(view ->{
            Snackbar.make(view,"cinsiyet"+cinsiyet+"seçilen dersler"+ders,Snackbar.LENGTH_SHORT).show();
        });

        b1.button5.setOnClickListener(view ->{
            int grn=b1.progressBar.getVisibility();
            //Snackbar.make(view,String.valueOf(grn),Snackbar.LENGTH_SHORT).show();
            if(grn==0){
                b1.progressBar.setVisibility(view.INVISIBLE);
            }
            else{
                b1.progressBar.setVisibility(view.VISIBLE);
            }

            float yildiz=b1.ratingBar.getRating();
            Snackbar.make(view,String.valueOf(yildiz),Snackbar.LENGTH_SHORT).show();
        });

        b1.seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                b1.textView.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

       b1.button5.setOnClickListener(view->{
            b1.imageView.setImageResource(R.drawable.resim);
        });

        String[] sehir={"istanbul","ankara","antalya","ısparta","burdur"};
        ArrayAdapter<String> adptr=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,sehir);

        b1.listview.setAdapter(adptr);
        b1.listview.setOnItemClickListener(((parent, view, position, id) -> {
            String secim=(String) parent.getItemAtPosition(position);
            //Snackbar.make(view,secim,Snackbar.LENGTH_SHORT).show();
            Snackbar.make(view,String.valueOf(position),Snackbar.LENGTH_SHORT).show();
        }));


        String[] sehir1 = {"istanbul", "ankara", "antalya", "ısparta", "burdur"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, sehir1);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        b1.spinner2.setAdapter(adapter);
        b1.spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedCity = sehir1[position];
                Snackbar.make(selectedItemView, selectedCity, Snackbar.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {

            }
        });


    }


}