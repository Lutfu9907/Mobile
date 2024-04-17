package com.example.hafta10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class CustomAdapter  extends RecyclerView.Adapter<CustomAdapter.ViewHolder>{

    private List<String> mData; // Gösterilecek veri kümesi

    // Constructor - Veri kümesini alır
    public CustomAdapter(List<String> data) {

        this.mData = data;
    }

    // ViewHolder sınıfını tanımlama
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public CardView cardView;
        public Button buton;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView1); // Öğeleri ViewHolder ile eşleme
            cardView=itemView.findViewById(R.id.cardView1);
            buton=itemView.findViewById(R.id.button5);
        }
    }

    // ViewHolder oluşturma
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card, parent, false);
        return new ViewHolder(view);
    }

    // Veri kümesinin boyutunu döndürme
    @Override
    public int getItemCount() {

        return mData.size();
    }

    // Veriyi görünüme bağlama
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String item = mData.get(position);
        holder.textView.setText(item);
        holder.buton.setOnClickListener(view->{
            Snackbar.make(view,"Sepete eklendi",Snackbar.LENGTH_SHORT).show();
        });
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snackbar.make(v,item,Snackbar.LENGTH_SHORT).show();
            }
   });
}
}