package com.example.a123;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<words> {

    public WordAdapter(Activity context, ArrayList<words> words) {
        super((Context) context,0, (List<com.example.a123.words>) words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        words currentAndroidFlavor = getItem(position);

        TextView English_text_view = (TextView) listItemView.findViewById(R.id.English_text_view);
        English_text_view.setText(currentAndroidFlavor.getEnglishTranslation());

        TextView Deutch_text_view = (TextView) listItemView.findViewById(R.id.Deutch_text_view);

        Deutch_text_view.setText(currentAndroidFlavor.getDeutchTranslation());

        return listItemView;
    }

}
