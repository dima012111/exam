package dima;

public class HandSony implements Hand {
    private String name;

    public HandSony() {

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
