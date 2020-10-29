package Chapter1;

import edu.princeton.cs.algs4.StdArrayIO;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex1133 {

    public static final class Matrix {

        public static double dot(double[]x, double[]y){
            double dot=0;
            for(int i=0;i<x.length;i++)
                dot += x[i]*y[i];
            return dot;
        }

        //matrix-vector product
        public static double[] mult(double[][]a, double[]x){
            double[] y = new double[a.length];
            for (int i = 0; i < a.length; i++)
                for (int j = 0; j < a[0].length; j++)
                    y[i] += a[i][j] * x[j];
            return y;
        }

        //matrix-matrix product
        public static double[][] multiply(double[][] a, double[][] b) {
            double[][] bt = transpose(b);
            double[][] y = new double[a.length][a[0].length];
            for (int i = 0; i < a.length; i++)
                y[i] = mult(a,bt[i]);
            return y;
        }

        public static double[][] transpose(double[][]a){
            double[][] b = new double[a[0].length][a.length];
            for (int i = 0; i < a[0].length; i++)
                for (int j = 0; j < a.length; j++)
                    b[j][i] = a[i][j];
            return b;
        }

        public static double[][] random(int m, int n) {
            double[][] a = new double[m][n];
            for (int i = 0; i < m; i++)
                for (int j = 0; j < n; j++)
                    a[i][j] = StdRandom.uniform(0.0, 1.0);
            return a;
        }

    }

    public static void main(String[] args) {

        StdOut.println("A");
        StdOut.println("--------------------");
        double[][] a = Matrix.random(2, 2);
        StdArrayIO.print(a);

        StdOut.println("A'");
        StdOut.println("--------------------");
        double[][] b = Matrix.transpose(a);
        StdArrayIO.print(b);
        StdOut.println();

        StdOut.println("A * A'");
        double[][] f = Matrix.multiply(a, b);
        StdArrayIO.print(f);
        StdOut.println();

        StdOut.println("A[0] . A'[0]");
        double dot = Matrix.dot(a[0], b[0]);
        StdOut.println(dot);

    }
}
