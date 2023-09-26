import java.util.LinkedList;
import java.util.Random;

public class Main {

    static final int x = 10000;

    public static int findFactor(int target, Prime p) {
        for (int i = 0; i <= target; i++) {
            int primeAtPosition = p.getPrime(i);
            if(target % primeAtPosition == 0){
                return primeAtPosition;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Random r = new Random();
        Prime p = new Prime(x);
        int target = r.nextInt(x);

        while (!p.isPrime(target) || target < 2) {
            target = r.nextInt();
        }

        System.out.println("What primes make up " + target + "?");

        LinkedList<Integer> factors = new LinkedList<>();
        while(target >= 2){
            int factor = findFactor(target, p);
            factors.addLast(factor);
            target /= factor;
        }

        for(int i = 0; i < factors.size(); i++){
            if(i == 0){
                System.out.print(factors.get(i));
            }else{
                System.out.print(" X " + factors.get(i));
            }
        }



    }
}