package jp.ac.uryukyu.ie.e175708;

public class Board {
    private String a ="";
    private String b ="";
    private String c ="";

    public String getA(){
        return a;
    }
    public String getB(){
        return b;
    }
    public String getC(){
        return c;
    }

    public Board(){
        MkBoard();
    }
    public  void MkBoard(){
        Empty obj = new Empty();
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
        }
    }
}
