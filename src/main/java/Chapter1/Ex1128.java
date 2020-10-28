package Chapter1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;
import java.util.Collections;

public class Ex1128 {
    public static int  rank(int key, int[] a){
        return rank(key, a, 0, a.length - 1,0);
    }
    public static int rank(int key, int[] a, int lo, int hi,int depth){
        // Index of key in a[], if present, is not smaller than lo
        // and not larger than hi.
        StdOut.printf("%s %d %d",String.join("", Collections.nCopies(depth, " ")),lo,hi);
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if(key < a[mid])
            return rank(key, a, lo, mid - 1,depth+1);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi,depth+1);
        else
            return mid;
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();

        Arrays.sort(whitelist);

        int[] _whitelist = new int[whitelist.length];
        _whitelist[0]=whitelist[0];
        int j=0;
        for (int k : whitelist)
            if (k != _whitelist[j])
                _whitelist[++j] = k;
        int[] dedup = new int[j];
        System.arraycopy(_whitelist,0,dedup,0,j);

        while(!StdIn.isEmpty()){
            int key = StdIn.readInt();
            if(rank(key,dedup) == -1)
                StdOut.println(key);
        }
    }
}
