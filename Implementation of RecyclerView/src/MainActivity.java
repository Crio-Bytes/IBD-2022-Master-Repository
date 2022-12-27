package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

// copy code form here only(not above from here)
public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Item> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //here intialize the arraylist
        list = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);

        //add elements to array
        list.add(new Item(R.drawable.p1,"Naruto"));
        list.add(new Item(R.drawable.p2,"Jiraya"));
        list.add(new Item(R.drawable.p3,"Shikamaru"));
        list.add(new Item(R.drawable.p4,"Kakashi"));
        list.add(new Item(R.drawable.p5,"Lee"));
        list.add(new Item(R.drawable.p6,"konahmaru"));
        list.add(new Item(R.drawable.p7,"saske bro"));
        list.add(new Item(R.drawable.p8,"Haserama"));
        list.add(new Item(R.drawable.p9,"Saske"));

        // now make adapter object
        MyCustomAdapter adapter = new MyCustomAdapter(list,this);

        //now set layout manager
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        // now set adapter
        recyclerView.setAdapter(adapter);
    }
}
//end here