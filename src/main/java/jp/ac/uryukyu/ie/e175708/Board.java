package jp.ac.uryukyu.ie.e175708;

public class Board {
    private String a ="a";
    private String b ="b";
    private String c ="c";
    private String d ="d";
    private Empty obj = new Empty();

    public String getA(){
        return a;
    }
    public String getB(){
        return b;
    }
    public String getC(){
        return c;
    }
    public String getD(){
        return d;
    }

    public void PrintBoard(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    public Board(){
        MkBoard();
    }
    public  void MkBoard(){
        for(int i = 0; i < 52; i++){
            if(i/13 == 0){
                a = a + obj.getEmp()[i];
            }
            if(i/13 == 1){
                b = b + obj.getEmp()[i];
            }
            if(i/13 == 2){
                c = c + obj.getEmp()[i];
            }
            if(i/13 == 3){
                d = d + obj.getEmp()[i];
            }
        }
    }
    public void ChangeBoard(String str,int x){
        a="a";
        b="b";
        c="c";
        d="d";
        obj.setEmp(str,x);
        MkBoard();
    }
}
