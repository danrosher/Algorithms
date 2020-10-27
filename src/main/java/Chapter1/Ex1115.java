package Chapter1;

import java.util.Random;

public class Ex1115 {

    public static int[] histogram(int a[],int M){
        int[] r = new int[M];
        for (int j : a) {
            r[j]++;
        }
        return r;
    }

    public static void main(String[] args) {
        int M = 123;
        Random r = new Random();
        int[] a = new int[M];
        for(int i=0;i<M;i++){
            a[i] = r.nextInt(M);
        }
        int[] h = histogram(a,M);
        int sum = 0;
        for (int j : h) {
            sum += j;
        }
        System.out.println("sum:"+sum+" must equal "+M);
    }
}
