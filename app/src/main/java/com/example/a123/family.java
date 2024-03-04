package com.example.a123;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class family extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<words> Translate = new ArrayList<>();
        Translate.add(new words("father","fater"));
        Translate.add(new words("mother","muter"));
        Translate.add(new words("son","sohn"));
        Translate.add(new words("daughter","tochter"));
        Translate.add(new words("brother","bruder"));
        Translate.add(new words("sister","schwester"));
        Translate.add(new words("male cousin","vetter"));
        Translate.add(new words("female cousin","kusine"));


        WordAdapter adapter = new WordAdapter (this,Translate);


        ListView ListView = findViewById(R.id.list);
        ListView.setAdapter(adapter);
    }
}