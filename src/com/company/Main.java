package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] array=new String[10];
        array[0]="qwe";
        array[1]="rty";
        array[2]="uio";
        array[3]="p[]";
        array[4]="asd";
        array[5]="fgh";
        array[6]="jkl";
        array[7]=";'z";
        array[8]="xcv";
        array[9]="bnm";

        List<String>list=new ArrayList<>();
        list.add("wervdcsferhgfv");
        list.add("wervdcsdvscbefv");
        list.add("wervdcebtnsfv");
        list.add("wervdcsedvfv");
        list.add("wervdrtbcsfv");
        list.add("wervdcssdvfv");
        list.add("wervdcsfvryng");


        for (String item:list){
            System.out.println(item);
        }
    }
}
