package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding bndg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bndg = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bndg.getRoot());



        NavHostFragment nhf = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.action_birinciFragment_to_ikinciFragment2);

        NavController navController = nhf.getNavController();

        NavigationUI.setupWithNavController(bndg.navView,nhf.getNavController());
        bndg.toolbar.setTitle("artık oldu");
        ActionBarDrawerToggle tggl=new ActionBarDrawerToggle(this,bndg.drawer,bndg.toolbar,0,0);
        bndg.drawer.addDrawerListener(tggl);
        tggl.syncState();
    }
}


       /* bndg.button6.setOnClickListener(view ->{
            Intent i1=new Intent(MainActivity.this,MainActivity2.class);
            i1.putExtra("mesaj",m1);
            startActivity(i1);
                });
    */


        /*Musteriler m1=new Musteriler(123,"lütfü",123.4456);

       /* bndg.button6.setOnClickListener(view ->{
            Snackbar.make(view,m1.getId()+""+m1.getAd()+""+m1.getOdemesiGerekenRakam(), Snackbar.LENGTH_SHORT).show();
                });


        //bndg.button6.setOnClickListener(new View.OnClickListener() {
           // @Override
            //public void onClick(View view) {
              //  Snackbar.make(view, "merhaba yazılım", Snackbar.LENGTH_SHORT).show();
            //}
        //});


        /*bndg.button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bndg.textView.setText("değişti");
            }
        });*/



