package jp.ac.uryukyu.ie.e175708;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Card playcard = new Card();
        Board gameboard = new Board();
        gameboard.PrintBoard();

        while(true) {
            String buf;
            System.out.print("input integer:");
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            try {
                buf = br.readLine();
            } catch (Exception e) {
                buf = null;
                System.out.println("エラーが発生しました。");
            }
            /*
            ユーザ入力に対応させている。
             */
            for (int i = 0; i < 13; i++) {
                if (("a" + (i + 1)).equals(buf)) {
                    gameboard.ChangeBoard(playcard.getShuffledCard()[i], i);
                }
                if (("b" + (i + 1)).equals(buf)) {
                    gameboard.ChangeBoard(playcard.getShuffledCard()[13 + i], 13 + i);
                }
                if (("c" + (i + 1)).equals(buf)) {
                    gameboard.ChangeBoard(playcard.getShuffledCard()[26 + i], 26 + i);
                }
                if (("d" + (i + 1)).equals(buf)) {
                    gameboard.ChangeBoard(playcard.getShuffledCard()[39 + i], 39 + i);
                }
            }
            /*
            それぞれの列a,b,c,dの何番目かを入力することで、配列の中のデータを探し出し
            書き換える。
             */
            gameboard.PrintBoard();
        }

    }
}
