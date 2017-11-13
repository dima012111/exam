package dima.test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test1  {


    static  boolean check(Path path){
       if (!Files.exists(path)){
            return true;
       }
        return false;
    }
}
