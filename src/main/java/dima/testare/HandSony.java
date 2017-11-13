package dima.testare;

import dima.testare.Hand;
import org.springframework.stereotype.Component;

@Component
@Cold

public class HandSony implements Hand {
    private String name;

    public HandSony() {
        this.name="dima";
    }

    public HandSony(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HandSony{" +
                "name='" + name + '\'' +
                '}';
    }

    public void take() {
        System.out.println(toString());
    }
}
