package com.example.hafta10;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SearchEvent;
import android.view.View;
import android.widget.SearchView;
import android.widget.Toolbar;

import com.example.hafta10.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {
    private ActivityMainBinding b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b1=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b1.getRoot());
        b1.button2.setOnClickListener(view -> {
            Snackbar sbr = Snackbar.make(view, "snackbar ornengi", Snackbar.LENGTH_SHORT);
            sbr.setAction("tamam", new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Snackbar.make(v, "snackbardaki butona tıkladınız", Snackbar.LENGTH_SHORT).show();
                }
            });
            sbr.show();
        });

        b1.floatingActionButton.setOnClickListener(view->{
            Snackbar.make(view, "Floating butona tıkladınız", Snackbar.LENGTH_SHORT).show();
        });
        setSupportActionBar(b1.toolbar);

        b1.toolbar.setTitle("Menü");
        setSupportActionBar(b1.toolbar);

        List<String> tiyatro=new ArrayList<>();
        tiyatro.add("tiyatro 1");
        tiyatro.add("tiyatro 2");
        tiyatro.add("tiyatro 3");
        tiyatro.add("tiyatro 4");
        tiyatro.add("tiyatro1 5");
        tiyatro.add("tiyatro1 6");

        CustomAdapter adapter=new CustomAdapter(tiyatro);
        b1.recycleView1.setAdapter(adapter);
        b1.recycleView1.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.HORIZONTAL));




    }
  /*  @Override
    public boolean onCreateOptionsMenu(Menu toolbarmenu) {
        getMenuInflater().inflate(R.menu.toolbarmenu,toolbarmenu);
        return true;
    }*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.saerch_menu,menu);
        MenuItem m1= menu.findItem(R.id.item6);
        SearchView sw=(SearchView) m1.getActionView();
        sw.setOnQueryTextListener(this);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id= item.getItemId();

        if(id==R.id.a1){
            Snackbar.make(findViewById(android.R.id.content),"birinci menü",Snackbar.LENGTH_SHORT).show();
        }

        else if(id==R.id.a2){
            Snackbar.make(findViewById(android.R.id.content),"ikinci menü",Snackbar.LENGTH_SHORT).show();
        }
        else if(id==R.id.a3){
            Snackbar.make(findViewById(android.R.id.content),"üçüncü menü",Snackbar.LENGTH_SHORT).show();
        }
        else if(id==R.id.a4){
            Snackbar.make(findViewById(android.R.id.content),"dördüncü menü",Snackbar.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        Snackbar.make(findViewById(android.R.id.content),query,Snackbar.LENGTH_SHORT).show();
        return true;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        Snackbar.make(findViewById(android.R.id.content),newText,Snackbar.LENGTH_SHORT).show();
        return true;
    }
}

