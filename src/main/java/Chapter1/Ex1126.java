package Chapter1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex1126 {

    public static void main(String[] args) {
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int c = StdIn.readInt();
        int t;
        if (a > b) { t = a; a = b; b = t; }
        if (a > c) { t = a; a = c; c = t; }
        if (b > c) { t = b; b = c; c = t; }
        StdOut.printf("%d %d %d",a,b,c);
    }
}
