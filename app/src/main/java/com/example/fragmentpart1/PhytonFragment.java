package com.example.fragmentpart1;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class PhytonFragment extends Fragment {
    ImageView imgAyam;

    public PhytonFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_phyton, container, false);
        imgAyam=(ImageView)view.findViewById(R.id.img_ayam);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Picasso.with(getContext()).load("https://cdn.pixabay.com/photo/2016/11/29/05/32/animal-1867562_960_720.jpg").into(imgAyam);
    }
}