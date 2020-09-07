package com.example.fragmentpart1;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class JavaFragment extends Fragment {
    ImageView imgSapi;

    public JavaFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_java, container, false);
        // Inflate the layout for this fragment
        imgSapi=(ImageView)view.findViewById(R.id.imgSapi);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Picasso.with(getContext()).load("https://cdn.pixabay.com/photo/2016/09/20/08/51/buffalo-1682061_960_720.jpg").into(imgSapi);
    }
}