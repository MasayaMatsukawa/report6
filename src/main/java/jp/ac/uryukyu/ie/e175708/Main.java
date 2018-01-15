package jp.ac.uryukyu.ie.e175708;

public class Main {
    public static void main(String[] args){
        Card card = new Card();
        for(int i = 0; i < card.getShuffledCard().length; i++){
            System.out.println(card.getShuffledCard()[i]);
        }
    }
}
