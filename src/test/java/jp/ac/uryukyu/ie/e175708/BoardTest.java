package jp.ac.uryukyu.ie.e175708;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTest {

    @Test
    public void changeBoard() {
        Card Testcard = new Card();
        Board Testboard = new Board();
        int x;
        Testboard.ChangeBoard(Testcard.getShuffledCard()[1], 1);
        assertEquals(Testcard.getShuffledCard()[1],Testboard.getObj().getEmp()[1]);
    }
}
