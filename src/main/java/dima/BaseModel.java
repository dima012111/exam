package dima;

public abstract class BaseModel implements Robot{
    private Hand hand;
    private Leg leg;

    public BaseModel() {
        System.out.println("construcor de la base model");
    }

    public BaseModel(Hand hand, Leg leg) {
        this();
        this.hand = hand;
        this.leg = leg;
    }

    public void fire() {
        hand.take();
        leg.go();
    }

    public void dance() {
        System.out.println("Dance");
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }
}
