package Chapter1;

import edu.princeton.cs.algs4.StdOut;

public class Ex1124 {
    //iterative version : java does not do tail-call optimization TCO
    //better to replace recursive calls to iterative ones
    //e.g. see http://blog.moertel.com/posts/2013-05-11-recursive-to-iterative.html
    public static int gcd(int p,int q){
        while(q != 0) {
            StdOut.printf("p:%d q:%d\n",p,q);
            int tp=p;p=q;q=tp%q;
        }
        return p;
    }

    public static void main(String[] args) {
        StdOut.println(gcd(1111111,1234567));
    }
}
