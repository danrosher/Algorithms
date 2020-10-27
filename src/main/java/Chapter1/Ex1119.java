package Chapter1;

public class Ex1119 {
    public static long F(int N)
    {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N-1) + F(N-2);
    }

    static int N = 100;
    static long[] cache = new long[N];
    static {
        cache[1] = 1;
    }
    public static long F2(int N)
    {
        if (N == 0) return 0;
        if (N == 1) return 1;
        if(cache[N] == 0){
            cache[N] =  cache[N-2]+ cache[N-1];
        }
        return cache[N];
    }

    public static long F3(int N){
        long a=0,b=1;
        while( N-- > 0){
            long acc = a + b;
            a = b;
            b = acc;
        }
        return a;
    }


    public static void main(String[] args)
    {
        for (int N = 0; N < 99; N++)
            System.out.println(N + " " + F3(N));
    }
}
