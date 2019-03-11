package com.example.karim.yandex;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Main extends Fragment {


    CardView playlist;
    CardView dezhavu;
    CardView premera;
    CardView goroskop;
    CardView office;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_main, container, false);

        playlist = view.findViewById(R.id.playlist);
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Playlist.class);
                startActivity(intent);
            }
        });

        dezhavu = view.findViewById(R.id.dezhavu);
        dezhavu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Dezhavu.class);
                startActivity(intent);
            }
        });

        premera = view.findViewById(R.id.premera);
        premera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Premera.class);
                startActivity(intent);
            }
        });
        goroskop = view.findViewById(R.id.goroskop);
        goroskop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Goroskop.class);
                startActivity(intent);
            }
        });
        office = view.findViewById(R.id.office);
        office.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Office.class);
                startActivity(intent);
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Главное");
    }
}
