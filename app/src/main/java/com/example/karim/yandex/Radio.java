package com.example.karim.yandex;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Radio extends Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_radio, container, false);

        view.findViewById(R.id.MatveyMP).setOnClickListener(this);
        view.findViewById(R.id.Rock).setOnClickListener(this);
        view.findViewById(R.id.Pop).setOnClickListener(this);
        view.findViewById(R.id.Metall).setOnClickListener(this);
        view.findViewById(R.id.Nastroenie).setOnClickListener(this);
        view.findViewById(R.id.Zaniatia).setOnClickListener(this);
        view.findViewById(R.id.Zhanr).setOnClickListener(this);
        view.findViewById(R.id.OST).setOnClickListener(this);
        view.findViewById(R.id.WorldMusic).setOnClickListener(this);
        view.findViewById(R.id.Epohi).setOnClickListener(this);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Радио");
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.MatveyMP) {
            Toast toast = Toast.makeText(getContext(), "Тут должна была включиться музыка, но нет...", Toast.LENGTH_SHORT);
            toast.show();
        } else if (i == R.id.Rock) {
            Toast toast = Toast.makeText(getContext(), "Тут тоже нет музыки!!! Не кликай!", Toast.LENGTH_SHORT);
            toast.show();
        } else if (i == R.id.Pop) {
            Toast toast = Toast.makeText(getContext(), "... Дурак?", Toast.LENGTH_SHORT);
            toast.show();
        } else if (i == R.id.Metall) {
            Toast toast = Toast.makeText(getContext(), "Я промолчу...", Toast.LENGTH_SHORT);
            toast.show();
        } else if (i == R.id.Nastroenie){
            Toast toast = Toast.makeText(getContext(), "Clickable", Toast.LENGTH_SHORT);
            toast.show();
        } else if (i == R.id.Zaniatia){
            Toast toast = Toast.makeText(getContext(), "Clickable", Toast.LENGTH_SHORT);
            toast.show();
        } else if (i == R.id.Zhanr){
            Toast toast = Toast.makeText(getContext(), "Clickable", Toast.LENGTH_SHORT);
            toast.show();
        } else if (i == R.id.OST){
            Toast toast = Toast.makeText(getContext(), "Clickable", Toast.LENGTH_SHORT);
            toast.show();
        } else if (i == R.id.WorldMusic){
            Toast toast = Toast.makeText(getContext(), "Clickable", Toast.LENGTH_SHORT);
            toast.show();
        } else if (i == R.id.Epohi){
            Toast toast = Toast.makeText(getContext(), "Clickable", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}