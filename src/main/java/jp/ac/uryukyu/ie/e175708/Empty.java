package jp.ac.uryukyu.ie.e175708;

import java.util.List;
import java.util.ArrayList;

public class Empty {
    private List<String> emp;
    public Empty() {
        MkEmpty();

    }


    public void MkEmpty() {
        emp = new ArrayList<String>();
        for (int i = 0; i < 52; i++){
            emp.add("?") ;
        }
    }
}

