package dima.test;

public class Consumator extends Thread {
    private Buffer buffer ;
    private String nume;

    public Consumator ( Buffer b,String nume ) {
        buffer = b ;
        this.nume=nume;
    }
    public void run () {
        int value = 0;
        for (int i = 0; i < 10; i ++) {
            value = buffer . get (nume) ;
            System . out . println ( " Consumatorul a primit   " + value ) ;
            System.out.println(Thread.currentThread().getName()+" consume");
        }
    }
}
