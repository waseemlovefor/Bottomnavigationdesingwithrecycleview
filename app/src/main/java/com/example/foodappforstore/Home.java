package com.example.foodappforstore;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class Home extends Fragment {
    public Home() {
    }
    Context context;
      RecyclerView recyclerView;
      recycleviewAdapter adapter;
      List<imageModel> list=new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView=view.findViewById(R.id.recycleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        adapter=new recycleviewAdapter(context,list);
        recyclerView.setAdapter(adapter);
        fatchdata();
        return view;
    }
    public void fatchdata(){
          imageModel imageModel=new imageModel(R.drawable.ic_launcher_background,"like","share");
          list.add(imageModel);
        imageModel imageModel1=new imageModel(R.drawable.ic_launcher_background,"like","share");
        list.add(imageModel1);
        imageModel imageModel2=new imageModel(R.drawable.ic_launcher_background,"like","share");
        list.add(imageModel2);
        imageModel imageModel3=new imageModel(R.drawable.ic_launcher_background,"like","share");
        list.add(imageModel3);
        imageModel imageModel4=new imageModel(R.drawable.ic_launcher_background,"like","share");
        list.add(imageModel4);
        imageModel imageModel5=new imageModel(R.drawable.ic_launcher_background,"like","share");
        list.add(imageModel5);
        imageModel imageModel6=new imageModel(R.drawable.ic_launcher_background,"like","share");
        list.add(imageModel6);
        imageModel imageModel7=new imageModel(R.drawable.ic_launcher_background,"like","share");
        list.add(imageModel7);
        imageModel imageModel8=new imageModel(R.drawable.ic_launcher_background,"like","share");
        list.add(imageModel8);
        imageModel imageModel9=new imageModel(R.drawable.ic_launcher_background,"like","share");
        list.add(imageModel9);
        imageModel imageModel10=new imageModel(R.drawable.ic_launcher_background,"like","share");
        list.add(imageModel10);
        imageModel imageModel11=new imageModel(R.drawable.ic_launcher_background,"like","share");
        list.add(imageModel11);
        imageModel imageModel12=new imageModel(R.drawable.ic_launcher_background,"like","share");
        list.add(imageModel12);




    }
}