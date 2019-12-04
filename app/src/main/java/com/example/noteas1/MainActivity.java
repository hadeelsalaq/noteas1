package com.example.noteas1;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<Note> noteList = new ArrayList<>();
    RecyclerView notes_rv;
    NotesAdapter notesAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        notes_rv = findViewById(R.id.notes_rv);
        notes_rv.setLayoutManager(new LinearLayoutManager(this));
        notesAdapter = new NotesAdapter(this ,noteList );
        notes_rv.setAdapter(notesAdapter);
    }

    private void initData() {
        noteList . add(new Note("1","Stu Name" , "Fifth Le." , 85.5f));
        noteList . add(new Note("2","Stu Name" , "Fifth Le." , 85.5f));
        noteList . add(new Note("3","Stu Name" , "Fifth Le." , 85.5f));
        noteList . add(new Note("4","Stu Name" , "Fifth Le." , 85.5f));
        noteList . add(new Note("5","Stu Name" , "Fifth Le." , 85.5f));
        noteList . add(new Note("6","Stu Name" , "Fifth Le." , 85.5f));

    }
}
