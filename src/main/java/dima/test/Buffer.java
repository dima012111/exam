package dima.test;

public class Buffer {
    private int number = -1;
    private boolean available = false ;
    Check c=new Check();
    public synchronized int get (String nume) {
        if (c.check(nume)){
            System.out.println(Thread.currentThread().getName()+" checked ");
        }
        while (! available ) {
            try {
                wait () ;
// Asteapta producatorul sa puna o valoare
            } catch ( InterruptedException e ) {
                e . printStackTrace () ;
            }
        }
        available = false ;
        notifyAll () ;
        return number ;
    }
    public synchronized void put (int number ) {
        while ( available ) {
            try {
                wait () ;
// Asteapta consumatorul sa preia valoarea
            } catch ( InterruptedException e ) {
                e . printStackTrace () ;
            }
        }
        this . number = number ;
        available = true ;
        notifyAll () ;
    }

}
