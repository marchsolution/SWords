package com.msolution.swords;

/**
 * Created by HP on 20.03.2015.
 */
public class Word {

    String word;
    String translate;

    public Word(String word, String translate){
        this.word = word;
        this.translate = translate;
    }

    public String getWord(){
        return this.word;
    }

    public String getTranslate(){
        return this.translate;
    }

    public void setWord(String word){
        this.word = word;
    }

    public void setTranslate(String translate){
        this.translate = translate;
    }
}
