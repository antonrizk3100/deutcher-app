package com.example.a123;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<words> Translate = new ArrayList<>();
        Translate.add(new words("red","rot"));
        Translate.add(new words("yellow","gelb"));
        Translate.add(new words("blue","blau"));
        Translate.add(new words("orange","orange"));
        Translate.add(new words("green","grun"));
        Translate.add(new words("purple","lila"));
        Translate.add(new words("pink","rosa"));
        Translate.add(new words("broen","braun"));
        Translate.add(new words("black","schwarz"));
        Translate.add(new words("white","weiẞ"));



        WordAdapter adapter = new WordAdapter (this,Translate);


        ListView ListView = findViewById(R.id.list);
        ListView.setAdapter(adapter);
    }
}