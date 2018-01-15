package jp.ac.uryukyu.ie.e175708;

public class Empty {
    private char emp[];
    public Empty() {
        MkEmpty();

    }


    public void MkEmpty() {
        emp = new char[52];
        for (int i = 0; i < emp.length; i++){
            emp[i] = '?';
        }
    }
}

