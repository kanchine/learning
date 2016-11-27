package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Edwin on 2016-10-23.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mTextBackgroundId;

    public WordAdapter(Context context, List<Word> objects){
        super(context,0,objects);
    }


    public WordAdapter(Context context, List<Word> objects, int textBackgroundId){
        super(context,0,objects);

        mTextBackgroundId = textBackgroundId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Word currentWord = getItem(position);

        if(hasTextBackground()) {
            /** Sets the background color of the LinearLayout containing the texts*/
            LinearLayout textLayout = (LinearLayout) listItemView.findViewById(R.id.text_view_group);
            textLayout.setBackgroundColor(ContextCompat.getColor(getContext(), mTextBackgroundId));
        }

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);

        defaultTextView.setText(currentWord.getDefaultTranslation());

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);

        miwokTextView.setText(currentWord.getMiwokTranslation());

        ImageView wordImageView = (ImageView) listItemView.findViewById(R.id.word_image);
        if(currentWord.hasImageId()) {
            wordImageView.setImageResource(currentWord.getImageResourcesId());
            wordImageView.setVisibility(ImageView.VISIBLE);
        }else{
            wordImageView.setVisibility(ImageView.GONE);
        }

        return listItemView;
    }


    private boolean hasTextBackground() {
        return mTextBackgroundId != 0;
    }
}
