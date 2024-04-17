package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.myapplication.databinding.FragmentIkinciBinding;

public class IkinciFragment extends Fragment {


    private FragmentIkinciBinding b2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        b2=FragmentIkinciBinding.inflate(inflater,container,false);

        IkinciFragmentArgs bndl=IkinciFragmentArgs.fromBundle(getArguments());
        //b2.textview4.setText(bndl.getM1()+" "+bndl.getAd());
        b2.button6.setOnClickListener(view ->{
            Navigation.findNavController(view).navigate(R.id.ikinciFragment2);
        });
        return b2.getRoot();
    }
}