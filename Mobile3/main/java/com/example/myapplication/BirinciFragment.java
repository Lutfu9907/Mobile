package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import com.example.myapplication.databinding.FragmentBirinciBinding;


public class BirinciFragment extends Fragment {

    private FragmentBirinciBinding b1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        b1 = FragmentBirinciBinding.inflate(inflater, container, false);

        Musteriler m1 = new Musteriler(321, "veli", 546.756);

        b1.button9.setOnClickListener(view -> {
            //m1.setId(123);
            //m1.setAd("veli");
            BirinciFragmentDirections.actionBirinciFragmentToIkinciFragment2 gec = BirinciFragmentDirections.actionBirinciFragmentToIkincibaglanti("veli",123);
            //gec.setM1(123);
            //gec.setAd("veli");

            Navigation.findNavController(view).navigate(NavDirections(gec));
        });

        return b1.getRoot();
    }
}
