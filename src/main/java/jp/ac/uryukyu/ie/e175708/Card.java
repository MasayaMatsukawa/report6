package jp.ac.uryukyu.ie.e175708;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Card {
    private String ShuffledCard[];

    public String[] getShuffledCard(){
        return ShuffledCard;
    }

    public Card() {
        ShuffleCard();
    }


    public void ShuffleCard(){
        String CardSet[] = MkCardSet();
        List<String> CardList =Arrays.asList(CardSet);
        Collections.shuffle(CardList);
        ShuffledCard = (String[])CardList.toArray(new String[CardList.size()]);
    }

    public String[] MkCardSet() {
        String CardType[] = MkCardType();
        String CardSet[] = new String[52];
        int k = 0;
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                CardSet[k] = CardType[i];
                k += 1;
            }
        }
        return CardSet;
    }
    public String[] MkCardType() {
        String CardType[] = new String[13];
        CardType[0] = "A";
        CardType[9] = "X";
        CardType[10] = "J";
        CardType[11] = "Q";
        CardType[12] = "K";
        int num;
        for (int i = 1; i < 9; i++) {
            num = i+1;
            CardType[i] = String.valueOf(num);
        }
        return CardType;
    }
}