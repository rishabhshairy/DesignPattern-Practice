package com.rshairy.designs.FlyweightPattern.WordProcessorExample;

public class WordProcessor {
    public static void main(String[] args) {
        ILetter t = LetterFactory.crateLetter('t');
        t.display(3, 4);
    }
}
