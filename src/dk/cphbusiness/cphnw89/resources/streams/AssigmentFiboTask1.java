package dk.cphbusiness.cphnw89.resources.streams;

import com.sun.jdi.Value;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Stream;

public class AssigmentFiboTask1 implements Callable<Long> {

    private int n;
    private boolean ready;

    public AssigmentFiboTask1(int n){
        this.n = n;
        ready = false;
    }


    @Override
    public Long call() throws Exception {
        while(!ready){
            try{
                List<Long> stream = Stream.iterate(new long[]{0,1}, e -> new long[]{e[1], e[0] + e[1]}).limit(n+1).map(e -> e[0]).toList();
                ready = true;
                return stream.get(n);
            }catch(Exception e){
                System.out.println("Error");
                Thread.sleep(1000);
            }
        }
        return null;
    }
}
