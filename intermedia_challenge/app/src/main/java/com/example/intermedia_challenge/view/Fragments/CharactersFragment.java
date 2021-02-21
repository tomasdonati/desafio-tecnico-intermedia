package com.example.intermedia_challenge.view.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.intermedia_challenge.R;
import com.example.intermedia_challenge.model.pojo.ListItem;
import com.example.intermedia_challenge.view.Adapters.RecyclerAdapter;

import java.util.ArrayList;

public class CharactersFragment extends Fragment {

    private RecyclerView charactersRecyclerView;
    private RecyclerView.Adapter charactersRecyclerAdapter;
    private RecyclerView.LayoutManager charactersRecyclerLayoutManager;





    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_characters, container, false);

        ArrayList<ListItem> itemList = new ArrayList<>();
        itemList.add(new ListItem(R.drawable.ic_placeholder_image, "Thanos", "a big purple guy"));
        itemList.add(new ListItem(R.drawable.ic_placeholder_image2, "Iron Man", "an iron guy"));
        itemList.add(new ListItem(R.drawable.ic_placeholder_image, "Hulk", "a big green guy"));
        itemList.add(new ListItem(R.drawable.ic_placeholder_image2, "Captain America", "a patriot guy"));
        itemList.add(new ListItem(R.drawable.ic_placeholder_image, "Thanos", "a big purple guy"));
        itemList.add(new ListItem(R.drawable.ic_placeholder_image2, "Iron Man", "an iron guy"));
        itemList.add(new ListItem(R.drawable.ic_placeholder_image, "Hulk", "a big green guy"));
        itemList.add(new ListItem(R.drawable.ic_placeholder_image2, "Captain America", "a patriot guy"));
        itemList.add(new ListItem(R.drawable.ic_placeholder_image, "Thanos", "a big purple guy"));
        itemList.add(new ListItem(R.drawable.ic_placeholder_image2, "Iron Man", "an iron guy"));
        itemList.add(new ListItem(R.drawable.ic_placeholder_image, "Hulk", "a big green guy"));
        itemList.add(new ListItem(R.drawable.ic_placeholder_image2, "Captain America", "a patriot guy"));

        charactersRecyclerView = view.findViewById(R.id.charactersFragment_recycler);
        charactersRecyclerLayoutManager = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        charactersRecyclerAdapter = new RecyclerAdapter(itemList);

        charactersRecyclerView.setLayoutManager(charactersRecyclerLayoutManager);
        charactersRecyclerView.setAdapter(charactersRecyclerAdapter);

        return view;
    }
}
