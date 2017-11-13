package dima.test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test extends Thread {
    String dir;
    String subdir;
    static Lock o=new ReentrantLock();



    public Test() {
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getSubdir() {
        return subdir;
    }

    public void setSubdir(String subdir) {
        this.subdir = subdir;
    }

    public Test(String dir, String subdir) {
        this.dir = dir;
        this.subdir = subdir;
    }
public void test(){
    try {
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
    @Override
    public void run() {
        //create();

        Path path = Paths.get("C:\\"+this.dir);
        Path path1 = Paths.get("C:\\"+this.dir+"\\"+this.subdir);


            try {
                o.lock();
                if (Test1.check(path)) {
                    System.out.println("directory was created"+Thread.currentThread().getName());
                    Thread.sleep(1000);


                    Files.createDirectories(path);
                    Files.createDirectories(path1);

                    System.out.println("directory was created");
                }

                else {
                    Files.createDirectories(path1);
                }

            } catch (InterruptedException e1) {
                e1.printStackTrace();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }











    public static void main(String [] strings){
        Test t1=new Test("dima1","dima2");
        Test t2=new Test("dima2","dima2");
        Test t3=new Test("dima1","dima3");
        Thread tt1=new Thread(t1);
        Thread tt2=new Thread(t3);
        Thread tt3=new Thread(t2);
        tt1.setName("tt1");
        tt2.setName("tt2");
        tt3.setName("tt3");
        tt1.start();
        tt2.start();
        tt3.start();

    }
}
