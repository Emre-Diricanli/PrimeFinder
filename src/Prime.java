import java.util.Arrays;
import java.util.LinkedList;
public class Prime {
    LinkedList<Integer> Primes = new LinkedList<Integer>();

    public Prime(int max) {
        boolean [] maxSize = new boolean[max];
        Arrays.fill(maxSize, true);
        int rootOfMax = (int) Math.sqrt(max);

        for(int i = 2; i <= max; i++){
            for(int j = 2; j <= rootOfMax; j++){
                if(j%i == 0){
                    maxSize[j] = false;
                }
            }
        }
        for(int i = 2; i < max; i++){
            if(maxSize[i]){
                Primes.add(i);
            }
        }
    }

    public boolean isPrime(int num){
        for(int x: Primes){
            if(num == x)
                return true;
        }
        return false;
    }

    public int getPrime(int pos){
        return Primes.get(pos);
    }
}
