package com.memory.adrhm.memory;

import android.content.ClipData;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by hansjulien on 22/05/2017.
 */

// Classe qui garde les references vers les vues de chaque cards
public class CardListViewHolder extends RecyclerView.ViewHolder{

    TextView text;
    ImageView image;
    public static String value;

    //itemView est la vue correspondante à 1 cellule
    public CardListViewHolder(final View itemView) {
        super(itemView);
        text = (TextView) itemView.findViewById(R.id.textCard);
        image = (ImageView) itemView.findViewById(R.id.imageCard);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent i = new Intent(itemView.getContext(), GameActivity.class);
                //envoi du titre de la carte
                value = (String) text.getText();
                i.putExtra("categorie", value);
                itemView.getContext().startActivity(i);
            }
        });
    }

    /*public void bind(CardList myObject){
        text.setText(myObject.getText());
        Picasso.with(image.getContext()).load(myObject.getImage()).centerCrop().fit().into(image);
    }*/


    public static String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}