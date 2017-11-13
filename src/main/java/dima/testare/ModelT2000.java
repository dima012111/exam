package dima.testare;

import dima.BaseModel;
import dima.Hand;
import dima.Leg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ModelT2000 implements Robot  {

    private dima.testare.Hand hand;
    public ModelT2000() {
    }
@Autowired
@Cold
    public ModelT2000(dima.testare.Hand hand) {
        this.hand = hand;
    }
    @Autowired
    @Cold
    public dima.testare.Hand getHand() {
        return hand;
    }
    @Autowired
    @Cold
    public void setHand(dima.testare.Hand hand) {
        this.hand = hand;
    }

    public void fire() {
        System.out.println("fire");
    }

    public void dance() {
        System.out.println("dance");
    }
}
