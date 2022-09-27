import java.util.*;
import java.io.*;


public class BDS {
    static int mtrials = 1000;

    public static void createsort(int[] array, int amount) {
        int good = 0;
        for (int q = 0; q < mtrials; q++) {
            for (int i = 0; i < amount; i++) {
                array[i] = (int)(Math.random() * 365) + 1;
            }
            Arrays.sort(array);
            for (int k=0;k<amount-1;k++){
                if (array[k] == array[k+1]) {
                    good += 1;
                    break;
                }
            }
        }
        System.out.println(good + "/" + mtrials);
    }

    public static void main(String[] args) {

        for(int n = 1; n <= 50;n++) {
            int[] p = new int[n];
            createsort(p, n);
        }
    }
}


