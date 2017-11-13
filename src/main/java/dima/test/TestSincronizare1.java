package dima.test;

public class TestSincronizare1 {
    public static void main ( String [] args ) {
        Buffer b = new Buffer () ;
        Producator p1 = new Producator ( b ) ;
        Consumator c1 = new Consumator ( b,"dima" ) ;
        Consumator c2 = new Consumator ( b,"maria" ) ;
        Consumator c3 = new Consumator ( b,"maria" ) ;
        p1 . start () ;
        c1 . start () ;
        c2 . start () ;
        c3.start();
    }
}
