package dk.cphbusiness.cphnw89.resources.streams;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class AssignmentPrimetaskTest {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(8);
        long beginTime = System.currentTimeMillis();
        for(int i = 0; i < 100; i++){
            AssignmentPrimetask1 task = new AssignmentPrimetask1(3000);
            Future<Long> future = executor.submit(task);

        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
        long endTime = System.currentTimeMillis();
        System.out.println("Time: "+(endTime - beginTime));
    }
}
