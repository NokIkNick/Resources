package dk.cphbusiness.cphnw89.resources.streams;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Stream;

public class AssignmentPrimetask1 implements Callable<Long> {

        private int n;

        public AssignmentPrimetask1(int n){
            this.n = n;
        }


        @Override
        public Long call() throws Exception {
            return findPrime(n);
        }


        private long findPrime(int n){
            int count = 1;
            long candidate = 2;
            while(count < n){
                ++candidate;
                if(isPrime(candidate)){
                    ++count;
                }
            }
            return candidate;
        }

        private boolean isPrime(long n ){
            if(n <= 1){
                return false;
            }
            long half = n/2 +1;
            for(long i = 2; i < half; i++){
                if(n % i == 0){
                    return false;
                }
            }
            return true;
        }

    }



