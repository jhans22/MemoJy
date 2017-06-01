package com.memory.adrhm.memory;

import android.media.Image;

/**
 * Created by hansjulien on 22/05/2017.
 */

// Classe qui définit ce que contient une card dans le choix des images pour jouer
// Contient une image et un titre
public class CardList {
    String text;
    int image;

    public CardList(String text, int image) {
        this.text = text;
        this.image = image;
    }

    //getters & setters

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
