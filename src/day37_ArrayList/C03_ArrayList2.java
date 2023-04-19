package day02_MyfirstProgram.src.day37_ArrayList;

import java.util.ArrayList;

public class C03_ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> arrList=new ArrayList<>();
        arrList.add("Harun");
        arrList.add("Ziya");
        arrList.add("Mehtap");
        arrList.add("Sami");
        arrList.add("Harun");
        arrList.add("Ziya");

        ArrayList<String> arrList2=new ArrayList<>();
        arrList2.add("Harun");
        arrList2.add("Ziya");

        arrList.removeAll(arrList2);

        System.out.println(arrList);


    }
}
