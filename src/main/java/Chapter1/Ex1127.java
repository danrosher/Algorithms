package Chapter1;

import edu.princeton.cs.algs4.StdOut;

public class Ex1127 {

    public static double binomial(int N, int k, double p) {
        double[][] cache = new double[N + 1][k + 1];
        for (int i = 0; i < N + 1; i++)
            for (int j = 0; j < k + 1; j++)
                cache[i][j] = -1;
        return _binomial(N, k, p, cache);
    }

    public static double _binomial(int N, int k, double p, double[][] cache) {
        if ((N == 0) && (k == 0)) return 1.0;
        if ((N < 0) || (k < 0)) return 0.0;
        if (cache[N][k] < 0)
            cache[N][k] = (1 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
        return cache[N][k];
    }

    public static void main(String[] args) {
        double v = binomial(10, 5, 0.25);
        StdOut.print(v);
    }
}
