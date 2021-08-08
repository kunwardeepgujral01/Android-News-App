package com.example.news;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class sportsFragment extends Fragment {
    String api="4f3c316ca7224c53af5ed797b59b476f";
    String country="in";
    Adapter adapter;
    ArrayList<ModelClass> modelClassArrayList;
    private RecyclerView recyclerViewofSports;
    private String category="sports";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable  Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.sportsfragment,null);
        recyclerViewofSports=v.findViewById(R.id.recyclerViewOfSports);
        modelClassArrayList=new ArrayList<>();
        recyclerViewofSports.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter= new Adapter(getContext(),modelClassArrayList);
        recyclerViewofSports.setAdapter(adapter);

        findNews();
        return v;
    }

    private void findNews() {
        ApiUtilities.getApiInterface().getCategoryNews(country,category,100,api).enqueue(new Callback<mainNews>() {
            @Override
            public void onResponse(Call<mainNews> call, Response<mainNews> response) {
                if(response.isSuccessful()){
                    modelClassArrayList.addAll(response.body().getArticles());
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<mainNews> call, Throwable t) {

            }
        });
    }
}

