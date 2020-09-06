package com.example.fragmentpart1;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CplusplusFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CplusplusFragment extends Fragment {
    ImageView imgSinga;
    public CplusplusFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_cplusplus, container, false);
        imgSinga=(ImageView)view.findViewById(R.id.img_singa);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Picasso.with(getContext()).load("https://cdn.pixabay.com/photo/2018/04/13/21/24/lion-3317670_960_720.jpg").into(imgSinga);
    }
}