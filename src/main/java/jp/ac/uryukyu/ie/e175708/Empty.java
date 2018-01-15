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


    public void MkEmpty() {
        emp = new String[52];
        for (int i = 0; i < emp.length; i++){
            emp[i] = "?";
        }
    }
}

