package dima.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Check {
    static List<String> list= new ArrayList<String>();

    public Check() {
    }

    synchronized boolean check(String nume){
        System.out.println(Thread.currentThread().getName()+" check ");
        if (list.contains(nume))
            return true;
       else{
           list.add(nume);
           return false;
        }
    }
}
