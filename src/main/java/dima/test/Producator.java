package dima.test;


public class Producator extends Thread {
    private Buffer buffer ;
    public Producator ( Buffer b ) {
        buffer = b ;
    }
    public void run () {
        for (int i = 0; i < 10; i ++) {
            buffer . put ( i ) ;
            System . out . println ( " Producatorul a pus  " + i ) ;
            try {
                sleep (( int ) ( Math . random () * 100) ) ;
            } catch ( InterruptedException e ) { }
        }
    }
}
