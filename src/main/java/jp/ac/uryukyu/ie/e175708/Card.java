package jp.ac.uryukyu.ie.e175708;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Card {
    private char ShuffledCard[];

    public Card() {
        MkCardSet();
    }

    public void ShuffleCard(){
        char CardSet[] = MkCardSet();
        char Shuffled[] = new char[52];
        
    }

    public char[] MkCardSet() {
        char CardType[] = MkCardType();
        char CardSet[] = new char[52];
        int k = 0;
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                CardSet[k] = CardType[i];
                k += 1;
            }
        }
        return CardSet;
    }
    public char[] MkCardType() {
        char CardType[] = new char[13];
        CardType[0] = 'A';
        CardType[9] = 'X';
        CardType[10] = 'J';
        CardType[11] = 'Q';
        CardType[12] = 'K';
        for (int i = 1; i < 9; i++) {
            CardType[i] = (char) (i + 1);
        }
        return CardType;
    }
}