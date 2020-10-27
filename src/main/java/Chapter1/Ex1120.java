package Chapter1;

public class Ex1120 {

    public static long fac(int N,long acc){
        return N==1 ? acc : fac(N-1,acc*N);
    }

    public static double ln(int N){
        return Math.log(fac(N,1));
    }

    public static void main(String[] args) {
        System.out.println(ln(6));
        System.out.println(Math.log(6 * 5 * 4 * 3 * 2));
    }
}
