package Chapter1;

public class Ex1117 {

    //stack overflow
    public static String exR2(int n)
    {
        String s = exR2(n-3) + n + exR2(n-2) + n;
        if (n <= 0) return "";
        return s;
    }

    public static String exR2New(int n)
    {
        if (n <= 0) return "";
        return exR2(n-3) + n + exR2(n-2) + n;
    }
    public static void main(String[] args) {
        System.out.println(exR2(6));
    }
}
