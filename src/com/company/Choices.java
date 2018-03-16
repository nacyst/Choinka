package com.company;

public enum Choices {
    Left('l'),Right('r'),Down('d'),Up('u');

    private char sign;

    Choices(char sign){
        this.sign=sign;
    }

    char charValue(){
        return this.sign;
    }

}
