package com.example.a123;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<words> Translate = new ArrayList<>();
        Translate.add(new words("Be careful.","Sei vorsichtig."));
        Translate.add(new words("Hello","Hallo"));
        Translate.add(new words("Bye","Tschüss"));
        Translate.add(new words("Thanks","Danke "));
        Translate.add(new words("Excuse me","Entschuldigung "));
        Translate.add(new words("Can you help me?"," Können Sie mir helfen?"));
        Translate.add(new words("Do you speak English?","Sprechen Sie English"));
        Translate.add(new words("One moment, please.","Einen Moment, bitte"));
        Translate.add(new words("That’s all, thank you.","Das ist alles, danke."));
        Translate.add(new words("Enjoy your meal","Guten Appetit."));



        WordAdapter adapter = new WordAdapter (this,Translate);


        ListView ListView = findViewById(R.id.list);
        ListView.setAdapter(adapter);
    }
}