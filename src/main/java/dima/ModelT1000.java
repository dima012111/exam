package dima;

import dima.Hand;
import dima.Robot;
import org.springframework.stereotype.Component;

import java.util.Date;

public class ModelT1000 extends BaseModel {

    private String name;
    private int year;

    public ModelT1000() {
    }

    public ModelT1000(Hand hand, Leg leg) {
        super(hand, leg);
    }


    public ModelT1000(Hand hand, Leg leg, String name, int year) {
        super(hand, leg);
        this.name = name;
        this.year = year;
    }

    public ModelT1000(String name, int year) {

        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


public void init(){
        System.out.println("init");
}
public void destroy(){
    System.out.println("destroy");
}

}
