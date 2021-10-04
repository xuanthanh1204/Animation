package com.baitaptransition;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class ActivityListTree extends AppCompatActivity {

    private List<Tree> listTree;
    private TreeAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_tree);

        listTree = new ArrayList<>();
        listTree.add(new Tree("tree1", "Lavender", 25));
        listTree.add(new Tree("tree2", "Yellow", 23));
        listTree.add(new Tree("tree3", "Light Lavender", 25));
        listTree.add(new Tree("tree4", "Short Lavender", 18));
        listTree.add(new Tree("tree5", "Short Green", 7));

        recyclerView = findViewById(R.id.listView);
        adapter = new TreeAdapter(listTree, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView,
                new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        startActivity(new Intent(view.getContext(),ActivityDetail.class).putExtra("TREE",listTree.get(position)));
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }
                }));
    }
}