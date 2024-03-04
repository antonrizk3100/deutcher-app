package com.example.a123;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<words> Translate = new ArrayList<>();
         Translate.add(new words("one","ein"));
        Translate.add(new words("two","zwei"));
        Translate.add(new words("tree","drei"));
        Translate.add(new words("four","vier"));
        Translate.add(new words("five","funf"));
        Translate.add(new words("six","sechs"));
        Translate.add(new words("seven","sieben"));
        Translate.add(new words("eight","acht"));
        Translate.add(new words("nine","neun"));
        Translate.add(new words("ten","zehn"));



        WordAdapter adapter = new WordAdapter (this,Translate);


        ListView ListView = findViewById(R.id.list);
        ListView.setAdapter(adapter);
    }
}

