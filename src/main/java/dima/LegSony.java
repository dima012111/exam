package dima;

public class LegSony implements Leg {
    private String name;

    public LegSony(String name) {
        this.name = name;
    }

    public LegSony() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "LegSony{" +
                "name='" + name + '\'' +
                '}';
    }

    public void go() {
        System.out.println(toString());
    }
}
