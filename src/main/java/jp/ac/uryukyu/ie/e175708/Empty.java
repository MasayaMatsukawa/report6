package jp.ac.uryukyu.ie.e175708;

public class Empty {
    private String emp[];
    public String[] getEmp(){
        return emp;
    }
    public Empty() {
        MkEmpty();

    }

    public void setEmp(String str,int x){
        emp[x] = str;
    }
    /*
    裏返しのカードは、それぞれ１３種類のカードに対応している。カードをひっくり返す際
    それぞれのカードを反映させるためにsetterを用い中身を変えられるようにする。
     */



    public void MkEmpty() {
        emp = new String[52];
        for (int i = 0; i < emp.length; i++){
            emp[i] = "?";
        }
    }
    /*
    ５２個の「?」の配列を作る。この「?」は裏返しのカードとして用いる。
     */
}

