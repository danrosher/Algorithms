package Chapter1;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Ex1129 {

    public static int rank(int k, int[] a) {
        return Math.max(lt(k,a,0,a.length),0);
    }

    public static int count(int k,int[] a){
        return rank(k+1,a)-rank(k,a);
    }

    public static int lt(int k, int[] a, int l, int h) {
        if (l > h) return -1;
        if(l==h) return l;
        int m = l + (h - l) / 2;
        if (k < a[m])
            return lt(k, a, l, m - 1);
        else if(k > a[m] )
            return lt(k, a, m + 1, h);
        else
            return lt(k, a, l, h-1);
    }

    public static void main(String[] args) {

        int[] a = Arrays.stream("2222334777788".split(""))
            .mapToInt(Integer::parseInt)
            .toArray();

        StdOut.println(rank(1,a));//0
        StdOut.println(rank(2,a));//0
        StdOut.println(rank(3,a));//4
        StdOut.println(rank(4,a));//6
        StdOut.println(rank(5,a));//7
        StdOut.println(rank(6,a));//7
        StdOut.println(rank(7,a));//7
        StdOut.println(rank(8,a));//11
        StdOut.println(rank(9,a));//13

        StdOut.println(count(1,a));//0
        StdOut.println(count(2,a));//4
        StdOut.println(count(3,a));//2
        StdOut.println(count(4,a));//1
        StdOut.println(count(5,a));//0
        StdOut.println(count(6,a));//0
        StdOut.println(count(7,a));//4
        StdOut.println(count(8,a));//2
        StdOut.println(count(9,a));//0

    }
}
