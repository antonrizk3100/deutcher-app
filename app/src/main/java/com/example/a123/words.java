package com.example.a123;

public class words {

    private String mEnglishTranslation;
    private String mDeutchTranslation;


    public words(String EnglishTranslation, String DeutchTranslation ){
        mDeutchTranslation = DeutchTranslation;
        mEnglishTranslation= EnglishTranslation;
    }
    public String getEnglishTranslation(){
        return mEnglishTranslation;
    }
    public String getDeutchTranslation(){
        return mDeutchTranslation;
    }


}

