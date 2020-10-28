package Chapter1;

import edu.princeton.cs.algs4.StdOut;

public class Ex1130 {

    public static int gcd(int p,int q){
        if(q==0) return p;
        return gcd(q,p%q);
    }

    public static void main(String[] args) {
        int N = 10;
        boolean[][] a = new boolean[N][N];
        for(int i=0;i<N;i++)
            for(int j=0;j<N;j++)
                a[i][j] = gcd(i,j) == 1;

        for(int i=0;i<N;i++) {
            for (int j = 0; j < N; j++)
                StdOut.print(a[i][j] ? "T" : "F");
            StdOut.println();
        }
    }
}
