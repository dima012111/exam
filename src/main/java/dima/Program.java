package dima;


import dima.aspect.Audience;
import dima.aspect.Perform;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String []args){

        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
       ApplicationContext context2=new ClassPathXmlApplicationContext("aspect.xml");
        ApplicationContext context1=new AnnotationConfigApplicationContext(Test.class);

        Object obj=context.getBean("t1000");
        Object obj2=context2.getBean("aud");
        Object obj1=context1.getBean(Robot.class);
if (obj2 instanceof Audience){
    Audience a= (Audience) obj2;
    a.applause();
    a.demandRefund();
    a.silenceCellPhones();
    a.takeSeats();
}
if (obj2 instanceof Perform){
    Perform p= (Perform) obj2;
    p.perform();
}
        if (obj instanceof ModelT1000){
            ModelT1000 m= (ModelT1000) obj;
            m.fire();
        }
        if (obj1 instanceof ModelT1000){
            ModelT1000 m= (ModelT1000) obj;
            m.dance();
        }
        RobotFactoryAbstract conv= (RobotFactoryAbstract) context.getBean("conv");


        Robot r1=conv.create();
        Robot r2=conv.create();
        Robot r3=conv.create();
        r1.dance();
        r2.dance();
        r3.dance();


    }
}
